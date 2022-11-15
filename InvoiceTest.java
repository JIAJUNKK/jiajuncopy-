package lab07;
import java.util.Scanner;
public class InvoiceTest {

	public static void main(String[] args) {
		Invoice item1 = new Invoice("1234", "Hammer", 2, 14.95);
		Invoice item2 = new Invoice("5678", "Paint Brush", -5, -9.99);
		Scanner input = new Scanner(System.in);
		int option = 4;
		
		System.out.println(item1);
		System.out.println();
		System.out.println(item2);
		System.out.println();

		

		
		while (option != 3) {
			System.out.print("Enter 1 to update your invoice 1, 2 to update your invoice 2, 3 to quit: ");
			option = input.nextInt();
			input.nextLine();
			
			if (option == 1) {
				System.out.println("\nEditing invoice 1");
				
				System.out.print("Enter part num: ");
				item1.setPartNum(input.nextLine());
				
				System.out.print("Enter part description: ");
				item1.setDesc(input.nextLine());
				
				System.out.print("Enter quantity: ");
				item1.setQuantity(input.nextInt());
				
				System.out.print("Enter price: ");
				item1.setPrice(input.nextDouble());
			

			}
			
			else if (option == 2) {
				System.out.println("\nEditing invoice 2");
				
				System.out.print("Enter part num: ");
				item2.setPartNum(input.nextLine());
				
				System.out.print("Enter part description: ");
				item2.setDesc(input.nextLine());
				
				System.out.print("Enter quantity: ");
				item2.setQuantity(input.nextInt());
			
				System.out.print("Enter price: ");
				item2.setPrice(input.nextDouble());
			}
			
		}
		System.out.println();
		System.out.println(item1);
		System.out.printf("Invoice amount: $%.2f \n", item1.getInvoiceAmount());
		
		System.out.println();
		System.out.println(item2);
		System.out.printf("Invoice amount: $%.2f \n", item2.getInvoiceAmount());
		

		input.close();
		
	}

}
