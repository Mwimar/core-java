
@FunctionalInterface
interface A {
  int add(int x, int z);

}



 
 

class Vipi {

  public static void main(String a[]) {
    // A obj = (x, y) -> x + y;
    
    // int result = obj.add(6, 3);
    // System.out.println(result);
    int x = 5;
    int y = 0;
    try {
       y= 18 / x;
     } catch (Exception e) {
      System.out.println("Something is up!");
    }
    System.out.println(y);
    System.out.println("Bye");
  }
}
