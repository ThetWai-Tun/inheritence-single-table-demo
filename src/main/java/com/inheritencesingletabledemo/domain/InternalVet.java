package com.inheritencesingletabledemo.domain;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("IN")
public class InternalVet extends Vet {

    private String qualification;
    private double salary;

    public InternalVet(){}

    public InternalVet(String name, String qualification, double salary) {
        super(name);
        this.qualification = qualification;
        this.salary = salary;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
