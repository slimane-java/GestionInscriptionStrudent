package entity;

public class Admin extends Users{
    public Admin() {
    }

    public Admin(String firstName, String lastName, String email, String adresse, String phoneNumber) {
        super(firstName, lastName, email, adresse, phoneNumber);
    }
}
