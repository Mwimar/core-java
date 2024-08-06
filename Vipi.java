class A {
  private String model;

  private int price;
  

  public A(String model, int price) {
    this.model = model;
    this.price = price;

  }
  
  public A() {
    
  }

  //getters
  public String getModel() {
    return model;
  }

  public int getPrice() {
    return price;
  }

  public void setPrice(int price){
    this.price = price;
  }

  public void setModel(String model) {
    this.model = model;
  }

 
  public void show(){

    System.out.println("in A class");
  }

 
  }


class Vipi {

  public static void main(String a[]) {
    A obj1 = new A("Cadillac", 500000);
    System.out.println(obj1.toString());
    A obj2 = new A();

    obj2.setPrice(4000);
    obj2.setModel("Toyota");

    int pri = obj2.getPrice();
    String mod = obj2.getModel();
    System.out.println(pri+ ":"+ mod);
    
    

    

  }
}
