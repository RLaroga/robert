package Practice;

class robert{
    public void code(){
        System.out.println("I can code java");
    }
}

class raymond extends robert{
    @Override
    public void code(){
        System.out.println("I can code C#");
    }
}

public class Polymorphism {
    public static void main (String [] args){
        raymond R = new raymond();
        R.code();
    }
}
