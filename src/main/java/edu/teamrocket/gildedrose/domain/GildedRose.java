package edu.teamrocket.gildedrose.domain;

import java.util.ArrayList;
import java.util.List;

public class GildedRose {

    private List<Updateable> inventory = new ArrayList<Updateable>();

    // en verdad es un getInventory
    public List<Updateable> inventory() {
        return this.inventory;
    }

    public void addItem(Updateable item) {
        this.inventory.add(item);
    }

    public void updateQuality() {
        for (Updateable item: inventory()) {
            item.updateQuality();
        }
    }


    @Override
    public String toString() {
        StringBuilder representation = new StringBuilder();
        for (Updateable item : inventory()) {
            representation.append(item.toString());
            representation.append('\n');
        }
        return representation.toString();
    }
}
