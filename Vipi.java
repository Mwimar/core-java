
class Laptop {
  
  String model;
  int price;

  public String toString() {
    return model + ":" + price;
  }
 }



class Vipi {

  public static void main(String a[]) {
    Laptop obj = new Laptop();
    obj.model = "HP";
    obj.price = 400;
    
   System.out.println(obj.toString());
  }
}
