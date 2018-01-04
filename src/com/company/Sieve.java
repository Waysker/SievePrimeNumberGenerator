package com.company;

import java.util.List;

public class Sieve {

    // TODO sieve is a noun, name your methods with verbs tell what they do, TELL THEIR STORY
    // change to 'sievify'
    List<Integer> sieve(List<Integer> list) {

        for (int base=2; base < Math.sqrt(list.size());base++) {

            int multiplication = base;
            // TODO change this iteration logic as we discussed. Change this i++ to i+=base or multiplication
            // or whatever the new convention would be 
            for (int i = 0; i < list.size(); i++) {
                list.set(multiplication, 0);
                multiplication = multiplication + base;
            }

        }
        return list;
    }
    // TODO here also - removeZeros instead of noun removal
    List<Integer> zeroRemoval(List<Integer> list){

        // TODO if you want to you can try using Iterator. Point is: you iterate in a for loop with Iterator
        // it keeps track of current item and allows for removing it while iterating.
        // so it would look like sth like this:
        // ListIterator<Integer> iterator = list.listIterator();
        // while(it.hasNext()) {
        //      if ( == 0)
        //          remove
        // I left out some code for you to have fun patching it up
        while (list.contains(0)) {
            list.remove(new Integer(0));
        }
        return list;
    }

}
