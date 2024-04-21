// Student.java

import java.util.ArrayList;

public class Student extends Person {
    private double GPA;
    private ArrayList<Course> coursesEnrolled;

    public Student(String name, int age, String ID, double GPA) {
        super(name, age, ID);
        this.GPA = GPA;
        this.coursesEnrolled = new ArrayList<>();
    }

    public double getGPA() {
        return GPA;
    }

    public void setGPA(double GPA) {
        try {
            if (GPA < 0) {
                throw new InvalidDataException("GPA cannot be negative");
            }
            this.GPA = GPA;
        } catch (InvalidDataException e) {
            System.out.println(e.getMessage());
        }
    }

    public ArrayList<Course> getCoursesEnrolled() {
        return coursesEnrolled;
    }

    public void enrollCourse(Course course) {
        coursesEnrolled.add(course);
    }

    @Override
    public void displayInfo() {
        System.out.println("Student Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("ID: " + ID);
        System.out.println("GPA: " + GPA);
        System.out.println("Enrolled Courses:");
        for (Course course : coursesEnrolled) {
            System.out.println(course.getCourseName());
        }
    }
}
