package APractice;

//Hierarchical Inheritance

class Animal3{
    void eat(){System.out.println("eating...");}
}
class Dog3 extends Animal3{
    void bark(){System.out.println("barking...");}
}
class Cat extends Animal3{
    void meow(){System.out.println("meowing...");}
}
class HierarchicalInheritance{
    public static void main(String args[]){
        Cat c=new Cat();
        c.meow();
        c.eat();
//c.bark();//C.T.Error
    }}