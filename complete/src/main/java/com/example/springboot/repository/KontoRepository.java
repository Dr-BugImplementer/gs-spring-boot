package com.example.springboot.repository;

import com.example.springboot.entity.Konto;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import org.springframework.data.jpa.repository.JpaRepository;

public interface KontoRepository extends JpaRepository<Konto, Integer>{
    @Query("Select k from Konto k where k.kontoId =:kontoId and k.loginId=:loginId")
    public Konto findeKonto(@Param("kontoId")Integer kontoId, @Param("loginId")Integer loginId);
}