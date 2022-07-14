/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Latihan7Vol2;

/**
 *
 * @author Lucky
 */
class GradedActivity{
    double score;
    String name;
    
    public String GradedActivity(String n){
        return null;
    }
    
    public void setScore(double s){
        
    }
    
    public double getScore(){
        return 0;        
    }
    
    public char getGrade(){
        return 0;
    }
}

class FinalExam extends GradedActivity{
    int numberOfQuestion, numberMissed;
    double pointsPerQuestion;   
    
    public void FinalExam(int question, int missed){
    }
    
    public double getPointsPerQuestion(){
        return 0;
    }
    
    public int getNumberMissed(){
        return 0;
    }
}

class PassFailActivity extends GradedActivity{
    double minimumPassingScore;
    
    public double PassFailActivity(double min){
        return 0;
    }
    
    public char getGrade(){
        return 0;
    }
}

class PassFailExam extends PassFailActivity{
    int numberOfQuestion, numberMissed;
    double pointsPerQuestion;
    
    public void PassFailExam(int question, int missed, double passing){
        
    }
    
    public double getPointEach(){
        return 0;
    }
    
    public int getNumberMissed(){
        return 0;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("main");
    }
}
