package com.epam.rd.autotasks.godutch;
import java.util.Scanner;
public class GoDutch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int bill_total_amount = scanner.nextInt();
        if (bill_total_amount < 0) {
            System.out.println("Bill total amount cannot be negative");
            return;
        }
        int number_of_friends = scanner.nextInt();
        if (number_of_friends <= 0) {
            System.out.println("Number of friends cannot be negative or zero");
            return;
        }
        else {
            double part_to_pay = (bill_total_amount + (bill_total_amount*0.1))/number_of_friends;
            int PartToPay = (int) part_to_pay;
            System.out.println(PartToPay);
        }
     }
}
