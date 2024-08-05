import tools.*;

class Calc {
    public int add(int a, int b) {
        return a +b;
    }

   
}

class AdvCalc extends Calc{

    public int add(int a, int b) {
        return a+b+1;
    }
}




class Vipi {

    public static void main(String a[]) {

        AdvCalc obj = new AdvCalc();
        int r1 = obj.add(3, 4);
      System.out.println(r1);
    }

}
