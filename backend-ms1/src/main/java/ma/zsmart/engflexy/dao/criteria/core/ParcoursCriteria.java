package ma.zsmart.engflexy.dao.criteria.core;


import ma.zsmart.engflexy.zynerator.criteria.BaseCriteria;
import ma.zsmart.engflexy.zynerator.util.DateUtil;

import java.time.LocalDateTime;
import java.util.List;

public class ParcoursCriteria extends BaseCriteria {

    private String datePublication;
    private String datePublicationFrom;
    private String datePublicationTo;
    private String dateCreation;
    private String dateCreationFrom;
    private String dateCreationTo;

    private String description;
    private String descriptionLike;
    private String code;
    private String codeLike;
    private String libelle;
    private String libelleLike;
    private String numeroOrder;
    private String numeroOrderMin;
    private String numeroOrderMax;
    private String nombreCours;
    private String nombreCoursMin;
    private String nombreCoursMax;

    private CentreCriteria centre;
    private List<CentreCriteria> centres;


    public ParcoursCriteria() {
    }

    private LocalDateTime todate(String str) {return DateUtil.stringEnToDate(str);}

    public LocalDateTime getDatePublication() {
        return todate(this.datePublication);
    }

    public void setDatePublication(String datePublication) {
        this.datePublication = datePublication;
    }

    public LocalDateTime getDatePublicationFrom() {
        return todate(this.datePublicationFrom);
    }

    public void setDatePublicationFrom(String datePublicationFrom) {
        this.datePublicationFrom = datePublicationFrom;
    }

    public LocalDateTime getDatePublicationTo() {
        return todate(this.datePublicationTo);
    }

    public void setDatePublicationTo(String datePublicationTo) {
        this.datePublicationTo = datePublicationTo;
    }

    public LocalDateTime getDateCreation() {
        return todate(this.dateCreation);
    }

    public void setDateCreation(String dateCreation) {
        this.dateCreation = dateCreation;
    }

    public LocalDateTime getDateCreationFrom() {
        return todate(this.dateCreationFrom);
    }

    public void setDateCreationFrom(String dateCreationFrom) {
        this.dateCreationFrom = dateCreationFrom;
    }

    public LocalDateTime getDateCreationTo() {
        return todate(this.dateCreationTo);
    }

    public void setDateCreationTo(String dateCreationTo) {
        this.dateCreationTo = dateCreationTo;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescriptionLike() {
        return this.descriptionLike;
    }

    public void setDescriptionLike(String descriptionLike) {
        this.descriptionLike = descriptionLike;
    }

    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCodeLike() {
        return this.codeLike;
    }

    public void setCodeLike(String codeLike) {
        this.codeLike = codeLike;
    }

    public String getLibelle() {
        return this.libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getLibelleLike() {
        return this.libelleLike;
    }

    public void setLibelleLike(String libelleLike) {
        this.libelleLike = libelleLike;
    }

    public String getNumeroOrder() {
        return this.numeroOrder;
    }

    public void setNumeroOrder(String numeroOrder) {
        this.numeroOrder = numeroOrder;
    }

    public String getNumeroOrderMin() {
        return this.numeroOrderMin;
    }

    public void setNumeroOrderMin(String numeroOrderMin) {
        this.numeroOrderMin = numeroOrderMin;
    }

    public String getNumeroOrderMax() {
        return this.numeroOrderMax;
    }

    public void setNumeroOrderMax(String numeroOrderMax) {
        this.numeroOrderMax = numeroOrderMax;
    }

    public String getNombreCours() {
        return this.nombreCours;
    }

    public void setNombreCours(String nombreCours) {
        this.nombreCours = nombreCours;
    }

    public String getNombreCoursMin() {
        return this.nombreCoursMin;
    }

    public void setNombreCoursMin(String nombreCoursMin) {
        this.nombreCoursMin = nombreCoursMin;
    }

    public String getNombreCoursMax() {
        return this.nombreCoursMax;
    }

    public void setNombreCoursMax(String nombreCoursMax) {
        this.nombreCoursMax = nombreCoursMax;
    }


    public CentreCriteria getCentre() {
        return this.centre;
    }

    public void setCentre(CentreCriteria centre) {
        this.centre = centre;
    }

    public List<CentreCriteria> getCentres() {
        return this.centres;
    }

    public void setCentres(List<CentreCriteria> centres) {
        this.centres = centres;
    }
}
