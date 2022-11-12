package model;

public class Client extends Person {
    public Client(String name) {
        super(name);
    }
    private String Count;

    public String getCount() {
        return Count;
    }

    public void setCount(String count) {
        Count = count;
    }

    public Client(String name, String count) {
        super(name);
        Count = count;
    }
}
