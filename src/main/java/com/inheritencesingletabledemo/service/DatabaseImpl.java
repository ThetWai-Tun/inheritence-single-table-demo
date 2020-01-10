package com.inheritencesingletabledemo.service;

import com.inheritencesingletabledemo.domain.ExternalVet;
import com.inheritencesingletabledemo.domain.InternalVet;
import com.inheritencesingletabledemo.repository.ExternalVetRepository;
import com.inheritencesingletabledemo.repository.InternalVetRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class DatabaseImpl implements IDatabase {

    private final InternalVetRepository internalVetRepository;
    private final ExternalVetRepository externalVetRepository;

    public DatabaseImpl(InternalVetRepository internalVetRepository, ExternalVetRepository externalVetRepository) {
        this.internalVetRepository = internalVetRepository;
        this.externalVetRepository = externalVetRepository;
    }

    @Override
    @Transactional
    public void createTable() {
        InternalVet internalVet1=new InternalVet("Mg Mg","MSc",500000);
        InternalVet internalVet2=new InternalVet("Aung Aung","MSc",700000);
        InternalVet internalVet3=new InternalVet("Mg Hla","MSc",600000);

        ExternalVet externalVet1 = new ExternalVet("Tun Tun","Myanmar",120000);
        ExternalVet externalVet2 = new ExternalVet("Tun Aung","Myanmar",140000);
        ExternalVet externalVet3 = new ExternalVet("Tun Hla","Myanmar",130000);

        internalVetRepository.save(internalVet1);
        internalVetRepository.save(internalVet2);
        internalVetRepository.save(internalVet3);

        externalVetRepository.save(externalVet1);
        externalVetRepository.save(externalVet2);
        externalVetRepository.save(externalVet3);
    }
}
