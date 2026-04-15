import java.util.ArrayList;
import java.util.Iterator;

class EmailService {
    private ArrayList<Email> emailList = new ArrayList<>();

    public void addEmail(Email email) {
        emailList.add(email);
        System.out.println("Email added!");
    }

    public void showAllEmails() {
        if (emailList.isEmpty()) {
            System.out.println("No emails found.");
            return;
        }

        Iterator<Email> it = emailList.iterator();
        while (it.hasNext()) {
            it.next().displayEmail();
        }
    }

    public void deleteEmail(String to) {
        Iterator<Email> it = emailList.iterator();
        while (it.hasNext()) {
            if (it.next().getTo().equalsIgnoreCase(to)) {
                it.remove();
                System.out.println("Email deleted!");
                return;
            }
        }
        System.out.println("Email not found.");
    }
}
