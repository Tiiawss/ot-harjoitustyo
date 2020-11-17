/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calendar.users;

/**
 *
 * @author nytiia
 */
public class Users {
   int maara = 1;
    
    public int maara(){
    maara++;
        return maara;
        
    }
    
    
    @Override
    public String toString(){
        return ""+ maara+"";
    }
    
    
    
    
    
}
