package com.company.FinalClasses;

import java.util.Objects;

public final class EngineerOffice {

    protected String directorName;
    protected int engineerCount;

    public EngineerOffice(){}

    public EngineerOffice(String directorName, int engineerCount, BuildCompany buildingCompany) throws Exception {
        this.directorName=directorName;
        if(engineerCount<=buildingCompany.getEmployeesNumber()){
        this.engineerCount=engineerCount;
        } else {
            throw new Exception("a lot of engineers");
        }
    }

    public void setNameOfDirector(String directorName){
        this.directorName=directorName;
    }

    public void setEngineerCount(int engineerCount, BuildCompany buildingCompany) throws Exception {

        if(engineerCount<=buildingCompany.getEmployeesNumber()) {
            this.engineerCount = engineerCount;
        } else {
            throw new Exception("a lot of engineers");
        }
    }

    public String getDirectorName() {
        return directorName;
    }

    public int getEngineerCount() {
        return engineerCount;
    }

    @Override
    public String toString() {
        return "EngineeringDepartment{" +
                "directorName='" + directorName + '\'' +
                ", engineerCount=" + engineerCount +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EngineerOffice that = (EngineerOffice) o;
        return engineerCount == that.engineerCount &&
                Objects.equals(directorName, that.directorName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(directorName, engineerCount);
    }
}
