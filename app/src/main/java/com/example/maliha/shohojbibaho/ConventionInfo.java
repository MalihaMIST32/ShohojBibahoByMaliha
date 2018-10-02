package com.example.maliha.shohojbibaho;

public class ConventionInfo {
    private String convName, location, area, capPeople, capParking, decCharge, floorCost,contactNo, userName, primaryKey,owner;

    public ConventionInfo(String convName, String location, String area, String capPeople, String capParking, String decCharge, String floorCost, String contactNo, String userName, String primaryKey,String owner) {
        this.convName = convName;
        this.location = location;
        this.area = area;
        this.capPeople = capPeople;
        this.capParking = capParking;
        this.decCharge = decCharge;
        this.floorCost = floorCost;
        this.contactNo = contactNo;
        this.userName = userName;
        this.primaryKey = primaryKey;
        this.owner = owner;
    }

    public ConventionInfo() {
    }

    public String getOwner() {
        return owner;
    }

    public String getConvName() {
        return convName;
    }

    public String getLocation() {
        return location;
    }

    public String getArea() {
        return area;
    }

    public String getCapPeople() {
        return capPeople;
    }

    public String getCapParking() {
        return capParking;
    }

    public String getDecCharge() {
        return decCharge;
    }

    public String getFloorCost() {
        return floorCost;
    }

    public String getContactNo() {
        return contactNo;
    }

    public String getUserName() {
        return userName;
    }

    public String getPrimaryKey() {
        return primaryKey;
    }
}
