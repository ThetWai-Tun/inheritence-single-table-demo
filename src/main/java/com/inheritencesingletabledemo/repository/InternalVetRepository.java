package com.inheritencesingletabledemo.repository;

import com.inheritencesingletabledemo.domain.ExternalVet;
import com.inheritencesingletabledemo.domain.InternalVet;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface InternalVetRepository extends JpaRepository<InternalVet,Integer> {

    @Query("select v from ExternalVet v where v.country=:country")
    public ExternalVet searchCountry(@Param("country") String country);
}
