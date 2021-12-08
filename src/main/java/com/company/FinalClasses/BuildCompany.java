package com.company.FinalClasses;

import java.util.Objects;
import java.util.Scanner;
import java.util.function.BinaryOperator;
import java.util.stream.Stream;

import com.company.Enums.CompanyEnums;
import com.company.Interfaces.ICalculateEmployees;
import org.apache.commons.lang3.RandomUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;

public final class BuildCompany {
    private String name;
    protected int employeesNumber;
    private static final Logger LOGGER = Logger.getLogger(BuildCompany.class);

    public BuildCompany(){
        name="NULL";
        employeesNumber=0;
    }

    public BuildCompany(String name, int employeesNumber){
        this.name=name;
        this.employeesNumber=employeesNumber;
    }

    public BuildCompany(String name){
        this.name=name;
        this.employeesNumber=RandomUtils.nextInt(1,50);//random utils
    }

    public void setName(String name){
        this.name=name;
    }

    public void setNameEnum() throws Exception {

        LOGGER.info("Companies:");
        //потоки
        Stream.of(CompanyEnums.values()).map(companyEnums -> companyEnums.ordinal()+1 +": "+companyEnums.getName()).forEach(LOGGER::info);

        LOGGER.info("Input number of company.");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
         switch (number){
            case 1:
                this.name = String.valueOf(CompanyEnums.ZAKRUTNIYBUILD.getName());
                break;
            case 2:
                this.name = String.valueOf(CompanyEnums.PARUSGROUP.getName());
                break;
            case 3:
                this.name = String.valueOf(CompanyEnums.RODOLIT.getName());
                break;
             case 4:
                 this.name = String.valueOf(CompanyEnums.CITYOFDREAMS.getName());
                 break;
            default:
                throw new Exception("Wrong value");
        }
    }

    public void setEmployeesNumber(int employeesNumber){
        this.employeesNumber=employeesNumber;
    }

    public String getName(){
        return name;
    }

    public int getEmployeesNumber(){
        return employeesNumber;
    }

    public void buildingTheHouse(Client client){
        Scanner scanner = new Scanner(System.in);
        LOGGER.info("Square of house:");
        int houseSquare = scanner.nextInt();
        int price = houseSquare * 600;
        ContractorCompany contractorCompany = new ContractorCompany();
        LOGGER.info("Input contractor name.");
        Scanner scanner1 = new Scanner(System.in);
        String contrName = scanner1.nextLine();
        contractorCompany.setName(contrName);
        LOGGER.info("Input employees count.");
        contractorCompany.setEmployeesCount(scanner.nextInt());
            ICalculateEmployees calculateEmployees = new ICalculateEmployees() { //використання лямбди
                @Override
                public int countEmployees(int houseSquare, int squareForEmployee) {
                    return houseSquare/squareForEmployee;
                }
            };
        int tmp = calculateEmployees.countEmployees(houseSquare,15);
        int needEmployeesForBuild;
        if (tmp <= contractorCompany.getEmployeesCount()){
            needEmployeesForBuild = tmp;
        } else {
            needEmployeesForBuild = contractorCompany.getEmployeesCount();
        }
        int monthForOneEmployee = 2;
        BinaryOperator<Integer> monthsForBuild = (needEmployeesForBuild_f, monthForOneEmployee_f) ->
                needEmployeesForBuild_f * monthForOneEmployee_f;//функціональні інтерфейсі
        int month = monthsForBuild.apply(needEmployeesForBuild,monthForOneEmployee);
        LOGGER.info("\n" +
                "Client name: "+ client.getNameOfClient()+".\n" +
                "Client's address: "+client.getAddressOfClient()+"\n"+
                "Contractor name: "+contractorCompany.getName()+".\n" +
                "House: "+houseSquare+" square meters.\n" +
                "Employees count: "+needEmployeesForBuild+" employees.\n" +
                "Duration: "+month+" months.\n" +
                "Price: "+price + "$.\n");
        boolean ifEmpty = StringUtils.isEmpty(client.getAddressOfClient());//string utils
        LOGGER.info("If Address is empty? "+ifEmpty);
    }


    @Override
    public String toString() {
        return "BuildCompany{" +
                "name='" + name + '\'' +
                ", employeesNumber=" + employeesNumber +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BuildCompany that = (BuildCompany) o;
        return employeesNumber == that.employeesNumber &&
                Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, employeesNumber);
    }
}
