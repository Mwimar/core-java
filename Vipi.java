
 class Calc {
  public final void show() {
    System.out.println("in Calc");

  }

  public void add(int a, int b) {
    System.out.println(a + b);
  }
}

class AdvCalc extends Calc {
  // public void show() {
  //   System.out.println("in Adv Calc");

 
  
}

class Vipi {

  public static void main(String a[]) {
    AdvCalc obj = new AdvCalc();
    obj.show();
    obj.add(7, 9);
   
  }
}
