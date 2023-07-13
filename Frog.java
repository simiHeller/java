
package home.exrecise;

public class Frog extends Animal implements Land, Water{
    protected int numberOfLengs;
    
    public Frog(boolean carnivorous,boolean mammals, int mood) {
        super(mammals,carnivorous,mood);
    }
    @Override
    public void sayHello(int mood){
        if(mood==MOOD_HAPPY)
            System.out.println("quack quack quack");
        else
            System.out.println("plop into the water");
    }
    @Override
    //יש זימים 
    public boolean hasGills() {
            return false;
            
    }

    @Override
    //מטילים ביצים
    public boolean hasLaysEEggs() {
        return true;
    }
     @Override
    public int getNumberOfLegs() {
        return numberOfLengs;
    }

   
    
    
}
