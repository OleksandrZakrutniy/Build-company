package com.company.FinalClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.apache.log4j.Logger;

public final class Salary {
    List<ArrayList<String>> salaryList = new ArrayList<>();

    private static final Logger LOGGER = Logger.getLogger(Salary.class);

    public Salary(){}

    public void setSalary() {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        while(flag) {
            ArrayList<String> tmpList =new ArrayList<>();
            LOGGER.info("Input name of profession.");
            tmpList.add(scanner.nextLine());
            LOGGER.info("Input salary.");
            tmpList.add(scanner.nextLine());
            salaryList.add(tmpList);
            LOGGER.info("Do you want add profession and salary for this?(yes/no)");
            String tmpInfo = scanner.nextLine();
            if(tmpInfo.equals("yes")){
                flag = true;
            } else {
                flag = false;
            }
        }

    }

    public void getSalary() {
        LOGGER.info("Salary list");
        for(ArrayList obj: salaryList){
            ArrayList<String> tmp = obj;
            for(String num : tmp){
                LOGGER.info(num + " ");
            }
            LOGGER.info("\n");
        }
    }
}
