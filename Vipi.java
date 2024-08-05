
class Laptop {

  String model;
  int price;

  // public String toString() {
  //   return model + ":" + price;

  // }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((model == null) ? 0 : model.hashCode());
    result = prime * result + price;
    return result;
  }

  @Override
  public String toString() {
    return "Laptop [model=" + model + ", price=" + price + "]";
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Laptop other = (Laptop) obj;
    if (model == null) {
      if (other.model != null)
        return false;
    } else if (!model.equals(other.model))
      return false;
    if (price != other.price)
      return false;
    return true;
  }

  // public boolean equals(Laptop that) {

  //   return this.model.equals(that.model) && this.price == that.price;

  // }
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
