/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw0;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author mlevin
 */
public class Main {
    public static void main(String[] args) throws IOException
    {
        Student s1 = new Student("Barry Fast");
        s1.setHWGrade(87);
        s1.setExam1Grade(65);
        s1.setExam2Grade(54);
        
        System.out.println("Name: "+s1.getName());
        System.out.println("Average: "+s1.getAverage());
        System.out.println("Grade: "+s1.getLetterGrade());
        System.out.println();
        
        ClassRoster roster = new ClassRoster();
        roster.readFile(new File("students.txt"));
        System.out.println("Size: "+roster.getClassSize());
        System.out.println("Best student: "+roster.getBestStudent());
        System.out.println("% with A: "+roster.getPercentWithGrade("A"));
        System.out.println();
        
        StudentWithMakeupExam s5 = new StudentWithMakeupExam("Ned Dubois");
        s5.setHWGrade(66);
        s5.setExam1Grade(67);
        s5.setExam2Grade(38);
        s5.setMakeupScore(85);
        
        System.out.println("Name: "+s5.getName());
        System.out.println("Makeup score: "+s5.getMakeupScore());
        System.out.println("Exam 2 score: "+s5.getExam2Grade());
        System.out.println("Average: "+s5.getAverage());
        System.out.println("Grade: "+s5.getLetterGrade());
        System.out.println();
        
        Autograde.testCode();
    }
}
