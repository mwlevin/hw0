/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw0;

/**
 * This student has a makeup exam to replace their exam 2 grade. 
 * The exam 2 grade used to calculate their average score is the higher of their original exam 2 grade and their makeup exam grade.
 */
public class StudentWithMakeupExam extends Student
{    
    public StudentWithMakeupExam(String name)
    {
        super(name);
    }
    
    /**
     * Returns the makeup exam score given to this student.
     */
    public int getMakeupScore()
    {
        return 0;
    }
    
    /**
     * Updates the makeup exam score for this student.
     */
    public void setMakeupScore(int score)
    {
        
    }
    
    /**
     * Returns the exam 2 grade for the student, which is the higher of the original grade and the makeup score.
     */
    public int getExam2Grade()
    {
        return super.getExam2Grade();
    }
    
}
