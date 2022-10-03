

// simple example of covariantreturntype

class A{
    A get(){return this;}
}

class CovariantReturnType extends A{
    @Override
    CovariantReturnType get(){return this;}
    void message(){System.out.println("welcome to covariant return type");}

    public static void main(String args[]){
        new CovariantReturnType().get().message();
    }
}