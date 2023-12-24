package Seminar6.DZ1;


import java.util.HashSet;
import java.util.Set;

public class Product {

    public String brend;
    public Integer price;
    private String os;
    private double ssd;
    private double ddr;
    private String color;

     public Product(String brend, Integer price, String os, double ssd, double ddr, String color) {
        this.brend = brend;
        this.price = price;
        this.os = os;
        this.ssd = ssd;
        this.ddr = ddr;
        this.color = color;
    }
    public String getBrend() {
        return brend;
    }
    public void setBrend(String brend) {
        this.brend = brend;
    }

    public double getSsd() {
        return ssd;
    }

    public double getDdr() {
        return ddr;
    }

    @Override
    public String toString() {
        return  "brend='" + brend + '\'' +
                ", price=" + price +
                ", os='" + os + '\'' +
                ", ssd=" + ssd +
                ", ddr=" + ddr +
                ", color='" + color + '\'';
    }
}



