package com.interfaces;

import java.util.ArrayList;
import java.util.List;

public class Monster implements ISaveable{
    private String name;
    private int hitPoints;
    private int strength;

    public Monster(String name, int hitPoints, int strength) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
    }

    public String getName() {
        return name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    @Override
    public List<String> write() {
        List<String> listString = new ArrayList<String>();
        listString.add(this.name);
        listString.add(String.valueOf(this.hitPoints));
        listString.add(String.valueOf(this.strength));
        return listString;
    }

    @Override
    public void read(List<String> listToRead) {
        if (listToRead != null && listToRead.size()>0){
            List<String> listString = listToRead;
        }
    }


    @Override
    public String toString() {
        return "Monster{name='"+this.name+"', hitPoints="+this.hitPoints+", strength="+this.strength+"'}";
    }
}
