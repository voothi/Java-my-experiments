package ru.voothi.common.Comporator;

import java.util.ArrayList;
import java.util.Comparator;

class Test {

    public static void main(String[] args) {

        ArrayList<House> myHouseArrayList = new ArrayList<House>();

        House firstHouse = new House(100, 120000, "Tokyo", true);
        House secondHouse = new House(40, 70000, "Oxford", true);
        House thirdHouse = new House(70, 180000, "Paris", false);

        myHouseArrayList.add(firstHouse);
        myHouseArrayList.add(secondHouse);
        myHouseArrayList.add(thirdHouse);

        for (House h : myHouseArrayList) {
            System.out.println(h);
        }

        PriceComparator myPriceComparator = new PriceComparator();
        myHouseArrayList.sort(myPriceComparator);

        System.out.println("Sorted: ");
        for (House h : myHouseArrayList) {
            System.out.println(h);
        }

    }
}

class PriceComparator implements Comparator<House> {

    public int compare(House h1, House h2) {
        if (h1.price == h2.price) {
            return 0;
        }
        if (h1.price > h2.price) {
            return 1;
        }
        else {
            return -1;
        }
    }
}