import java.util.Scanner;

class numeric{

    int number;
    public void count(){
        System.out.println("I Can Count");
    }
}

class one extends numeric{

    public void display(){
        if(number>100) {
            System.out.println("The number is " + number);
        }
        else{
            System.out.println("The number is lower than 100");
        }
    }
}


public class RobertInheritance {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        one wan = new one();
        System.out.println("Please Enter a number");
        wan.number = input.nextInt();
        wan.display();
        wan.count();
    }
}



