package com.inheritencesingletabledemo.service;

import com.inheritencesingletabledemo.domain.ExternalVet;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

public class ICustom implements ICustomRepository {

    @PersistenceContext
    private EntityManager em;

    @Override
    public List<ExternalVet> find(String country) {
        return null;
    }
}
