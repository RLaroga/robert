package Practice;

//parent class.

class Vehicle{
    void run(){
        System.out.println("Practice.Vehicle is running");
    }
}
//child class

class MethodOverriding extends Vehicle{

    //defining the same method as in the parent class

    void run(){
        System.out.println("Bike is running safely");
    }

    public static void main(String args[]){
        MethodOverriding obj = new MethodOverriding();  //creating object
        obj.run();  //calling method
    }
}