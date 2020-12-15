/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nytiia
 */
//package Calendarfinal;

import Calendar.ui.TodoUi;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        TodoUi.main(args);
    }
    
    
    CalendarOver
            package Calendar;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import calendar.user.calendar;
import calendar.user.CalendarUser;

/**
 * Sovelluslogiikasta vastaava luokka 
 */

public class CalendarOver {
    private calendar calendar;
    private CalendarUser calendarUser;
    private User loggedIn;
    
    public CalendarOver(calendar calendar, CalendarUser calendarUser) {
        this.calendarUser = calendarUser;
        this.calendar = calendar;
    }
    
    /**
    * Uuden todon lisääminen kirjautuneena olevalle käyttäjälle
    *
    * @param   content   luotavan todon sisältö
    */
    
    public boolean createCalendar(String content) {
        Calendar mark = new Calendar(content, loggedIn);
        try {   
            calendar.create(mark);
        } catch (Exception ex) {
            return false;
        }
        return true;
    }
    
    /**
    * kirjautuneen käyttäjän tekemättömät todot
    * 
    * @return kirjautuneen käyttäjän tekemättömät todot
    */
    
    public List<Calendar> getUndone() {
        if (loggedIn == null) {
            return new ArrayList<>();
        }
          
        return calendar.getAll()
            .stream()
            .filter(t-> t.getUser().equals(loggedIn))
            .filter(t->!t.isDone())
            .collect(Collectors.toList());
    }
   
    /**
    * todon merkitseminen tehdyksi
    * 
    * @param   id   tehdyksi merkittävän todon tunniste
    */    
    
    public void markDone(int id) {
        try {
            calendar.setDone(id);
        } catch (Exception ex) {
        }
    }
    
    /**
    * sisäänkirjautuminen
    * 
    * @param   username   käyttäjätunnus
    * 
    * @return true jos käyttäjätunnus on olemassa, muuten false 
    */    
    
    public boolean login(String username) {
        User user = calendarUser.findByUsername(username);
        if (user == null) {
            return false;
        }
        
        loggedIn = user;
        
        return true;
    }
    
    /**
    * kirjautuneena oleva käyttäjä
    * 
    * @return kirjautuneena oleva käyttäjä 
    */   
    
    public User getLoggedUser() {
        return loggedIn;
    }
   
    /**
    * uloskirjautuminen
    */  
    
    public void logout() {
        loggedIn = null;  
    }
    
    /**
    * uuden käyttäjän luominen
    * 
    * @param   username   käyttäjätunnus
    * @param   name   käyttäjän nimi
    * 
    * @return true jos käyttäjätunnus on luotu onnistuneesti, muuten false 
    */ 
    
    public boolean createUser(String username, String name)  {   
        if (calendarUser.findByUsername(username) != null) {
            return false;
        }
        User user = new User(username, name);
        try {
            calendarUser.create(user);
        } catch(Exception e) {
            return false;
        }

        return true;
    }
    package calendar.user;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import Calendar.Calendar;
import Calendar.User;

public class CalendarFile implements calendar {
    public List<Calendar> todos;
    private String file;

    public CalendarFile(String file, CalendarUser users) throws Exception {
        todos = new ArrayList<>();
        this.file = file;
        try {
            Scanner reader = new Scanner(new File(file));
            while (reader.hasNextLine()) {
                String[] parts = reader.nextLine().split(";");
                int id = Integer.parseInt(parts[0]);
                boolean done = Boolean.parseBoolean(parts[2]);
                User user = users.getAll().stream().filter(u->u.getUsername().equals(parts[3])).findFirst().orElse(null); 
                Calendar todo = new Calendar(id, parts[1], done, user);
                todos.add(todo);
            }
        } catch (Exception e) {
            FileWriter writer = new FileWriter(new File(file));
            writer.close();
        }
        
    }
    
    private void save() throws Exception{
        try (FileWriter writer = new FileWriter(new File(file))) {
            for (Calendar todo : todos) {
                writer.write(todo.getId() + ";" + todo.getContent() + ";" + todo.isDone() + ";" + todo.getUser().getUsername() + "\n");
            }
        }
    }    
    
    private int generateId() {
        return todos.size() + 1;
    }
    
    @Override
    public List<Calendar> getAll() {
        return todos;
    }
    
    @Override
    public Calendar create(Calendar todo) throws Exception {
        todo.setId(generateId());
        todos.add(todo);
        save();
        return todo;
    }   
    
    @Override
    public void setDone(int id) throws Exception {
        for (Calendar t : todos) {
            if (t.getId() == id) {
                t.setDone();
            }
        }
        save();
    }    




}
}
}
