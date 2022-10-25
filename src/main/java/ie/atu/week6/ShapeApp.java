package ie.atu.week6;

import java.util.Scanner;

public class ShapeApp {

    public static void main(String[] args){
        //create first instance
        System.out.println("Enter students name: ");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        Info stuInfo = new Info();
        stuInfo.setName(name);
        System.out.println("You entered: " +stuInfo.getName());

        System.out.println("Enter student email: ");
        String email = input.nextLine();
        stuInfo.setEmail(email);
        System.out.println("You entered: " +stuInfo.getEmail());

        System.out.println("Enter students college course: ");
        String course = input.nextLine();
        stuInfo.setCourse(course);
        System.out.println("You entered: " +stuInfo.getCourse());

        //create second instance
        Info stuInfo2 = new Info();
        System.out.println("Enter second students name: ");
        String name2 = input.nextLine();
        stuInfo2.setName(name2);
        System.out.println("You entered: " +stuInfo2.getName());

        System.out.println("Enter second student email: ");
        String email2 = input.nextLine();
        stuInfo2.setEmail(email2);
        System.out.println("You entered: " +stuInfo2.getEmail());

        System.out.println("Enter second students college course: ");
        String course2 = input.nextLine();
        stuInfo2.setCourse(course2);
        System.out.println("You entered: " +stuInfo2.getCourse());


        //create third instance (with constructor)
        System.out.println("Enter third students name: ");
        String name3 = input.nextLine();
        System.out.println("Enter third students email: ");
        String email3 = input.nextLine();
        System.out.println("Enter third students course: ");
        String course3 = input.nextLine();
        Info stuInfo3 = new Info(name3, email3, course3);
        System.out.println("You entered; " +stuInfo3.getName());
        System.out.println("You entered; " +stuInfo3.getEmail());
        System.out.println("You entered; " +stuInfo3.getCourse());
    }
}

