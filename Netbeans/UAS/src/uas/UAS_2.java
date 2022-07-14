/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package uas;

/**
 *
 * @author Lucky
 */
public class UAS_2 {
    abstract class Animal {
        public abstract void checkup();
        public abstract void breath();
    }
    class Dog extends Animal {
        public void checkup() {
            System.out.println("Dog checkup");
        }

        @Override
        public void breath() {
            System.out.println("Dog breath");
        }
    }
    class Cat extends Animal implements LivingThing{
        public void checkup(){
            System.out.println("Cat checkup");
        }

        @Override
        public void breath() {
            System.out.println("Cat breath");            
        }

        @Override
        public void walk() {
            System.out.println("Cat walk");    
        }

        @Override
        public void eat() {
            System.out.println("Cat eat");
        }
    }
    
    class Bird extends Animal{
        public void breath(){
            System.out.println("Bird breathing.");
        }

        @Override
        public void checkup() {
            System.out.println("Bird checkup");
        }
    }
    public interface LivingThing{
        public void walk();
        public void eat();
    }
    
    public class Human implements LivingThing
    { 
        public void breath(){
            System.out.println("Human breathing.");
        }

        @Override
        public void walk() {
            System.out.println("Human walk");
        }

        @Override
        public void eat() {
            System.out.println("Human eat");
        }
    }
}
