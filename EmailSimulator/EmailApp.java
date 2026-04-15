import java.util.Scanner;

public class EmailApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EmailService service = new EmailService();

        while (true) {
            System.out.println("\n1. Send Email");
            System.out.println("2. View Emails");
            System.out.println("3. Delete Email");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {
                System.out.print("Enter receiver: ");
                String to = sc.nextLine();

                System.out.print("Enter subject: ");
                String subject = sc.nextLine();

                System.out.print("Enter body: ");
                String body = sc.nextLine();

                service.addEmail(new Email(to, subject, body));

            } else if (choice == 2) {
                service.showAllEmails();

            } else if (choice == 3) {
                System.out.print("Enter receiver to delete: ");
                String to = sc.nextLine();
                service.deleteEmail(to);

            } else if (choice == 4) {
                System.out.println("Exit");
                break;

            } else {
                System.out.println("Invalid choice");
            }
        }

        sc.close();
    }
}
