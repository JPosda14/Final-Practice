package model;

public class Service {
    private String name;
    private double price;
    private int time;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public Service(String name, double price, int time) {
        this.name = name;
        this.price = price;
        this.time = time;
    }
}
