/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package studentandcourse;

/**
 *
 * @author Lucky
 */

class Student{
    private int nim;
    private String nama;
    private Course[] courseList = new Course[60];
    private int countCourse;
    
    public Student(int id, String n){
        nim = id;
        nama = n;
    }
    
    public void addCourse(Course s){
        courseList[countCourse] = s;
        countCourse++;
    }
    
    public int getCountCourse(){
        return countCourse;
    }
}

class Course{
    private String courseName;
    
    public Course(String n){
        System.out.println("Course Name");
        courseName = n;
    }
}


public class StudentAndCourse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Student p = new Student(123, "pevita");
        p.addCourse(new Course("PBO"));
        p.addCourse(new Course("IMK"));
        p.addCourse(new Course("Test"));
        System.out.println("Kelas = " + p.getCountCourse());
    }
    
}
