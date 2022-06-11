package org.example.reverse;

import java.util.Comparator;

public class CompareStringByLength implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        return Integer.compare(o1.length(), o2.length());
    }
}
