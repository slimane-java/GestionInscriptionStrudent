package entity;

public class IdAudit extends DateAudit {
    private int id;

    public IdAudit() {}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
