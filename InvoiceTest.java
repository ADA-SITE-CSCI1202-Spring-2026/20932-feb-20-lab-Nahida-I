import java.util.Scanner;

public class InvoiceTest {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Invoices: ");
        int n = in.nextInt();
        in.nextLine();  

        Invoice[] invoices = new Invoice[n];

        for (int i = 0; i < n; i++) {

            System.out.println("Invoice " + (i + 1));

            System.out.print("Part number: ");
            String partNumber = in.nextLine();

            System.out.print("Description: ");
            String description = in.nextLine();

            System.out.print("Quantity: ");
            int quantity = in.nextInt();

            System.out.print("Price per item: ");
            double price = in.nextDouble();
            in.nextLine(); 

            invoices[i] = new Invoice(partNumber, description, quantity, price);
        }

        System.out.println("\nInvoice Info:");

        for (int i = 0; i < n; i++) {
            System.out.println(invoices[i].getInvoiceAmount());
        }

        in.close();
    }
}