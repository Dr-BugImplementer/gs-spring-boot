package com.example.springboot.entity;


import javax.persistence.*;

@Entity
@Table(name = "login", schema = "public", catalog = "kasino")
public class Login {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="login_id")
    private Integer loginId;
    @Basic
    @Column(name = "benutzername")
    private String benutzername;
    @Basic
    @Column(name = "email")
    private String email;
    @Basic
    @Column(name = "passwort")
    private String passwort;

    public Integer getLoginId() {
        return loginId;
    }

    public void setLoginId(Integer loginId) {
        this.loginId = loginId;
    }

    public String getBenutzername() {
        return benutzername;
    }

    public void setBenutzername(String benutzername) {
        this.benutzername = benutzername;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPasswort() {
        return passwort;
    }

    public void setPasswort(String passwort) {
        this.passwort = passwort;
    }


}
