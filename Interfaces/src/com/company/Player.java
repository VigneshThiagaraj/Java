package com.company;

import java.util.ArrayList;
import java.util.List;

public class Player implements ISaveable{
    private String name;
    private String weapon;
    private int hitPoints;
    private int strength;

    public Player(String name, int hitPoints, int strength) {
        this.name = name;
        this.weapon = "Sword";
        this.hitPoints = hitPoints;
        this.strength = strength;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    @Override
    public List<String> write() {
        List<String> listString = new ArrayList<String>();
        listString.add(this.name);
        listString.add(String.valueOf(this.hitPoints));
        listString.add(String.valueOf(this.strength));
        listString.add(String.valueOf(this.weapon));
        return listString;
    }

    @Override
    public void read(List<String> listToRead) {
        if (listToRead != null && listToRead.size()>0){
                setName(listToRead.get(0));
                setHitPoints(Integer.valueOf(listToRead.get(1)));
                setStrength(Integer.valueOf(listToRead.get(2)));
                setWeapon(listToRead.get(3));
        }
    }

    @Override
    public String toString() {
        return "Player{name='"+this.name+"', hitPoints="+this.hitPoints+", strength="+this.strength+", weapon='"+this.weapon+"'}";
    }
}
