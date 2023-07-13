package home.exrecise;

public class HomeExrecise {

    public static void main(String[] args){
        Animal[] arr = new Animal[3];
        arr[0]=new Cat(true, true, -1);
        arr[1]=new Dog(true,true, 1);
        arr[2]=new Frog(false,false,1);
        //יש כאן דריסה כל סוג חיה מפעיל את הפעולה \
        // שהוא צריך לעשות
       for (int i = 0; i < arr.length; i++) {
           arr[i].sayHello();
           System.out.println(arr[i].isCarnivorous());
           System.out.println(arr[i].isMammals());
        }
       
    }
    
}
