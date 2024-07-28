class Vipi {
    
    public static void main(String a[]){
    
        char n = 'k';
        int num = 0x7E;

        byte b = 127;

        int size = 25;


        //Explicit assigning also known as casting
        // b = (byte) size;

        //Implicit assigning aslo known as conversion
         size=b;

         float f = 5.5f;
         int num1 = (int) f;
         int dig = 11;
         //  ++dig;
         --dig;
         System.out.println(dig);
        System.out.println(num1);

        //Type conversion
        byte x = 7;
        byte y = 3;
        int result = x * y;
        System.out.println(result);
    }
}