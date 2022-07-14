/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hashmap;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Lucky
 */
class ATM{
    protected int pw;
    protected String username;
    protected Map<Integer, String> hashMap = new HashMap<Integer, String>();
    
    protected ATM(){
    }
    
    protected void addAccount(int pw, String user){
        this.pw = pw;
        this.username = user;
        hashMap.put(pw, username);
    }
    
    protected void checkAccount(int pw){
        String x = hashMap.get(pw);
        try{
            if (!x.equals(null)) {
                System.out.println("account ready");
            }
        } catch (Exception e){
            System.out.println("create account first");
        }
        
    }
}

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ATM user = new ATM();
        user.addAccount(9801, "Alma"); 
        user.addAccount(9802, "Gale"); 
        user.addAccount(9803, "Nado"); 
        user.checkAccount(981);
                
    }
    
}
