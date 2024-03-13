package model;

import interfaces.Dishable;

public class FirstCourse implements Dishable {

    private String name;
    private String descriptoin;
    private int quant;

    public FirstCourse(String name, String desc, int quantity){
       this.name=name;
       this.descriptoin=desc;
       this.quant=quantity;
    }


    public double getPrice(int quantity) {
        return quantity *2;
    }
}
