class Calculator {
    public int add(int num1, int num2) {

        return num1 + num2;
    }

    public int add(int num1, int num2, int num3) {

        return num1 + num2 + num3;
    }
    
    public double add(double num1, int num3) {

        return num1 + num3;
    }
}


   


class Vipi {

    public static void main(String a[]) {

        Calculator obj = new Calculator();
        double result = obj.add( 16.5, 17);
        System.out.println(result);

        
    }
    }

