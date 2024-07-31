class Calculator {
    

    public int add(int n1, int n2) {
        
        int ans = n1 + n2;

        return ans;

    }}



class Vipi {

    public static void main(String a[]) {
        int num1 = 7;
        int num2 = 6;
        

        Calculator calc = new Calculator();
        int result = calc.add(num1,num2);
        System.out.println(result);



    }
    }

