// Parent class
class Employee {
    double baseSalary;

    Employee(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    double calculateSalary() {
        return baseSalary; // default
    }
}

// Manager subclass
class Manager extends Employee {
    double bonus;

    Manager(double baseSalary, double bonus) {
        super(baseSalary);
        this.bonus = bonus;
    }

    @Override
    double calculateSalary() {
        return baseSalary + bonus;
    }
}

// Developer subclass
class Developer extends Employee {
    double overtimePay;

    Developer(double baseSalary, double overtimePay) {
        super(baseSalary);
        this.overtimePay = overtimePay;
    }

    @Override
    double calculateSalary() {
        return baseSalary + overtimePay;
    }
}

// Main class
public class EmployeeSalary {
    public static void main(String[] args) {
        Employee e1 = new Manager(50000, 10000);
        Employee e2 = new Developer(40000, 8000);

        System.out.println("Manager Salary: " + e1.calculateSalary());
        System.out.println("Developer Salary: " + e2.calculateSalary());
    }
}

