package edu.teamrocket.guildedrose;

public class Backstage extends NormalItem {

    public Backstage(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    public void updateQuality() {
        if (getSellIn() > 10) {
            computeQuality(+1);
        } else if (getSellIn() > 5) {
            computeQuality(+2);
        } else if (getSellIn() > 0) {
            computeQuality(+3);
        } else {
            getItem().setQuality(0);
        }
        setSellIn();
    }
}