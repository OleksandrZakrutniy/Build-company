package com.company;

import com.company.FinalClasses.BuildCompany;
import com.company.FinalClasses.Client;
import com.company.FinalClasses.Salary;

public class Main {

    public static void main(String[] args) throws Exception {
     BuildCompany buildCompany = new BuildCompany();
     buildCompany.setNameEnum();
     buildCompany.setEmployeesNumber(32);

     Client client = new Client("Pasha", "Chernivtsi, Shevchenka street, 325");

     buildCompany.buildingTheHouse(client);

     Salary salary = new Salary();
     salary.setSalary();
     salary.getSalary();
    }
}
