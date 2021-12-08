package com.company.FinalClasses;

import java.util.Objects;

public final class LawyersOffice {
    protected String directorName;
    protected int lawyersCount;

    public LawyersOffice(){
    }

    public LawyersOffice(String directorName, int lawyersCount, BuildCompany buildingCompany) throws Exception {

        this.directorName=directorName;
        if(lawyersCount<=buildingCompany.getEmployeesNumber()){
            this.lawyersCount=lawyersCount;
        } else {
            throw new Exception("a lot of lawyers");
        }
    }

    public void setLawyersCount(String directorName, int lawyersCount, BuildCompany buildingCompany) throws Exception {

        this.directorName=directorName;
        if(lawyersCount<=buildingCompany.getEmployeesNumber()){
            this.lawyersCount=lawyersCount;
        } else {
            throw new Exception("a lot of lawyers");
        }
    }

    public void setDirectorName(String directorName) {
        this.directorName = directorName;
    }

    public String getDirectorName() {
        return directorName;
    }

    public int getLawyersCount() {
        return lawyersCount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LawyersOffice that = (LawyersOffice) o;
        return lawyersCount == that.lawyersCount &&
                Objects.equals(directorName, that.directorName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(directorName, lawyersCount);
    }

    @Override
    public String toString() {
        return "LawDepartment{" +
                "directorName='" + directorName + '\'' +
                ", lawyersCount=" + lawyersCount +
                '}';
    }
}
