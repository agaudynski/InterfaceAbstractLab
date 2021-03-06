package lab2;

import javax.swing.JOptionPane;

/**
 * Describe responsibilities here.
 *
 * @author      your name goes here
 * @version     1.00
 */
public class IntroToProgrammingCourse implements GeneralCollegeCourse {
    
    private String courseName;
    private String courseNumber;
    private double credits;
    private String prerequisites;

    
    // Constructor
    public IntroToProgrammingCourse(String courseName, String courseNumber) {
        this.setCourseName(courseName);
        this.setCourseNumber(courseNumber);
        prerequisites = "None";
    }

    
    // Getters
    
    @Override
    public String getCourseNumber() {
        return courseNumber;
    }
    
    @Override
    public double getCredits() {
        return credits;
    }
    
    @Override
    public String getCourseName() {
        return courseName;
    }
    
    @Override
    public String getPrerequisites() {
        return prerequisites;
    }
    
    @Override
    public String getCapitalizedCourseName() {
        return courseName.toUpperCase();
    }


    // Setters

    @Override
    public void setCourseNumber(String courseNumber) {
        if(courseNumber == null || courseNumber.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: courseNumber cannot be null of empty string");
            System.exit(0);
        }
        this.courseNumber = courseNumber;
    }


    @Override
    public void setCredits(double credits) {
        if(credits < 0.5 || credits > 3.0) {
            JOptionPane.showMessageDialog(null,
                    "Error: credits must be in the range 0.5 to 3.0");
            System.exit(0);
        }
        this.credits = credits;
    }


    @Override
    public void setCourseName(String courseName) {
        if(courseName == null || courseName.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: courseName cannot be null of empty string");
            System.exit(0);
        }
        this.courseName = courseName;
        }
  


    @Override
    public void setPrerequisites(String prerequisites) {
        if(prerequisites == null || prerequisites.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: courseName cannot be null of empty string");
            System.exit(0);
        }
        this.prerequisites = prerequisites;
        }

    
}
