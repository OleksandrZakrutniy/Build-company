package com.company.FinalClasses;

import java.util.Objects;

public final class Client {

    private String nameOfClient, addressOfClient;

    public Client(){
        nameOfClient = "";
        addressOfClient = "";
    }

    public Client(String nameOfClient, String addressOfClient){
        this.nameOfClient = nameOfClient;
        this.addressOfClient = addressOfClient;
    }

    public void setAddressOfClient(String addressOfClient){
        this.addressOfClient = addressOfClient;
    }

    public String getAddressOfClient(){
        return  addressOfClient;
    }

    public void setNameOfClient(String nameOfClient){
        this.nameOfClient = nameOfClient;
    }

    public String getNameOfClient(){
        return nameOfClient;
    }

    @Override
    public String toString() {
        return "Client{" +
                "nameOfClient='" + nameOfClient + '\'' +
                ", addressOfClient='" + addressOfClient + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return Objects.equals(nameOfClient, client.nameOfClient) &&
                Objects.equals(addressOfClient, client.addressOfClient);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameOfClient, addressOfClient);
    }

}
