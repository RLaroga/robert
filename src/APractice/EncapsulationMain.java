package APractice;

//We are encapsulating our properties within the object by setting properties to private ( set getters and setters)

public class EncapsulationMain {
    public static void main (String [] args){
        EncapsulationClass EC = new EncapsulationClass();
        EC.setName("R(dot)");
        EC.setAge(20);
        System.out.println(EC.getName());
        System.out.println(EC.getAge());
    }
}
