package edu.teamrocket.guildedrose;

/**
 * Item 17: Minimize mutability
 * Ensure that the class can’t be extended.
 * Bloch, Joshua; Effective Java, Third Edition.
 */
final class Item {

    /** 
     * Item 17: Minimize mutability.
     * Bloch, Joshua; Effective Java, Third Edition.
     */
    private final String name;
    /** 
     * Item 61: Prefer primitive types to boxed primitives.
     * Bloch, Joshua; Effective Java, Third Edition.
    */
    private int sellIn = 0;
    private int quality = 0;

    Item(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }

    /**
     * Returns a brief description of the Item. 
     * The exact details of the representation are unspecified
     * and subject to change, but the following may be regarded
     * as typical.
     * [name=Sulfuras, sell_in=10, quality=20]"
     * 
     * Item 12: Always override toString
     * Item 63: Beware the performance of string concatenation
     * Bloch, Joshua; Effective Java, Third Edition.
     */
    @Override
    public String toString() {
        StringBuilder itemDescription = new StringBuilder();
        itemDescription.append("name=" + getName());
        itemDescription.append(", sellIn=" + getSellIn());
        itemDescription.append(", quality=" + getQuality());
        return itemDescription.toString();
    }

    String getName() {
        return this.name;
    }

    int getSellIn() {
        return this.sellIn;
    }

    void setSellIn() {
        this.sellIn = this.getSellIn() - 1;
    }

    int getQuality() {
        return this.quality;
    }

    void setQuality(int value) {
        this.quality = value;
    }
}