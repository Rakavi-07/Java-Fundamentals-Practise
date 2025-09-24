// StudentMarksSystem.java

// Student class with encapsulation
class Student {
    private String name;
    private int marks; // private - cannot be accessed directly

    // Constructor
    public Student(String name) {
        this.name = name;
    }

    // Getter - students can only view marks
    public int getMarks() {
        return marks;
    }

    public String getName() {
        return name;
    }

    // Setter - only teachers should use this
    public void setMarks(int marks, String role) {
        if (role.equals("Teacher")) {
            this.marks = marks;
            System.out.println("Marks updated by teacher.");
        } else {
            System.out.println("Access Denied! Only teachers can update marks.");
        }
    }
}

// Main class
public class StudentMarksSystem {
    public static void main(String[] args) {
        Student s1 = new Student("Rahul");

        // Student trying to set marks
        s1.setMarks(90, "Student");  

        // Teacher setting marks
        s1.setMarks(90, "Teacher");  

        // Student viewing marks
        System.out.println(s1.getName() + " scored: " + s1.getMarks());
    }
}
