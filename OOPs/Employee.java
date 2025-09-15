package OOPs;

public class Employee {
    String name;
    String id;
    double salary;

    public Employee(String name, String id, double salary){
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public void displayDetails(){
        System.out.println("Employee name: "+name);
        System.out.println("Employee id: "+id);
        System.out.println("Employee Salary: "+salary);
    }

    public static void main(String[] args) {
        Employee emp = new Employee("Kunal","10001",800000);
        emp.displayDetails();
    }
}

