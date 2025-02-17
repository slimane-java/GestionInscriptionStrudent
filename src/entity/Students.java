package entity;

public class Students extends Users{
    private String cne;
    private String status;
    public Students() {}

    @Override
    public String toString() {
        return "Students{" +
                "cne='" + cne + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
