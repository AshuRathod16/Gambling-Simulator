package com.bridgelabz;

public class GamblingSimulator {
    public static void main(String[] args) {
        System.out.println("Welcome to Gambling Simulator");
        int totalAmount = 100;
        int bet = 1;
        while (totalAmount > 50 && totalAmount < 150) {
            double gameCheck = Math.floor(Math.random() * 10) % 2;
            if (bet == gameCheck) {
                System.out.println("you won the game");
                totalAmount++;
            } else {
                System.out.println("you lost the game");
                totalAmount--;
            }
        }
        System.out.println("Total amount :" + totalAmount);


    }

}
