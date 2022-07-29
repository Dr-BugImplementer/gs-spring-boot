package com.example.springboot.entity;

import java.io.Serializable;
import java.util.Objects;

public class KontoId implements Serializable {

    private Integer kontoId;
    private Integer loginId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        KontoId kontoId1 = (KontoId) o;
        return kontoId.equals(kontoId1.kontoId) && loginId.equals(kontoId1.loginId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(kontoId, loginId);
    }

    public Integer getKontoId() {
        return kontoId;
    }

    public void setKontoId(Integer kontoId) {
        this.kontoId = kontoId;
    }

    public Integer getLoginId() {
        return loginId;
    }

    public void setLoginId(Integer loginId) {
        this.loginId = loginId;
    }


}

