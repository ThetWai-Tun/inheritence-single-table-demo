package com.inheritencesingletabledemo.domain;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("EX")
public class ExternalVet extends Vet {

    private String country;
    private double fees;

    public ExternalVet() {}

    public ExternalVet(String name, String country, double fees) {
        super(name);
        this.country = country;
        this.fees = fees;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public double getFees() {
        return fees;
    }

    public void setFees(double fees) {
        this.fees = fees;
    }
}
