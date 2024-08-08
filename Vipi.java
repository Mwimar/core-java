
@FunctionalInterface
interface A {
  int add(int x, int z);

}



 
 

class Vipi {

  public static void main(String a[]) {
    // A obj = (x, y) -> x + y;
    
    // int result = obj.add(6, 3);
    // System.out.println(result);
    int x = 0;
    int y = 0;
    
    try {
      y = 18 / x;
       
      
    } catch (ArithmeticException e) {
      
      y = 18 / 1;
    
    } catch (Exception e) {
      System.out.println("Sth went Wrong " + e);
    }
    System.out.println(y);
    System.out.println("Bye");
  }
}
