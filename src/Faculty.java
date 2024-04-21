// Faculty.java

import java.util.ArrayList;

public class Faculty extends Person {
    private String department;
    private ArrayList<Course> coursesTaught;

    public Faculty(String name, int age, String ID, String department) {
        super(name, age, ID);
        this.department = department;
        this.coursesTaught = new ArrayList<>();
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public ArrayList<Course> getCoursesTaught() {
        return coursesTaught;
    }

    public void assignCourse(Course course) {
        coursesTaught.add(course);
    }

    @Override
    public void displayInfo() {
        System.out.println("Faculty Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("ID: " + ID);
        System.out.println("Department: " + department);
        System.out.println("Courses Taught:");
        for (Course course : coursesTaught) {
            System.out.println(course.getCourseName());
        }
    }
}
