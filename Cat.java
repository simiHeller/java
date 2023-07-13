
package home.exrecise;

public class Cat extends Animal implements Land{
    protected int numberOfLengs;

    public Cat(boolean carnivorous, boolean mammals, int mood) {
        super(carnivorous, mammals, mood);
    }

    
    public void sayHello(){
        System.out.println("meow~");
    }
    @Override
     public void sayHello(int mood){
        if(mood==MOOD_HAPPY)
             System.out.println(" purr, purr");
        else
             System.out.println("hiss");
    }
    
    @Override
    public int getNumberOfLegs() {
        return numberOfLengs;
    }
    
}
