
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
    // A obj = (A) new B();
    // obj.show1();

    // B obj1 = (B) obj;
    // obj1.show2();

    int num = 5;
    Integer numb = num;

    int num2 = numb;
    // System.out.println(num2);

    String str = "50";
    int digit = Integer.parseInt(str);
    System.out.println(digit*2);
  }
}
