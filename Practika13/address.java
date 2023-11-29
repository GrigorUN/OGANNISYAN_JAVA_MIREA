package Practika13;

import java.util.StringTokenizer;

public class address {
    String Country;
    String City;
    String street;
    String House;
    String Body;
    String Flat;
    public address(String Address){
        String[] AddressList;
        if (Address.contains(" ")){
            AddressList  = Address.split(" ");
            Country = AddressList[0];
            City = AddressList[1];
            street = AddressList[2];
            House = AddressList[3];
            Body = AddressList[4];
            Flat = AddressList[5];
        }else{
            StringTokenizer buff = new StringTokenizer(Address, ",.;");
            Country = buff.nextToken();
            City = buff.nextToken();
            street = buff.nextToken();
            House = buff.nextToken();
            Body = buff.nextToken();
            Flat = buff.nextToken();

        }
    }

    public String getFlat() {
        return Flat;
    }

    public void setFlat(String flat) {
        Flat = flat;
    }

    public String getBody() {
        return Body;
    }

    public void setBody(String body) {
        Body = body;
    }

    public String getHouse() {
        return House;
    }

    public void setHouse(String house) {
        House = house;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }

    @Override
    public String toString() {
        return "address{" +
                "Country='" + Country + '\'' +
                ", City='" + City + '\'' +
                ", street='" + street + '\'' +
                ", House='" + House + '\'' +
                ", Body='" + Body + '\'' +
                ", Flat='" + Flat + '\'' +
                '}';
    }
}