
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
    int[] nums = new int [5];
    try {
      y = 18 / x;
       
      System.out.println(nums[5]);
    } catch (ArithmeticException e) {
      
      System.out.println("Cannot divide by zero..");
    } catch(ArrayIndexOutOfBoundsException e){
System.out.println("Array out of bonds");
    }
    System.out.println(y);
    System.out.println("Bye");
  }
}
