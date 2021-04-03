package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ISaveable player = new Player("Tim",10,15);
        //player.read(player.write());
        System.out.println(player);
        ISaveable monster = new Monster("Tim",10,15);
        System.out.println(monster);

    }
}
