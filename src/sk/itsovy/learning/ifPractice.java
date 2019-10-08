package sk.itsovy.learning;

import java.util.Scanner;

public class ifPractice {

    public void getMonth() {

        Scanner practicingIf = new Scanner(System.in);
        System.out.println("Hello, I am program for solving Quadratic Equations");

        System.out.print("Enter Number 1-12: ");
        int num = practicingIf.nextInt();

        if (num >= 1 && num <= 12) {
            if (num == 1) {
                System.out.println("January");
            }
            if (num == 2) {
                System.out.println("February");
            }
            if (num == 3) {
                System.out.println("March");
            }
            if (num == 4) {
                System.out.println("April");
            }
            if (num == 5) {
                System.out.println("May");
            }
            if (num == 6) {
                System.out.println("June");
            }
            if (num == 7) {
                System.out.println("July");
            }
            if (num == 8) {
                System.out.println("August");
            }
            if (num == 9) {
                System.out.println("September");
            }
            if (num == 10) {
                System.out.println("October");
            }
            if (num == 11) {
                System.out.println("November");
            }
            if (num == 12) {
                System.out.println("December");
            }
        }
        else {
            System.out.println("Invalid input");
        }

    }
    public void getMonthSwitch() {
        Scanner switching = new Scanner(System.in);
        System.out.println("Enter Number 1-12: ");
        int numb = switching.nextInt();

        switch(numb) {
            case 1: {
                System.out.println("January");
                break;
            } case 2: {
                System.out.println("Feb");
                break;
            } case 3: {
                System.out.println("Mar");
                break;
            } case 4: {
                System.out.println("April");
                break;
            } case 5: {
                System.out.println("May");
                break;
            } case 6: {
                System.out.println("June");
                break;
            } case 7: {
                System.out.println("July");
                break;
            } case 8: {
                System.out.println("August");
                break;
            } case 9: {
                System.out.println("Sep");
                break;
            } case 10: {
                System.out.println("Oct");
                break;
            } case 11: {
                System.out.println("Nov");
                break;
            } case 12: {
                System.out.println("Dec");
                break;
            } default: {
                System.out.println("Error");
            }
        }

        switch(numb) {
            case 12: {
            }
              case 1: {
            } case 2: {
                System.out.println("Winter");
                break;
            } case 3: {
            } case 4: {
            } case 5: {
                System.out.println("Spring");
                break;
            } case 6: {
             } case 7: {
            } case 8: {
                System.out.println("Summer");
                break;
            } case 9: {
              } case 10: {
            } case 11: {
                System.out.println("Fall");
                break;
            } default: {
                System.out.println("Error");
            }
        }


    }

    public void quadraticEquation() {
        Scanner quadratic = new Scanner(System.in);
        System.out.println("Hello, I am program for solving Quadratic Equations!");

        System.out.print("Input a: ");
        double a = quadratic.nextDouble();
        System.out.print("Input b: ");
        double b = quadratic.nextDouble();
        System.out.print("Input c: ");
        double c = quadratic.nextDouble();

        double discriminant = b * b - 4.0 * a * c;

        if (discriminant > 0.0) {
            double r1 = (-b + Math.pow(discriminant, 0.5)) / (2.0 * a);
            double r2 = (-b - Math.pow(discriminant, 0.5)) / (2.0 * a);
            System.out.println("The roots are " + r1 + " and " + r2);

        } else if (discriminant == 0.0) {
            double r1 = -b / (2.0 * a);
            System.out.println("The root is " + r1);

        } else {
            System.out.println("The equation has no roots.");
        }
    }


}
