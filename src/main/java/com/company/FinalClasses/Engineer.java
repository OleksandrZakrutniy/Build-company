package com.company.FinalClasses;

import java.util.Objects;
import com.company.AbstractClasses.Person;
import com.company.Interfaces.IEngineer;
import org.apache.log4j.Logger;

public final class Engineer extends Person implements IEngineer {

    private int workExperience;
    private static final Logger LOGGER = Logger.getLogger(Engineer.class);

    public Engineer(){
        super();
    }

    public Engineer(int workExperience) {
        this.workExperience = workExperience;
    }

    public Engineer(String name, int age, int workExperience) {
        super(name, age);
        this.workExperience = workExperience;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Engineer engineer = (Engineer) o;
        return workExperience == engineer.workExperience;
    }

    @Override
    public int hashCode() {
        return Objects.hash(workExperience);
    }

    @Override
    public String toString() {
        return "Engineer{" +
                "workExpirience=" + workExperience +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public void developmentNewLayout() {
        LOGGER.info(this.getName()+" development new layout.");
    }

    @Override
    public void improvingOldLayout() {
        LOGGER.info(this.getName()+" is improving old layout.");
    }
}