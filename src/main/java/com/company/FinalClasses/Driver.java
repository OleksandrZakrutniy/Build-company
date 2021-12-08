package com.company.FinalClasses;

import com.company.AbstractClasses.Person;
import com.company.Interfaces.IDriver;
import org.apache.log4j.Logger;

import java.util.Objects;

public final class Driver extends Person implements IDriver {

    private static final Logger LOGGER = Logger.getLogger(Driver.class);

    private int drivingExperience;

    public Driver(){
        super();
    }

    public Driver(int drivingExperience) {
        this.drivingExperience = drivingExperience;
    }

    public Driver(String name, int age, int drivingExperience) {
        super(name, age);
        this.drivingExperience = drivingExperience;
    }

    public int getDrivingExperience() {
        return drivingExperience;
    }

    public void setDrivingExperience(int drivingExperience) {
        this.drivingExperience = drivingExperience;
    }

    @Override
    public void roadToClient(Car car, Client client) {
        LOGGER.info(this.getName()+" is driving to client.\n"+
                "Address: "+client.getAddressOfClient());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Driver driver = (Driver) o;
        return drivingExperience == driver.drivingExperience;
    }

    @Override
    public int hashCode() {
        return Objects.hash(drivingExperience);
    }

    @Override
    public String toString() {
        return "Driver{" +
                "drivingExperience=" + drivingExperience +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
