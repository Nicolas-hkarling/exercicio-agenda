import Model.Contact;

public class Main {
    public static void main(String[] args){

        Contact contact1 = new Contact();
        Contact contact2 = new Contact();
        contact1.setName("Mario");
        contact1.setEmail("SuperMario1234@gmail.com");
        contact1.setCompany("Mario Plumbers");
        contact1.setPhoneNumber(991234567);
        contact2.setName("Luigi");
        contact2.setEmail("MarioVerde4321@gmail.com");
        contact2.setCompany("Mario Plumbers");
        contact2.setPhoneNumber(999876543);

   System.out.println(contact1);
   System.out.println(contact2);
    }
}
