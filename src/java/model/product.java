/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author os
 */
public class product {
    private int id;
    private String name;
    private String img;
    private float price;
    private String desc;

    public product() {
    }

    public product(int id, String name, String img, float price, String desc) {
        this.id = id;
        this.name = name;
        this.img = img;
        this.price = price;
        this.desc = desc;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "product{" + "id=" + id + ", name=" + name + ", img=" + img + ", price=" + price + ", desc=" + desc + '}';
    }

    
    
    
}
