import java.util.Scanner;

class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome Restaurant!");

        System.out.println("1. Pizza");
        System.out.println("2. Burger");
        System.out.println("3. Pasta");
        System.out.println("4. Sandwich");
        System.out.println("5. Coffee");

        System.out.print("Enter your choice:");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("You selected Pizza.");
                System.out.println("Price: $10.99");
                break;
            case 2:
                System.out.println("You selected Burger.");
                System.out.println("Price: $5.99");
                break;
            case 3:
                System.out.println("You selected Pasta.");
                System.out.println("Price: $8.99");
                break;
            case 4:
                System.out.println("You selected Sandwich.");
                System.out.println("Price: $4.99");
                break;
            case 5:
                System.out.println("You selected Coffee.");
                System.out.println("Price: $2.99");
                break;
            default:
                System.out.println("Invalid choice! Please select a valid option");
        }

    }
}

