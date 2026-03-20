package edu.teamrocket.guildedrose;

public class Conjured extends NormalItem{

    public Conjured (String name, int SellIn, int quality){
        super(name, SellIn, quality);
    }

    @Override
    public void updateQuality() {

        if (getSellIn() > 0){
            computeQuality(-2);
        } else {
            computeQuality(-4);
        }

        setSellIn();
    }

















}