package question2;

import java.util.ArrayList;

public class InterfaceDemo {
    public static void main(String[] args) {

        ArrayList<Payable> payables = new ArrayList<>();

        payables.add(new Freelancer(
                "Alice", "Johnson", 30.00, 35));

        payables.add(new Freelancer(
                "Bob", "Lee", 40.00, 45));

        payables.add(new VendorInvoice(
                "Office Depot", "INV-1001", 1250.75));

        payables.add(new VendorInvoice(
                "Tech Supply Inc.", "INV-1002", 850.25));


        double totalPayout = 0.0;

        for (Payable payable : payables) {

            if (payable instanceof Freelancer) {
                ((Freelancer) payable).print();
            } else if (payable instanceof VendorInvoice) {
                ((VendorInvoice) payable).print();
            }

            totalPayout += payable.calculatePayment();

            System.out.println("------------------------------");
        }

        System.out.printf(
                "Total Payout: $%.2f%n",
                totalPayout
        );
    }
}