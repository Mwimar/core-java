enum Status {
  Running, Loading, Success, Failed
}
 
 

class Vipi {

  public static void main(String a[]) {
   
    Status[] rr = Status.values();
   
    for (Status r : rr) {
      System.out.println(r);
    }

  }
}
