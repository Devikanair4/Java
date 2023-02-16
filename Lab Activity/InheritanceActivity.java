class Employee { 
    long employeeId;
    String employeeName;
    String employeeAddress;
    long employeePhone;
    double basicSalary;
    double specialAllowance = 250.80;
    double hra = 1000.50;

    public Employee(long employeeId, String employeeName, String employeeAddress, long employeePhone, double basicSalary) { 
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeAddress = employeeAddress;
        this.employeePhone = employeePhone;
        this.basicSalary = basicSalary;
    }

    public void calculateSalary() { 
        double salary = basicSalary + (basicSalary * specialAllowance / 100) + (basicSalary * hra / 100); 
        System.out.println(salary);
    }

    public void calculateTransportAllowance() { 
        double transportAllowance = 0.1 * basicSalary;
        System.out.println(transportAllowance);
    }
}

class Manager extends Employee { 
    public Manager(long employeeId, String employeeName, String employeeAddress, long employeePhone, double basicSalary) {
        super(employeeId, employeeName, employeeAddress, employeePhone, basicSalary);
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeAddress = employeeAddress;
        this.employeePhone = employeePhone;
        this.basicSalary = basicSalary;
    }

    public void calculateTransportAllowance() { 
        double transportAllowance = 0.15 * basicSalary;
        System.out.println(transportAllowance);
    }
}

class Trainee extends Employee {

    public Trainee(long employeeId, String employeeName, String employeeAddress, long employeePhone, double basicSalary) {
        super(employeeId, employeeName, employeeAddress, employeePhone, basicSalary);
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeAddress = employeeAddress;
        this.employeePhone = employeePhone;
        this.basicSalary = basicSalary;
    }
}

public class InheritanceActivity {
    public static void main(String[] args) {
        Manager man = new Manager(126534, "Peter", "Chennai India", 237844, 65000);
        System.out.print("Manager's Basic Salary: ");
        double managerBasicSalary = man.basicSalary;
        System.out.println(managerBasicSalary);
        System.out.print("Manager's Salary: ");
        man.calculateSalary();
        System.out.print("Manager's Travel Allowance: ");
        man.calculateTransportAllowance();
        Trainee tr = new Trainee(29846, "Jack", "Mumbai India", 442085, 45000);
        System.out.print("Trainee's Basic Salary: ");
        double traineeBasicSalary = tr.basicSalary;
        System.out.println(traineeBasicSalary);
        System.out.print("Trainee's Salary: ");
        tr.calculateSalary();
        System.out.print("Trainee's Travel Allowance: ");
        tr.calculateTransportAllowance();
    }
}