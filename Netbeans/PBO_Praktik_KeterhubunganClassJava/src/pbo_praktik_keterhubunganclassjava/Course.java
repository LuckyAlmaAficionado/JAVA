/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pbo_praktik_keterhubunganclassjava;

/**
 *
 * @author Lucky
 */
public class Course {

    private String namaCourse;
    private Student[] listStudent = new Student[60];
    private int countStudent;
    private Faculty[] listFaculty = new Faculty[3];
    private int countFaculty;
    
    
    public Course(String namaCourse){
        this.namaCourse = namaCourse;
    }
    
    public String getNameCourse(){
        return namaCourse;
    }
    
    public void addStudent(Student s){
        listStudent[countStudent] = s;
        countStudent++;
    }
    
    public Student[] getStudent(){
        return listStudent;
    }
    
    public int getCountStudent(){
        return countStudent;
    }
    
    public void setFaculty(Faculty f){
        listFaculty[countFaculty] = f;
        countFaculty++;
    }
    
    public Faculty[] getFaculty(){
        return listFaculty;
    }
        
    public int getCountFaculty(){
        return countFaculty;
    }   
    
    public void printStudent(){
        for (int i = 0; i < countStudent; i++) {
            System.out.print(listStudent[i].getNameStudent() + ", ");
        }
    }
    
    public void printTeacher(){
        for (int i = 0; i < countFaculty; i++) {
            System.out.print(listFaculty[i].getNameTeacher()+ ", ");
        }        
    }
    
    public static void main(String[] args) {
        Course pbo = new Course("PBO");
        Course web = new Course("PWL");
        
        pbo.setFaculty(new Faculty("Nurul Anisa"));
        pbo.setFaculty(new Faculty("Abas Setiawan"));
        
       web.setFaculty(new Faculty("Nurul Anisa"));
       web.setFaculty(new Faculty("Syaifur Rochman"));
       
       pbo.addStudent(new Student("Dilan1"));
       pbo.addStudent(new Student("Milea1"));
       
       web.addStudent(new Student("Dilan"));
       web.addStudent(new Student("Milea"));
       
       System.out.println("1. PBO");
       System.out.print("Dosen : ");
       pbo.printTeacher();
       System.out.print("\nMurid ada " + pbo.getCountStudent() + " : ");
       pbo.printStudent();
       System.out.println("");
       
       
       System.out.println("2. WEB");
       System.out.print("Dosen : ");
       web.printTeacher();
       System.out.print("\nMurid ada " + web.getCountFaculty() + " : ");
       web.printStudent();
       System.out.println("");
        
    }
    
}
