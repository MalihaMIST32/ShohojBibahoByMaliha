package com.example.maliha.shohojbibaho;

public class CateringInfo {
    private String cateringName, areaOfService, chargePerWaiter, itemName, price, contactNo, userName, primaryKey,owner;

    public CateringInfo(String cateringName, String areaOfService, String chargePerWaiter, String itemName, String price, String contactNo, String userName, String primaryKey,String owner) {
        this.cateringName = cateringName;
        this.areaOfService = areaOfService;
        this.chargePerWaiter = chargePerWaiter;
        this.itemName = itemName;
        this.price = price;
        this.contactNo = contactNo;
        this.userName = userName;
        this.primaryKey = primaryKey;
        this.owner = owner;
    }

    public CateringInfo() {
    }

    public String getOwner() {
        return owner;
    }

    public String getCateringName() {
        return cateringName;
    }

    public String getAreaOfService() {
        return areaOfService;
    }

    public String getChargePerWaiter() {
        return chargePerWaiter;
    }

    public String getItemName() {
        return itemName;
    }

    public String getPrice() {
        return price;
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
