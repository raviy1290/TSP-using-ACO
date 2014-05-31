package aco.tsp;

import java.util.Random;

public class RandomGen {

    public static void main(String... args){
        
        for(int i=0; i<5; i++)
            System.out.println(randomWithrange(0, 5));

    }
    
    public static int randomWithrange(int min, int max){
        Random rg = new Random();
        return rg.nextInt(max-min) + min;
    }
}
