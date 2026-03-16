package edu.teamrocket.guildedrose;

public class NormalItem implements Updateable {

    private final Item item;
    
    public NormalItem(String name, int sellIn, int quality) {

        this.item = new Item(name, sellIn, quality);

    }

    @Override
    public String toString() {
        return this.item.toString();
    }


    Item getItem() {
        return this.item;
    }


    public String getName() {
        return this.item.getName();
    }


    public int getSellIn() {
        return this.item.getSellIn();
    }

    public int getQuality() {
        return this.item.getQuality();
    }

    @Override
    public void updateQuality() {

    }



}