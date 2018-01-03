package com.company;

import java.util.List;

public class Sieve {

    List<Integer> sieve(List<Integer> list) {

        for (int base=2; base < Math.sqrt(list.size());base++) {

            int multiplication = base;

            for (int i = 0; i < list.size(); i++) {
                list.set(multiplication, 0);
                multiplication = multiplication + base;
            }

        }
        return list;
    }
    List<Integer> zeroRemoval(List<Integer> list){

        while (list.contains(0)) {
            list.remove(new Integer(0));
        }
        return list;
    }

}
