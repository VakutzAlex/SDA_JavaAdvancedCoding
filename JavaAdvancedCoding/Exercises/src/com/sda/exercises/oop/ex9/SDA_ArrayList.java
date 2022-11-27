package com.sda.exercises.oop.ex9;

import java.util.ArrayList;
import java.util.List;

public class SDA_ArrayList<T> extends ArrayList<T> {

    public List<T> getEveryNthElement(int startIndex, int noOfSkippedElements) {
        List<T> collectorList = new ArrayList<>();

        if (startIndex < 0 || startIndex > size()) {
            throw new IllegalStateException("Invalid start index");
        }

        if (noOfSkippedElements < 0) {
            throw new IllegalStateException("Invalid increment");
        }

        for (int i = startIndex; i < size(); i += noOfSkippedElements + 1) {
            collectorList.add(get(i));
        }
        return collectorList;
    }
}
