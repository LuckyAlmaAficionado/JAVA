/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg03.latihan.part.pkg1;

/**
 *
 * @author Lucky
 */

// Class player
class Player{
    String name;
    double health;
    int level;
    // object member
    Weapon weapon;
    Armor armor;
    
    Player(String name, double health){
        this.name = name;
        this.health = health;
    }
    void equipWeapon(Weapon weapon){
        this.weapon = weapon;
    }
    void equipArmor(Armor armor){
        this.armor = armor;
    }
    void display(){
        System.out.println("\nName: " + this.name);
        System.out.println("Health: " + this.health);
        this.weapon.display();
        this.armor.display();
    }
    
}

// Senjata
class Weapon{
    double attackPower;
    String name;
    Weapon(String name, double attackPower){
        this.name = name;
        this.attackPower = attackPower;
    }
    
    void display(){
        System.out.println("Weapon: " + this.name + ", Power: " + this.attackPower);
    }
}
// Armor
class Armor{
    String name;
    double defencePower;
    
    Armor(String name, double defencePower){
        this.name = name;
        this.defencePower = defencePower;
    }
    
    void display(){
        System.out.println("Weapon: " + this.name + ", Power: " + this.defencePower);
    }
}


class Main{
    public static void main(String[] args) {

        // membuat object player
        Player player1 = new Player("ucup", 100);
        Player player2 = new Player("otong", 50);
    
        // membuat object weapon
        Weapon pedang = new Weapon("pedang", 15);
        Weapon ketapel = new Weapon("ketapel", 1);
        
        // membuat object armor
        Armor bajuBesi = new Armor("baju besi", 10);
        Armor kaos = new Armor("kaos", 0);
        
        // player 1
        // equip senjata dan armor
        player1.equipWeapon(pedang);
        player1.equipArmor(bajuBesi);
        player1.display();
        
        // player 2
        player2.equipWeapon(ketapel);
        player2.equipArmor(kaos);
        player2.display();
    }
}