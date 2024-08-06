class A {
  private String model;

  private int price;
  

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
    A obj = new A();
    obj.setPrice(4000);
    obj.setModel("Toyota");

    int pri = obj.getPrice();
    String mod = obj.getModel();
    System.out.println(pri+ ":"+ mod);
    
    

    

  }
}
