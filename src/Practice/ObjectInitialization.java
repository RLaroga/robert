package Practice;

public class ObjectInitialization {
    public static void main (String [] args){

        //Initialization of Object through reference
        class1 c1 = new class1();
        c1.name = "5Robert";
        c1.number = 5;
        System.out.println(c1.name +" "+ c1.number);

        //Initialization of Object through method - I Think same as Constructor (Constructor code that initialize a newly created object)
        class2 c2 = new class2();
        c2.insertRecord(4, "4Robert");
        System.out.println(c2.name+" "+c2.rollno);
    }
}
class class1{
    int number;
    String name;
}

class class2{
    int rollno;
    String name;
    void insertRecord(int r, String n){
        rollno = r;
        name = n;
    }
}