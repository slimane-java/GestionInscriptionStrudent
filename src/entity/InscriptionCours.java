package entity;

public class InscriptionCours extends IdAudit {
    private int id;
//    @ManyToOne
    private Course cours;
//    @ManyToOne
    private Inscription inscription;

    public InscriptionCours() {

    }

    public void setId(int id) {
        this.id = id;
    }

    public Inscription getInscription() {
        return inscription;
    }

    public void setInscription(Inscription inscription) {
        this.inscription = inscription;
    }

    public Course getCours() {
        return cours;
    }

    public void setCours(Course cours) {
        this.cours = cours;
    }
}
