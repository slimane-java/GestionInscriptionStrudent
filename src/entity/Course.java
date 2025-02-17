package entity;

import java.time.LocalDate;
import java.util.List;

public class Course extends IdAudit {
    private String title;
    private String description;
    private LocalDate startDate;
    private LocalDate endDate;
//    @ManyToOne
    private Formateur formateur;
//    @OneToMany
    private List<InscriptionCours> inscriptionCours;

    public Course() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public Formateur getFormateur() {
        return formateur;
    }

    public void setFormateur(Formateur formateur) {
        this.formateur = formateur;
    }

    @Override
    public String toString() {
        return "Course{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", formateur=" + formateur +
                ", inscriptionCours=" + inscriptionCours +
                '}';
    }
}
