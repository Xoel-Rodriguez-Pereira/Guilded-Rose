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

    void setSellIn() {
        this.item.setSellIn();
    }

    public int getQuality() {
        return this.item.getQuality();
    }


    void computeQuality(int value) {
        if (getQuality() + value > 50) {
            this.item.setQuality(50); 
        } else if (getQuality() + value >= 0) {
            this.item.setQuality(getQuality() + value);
        } else {
            this.item.setQuality(0);
        }
    }

    @Override
    public void updateQuality() {
        if (getSellIn() > 0) {
            computeQuality(-1);
        }
        else {
            computeQuality(-2);
        }

        setSellIn();
    }
}