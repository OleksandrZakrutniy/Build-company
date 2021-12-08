package com.company.Enums;

public enum CompanyEnums {

    ZAKRUTNIYBUILD("Zakrutniy build"),
    PARUSGROUP("Parus Group"),
    RODOLIT("RODOLIT"),
    CITYOFDREAMS("City of dreams");


    private String name;

    CompanyEnums(){
        this.name ="";
    }

    CompanyEnums(String name) {
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
