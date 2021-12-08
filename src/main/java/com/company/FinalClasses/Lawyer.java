package com.company.FinalClasses;

import java.util.Objects;

import com.company.AbstractClasses.Person;
import com.company.Interfaces.ILawyer;
import org.apache.log4j.Logger;

public final class Lawyer extends Person implements ILawyer {

    private int workExperience;

    private static final Logger LOGGER = Logger.getLogger(BuildCompany.class);

    public Lawyer(){
        super();
    }

    public Lawyer(int workExperience) {
        this.workExperience = workExperience;
    }

    public Lawyer(String name, int age, int workExperience) {
        super(name, age);
        this.workExperience = workExperience;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Lawyer lawyer = (Lawyer) o;
        return workExperience == lawyer.workExperience;
    }

    @Override
    public int hashCode() {
        return Objects.hash(workExperience);
    }

    @Override
    public String toString() {
        return "Lawyer{" +
                "workExperience=" + workExperience +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public void signingDocument() {
        LOGGER.info(this.getName()+" is singing the document with client.");
    }

    @Override
    public void dockCheck() {
        LOGGER.info(this.getName()+" is checking client's documents ");
    }
}
