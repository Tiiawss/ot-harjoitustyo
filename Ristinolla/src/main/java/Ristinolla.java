
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
public class Ristinolla {

    /**
     * @param args the command line arguments
     */
    //laitetaan myöhemmin olioksi ristikonluonti
    ArrayList<Integer> rivi1 = new ArrayList<Integer>(); 
    
    ArrayList<Integer> rivi2 = new ArrayList<Integer>(); 
    ArrayList<Integer> rivi3 = new ArrayList<Integer>(); 
    Scanner scan = new Scanner(System.in);
    
   public boolean peli(){
       rivi1.add(0, 2);
       rivi1.add(1, 2);
       rivi1.add(2, 2);
              rivi2.add(0, 2);
       rivi2.add(1, 2);
       rivi2.add(2, 2);
              rivi3.add(0, 2);
       rivi3.add(1, 2);
       rivi3.add(2, 2);
       while (true){
           System.out.println("Pelaaja 1 valitse merkin X paikka");
           int x1 = scan.nextInt(); 
           int x2 = scan.nextInt(); 
           sijoitax(x1,x2);
           if (loppu()){
               return true;
               
           }
           System.out.println("Pelaaja 2 valitse merkin O paikka");
           int o1 = scan.nextInt(); 
           int o2 = scan.nextInt(); 
           sijoitao(o1,o2);
             if (loppu()){
               return true;
               
           }
           
       }
       
       
       
       
   }
   
   public ArrayList sijoitax(int x1, int x2){
       if(x1==1){
           if (x2==1)  rivi1.add(0, 1);
           if (x2==2)  rivi1.add(1, 1);
           if (x2==3)  rivi1.add(2, 1);
           
       }
       if (x1==2){
            if (x2==1)  rivi3.add(0, 1);
           if (x2==2)  rivi3.add(1, 1);
           if (x2==3)  rivi3.add(2, 1);
           
       }
       
       if (x1==3){
            if (x2==1)  rivi3.add(0, 1);
           if (x2==2)  rivi3.add(1, 1);
           if (x2==3)  rivi3.add(2, 1);
           
       }
       return rivi1;
   }
   public ArrayList sijoitao(int x1, int x2){
       if(x1==1){
           if (x2==1)  rivi1.add(0, 1);
           if (x2==2)  rivi1.add(1, 1);
           if (x2==3)  rivi1.add(2, 1);
           
       }
       if (x1==2){
            if (x2==1)  rivi3.add(0, 1);
           if (x2==2)  rivi3.add(1, 1);
           if (x2==3)  rivi3.add(2, 1);
           
       }
       
       if (x1==3){
            if (x2==1)  rivi3.add(0, 1);
           if (x2==2)  rivi3.add(1, 1);
           if (x2==3)  rivi3.add(2, 1);
           
       }
       return rivi1;
   }
    
    public boolean loppu(){
        if(rivi1.get(0)==0  &&rivi1.get(1)==0 &&rivi1.get(2)==0  ) {
            return true;
            
        }else if(rivi2.get(0)==0  &&rivi2.get(1)==0 &&rivi2.get(2)==0  ) {
            return true;
            
        }else if (rivi3.get(0)==0  &&rivi3.get(1)==0 &&rivi3.get(2)==0  ) {
            return true;
        }else if(rivi2.get(0)==1  &&rivi2.get(1)==1 &&rivi2.get(2)==1 ) {
            return true;
            
        }else if (rivi3.get(0)==1  &&rivi3.get(1)==1 &&rivi3.get(2)==1  ) {
            return true;
        }else if(rivi2.get(0)==1  &&rivi2.get(1)==1 &&rivi2.get(2)==1  ) {
            return true;
            
        }
        
        return false;
        
        
    }
    public static void main(String[] args) {
        // TODO code application logic here
        
        Ristinolla r = new Ristinolla();
        r.peli();
    }
    
}
