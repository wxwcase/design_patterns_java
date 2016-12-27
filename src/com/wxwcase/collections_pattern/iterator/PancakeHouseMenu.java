package com.wxwcase.collections_pattern.iterator;

import java.util.ArrayList;

/**
 * Created by wwang on 12/27/2016.
 */
public class PancakeHouseMenu implements Menu {

    ArrayList<String> menuItems;

    public PancakeHouseMenu() {
        menuItems = new ArrayList<>();

        addItem("K&B's Pancake Breakfast");
        addItem("Regular Pancake Breakfast");
        addItem("Blueberry Pancakes");
        addItem("Waffles");
    }

    public void addItem(String name) {
        menuItems.add(name);
    }

    public ArrayList<String> getMenuItems() {
        return menuItems;
    }

    public String toString() {
        return "Pancake House Menu";
    }

    public Iterator createIterator() {
        return new PancakeHouseMenuIterator(menuItems);
    }
}
