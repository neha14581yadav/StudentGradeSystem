import java.util.Scanner;

public class StudentGradeSystem {

    void studentDetails() {

        String name;
        long rollNo;
        byte java, python, c;
        short total;
        float per;

        Scanner s = new Scanner(System.in);

        System.out.println("Enter your name:");
        name = s.nextLine();

        System.out.println("Enter your Roll No:");
        rollNo = s.nextLong();

        System.out.println("Enter your Java marks:");
        java = s.nextByte();

        System.out.println("Enter your Python marks:");
        python = s.nextByte();

        System.out.println("Enter your C marks:");
        c = s.nextByte();

        total = (short) (java + python + c);

        // Percentage
        per = (total * 100.0f) / 300;

        System.out.println("\n----- Student Details -----");
        System.out.println("Name       : " + name);
        System.out.println("Roll No    : " + rollNo);
        System.out.println("Java Marks : " + java);
        System.out.println("Python     : " + python);
        System.out.println("C Marks    : " + c);
        System.out.println("Total      : " + total);
        System.out.printf("Percentage : %.2f%%\n", per);

        if (per >= 90) {
            System.out.println("Grade A");
        }
        else if (per >= 80) {
            System.out.println("Grade B");
        }
        else if (per >= 60) {
            System.out.println("Grade C");
        }
        else {
            System.out.println("Grade D");
        }
    }

    public static void main(String[] args) {

        StudentGradeSystem obj = new StudentGradeSystem();

        obj.studentDetails();
    }
}