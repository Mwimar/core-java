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

        int nums[][] = new int[3][4];

        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                nums[i][j] = (int) (Math.random()*10);
            }
            
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }

        for (int n[] : nums) {
            for (int m : n) {
                System.out.print(m + " ");
            }
            System.out.println();
        }
    }
    }

