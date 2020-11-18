package com.company;

public class Die {

    private int total;

    public void roll(){
        total = (int)(Math.random() * 6 + 1);
    }
    public int getNumDots(){
        return total;
    }

    public static void main (String[] args){
        //TODO Auto-generated methods stub
        Die die = new Die();
        die.roll();
        System.out.println(die.getNumDots());


    }
}
