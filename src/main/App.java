package lv.rvt; // Klases atrašanas vieta projektā

import java.util.Scanner;

public class Mainpro {
    
    public static void main(String[] args) {

        DecreasingCounter counter = new DecreasingCounter(10);

        counter.printValue();

        counter.decrement();
        counter.printValue();

        counter.decrement();
        counter.printValue();
    }