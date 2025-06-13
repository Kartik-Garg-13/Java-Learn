class Animal {
  public String sound(){
    return "Animal Makes A Sound";
  }
}
class Dog extends Animal{
  public String sound(){
    return "Dog Says Woof Woof";
  }
}
class Cat extends Animal{
  public String sound(){
    return "Cat Says Meow Meow";
  }
}
public class TestAnimals{
  public static void main(String[] args) {
    Animal myDog = new Dog();
    Animal myCat = new Cat();
    Animal mysound = new Animal();
    System.out.println(mysound.sound());
    System.out.println(myDog.sound());
    System.out.println(mysound.sound());
    System.out.println(myCat.sound()); 
  }
}



