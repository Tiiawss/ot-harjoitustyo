
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nytiia
 */
public class Game {
     Scanner scan;
     ArrayList<Integer> rivi1 = new ArrayList<Integer>(); 
     ArrayList<Integer> rivi2 = new ArrayList<Integer>(); 
      ArrayList<Integer> rivi3 = new ArrayList<Integer>(); 
            
            
    
    
    //tähän myös linkki uiseen 
    public Game (Scanner scan){
        this.scan = scan;
        this.rivi1= rivi1;
        this.rivi2= rivi2;
        this.rivi3= rivi3;
        
        
    }
    
   
   
    
    
   public boolean Start(){
       
       System.out.println("Tervetuloa pelaamaan ristinollaa, ruudukko on 3x3 ja pelaaja 1 aloittaa pelimerkillä X");
      setGame();
       while (true){
           System.out.println("Pelaaja 1 valitse merkin X paikka, syötä paikka ensin vaaka ja sitten pysty suunnassa.(1,2 tai 3)");
           int x1 = scan.nextInt(); 
           int x2 = scan.nextInt(); 
           PlaceX(x1,x2);
           if (IsDone()){
               return true;
               
               
           }
           System.out.println("Pelaaja 2 valitse merkin O paikka, syötä paikka ensin vaaka ja sitten pysty suunnassa.(1,2 tai 3)");
           int o1 = scan.nextInt(); 
           int o2 = scan.nextInt(); 
           PlaceO(o1,o2);
             if (IsDone()){
               return true;
               
           }
           
       }
       
   }
    public void setGame(){
  
       rivi1.add(0, 2);
       rivi1.add(1, 2);
       rivi1.add(2, 2);
       rivi2.add(0, 2);
       rivi2.add(1, 2);
       rivi2.add(2, 2);
       rivi3.add(0, 2);
       rivi3.add(1, 2);
       rivi3.add(2, 2);
    }
   
   public  void PlaceX(int x1, int x2){
       if(x1==1){
           if (x2==1)  rivi1.add(0, 1);
           if (x2==2)  rivi1.add(1, 1);
           if (x2==3)  rivi1.add(2, 1);
           
       }
       if (x1==2){
            if (x2==1)  rivi2.add(0, 1);
           if (x2==2)  rivi2.add(1, 1);
           if (x2==3)  rivi2.add(2, 1);
           
       }
       
       if (x1==3){
            if (x2==1)  rivi3.add(0, 1);
           if (x2==2)  rivi3.add(1, 1);
           if (x2==3)  rivi3.add(2, 1);
           
       }
     
       
   }
   public ArrayList PlaceO(int x1, int x2){
       if(x1==1){
           if (x2==1)  rivi1.add(0, 1);
           if (x2==2)  rivi1.add(1, 1);
           if (x2==3)  rivi1.add(2, 1);
           
       }
       if (x1==2){
            if (x2==1)  rivi2.add(0, 1);
           if (x2==2)  rivi2.add(1, 1);
           if (x2==3)  rivi2.add(2, 1);
           
       }
       
       if (x1==3){
            if (x2==1)  rivi3.add(0, 1);
           if (x2==2)  rivi3.add(1, 1);
           if (x2==3)  rivi3.add(2, 1);
           
       }
       return rivi1;
   }
    
    public boolean IsDone(){
        if(rivi1.get(0)==0  &&rivi1.get(1)==0 &&rivi1.get(2)==0  ) {
            System.out.println("Pelaaja 2 voitti");
            return true;
            
        }else if(rivi2.get(0)==0  &&rivi2.get(1)==0 &&rivi2.get(2)==0  ) {
            System.out.println("Pelaaja 2 voitti");
            return true;
            
        }else if (rivi3.get(0)==0  &&rivi3.get(1)==0 &&rivi3.get(2)==0  ) {
            System.out.println("Pelaaja 2 voitti");
            return true;
        }else if(rivi1.get(0)==1  &&rivi1.get(1)==1 &&rivi1.get(2)==1  ) {
            System.out.println("Pelaaja 1 voitti");
            return true;
        }else if(rivi2.get(0)==1  &&rivi2.get(1)==1 &&rivi2.get(2)==1 ) {
            System.out.println("Pelaaja 1 voitti");
            return true;
            
        }else if (rivi3.get(0)==1  &&rivi3.get(1)==1 &&rivi3.get(2)==1  ) {
            System.out.println("Pelaaja 1 voitti");
            return true;
        
        }else if(rivi1.get(0)==1  &&rivi2.get(0)==1 &&rivi3.get(0)==1 ) {
            System.out.println("Pelaaja 1 voitti");
            return true;
            
        }else if (rivi1.get(1)==1  &&rivi2.get(1)==1 &&rivi3.get(1)==1  ) {
            System.out.println("Pelaaja 1 voitti");
            return true;
        }else if(rivi1.get(2)==1  &&rivi2.get(2)==1 &&rivi3.get(2)==1  ) {
            System.out.println("Pelaaja 1 voitti");
            return true;   
         }else if(rivi1.get(0)==0  &&rivi2.get(0)==0 &&rivi3.get(0)==0 ) {
            System.out.println("Pelaaja 2 voitti");
            return true;
            
        }else if (rivi1.get(1)==0  &&rivi2.get(1)==0 &&rivi3.get(1)==0  ) {
            System.out.println("Pelaaja 2 voitti");
            return true;
        }else if(rivi1.get(2)==0  &&rivi2.get(2)==0 &&rivi3.get(2)==0  ) {
            System.out.println("Pelaaja 2 voitti");
            return true;    
        }else if(rivi1.get(0)==0  &&rivi2.get(1)==0 &&rivi3.get(2)==0  ) {
            System.out.println("Pelaaja 2 voitti");
            return true;    
        }else if(rivi1.get(2)==0  &&rivi2.get(1)==0 &&rivi3.get(0)==0  ) {
            System.out.println("Pelaaja 2 voitti");
            return true;    
        }else if(rivi1.get(0)==1  &&rivi2.get(1)==1 &&rivi3.get(2)==1  ) {
            System.out.println("Pelaaja 1 voitti");
            return true;    
        }else if(rivi1.get(2)==1  &&rivi2.get(1)==1 &&rivi3.get(0)==1  ) {
            System.out.println("Pelaaja 1 voitti");
            return true;    
        }
        
        
        
        
        return false;
        
        
    }
    
    
    
}
