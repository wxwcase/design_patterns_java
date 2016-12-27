package com.wxwcase.collections_pattern.iterator;

/**
 * Created by wwang on 12/27/2016.
 */
public class DinerMenuIterator implements Iterator {

    String[] items;
    int position = 0;

    public DinerMenuIterator(String[] items) {
        this.items = items;
    }

    public boolean hasNext() {
        if (position >= items.length || items[position] == null) {
            return false;
        } else {
            return true;
        }
    }

    public Object next() {
        String menuItem = items[position];
        position += 1;
        return menuItem;
    }
}
