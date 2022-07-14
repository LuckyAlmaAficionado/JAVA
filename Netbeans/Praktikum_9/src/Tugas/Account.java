/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Tugas;

/**
 *
 * @author Lucky
 */
public class Account {
    protected double balance;
    protected Account(double initBalance){
        balance = initBalance;
    }
    public double getBalance(){
        return balance;
    }
    public void deposit(double amt){
        balance = balance + amt;
    }
    public void withdraw(double amt) throws OverdraftException{
        if(amt<=balance){
            balance -= amt;
        }else{
            throw new OverdraftException("Dana Anda tidak cukup", amt-balance);
        }
    }
}

class OverdraftException extends Exception{
    private final double deficit;
    public OverdraftException(String msg, double deficit){
        super(msg);
        this.deficit = deficit;
    }
    public double getDeficit(){
        return deficit;
    }
}

class testBank2{
    public static void main(String[] args) {
        Account [] account= new Account[100];
        account[0] = new Account(200000);
        account[1] = new Account(0);
        for (int i = 0; i < 2; i++) {
            double b = account[i].getBalance();
            System.out.println("Saldo akhir account ke " + i + " = " + b);
            try{
                account[i].withdraw(10000);
            }catch(OverdraftException ode){
                System.err.println(""+ode);
            }
        }
    }
}