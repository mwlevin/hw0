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
public class Autograde {
    
    
    public static void testCode() throws IOException
    {
        studentClassTest();
        classRosterTest();
        makeupExamTest();
        
        
        System.err.println("This is an unofficial score, please submit code for final scoring.");
        
    }
    
    
    public static void makeupExamTest()
    {

        int points = 0;
        int possible = 0;
        
        
        
        Student s2 = new Student("Riesey van Huyten");
        s2.setHWGrade(88);
        s2.setExam1Grade(84);
        s2.setExam2Grade(81);
        
        StudentWithMakeupExam s5 = new StudentWithMakeupExam("Ned Dubois");
        s5.setHWGrade(66);
        s5.setExam1Grade(67);
        s5.setExam2Grade(38);
        s5.setMakeupScore(85);
        
        StudentWithMakeupExam s6 = new StudentWithMakeupExam("Forrest Calhoun");
        s6.setHWGrade(73);
        s6.setExam1Grade(81);
        s6.setExam2Grade(57);
        s6.setMakeupScore(42);


        possible = 7;
        
        points += s2.getAverage() == 85? 1 : 0;
        points += s2.getLetterGrade().equals("B")? 1 : 0;
        points += s5.getMakeupScore() == 85? 1 : 0;
        points += s5.getAverage() == 72? 1 : 0;
        points += s5.getLetterGrade().equals("C")? 1 : 0;
        points += s6.getAverage() == 70? 1 : 0;
        points += s6.getLetterGrade().equals("C")? 1 : 0;
        
        System.err.println("\tTesting StudentWithMakeupExam.class: \t"+String.format("%.2f", (double)points/possible*100)+"%");
    }
    
    public static void classRosterTest() throws IOException
    {

        
        int points = 0;
        int possible = 0;
        
        ClassRoster roster = new ClassRoster();
        roster.readFile(new File("students.txt"));
        
        possible = 7;
        
        points += roster.getClassSize() == 5? 1 : 0;
        points += roster.getBestStudent().equals("Jimmy Poole")? 1 : 0;
        points += roster.getPercentWithGrade("A") == 20? 1 : 0;
        points += roster.getPercentWithGrade("B") == 20? 1 : 0;
        points += roster.getPercentWithGrade("C") == 40? 1 : 0;
        points += roster.getPercentWithGrade("D") == 0? 1 : 0;
        points += roster.getPercentWithGrade("F") == 20? 1 : 0;
        
        System.err.println("\tTesting ClassRoster.class: \t"+String.format("%.2f", (double)points/possible*100)+"%");
        
        
    }
    
    public static void studentClassTest()
    {
        
        
        int points = 0;
        int possible = 10;
        
        
        Student s1 = new Student("Barry Fast");
        s1.setHWGrade(87);
        s1.setExam1Grade(65);
        s1.setExam2Grade(54);
        
        
        Student s2 = new Student("Riesey van Huyten");
        s2.setHWGrade(88);
        s2.setExam1Grade(84);
        s2.setExam2Grade(81);
        
        
        Student s3 = new Student("Jimmy Poole");
        s3.setHWGrade(101);
        s3.setExam1Grade(100);
        s3.setExam2Grade(110);
        
        Student s4 = new Student("Styx Carson");
        s4.setHWGrade(20);
        s4.setExam1Grade(-30);
        s4.setExam2Grade(-40);
        
        points += s1.getName().equals("Barry Fast")? 1 : 0;
        points += s2.getName().equals("Riesey van Huyten")? 1 : 0;
        
        
        
        points += s2.getAverage() == 85? 1 : 0;
        points += s1.getAverage() == 73? 1 : 0;
        points += s3.getAverage() == 100? 1 : 0;
        points += s4.getAverage() == 0? 1 : 0;


        
        points += s1.getLetterGrade().equals("C")? 1 : 0;
        points += s2.getLetterGrade().equals("B")? 1 : 0;
        points += s3.getLetterGrade().equals("A")? 1 : 0;
        points += s4.getLetterGrade().equals("F")? 1 : 0;
        
        
        System.err.println("\tTesting Student.class: \t"+String.format("%.2f", (double)points/possible*100)+"%");
    }
}
