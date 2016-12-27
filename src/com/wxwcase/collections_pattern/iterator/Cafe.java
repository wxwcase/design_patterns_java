package com.wxwcase.collections_pattern.iterator;

import java.util.ArrayList;

/**
 * Created by wwang on 12/27/2016.
 */
public class Cafe {

    public static void main(String[] args) {

        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinerMenu dinerMenu = new DinerMenu();

        // with no iteration
        System.out.println("\nMENU\n----\nBREAKFAST");
        ArrayList<String> breakfastItems = pancakeHouseMenu.getMenuItems();
        for (int i = 0; i < breakfastItems.size(); i++) {
            String menuItem = breakfastItems.get(i);
            System.out.println(menuItem);
        }

        System.out.println("\nLUNCH");
        String[] lunchItems = dinerMenu.getMenuItems();
        for (int i = 0; i < lunchItems.length; i++) {
            System.out.println(lunchItems[i]);
        }

        // with iterator
        Iterator pancakeIterator = pancakeHouseMenu.createIterator();
        Iterator dinerIterator = dinerMenu.createIterator();

        System.out.println("\nMENU (with iterators)\n----\nBREAKFAST");
        printMenu(pancakeIterator);
        System.out.println("\nLUNCH");
        printMenu(dinerIterator);
    }

    private static void printMenu(Iterator iterator) {
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
