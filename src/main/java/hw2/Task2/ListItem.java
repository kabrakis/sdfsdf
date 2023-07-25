package hw2.Task2;

import java.util.ArrayList;
import java.util.List;

public class ListItem {
    private List<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        items.add(item);
    }

    public List<Item> getItems() {
        return items;
    }

    private class itemIterator implements iterator<Item> {
        private int currentIndex = 0;

        @Override
        public boolean hasNext() {
            return currentIndex < items.size();
        }

        @Override
        public Item next() {
            return items.get(currentIndex++);
        }

        @Override
        public void remove() {
            items.remove(currentIndex - 1);
            currentIndex--;
        }

    }

    // Метод, возвращающий объект итератора для списка продуктов
    public iterator<Item> iterator() {
        return new itemIterator();
    }

}
