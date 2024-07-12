package com.example.recyclerviewinandroid;

public class ItemModelClass {
    private String itemName;
    private int itemImage;
    private String itemDescription;

    public ItemModelClass(int itemImage, String itemName, String itemDescription) {
        this.itemName = itemName;
        this.itemImage = itemImage;
        this.itemDescription = itemDescription;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getItemImage() {
        return itemImage;
    }

    public void setItemImage(int itemImage) {
        this.itemImage = itemImage;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }


}
