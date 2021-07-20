package model;

public class Participant {


    public String name;


    // Constructor
    public Participant(String text) {
        name = text;
    }

    // getter for name
    public String getName() {
        return name;
    }

    // setter for name
    public void setName(String name) {
        this.name = name;
    }
}
