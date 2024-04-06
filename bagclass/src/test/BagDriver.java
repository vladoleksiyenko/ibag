package test;

import structures.Bag;

public class BagDriver {
    public static void main(String[] args) {
        Bag bagOfColors = new Bag(5);

        bagOfColors.add("Blue");
        bagOfColors.add("Green");
        bagOfColors.add("Purple");
        bagOfColors.add("Red");
        bagOfColors.add("White");

        System.out.println(bagOfColors.contains("Yellow"));
        System.out.println(bagOfColors.contains("False"));

        System.out.println(bagOfColors.remove("Purple"));
    }
}
