
@FunctionalInterface
interface A {
  void show();

}

class B implements A {
  public void show() {
    System.out.println("In B show");
  }
} 

 
 

class Vipi {

  public static void main(String a[]) {
    A obj = new B();
    obj.show();
  }
}
