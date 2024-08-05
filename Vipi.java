
class Laptop {
  
  String model;
  int price;

  public String toString() {
    return model + ":" + price;
  }

  public boolean equals(Laptop that) {

    return this.model.equals(that.model) && this.price == that.price;
    
  }
 }



class Vipi {

  public static void main(String a[]) {
    Laptop obj = new Laptop();
    obj.model = "HP";
    obj.price = 400;

    Laptop obj1 = new Laptop();
    obj1.model = "HP";
    obj1.price = 400;

    boolean result = obj.equals(obj1);
    System.out.println(result);
    
  //  System.out.println(obj.toString());
  }
}
