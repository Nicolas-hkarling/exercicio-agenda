package Model;

public class Contact {

    private String name;
    private String email;
    private String company;
    private int phoneNumber;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return
                "\nYour name is " + this.name.toUpperCase()  +
                "\nYour email is " + this.email.toLowerCase()  +
                "\nYour company is " + this.company.toUpperCase()  +
                "\nYour phone number is " + this.phoneNumber;
    }
}
