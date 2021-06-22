package com;

import java.util.Random;

public class randome {
    public static void main(String[] args) {
        Random random = new Random();
        int rand = random.nextInt(9999);
        System.out.println(rand);
    }
}
