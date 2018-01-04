package com.company;


import java.util.List;

public class Main {

    public static void main(String[] args) {

        Sieve sieve = new Sieve();
        Generator generator = new Generator();

        // TODO name variables with meaningful names, tell viewer what this stuff IS, what JOB DOES IT HAVE, don't state
        // obvious like it's argument zero. Tell me what this is FOR, with its name, so I don't need to analyze code to know it
        int arg0 = Integer.parseInt(args[0]);
        System.out.println(generator.Integers(arg0).get(4));
        List<Integer> list = sieve.zeroRemoval(sieve.sieve(generator.Integers(arg0)));

        System.out.println(list.toString());


    }
}
