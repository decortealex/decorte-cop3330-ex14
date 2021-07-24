/*
 * UCF COP3330 SUMMER 2021 ASSIGNMENT 1 SOLUTION
 * COPYRIGHT 2021 ALEXANDER DE CORTE
 */

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double price;
        String state;

        System.out.print("What is the order amount? ");
        price = Double.parseDouble(input.nextLine());
        System.out.print("What is the state? ");
        state = input.nextLine();

        TaxCalc calc = new TaxCalc(price, state);
        System.out.printf("The total is $%.2f", calc.calcTotal());
    }
}

class TaxCalc {
    private double subT;
    private String state;
    private double tax;
    private double total;

    public TaxCalc(double subT, String state) {
        this.subT = subT;
        this.state = state;
    }

    public double getTax() {
        if(state.equalsIgnoreCase("WI"))
            return subT * .055;
        return 0;
    }

    public double calcTotal() {
        return subT + this.getTax();
    }
}
