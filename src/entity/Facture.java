package entity;

import java.time.LocalDate;
import java.util.List;

public class Facture extends IdAudit {
    private int id;
    private double totalPrice;
//    @ManyToOne
    private Inscription inscription;
}
