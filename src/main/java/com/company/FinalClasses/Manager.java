package com.company.FinalClasses;

import com.company.AbstractClasses.Person;
import com.company.Interfaces.IManagement;
import org.apache.log4j.Logger;

public final class Manager extends Person implements IManagement {
    private int managementExperience;

    private static final org.apache.log4j.Logger LOGGER = Logger.getLogger(BuildCompany.class);

    public Manager(){
        super();
    }

    public Manager(int managementExperience) {
        this.managementExperience = managementExperience;
    }

    public Manager(String name, int age, int managementExperience) {
        super(name, age);
        this.managementExperience = managementExperience;
    }

    @Override
    public void searchForEmployees() {
        LOGGER.info(this.getName()+" is searching new employees.");
    }

    @Override
    public void salaryIncrease() {
        LOGGER.info(this.getName()+" is increasing a salary.");
    }

    @Override
    public void salaryReduction() {
        LOGGER.info(this.getName()+" reduction a salary.");
    }
}
