package OOPs;

public class Student {
    String name;
    String rollNumber;
    double[] marks;

    public Student(String name, String rollNumber, double[] marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    public double calculateTotalMarks(double[] marks) {
        double totalMarks = 0;
        for (int i = 0; i < marks.length; i++) {
            totalMarks += marks[i];
        }
        double totalmark= totalMarks/5;
        return totalmark;
    }

    public String calculateGrade(double totalmark) {
        if (totalmark >= 80 && totalmark <= 100) {
            return "Grade A";
        } else if (totalmark >= 60 && totalmark <= 80) {
            return "Grade B";
        } else if (totalmark >= 50 && totalmark <= 60) {
            return "Grade C";
        } else if (totalmark >= 40 && totalmark <= 50) {
            return "Grade D";
        } else {
            return "Grade F";
        }
    }

    public void displayStudent() {
        System.out.println("Student Name: " + name);
        System.out.println("Student Roll Number: " + rollNumber);
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Marks "+(i+1)+": " + marks[i]);
        }
        double totalmark=calculateTotalMarks(marks);
        System.out.println(calculateGrade(totalmark));
    }

    public static void main(String[] args) {
        double[] mark1 = {78,98,76,78,98};
        double[] mark2 = {89,99,97,87,98};
        Student s1 = new Student("Kunal","107", mark1);
        Student s2 = new Student("Abhishek","009", mark2);
        s1.displayStudent();
        s2.displayStudent();
    }
}
