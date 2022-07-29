package com.example.springboot.entity;


import javax.persistence.*;

@Entity
@IdClass(KontoId.class)
public class Konto {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Integer kontoId;
    @Basic
    @Column(name="vorname")
    private String vorname;
    @Basic
    @Column(name="nachname")
    private String nachname;
    @Basic
    @Column(name="strasse")
    private String strasse;
    @Basic
    @Column(name="hausnummer")
    private int hausnummer;
    @Basic
    @Column(name="hnr_zusatz")
    private String hnr_zusatz;
    @Basic
    @Column(name="postleitzahl")
    private String postleitzahl;
    @Basic
    @Column(name="ort")
    private String ort;
    @Basic
    @Column(name="guthaben")
    private double guthaben;
    @Id
    @Column(name="loginId")
    private Integer loginId;

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public String getStrasse() {
        return strasse;
    }

    public void setStrasse(String strasse) {
        this.strasse = strasse;
    }

    public int getHausnummer() {
        return hausnummer;
    }

    public void setHausnummer(int hausnummer) {
        this.hausnummer = hausnummer;
    }

    public String getHnr_zusatz() {
        return hnr_zusatz;
    }

    public void setHnr_zusatz(String hnr_zusatz) {
        this.hnr_zusatz = hnr_zusatz;
    }

    public String getPostleitzahl() {
        return postleitzahl;
    }

    public void setPostleitzahl(String postleitzahl) {
        this.postleitzahl = postleitzahl;
    }

    public String getOrt() {
        return ort;
    }

    public void setOrt(String ort) {
        this.ort = ort;
    }

    public double getGuthaben() {
        return guthaben;
    }

    public void setGuthaben(double guthaben) {
        this.guthaben = guthaben;
    }

    public Integer getLoginId() {
        return loginId;
    }

    public void setLoginId(Integer loginId) {
        this.loginId = loginId;
    }
    public Integer getKontoId() {
        return kontoId;
    }

    public void setKontoId(Integer kontoId) {
        this.kontoId = kontoId;
    }

}