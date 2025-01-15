import java.util.Scanner;

public class IT24103873Lab5Q3 {
    public static final double ROOM_CHARGE = 48000.0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Start Date (1-31): ");
        int startDate = scanner.nextInt();

        System.out.print("Enter End Date (1-31): ");
        int endDate = scanner.nextInt();

        if (startDate < 1 || startDate > 31 || endDate < 1 || endDate > 31) {
            System.out.println("Error: Days must be between 1 and 31");
            return;
        }

        if (startDate >= endDate) {
            System.out.println("Error: Start Date must be less than End Date");
            return;
        }

        int numDays = endDate - startDate + 1;

        double discount = 0;
        if (numDays >= 3) {
            discount = numDays >= 5 ? 0.2 : 0.1;
        }

        double totalAmount = ROOM_CHARGE * numDays * (1 - discount);

        System.out.println("Room Charge Per Day: Rs. " + ROOM_CHARGE + "/=");
        System.out.println("Number of Days Reserved: " + numDays);
        System.out.println("Total Amount to be Paid: " + totalAmount);
    }
}