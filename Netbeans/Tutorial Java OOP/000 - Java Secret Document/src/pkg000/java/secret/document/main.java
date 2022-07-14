/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg000.java.secret.document;

/**
 *
 * @author Lucky
 */

class Game{
    String name;
    int health;
    // class
    Weapon weapon;
    Armor armor;
    
    Game(String name, int health){
        this.name = name;
        this.health = health;
    }
    
    void useWeapon(Weapon weapon){
        this.weapon = weapon;
    }
    
    void useArmor(Armor armor){
        this.armor = armor;
    }
    
    void displayAll(){
        System.out.println("\nName: " + this.name);
        System.out.println("Health: " + this.health);
        this.weapon.display();
        this.armor.display();
    }
    
}

class Weapon{
    String name;
    int damage;
    
    Weapon(String name, int damage){
        this.name = name;
        this.damage = damage;
    }
    
    void display(){
        System.out.println("Weapon: " + this.name + ", Damage: " + this.damage);
    }
}

class Armor{
    String name;
    int defense;
    
    Armor(String name, int defense){
        this.name = name;
        this.defense = defense;
    }
        
    void display(){
        System.out.println("Weapon: " + this.name + ", Damage: " + this.defense);
    }
}

class main{
    public static void main(String[] args) {
        Game player1 = new Game("Ash", 100);
        Game player2 = new Game("Mirage", 100);
        
        Weapon wingman = new Weapon("Wingman", 45);
        Weapon R_99 = new Weapon("R-99", 30);
        
        Armor blue = new Armor("Blue armor", 50);
        Armor purple = new Armor("Purple armor", 70);
        
        player1.useWeapon(wingman);
        player1.useArmor(blue);
        
        player2.useWeapon(R_99);
        player2.useArmor(purple);
        
        player1.displayAll();
        player2.displayAll();

    }
}