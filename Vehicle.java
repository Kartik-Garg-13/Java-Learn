class Vaahan{
  String brand;
  public Vaahan(String brand){
    this.brand=brand;
  }
}
class Car extends Vaahan{
  String modelname;
  public Car(String brand, String modelname){
    super(brand);
    this.modelname=modelname;
  }
  public void display(){
    System.out.print(brand + " ");
    System.out.print(modelname);
  }
}
public class Vehicle {
  public static void main(String[] args) {
    Car mycar=new Car("Lamborghini", "Aventador");
    mycar.display();  
  }
}
