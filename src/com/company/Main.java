package com.company;

public class Main {

    public static void main(String[] args) {
//        Method overloading:  when you use the same method name with diff params
//        Changing the data type of a method is not enough. it's actually the number of params and their data type that matters.'

        int newScore = calcScore("John", 2500);
        int finalScore = calcScore(750);
        int noParams = calcScore();
        System.out.println(newScore);
        System.out.println(finalScore);
        System.out.println(noParams);

    }
    public static int calcScore(String name, int score){
        System.out.println("Player: " + name);
        System.out.println("Score: " + score);
        return score * 2;
    }

    public static int calcScore( int score){
        System.out.println("Score only: " + score);
        return score * 2;
    }
    public static int calcScore(){
        return 2;
    }
}
