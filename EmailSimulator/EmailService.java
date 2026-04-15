import java.util.ArrayList;
import java.util.Iterator;

class EmailService {
    ArrayList<Email> list = new ArrayList<>();

    void sendEmail(Email e) {
        list.add(e);
        System.out.println("Email Sent!");
    }

    void viewEmails() {
        if (list.isEmpty()) {
            System.out.println("No emails found.");
            return;
        }

        Iterator<Email> it = list.iterator();
        while (it.hasNext()) {
            it.next().display();
        }
    }

    void deleteEmail(String to) {
        Iterator<Email> it = list.iterator();
        boolean found = false;

        while (it.hasNext()) {
            Email e = it.next();
            if (e.to.equalsIgnoreCase(to)) {
                it.remove(); // Iterator remove
                found = true;
                System.out.println("Email Deleted!");
            }
        }

        if (!found) {
            System.out.println("Email not found.");
        }
    }
}