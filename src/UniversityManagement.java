import java.util.ArrayList;

public class UniversityManagement implements IManageable {
    private ArrayList<Student> students;
    private ArrayList<Faculty> faculty;
    private ArrayList<Course> courses;
    private ArrayList<Department> departments;

    public UniversityManagement() {
        this.students = new ArrayList<>();
        this.faculty = new ArrayList<>();
        this.courses = new ArrayList<>();
        this.departments = new ArrayList<>();
    }

    // Method overloading to add different entities
    public void add(Person person) {
        if (person instanceof Student) {
            students.add((Student) person);
        } else if (person instanceof Faculty) {
            faculty.add((Faculty) person);
        }
    }

    public void add(Course course) {
        courses.add(course);
    }

    public void add(Department department) {
        departments.add(department);
    }

    // Method overloading to remove different entities
    public void remove(Person person) {
        if (person instanceof Student) {
            students.remove((Student) person);
        } else if (person instanceof Faculty) {
            faculty.remove((Faculty) person);
        }
    }

    public void remove(Course course) {
        courses.remove(course);
    }

    public void remove(Department department) {
        departments.remove(department);
    }

    // Method overloading to update different entities
    public void update(Student student) throws InvalidDataException {
        try {
            if (student.getGPA() < 0) {
                throw new InvalidDataException("GPA cannot be negative.");
            }
            // Update student information
        } catch (InvalidDataException e) {
            System.out.println(e.getMessage());
        }
    }

    public void update(Course course) throws InvalidDataException {
        try {
            // Check for invalid course code
            if (course.getCourseCode().isEmpty() || course.getCourseCode().length() != 6) {
                throw new InvalidDataException("Invalid course code.");
            }
            // Update course information
        } catch (InvalidDataException e) {
            System.out.println(e.getMessage());
        }
    }

    public void update(Department department, String newName) {
        try {
            // Check for empty department name
            if (newName.isEmpty()) {
                throw new InvalidDataException("Department name cannot be empty.");
            }
            department.setDepartmentName(newName);
            // Update department information
        } catch (InvalidDataException e) {
            System.out.println(e.getMessage());
        }
    }

    // Method to update faculty department
    public void update(Faculty faculty, String newDepartment) {
        try {
            // Check for empty department name
            if (newDepartment.isEmpty()) {
                throw new InvalidDataException("Department name cannot be empty.");
            }
            faculty.setDepartment(newDepartment);
            // Update faculty information
        } catch (InvalidDataException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void add() {
        // Implement add method from the interface if needed
    }

    @Override
    public void remove() {
        // Implement remove method from the interface if needed
    }

    @Override
    public void update() {
        // Implement update method from the interface if needed
    }
}
