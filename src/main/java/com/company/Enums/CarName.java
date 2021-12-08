package com.company.Enums;

public enum CarName {

    MAN("Man"),
    SCANIA("SCANIA"),
    MERCEDES("Mercedes-benz"),
    KAMAZ("Kamaz");

    private String name;

    CarName(){
        this.name ="";
    }
    CarName(String name) {
        this.name = name;
    }
    public String getName(){
        return name;
    }
    @Override
    public String toString() {
        return name;
    }

}
