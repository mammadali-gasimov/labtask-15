import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // first user
        System.out.println("First user info:");
        System.out.println("Enter name of the first user:");
        String firstUserName = scanner.nextLine();

        System.out.println("Enter surname of the first user:");
        String firstUserSurname = scanner.nextLine();

        System.out.println("Enter age of the first user:");
        byte firstUserAge = scanner.nextByte();

        System.out.println("Enter amount of money for first user:");
        double firstUserMoney = scanner.nextDouble();
        scanner.nextLine();

        // second user
        System.out.println("Second user info:");
        System.out.println("Enter name of the second user:");
        String secondUserName = scanner.nextLine();

        System.out.println("Enter surname of the second user:");
        String secondSurname = scanner.nextLine();

        System.out.println("Enter age of the second user:");
        byte secondUserAge = scanner.nextByte();

        System.out.println("Enter amount of money for second user:");
        double secondUserMoney = scanner.nextDouble();
        scanner.nextLine();

        while (true) {
            System.out.println("Enter 1 to send money from the first person to the second one.");
            System.out.println("Enter 2 to send money from the second person to the first one.");
            System.out.println("Enter \"exit\" to exit the program.");
            String action = scanner.nextLine();

            System.out.println("Enter the amount you want to transfer:");
            double transferAmount = scanner.nextDouble();

            switch (action) {
                case "1":
                    if (firstUserMoney >= transferAmount) {
                        firstUserMoney -= transferAmount;
                        secondUserMoney += transferAmount;
                        System.out.println("User " + firstUserName + " " + firstUserSurname + " sent " + transferAmount + " to user " + secondUserName + " " + secondSurname);
                        System.out.println("Amount for user " + firstUserName + " " + firstUserSurname + " is: " + firstUserMoney);
                        System.out.println("Amount for user " + secondUserName + " " + secondSurname + " is: " + secondUserMoney);
                    } else {
                        System.out.println("Funds are not enough.");
                    }
                    scanner.nextLine();
                    continue;
                case "2":
                    if (secondUserMoney >= transferAmount) {
                        secondUserMoney -= transferAmount;
                        firstUserMoney += transferAmount;
                        System.out.println("User " + secondUserName + " " + secondSurname + " sent " + transferAmount + " to user " + firstUserName + " " + firstUserSurname);
                        System.out.println("Amount for user " + firstUserName + " " + firstUserSurname + " is: " + firstUserMoney);
                        System.out.println("Amount for user " + secondUserName + " " + secondSurname + " is: " + secondUserMoney);
                    } else {
                        System.out.println("Funds are not enough.");
                    }
                    scanner.nextLine();
                    continue;
                case "exit":
                    System.exit(0);
                default:
                    System.out.println("Wrong input!");
            }
        }
    }
}