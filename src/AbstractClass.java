

//We care only about calling of method we dont care about underlying implementation

abstract class abstractDog{

    public void bark(){
        System.out.println("Bark!");
    }
    public abstract void poop();
}

class Chihuahua extends abstractDog{


    @Override
    public void poop(){
        System.out.println("Dog, pooped");
    }

}

public class AbstractClass {
    public static void main (String[]args){
        Chihuahua C = new Chihuahua();
        C.bark();
        C.poop();
    }
}
