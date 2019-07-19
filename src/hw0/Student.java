/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw0;

/**
* This class represents a student with a name, a homework grade, and 2 exam grades.
 */
public class Student 
{ 
    // these are the student scores (0-100) on exam 1, exam 2, homework
    private int exam1grade, exam2grade, hwgrade;
    
    /**
     * Constructs a student with the given name.
     * Fill this in.
     */
    public Student(String name)
    {

    }
    
    
    /**
     * Returns the student's name
     */
    public String getName()
    {
        return "";
    }
    
    
    /**
     * Returns the student's grade in the class (0-100).
     * Homeworks (collectively) are worth 50% of the total grade.
     * Exam 1 is worth 20% of the total grade.
     * Exam 2 is worth 30% of the total grade.
     * The average cannot be less than 0 or greater than 100.
     */
    public int getAverage()
    {
        return 0;
    }
    
    /**
     * Returns the student's letter grade in the class.
     * A is 90% and above.
     * B is 80% and above.
     * C is 70% and above.
     * D is 60% and above.
     * F is anything below 60%.
     */
    public String getLetterGrade()
    {
        return "F";
    }
    
    /**
     * Sets the student's exam 1 grade
     */
    public void setExam1Grade(int grade)
    {
        exam1grade = grade;
    }
    
    /**
     * Sets the student's exam 2 grade
     */
    public void setExam2Grade(int exam2grade)
    {
        this.exam2grade = exam2grade;
    }
    
    /**
     * Sets the student's homework grade
     */
    public void setHWGrade(int grade)
    {
        hwgrade = grade;
    }
    
    /**
     * Returns the student's homework grade
     */
    public int getHWGrade()
    {
        return hwgrade;
    }
    
    /**
     * Returns the student's exam 2 grade
     */
    public int getExam2Grade()
    {
        return exam2grade;
    }
    
    /**
     * Returns the student's exam 1 grade
     */
    public int getExam1Grade()
    {
        return exam1grade;
    }
    
    
    
}
