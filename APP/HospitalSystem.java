// Base class
class Patient {
    String name;
    int age;

    Patient(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age : " + age);
    }
}

// InPatient subclass
class InPatient extends Patient {
    int roomNumber;

    InPatient(String name, int age, int roomNumber) {
        super(name, age);
        this.roomNumber = roomNumber;
    }

    void display() {
        super.display();
        System.out.println("Room Number: " + roomNumber);
    }
}

// OutPatient subclass
class OutPatient extends Patient {
    String doctorName;

    OutPatient(String name, int age, String doctorName) {
        super(name, age);
        this.doctorName = doctorName;
    }

    void display() {
        super.display();
        System.out.println("Doctor Name: " + doctorName);
    }
}

// Main class
public class HospitalSystem {
    public static void main(String[] args) {
        InPatient p1 = new InPatient("Rahul", 25, 101);
        OutPatient p2 = new OutPatient("Priya", 30, "Dr. Mehta");

        System.out.println("=== InPatient ===");
        p1.display();

        System.out.println("\n=== OutPatient ===");
        p2.display();
    }
}

