package com.company.FinalClasses;

import java.util.Objects;
import java.util.Scanner;
import java.util.stream.Stream;

import com.company.Enums.CarName;
import org.apache.log4j.Logger;

public final class Car{

    String name, cargoLiftingCapacity;
    private static final Logger LOGGER = Logger.getLogger(Car.class);

    public Car(){

    }

    public Car(String name, String cargoLiftingCapacity) {
        this.name = name;
        this.cargoLiftingCapacity = cargoLiftingCapacity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCargoLiftingCapacity() {
        return cargoLiftingCapacity;
    }

    public void setCargoLiftingCapacity(String cargoLiftingCapacity) {
        this.cargoLiftingCapacity = cargoLiftingCapacity;
    }

    public void setNameEnum() throws Exception {

        LOGGER.info("Cars name:");
        Stream.of(CarName.values()).map(carName -> carName.ordinal()+1 +": "+carName.getName()).forEach(LOGGER::info);

        LOGGER.info("Input number of car.");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        switch (number){
            case 1:
                this.name = String.valueOf(CarName.MAN.getName());
                break;
            case 2:
                this.name = String.valueOf(CarName.SCANIA.getName());
                break;
            case 3:
                this.name = String.valueOf(CarName.MERCEDES.getName());
                break;
            case 4:
                this.name = String.valueOf(CarName.KAMAZ.getName());
                break;
            default:
                throw new Exception("Wrong value");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(name, car.name) &&
                Objects.equals(cargoLiftingCapacity, car.cargoLiftingCapacity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, cargoLiftingCapacity);
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", cargoLiftingCapacity='" + cargoLiftingCapacity + '\'' +
                '}';
    }
}
