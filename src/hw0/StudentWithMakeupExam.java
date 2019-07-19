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
    
    public int getMakeupScore()
    {
        return 0;
    }
    
    public void setMakeupScore(int score)
    {
        
    }
    
}
