// Department.java

import java.util.ArrayList;

public class Department {
    private String departmentName;
    private ArrayList<Course> courses;
    private ArrayList<Faculty> facultyMembers;

    public Department(String departmentName) {
        this.departmentName = departmentName;
        this.courses = new ArrayList<>();
        this.facultyMembers = new ArrayList<>();
    }

    // Getters and setters

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public ArrayList<Faculty> getFacultyMembers() {
        return facultyMembers;
    }

    public void addFacultyMember(Faculty faculty) {
        facultyMembers.add(faculty);
    }

    public void displayInfo() {
        System.out.println("Department Name: " + departmentName);
        System.out.println("Courses Offered:");
        for (Course course : courses) {
            System.out.println(course.getCourseName());
        }
        System.out.println("Faculty Members:");
        for (Faculty faculty : facultyMembers) {
            System.out.println(faculty.getName());
        }
    }
}
