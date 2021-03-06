package lab1;

import javax.swing.JOptionPane;

/**
 * Describe responsibilities here.
 * @author      Alex Gaudynski
 */
public class AdvancedJavaCourse extends StandardSchoolCourse {
    
    
    //private String courseName;
    //private String courseNumber;
    //private String prerequisites;
    private double credits;    

    // Constructor
    public AdvancedJavaCourse(String courseName, String courseNumber, String prerequisites) {
        this.setCourseName(courseName);
        this.setCourseNumber(courseNumber);
        this.setPrerequisites(prerequisites);
    }

    
    // Set in class to allow for credit max variation
    @Override
    public void setCredits(double credits) {
        if(credits < 0.5 || credits > 5.0) {
            JOptionPane.showMessageDialog(null,
                    "Error: credits must be in the range 0.5 to 5.0");
            System.exit(0);
        }
        else
        {
        this.credits = credits;
        }
    }
    
    
    @Override
    public double getCredits() {
        return credits;
    }
    
    
    
}
