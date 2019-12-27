package TestPackage; 

public class Main {
  
}

class Parent{
  String city;
  Parent(String city){
    this.city = city;
    
  }
  public void display(){
    System.out.println("City name " + city);
  }
}

class Child extends Parent{
  Child(String city){
    super(city);
  }
}