package com.company;

import java.util.ArrayList;
import java.util.List;

public class Generator {

    List<Integer> Integers(int highest) {

        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i <= highest; i++){
            list.add(i);
            System.out.println(list.get(i));
        }

        return list;
    }

}
