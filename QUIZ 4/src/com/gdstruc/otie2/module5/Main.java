package com.gdstruc.otie2.module5;

public class Main {
    public static void main(String[] args) {
        Player pikachu = new Player(25, "Pikachu", 1);
        Player celebi = new Player(251, "Celebi", 2);
        Player hitmonchan = new Player(107, "Hitmonchan", 3);
        Player mankey = new Player(56, "Mankey", 4);
        Player starmie = new Player(175, "Starmie", 4);

        SimpleHashtable hashtable = new SimpleHashtable();

        hashtable.put(celebi.getUserName(), celebi);
        hashtable.put(mankey.getUserName(), mankey);
        hashtable.put(pikachu.getUserName(), pikachu);
        hashtable.put(hitmonchan.getUserName(), hitmonchan);
        hashtable.put(starmie.getUserName(), starmie);

        System.out.println("===Hash table before removing: ===");
        hashtable.printHashtable();
        System.out.println("\n");

        hashtable.remove("Celebi");

        System.out.println("===Hash table after removing: ===");
        hashtable.printHashtable();
    }
}