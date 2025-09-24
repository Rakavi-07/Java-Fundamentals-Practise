// Base class
class Admission {
    void admissionProcess() {
        System.out.println("General admission process");
    }
}

// UndergraduateAdmission subclass
class UndergraduateAdmission extends Admission {
    @Override
    void admissionProcess() {
        System.out.println("Merit + Entrance Test");
    }
}

// PostgraduateAdmission subclass
class PostgraduateAdmission extends Admission {
    @Override
    void admissionProcess() {
        System.out.println("Written Test + Interview");
    }
}

// Main class
public class UniversityAdmission {
    public static void main(String[] args) {
        Admission ug = new UndergraduateAdmission();
        Admission pg = new PostgraduateAdmission();

        ug.admissionProcess();
        pg.admissionProcess();
    }
}
