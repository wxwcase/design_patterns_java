package com.wxwcase.collections_pattern.iterator;

import java.util.ArrayList;

/**
 * Created by wwang on 12/27/2016.
 */
public class PancakeHouseMenuIterator implements Iterator {

    ArrayList<String> items;
    int position = 0;

    public PancakeHouseMenuIterator(ArrayList<String> items) {
        this.items = items;
    }

    public boolean hasNext() {
        if (position >= items.size()) {
            return false;
        } else {
            return true;
        }
    }

    public Object next() {
        String menuItem = items.get(position);
        ++position;
        return menuItem;
    }
}
