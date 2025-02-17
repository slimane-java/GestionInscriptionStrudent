package entity;

import java.util.List;

public class Inscription extends IdAudit {
    private int id;
    private String dateInscription;
    private Students student;
//    @OneToMany
    private List<InscriptionCours> cours;
}
