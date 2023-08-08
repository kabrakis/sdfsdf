package hw4.task2;

import java.util.ArrayList;
import java.util.List;

public class PrintArray<E> {
    private List<E> arrayList = new ArrayList<>();

    public void AddList(E List) {
        arrayList.add(List);
    }

    void PrintArray() {
        for (E i : arrayList) {
            System.out.println(i);
        }
    }
}
