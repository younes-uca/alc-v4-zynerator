package ma.zsmart.engflexy.dao.criteria.core;


import ma.zsmart.engflexy.zynerator.criteria.BaseCriteria;
import ma.zsmart.engflexy.zynerator.util.DateUtil;

import java.util.List;
import java.time.LocalDateTime;

public class SessionCoursCriteria extends BaseCriteria {

    private String reference;
    private String referenceLike;
    private String duree;
    private String dureeMin;
    private String dureeMax;
    private String totalheure;
    private String totalheureMin;
    private String totalheureMax;
    private String mois;
    private String moisMin;
    private String moisMax;
    private String annee;
    private String anneeMin;
    private String anneeMax;

    private String dateFin;
    private String dateFinFrom;
    private String dateFinTo;
    private String dateDebut;
    private String dateDebutFrom;
    private String dateDebutTo;
    private Boolean payer;

    private ProfCriteria prof;
    private List<ProfCriteria> profs;
    private CoursCriteria cours;
    private List<CoursCriteria> courss;
    private GroupeEtudiantCriteria groupeEtudiant;
    private List<GroupeEtudiantCriteria> groupeEtudiants;
    private SalaryCriteria salary;
    private List<SalaryCriteria> salarys;

    public SessionCoursCriteria() {
    }

    public String getReference() {
        return this.reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getReferenceLike() {
        return this.referenceLike;
    }

    public void setReferenceLike(String referenceLike) {
        this.referenceLike = referenceLike;
    }

    public String getDuree() {
        return this.duree;
    }

    public void setDuree(String duree) {
        this.duree = duree;
    }

    public String getDureeMin() {
        return this.dureeMin;
    }

    public void setDureeMin(String dureeMin) {
        this.dureeMin = dureeMin;
    }

    public String getDureeMax() {
        return this.dureeMax;
    }

    public void setDureeMax(String dureeMax) {
        this.dureeMax = dureeMax;
    }

    public String getTotalheure() {
        return this.totalheure;
    }

    public void setTotalheure(String totalheure) {
        this.totalheure = totalheure;
    }

    public String getTotalheureMin() {
        return this.totalheureMin;
    }

    public void setTotalheureMin(String totalheureMin) {
        this.totalheureMin = totalheureMin;
    }

    public String getTotalheureMax() {
        return this.totalheureMax;
    }

    public void setTotalheureMax(String totalheureMax) {
        this.totalheureMax = totalheureMax;
    }

    public String getMois() {
        return this.mois;
    }

    public void setMois(String mois) {
        this.mois = mois;
    }

    public String getMoisMin() {
        return this.moisMin;
    }

    public void setMoisMin(String moisMin) {
        this.moisMin = moisMin;
    }

    public String getMoisMax() {
        return this.moisMax;
    }

    public void setMoisMax(String moisMax) {
        this.moisMax = moisMax;
    }

    public String getAnnee() {
        return this.annee;
    }

    public void setAnnee(String annee) {
        this.annee = annee;
    }

    public String getAnneeMin() {
        return this.anneeMin;
    }

    public void setAnneeMin(String anneeMin) {
        this.anneeMin = anneeMin;
    }

    public String getAnneeMax() {
        return this.anneeMax;
    }

    public void setAnneeMax(String anneeMax) {
        this.anneeMax = anneeMax;
    }

    private LocalDateTime todate(String str) {
        return DateUtil.stringEnToDate(str);
    }

    public LocalDateTime getDateFin() {
        return todate(this.dateFin);
    }

    public void setDateFin(String dateFin) {
        this.dateFin = dateFin;
    }

    public LocalDateTime getDateFinFrom() {
        return todate(this.dateFinFrom);
    }

    public void setDateFinFrom(String dateFinFrom) {
        this.dateFinFrom = dateFinFrom;
    }

    public LocalDateTime getDateFinTo() {
        return todate(this.dateFinTo);
    }

    public void setDateFinTo(String dateFinTo) {
        this.dateFinTo = dateFinTo;
    }

    public LocalDateTime getDateDebut() {
        return todate(this.dateDebut);
    }

    public void setDateDebut(String dateDebut) {
        this.dateDebut = dateDebut;
    }

    public LocalDateTime getDateDebutFrom() {
        return todate(this.dateDebutFrom);
    }

    public void setDateDebutFrom(String dateDebutFrom) {
        this.dateDebutFrom = dateDebutFrom;
    }

    public LocalDateTime getDateDebutTo() {
        return todate(this.dateDebutTo);
    }

    public void setDateDebutTo(String dateDebutTo) {
        this.dateDebutTo = dateDebutTo;
    }

    public Boolean getPayer() {
        return this.payer;
    }

    public void setPayer(Boolean payer) {
        this.payer = payer;
    }

    public ProfCriteria getProf() {
        return this.prof;
    }

    public void setProf(ProfCriteria prof) {
        this.prof = prof;
    }

    public List<ProfCriteria> getProfs() {
        return this.profs;
    }

    public void setProfs(List<ProfCriteria> profs) {
        this.profs = profs;
    }

    public CoursCriteria getCours() {
        return this.cours;
    }

    public void setCours(CoursCriteria cours) {
        this.cours = cours;
    }

    public List<CoursCriteria> getCourss() {
        return this.courss;
    }

    public void setCourss(List<CoursCriteria> courss) {
        this.courss = courss;
    }

    public GroupeEtudiantCriteria getGroupeEtudiant() {
        return this.groupeEtudiant;
    }

    public void setGroupeEtudiant(GroupeEtudiantCriteria groupeEtudiant) {
        this.groupeEtudiant = groupeEtudiant;
    }

    public List<GroupeEtudiantCriteria> getGroupeEtudiants() {
        return this.groupeEtudiants;
    }

    public void setGroupeEtudiants(List<GroupeEtudiantCriteria> groupeEtudiants) {
        this.groupeEtudiants = groupeEtudiants;
    }

    public SalaryCriteria getSalary() {
        return this.salary;
    }

    public void setSalary(SalaryCriteria salary) {
        this.salary = salary;
    }

    public List<SalaryCriteria> getSalarys() {
        return this.salarys;
    }

    public void setSalarys(List<SalaryCriteria> salarys) {
        this.salarys = salarys;
    }
}
