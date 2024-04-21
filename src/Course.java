// Course.java

import java.util.ArrayList;

public class Course {
    private String courseName;
    private String courseCode;
    private Faculty assignedFaculty;
    private ArrayList<Student> enrolledStudents;

    public Course(String courseName, String courseCode, Faculty assignedFaculty) {
        if (courseCode == null || courseCode.trim().isEmpty()) {
            throw new IllegalArgumentException("Course code cannot be blank");
        }
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.assignedFaculty = assignedFaculty;
        this.enrolledStudents = new ArrayList<>();
    }

    // Getters and setters

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public Faculty getAssignedFaculty() {
        return assignedFaculty;
    }

    public void setAssignedFaculty(Faculty assignedFaculty) {
        this.assignedFaculty = assignedFaculty;
    }

    public ArrayList<Student> getEnrolledStudents() {
        return enrolledStudents;
    }

    public void enrollStudent(Student student) {
        enrolledStudents.add(student);
    }

    public void displayInfo() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Course Code: " + courseCode);
        System.out.println("Assigned Faculty: " + assignedFaculty.getName());
        System.out.println("Enrolled Students:");
        for (Student student : enrolledStudents) {
            System.out.println(student.getName());
        }
    }
}
