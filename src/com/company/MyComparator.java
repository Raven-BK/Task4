package com.company;

import java.util.Comparator;

public class MyComparator {
    public static class FirstComparator implements Comparator<String> {
        @Override
        public int compare(String o1, String o2) {
            int iterator1 = o1.toCharArray().length - 1;
            while (o1.toCharArray()[iterator1] != '.') {
                iterator1--;
            }
            int iterator2 = o2.toCharArray().length - 1;
            while (o2.toCharArray()[iterator2] != '.') {
                iterator2--;
            }
            if (o1.toCharArray()[iterator1 + 1] != o2.toCharArray()[iterator2 + 1]) {
                return o1.toCharArray()[iterator1 + 1] - o2.toCharArray()[iterator2 + 1];
            } else {
                return o1.toCharArray()[0] - o2.toCharArray()[0];
            }
        }
    }

    public static class SecondComparator implements Comparator<String> {
        @Override
        public int compare(String o1, String o2) {
            int iterator1 = o1.toCharArray().length - 1;
            while (o1.toCharArray()[iterator1] != '.') {
                iterator1--;
            }
            int iterator2 = o2.toCharArray().length - 1;
            while (o2.toCharArray()[iterator2] != '.') {
                iterator2--;
            }
            if (o1.toCharArray()[iterator1 + 1] != o2.toCharArray()[iterator2 + 1]) {
                return o2.toCharArray()[iterator2 + 1] - o1.toCharArray()[iterator1 + 1];
            } else {
                return o2.toCharArray()[0] - o1.toCharArray()[0];
            }
        }
    }

    public static class ThirdComparator implements Comparator<String> {
        @Override
        public int compare(String o1, String o2) {
            return o1.toCharArray()[0] - o2.toCharArray()[0];
        }
    }

    public static class FourthComparator implements Comparator<String> {
        @Override
        public int compare(String o1, String o2) {
            return o2.toCharArray()[0] - o1.toCharArray()[0];
        }
    }
}
