/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex6;

import java.util.List;

/**
 *
 * @author Tong
 */
public class Ex6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Student std1 = new Student(1, "Yotsapol", 4.00);
        //StudentTable.insertStudent(std1);
        //System.out.println(StudentTable.findStudentById(1));    //find by ID
        
        //update std1
        Student updateStd1 = new Student(1, "Yotsapol", 3.50);
        StudentTable.updateStudent(updateStd1);
        System.out.println(StudentTable.findStudentByName("Yotsapol"));    //find by Name
        
        //delete std1
        StudentTable.removeStudent(std1);
        System.out.println(StudentTable.findAllStudent());      //find all Student
    }
    
    
    public static void printAllStudent(List<Student> stdList) {
        for(Student std : stdList) {
           System.out.print(std.getId() + " ");
           System.out.print(std.getName() + " ");
           System.out.println(std.getGpa() + " ");
       }
    }
}
