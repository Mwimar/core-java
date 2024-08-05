
final class Calc {
  public void show() {
    System.out.println("in Calc");

  }

  public void add(int a, int b) {
    System.out.println(a + b);
  }
}

// class AdvCalc extends Calc {
  
// }

class Vipi {

  public static void main(String a[]) {
    Calc obj = new Calc();
    obj.show();
    obj.add(7, 9);
   
  }
}
