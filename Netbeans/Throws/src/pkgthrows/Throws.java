/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkgthrows;

/**
 *
 * @author Lucky
 */
class Account{
    protected double balance;
    protected Account(double initBalance){
        balance = initBalance;
    }
    
    public double getBalance(){
        return this.balance;
    }
    
    public void deposit(double amt){
        balance += amt;
    }
}

public class Throws {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Account[] account = new Account[100];
        account[0] = new Account(1000000);
        account[1] = new Account(2000000);

        
    }
}
