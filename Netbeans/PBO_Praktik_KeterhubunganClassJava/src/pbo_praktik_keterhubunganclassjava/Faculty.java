/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package pbo_praktik_keterhubunganclassjava;

/**
 *
 * @author Lucky
 */
public class Faculty {
    private String teacher;
    private Course[] listCourse = new Course[3];
    private int countCourse;
    
    public Faculty(String teacher){
        this.teacher = teacher;
    }
    
    public String getNameTeacher(){
        return teacher;
    }
    
    public void teachCourse(Course c){
        System.out.print("me");
        listCourse[countCourse] = c;
        countCourse++;
    }
    
    public Course[] getListCourse(){
        return listCourse;
    }
    
    public int getCountCourse(){
        return countCourse;
    }
    
    public static void main(String[] args) {
        
    }
}
