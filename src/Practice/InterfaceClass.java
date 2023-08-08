package Practice;

interface Waterbottleinterface{
    String color = "blue";
    void fillUp();
}

public class InterfaceClass implements Waterbottleinterface{
    public static void main(String [] args){
        System.out.println("The color of bottle is "+ color);
        InterfaceClass W = new InterfaceClass();
        W.fillUp();
    }
    @Override
    public void fillUp(){
        System.out.println("It is filled");
    }

}
