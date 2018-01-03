package com.company;


import java.util.List;

public class Main {

    public static void main(String[] args) {

        Sieve sieve = new Sieve();
        Generator generator = new Generator();

        int arg0 = Integer.parseInt(args[0]);
        System.out.println(generator.Integers(arg0).get(4));
        List<Integer> list = sieve.zeroRemoval(sieve.sieve(generator.Integers(arg0)));

        System.out.println(list.toString());


    }
}
