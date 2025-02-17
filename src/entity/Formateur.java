package entity;

public class Formateur extends Users {
    private String cih;

    public Formateur() {

    }

    public Formateur(String firstName, String lastName, String email, String adresse, String phoneNumber, String cih) {
        super(firstName, lastName, email, adresse, phoneNumber);
        this.cih = cih;
    }

    public String getCih() {
        return cih;
    }

    public void setCih(String cih) {
        this.cih = cih;
    }

    @Override
    public String toString() {
        return super.toString() + "Formateur{" + "cih=" + cih + '}';
    }
}
