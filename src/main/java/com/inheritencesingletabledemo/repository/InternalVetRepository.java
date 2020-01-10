package com.inheritencesingletabledemo.repository;

import com.inheritencesingletabledemo.domain.InternalVet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InternalVetRepository extends JpaRepository<InternalVet,Integer> {
}
