enum Laptop {
  Thinkpad(400), HP(9000), Mac(3000), Acer(500);
  private int price;

  public int getPrice() {
    return price;
  }

  public void setPrice(int price) {
    this.price = price;
  }

  private Laptop(int price) {
    this.price = price;
  }
  
}
 
 

class Vipi {

  public static void main(String a[]) {

    // Status[] rr = Status.values();
    // Status s = Status.Success;
   
    // for (Status r : rr) {
    //   System.out.println(r);
    // }

    // if (s == Status.Running) {
    //   System.out.println("All good");
    // } else if (s == Status.Loading) {
    //   System.out.println("Please wait");
    // } else if (s == Status.Success) {
    //   System.out.println("Done");
    // } else {
    //   System.out.println("Retry");
    // }
//     switch (s) {
//   case Running:
//   System.out.println("All good");
//   break;
// case Loading:
//  System.out.println("Please wait");
//    break;
//  case Success:
//    System.out.println("Done");
//    break;
//  default:
//    System.out.println("Timeout");
//    break;

// }
  }
}
