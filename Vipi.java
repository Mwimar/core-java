@Deprecated
class A {
  public void showTheDatasHere() {
    System.out.println("In A show");
  }
}

class B extends A {
  @Override
  public void showTheDatasHere() {
    System.out.println("In B show");
  }
}
  

 
 

class Vipi {

  public static void main(String a[]) {
    A obj = new B();
    obj.showTheDatasHere();
  }
}
