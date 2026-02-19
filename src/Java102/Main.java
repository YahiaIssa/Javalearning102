package Java102;


import java.util.InputMismatchException;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Student std=new Student();
        try {
            System.out.println("Enter Student id :");
            std.setId(input.nextInt());
            System.out.println("Enter Student name : ");
            std.setName(input.next());
            System.out.println("Enter Student Departmint : ");
            std.setDepartmint(input.next());
            System.out.println("Enter Student Age :");
            std.setAge(input.nextInt());

            System.out.println("Enter Student Gpa :");
            std.setGPA(input.nextFloat());
            std.printStudentinfo();
        }
        catch (InputMismatchException e)
        {
            System.out.println("Input Mismatch");
        }



    }

}