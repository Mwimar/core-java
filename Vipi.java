enum Status {
  Running, Loading, Success, Failed
}
 
 

class Vipi {

  public static void main(String a[]) {
   
    Status[] rr = Status.values();
    Status s = Status.Running;
   
    // for (Status r : rr) {
    //   System.out.println(r);
    // }

    if (s == Status.Running) {
      System.out.println("All good");
    } else if (s == Status.Loading) {
      System.out.println("Please wait");
    } else if (s == Status.Success) {
      System.out.println("Done");
    } else {
      System.out.println("Retry");
    }

  }
}
