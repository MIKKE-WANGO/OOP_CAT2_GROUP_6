public class App {
    public static void main(String[] args) {
        // Create students
        Student student1 = new Student("Alice", 20, "S001", 3.5);
        Student student2 = new Student("Bob", 22, "S002", 3.7);

        // Create faculty
        Faculty faculty1 = new Faculty("Dr. Tom", 45, "F001", "Computer Science");
        Faculty faculty2 = new Faculty("Prof. kamau", 50, "F002", "Mathematics");

        // Create courses
        Course course1 = new Course("Introduction to Programming", "CS101", faculty1);
        Course course2 = new Course("Calculus", "MATH101", faculty2);

        // Create departments
        Department csDepartment = new Department("Computer Science");
        Department mathDepartment = new Department("Mathematics");

        // Assign faculty to departments
        csDepartment.addFacultyMember(faculty1);
        mathDepartment.addFacultyMember(faculty2);

        // Assign courses to departments
        csDepartment.addCourse(course1);
        mathDepartment.addCourse(course2);

        // Add students to courses
        course1.enrollStudent(student1);
        course1.enrollStudent(student2);

        // Remove student from a course
        course1.getEnrolledStudents().remove(student1);

        // Assign faculty to courses
        faculty2.assignCourse(course2);

        // Print student information
        student1.displayInfo();
        student2.displayInfo();

        // Print faculty information
        faculty1.displayInfo();
        faculty2.displayInfo();

        // Print course information
        course1.displayInfo();
        course2.displayInfo();

        // Print department information
        csDepartment.displayInfo();
        mathDepartment.displayInfo();

        

        // Update student information (with custom exception handling)
        try {
            student1.setGPA(-3.5); // Trying to set a negative GPA
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Update course information (with custom exception handling)
        try {
            Course invalidCourse = new Course("Invalid Course", "", faculty1); // Invalid course code
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Update department information (with custom exception handling)
        csDepartment.setDepartmentName(""); // Trying to set an empty department name

        // Update faculty department (with custom exception handling)
        try {
            UniversityManagement universityManagement = new UniversityManagement();
            universityManagement.update(faculty1, ""); // Trying to set an empty department name
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
