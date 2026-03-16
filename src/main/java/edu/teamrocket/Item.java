package edu.teamrocket;

public class Item {

    //atributos
    private final String name;
    private int sell_in;
    private int quality;

    //constructor
    Item(String name, int sell_in, int quality) {
        this.name = name;
        this.sell_in = sell_in;
        this.quality = quality;
    };

    //métodos
     String getName() {
        return name;
    }

    int getSell_in() {
        return sell_in;
    }

    int getQuality() {
        return quality;
    }

    void setSell_in(int sell_in) {
        this.sell_in = sell_in;
    }

    void setQuality(int quality) {
        this.quality = quality;
    }

    @Override
    public String toString() {};


}
