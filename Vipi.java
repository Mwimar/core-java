
class A {
  public void show() {
    System.out.println("In A show");
  }
}


class B extends A {
  public void show() {
    System.out.println("In B show");

  }

}

class C extends A {
  public void show() {
    System.out.println("In c show");
  }
}


class Vipi {

  public static void main(String a[]) {

    A obj = new A();
    obj = new B();
    obj.show();

    obj = new C();
    obj.show();
  }
}
