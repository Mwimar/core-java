
@FunctionalInterface
interface A {
  int add(int x, int z);

}



 
 

class Vipi {

  public static void main(String a[]) {
    A obj = (int x, int y) -> x + y;
    
    int result = obj.add(6, 3);
    System.out.println(result);
  }
}
