package com.example.budgetfoods;

import android.widget.Button;

public class foods {
    private String Desc;
    private Button Add;
    private String Price;
    private int Images;

    public foods() {

    }

    public foods(String desc, String price, int images, Button add) {
        Desc = desc;
        Add = add;
        Price = price;
        Images=images;
    }

    public String getDesc() {
        return Desc;
    }

    public String getPrice() {
        return Price;
    }

    public int getImages() {
        return Images;
    }

    public Button getAdd() {
        return Add;
    }

    public void setDesc(String desc) {
        Desc = desc;
    }

    public void setAdd(Button add) {
        Add = add;
    }

    public void setPrice(String price) {
        Price = price;
    }
}
