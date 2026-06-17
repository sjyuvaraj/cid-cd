package com.devop;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter total classes conducted: ");
        int totalClasses = sc.nextInt();

        System.out.print("Enter classes attended: ");
        int attendedClasses = sc.nextInt();

        double attendancePercentage =
                ((double) attendedClasses / totalClasses) * 100;

        System.out.printf("Attendance Percentage: %.2f%%\n",
                attendancePercentage);

        if (attendancePercentage >= 75) {
            System.out.println("Eligible to appear for exams.");
        } else {
            System.out.println("Not eligible to appear for exams.");
        }

        sc.close();
    }
}
