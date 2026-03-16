package edu.teamrocket.gildedrose;

public class Item {

    //atributos
    private final String name;
    private int sell_in = 0;
    private int quality = 0;

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

    void setSell_in() {
        this.sell_in = this.getSell_in() - 1;
    }

    void setQuality(int value) {
        this.quality = value;
    }


}
