package home.exrecise;

import java.util.Scanner;

public class Dog extends Animal implements Land{
    Scanner in=new Scanner(System.in);
    protected int numberOfLegs;
    public Dog(boolean mammals,boolean carnivorous , int mood) {
         super(true, true, mood);
    }
    
    @Override
    public void sayHello(){
        System.out.println("dog");
    }
    @Override
    public void sayHello(int mood){
        if(mood==MOOD_HAPPY)
            System.out.println("They will bark loudly");
        else
            System.out.println("whooping");
    }
    @Override
    public int getNumberOfLegs() {
        return numberOfLegs;
    }
    
}
