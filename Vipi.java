
class A {

  public void show1() {
    System.out.println("in A show");
  }
}

class B extends A {
  public void show2() {
    System.out.println("in B show");
  }
}


class Vipi {

  public static void main(String a[]) {
    A obj = (A) new B();
    obj.show1();
  }
}
