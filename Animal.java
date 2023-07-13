
package home.exrecise;

public abstract class  Animal {
    private boolean mammals; //יונק
    private boolean carnivorous; //טורף
    public static int MOOD_HAPPY; //מצב רוח שמח
    public static int MOOD_SCARE; //מצב מפוחד
    private int mood;//מצב
    
   
    public Animal(boolean carnivorous, boolean mammals,int mood ){
        this.carnivorous=carnivorous;
        this.mammals=mammals;
        this.mood=mood;
        MOOD_HAPPY=1;
        MOOD_SCARE=-1;
    }
   
    public int getMood() {
        return mood;
    }

    public void setMood(int mood) {
        this.mood = mood;
    }
    
    public void sayHello(){
        System.out.println("i am Animal");
    }
    public abstract void sayHello(int index);
    public boolean isMammals(){
        return this.mammals;
    }
    public void setMammals(boolean Mammals){
        this.mammals=Mammals;
    }
    public boolean isCarnivorous(){
        return this.carnivorous;
    }
    
    public void setCarnivorous(boolean Carnivorous){
        this.carnivorous=Carnivorous;
    }

    
    
            
          
    
    
}
