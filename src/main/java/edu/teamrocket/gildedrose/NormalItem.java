package edu.teamrocket.gildedrose;

public class NormalItem {
    private final Item item;
    
    //constructor
    NormalItem(String name, int sell_in, int quality) {
        this.item = new Item(name, sell_in, quality);
    };

    //métodos
    Item getItem() {
        return this.item;
    };

    public int getQuality() {
        return item.getQuality();
    };

    public String getName() {
        return item.getName();
    };

    public int getSell_in() {
        return item.getSell_in();
    };

    void setSell_in() {
        item.setSell_in();
    };

    void computeQuality(int value) {

        if (getQuality() + value > 50) {
            item.setQuality(50);
        }
        else if (getQuality() + value >= 0) {
            item.setQuality(getQuality() + value);
        }
        else {
            item.setQuality(0);
        }
    }

    public void updateQuality() {

        if (getSell_in() > 0) {
            computeQuality(-1);
        } else {
            computeQuality(-2);
        }
        setSell_in();
    }



}
