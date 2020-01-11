package com.inheritencesingletabledemo.service;

import com.inheritencesingletabledemo.domain.ExternalVet;

import java.util.List;

public interface ICustomRepository {
    List<ExternalVet> find(String country);
}
