class Vipi {

    public static void main(String a[]) {

        char n = 'k';
        int num = 0x7E;

        byte b = 127;

        int size = 25;

        // Explicit assigning also known as casting
        // b = (byte) size;

        // Implicit assigning aslo known as conversion
        size = b;

        float f = 5.5f;
        int num1 = (int) f;
        int dig = 11;
        // ++dig;
        // int result = ++dig;
        // System.out.println(result);

        // Type conversion
        byte x = 7;
        byte y = 3;
        // int result = x * y;

        int h = 7;
        int result = 0;
        // if (h % 2 == 0)
        //     result = 10;
        // else
        //     result = 20;

        //tenary operators ?:
        result = h % 2 == 0 ? 10 : 20; 

        System.out.println(result);

        int d = 7;
        if(d==1)
            System.out.println("Monday");
        else if(d==2)
            System.out.println("Tuesday");
        else if(d==3)
            System.out.println("Wednesday");
        else if(d==4)
            System.out.println("Thursday");
        else if(d==5)
            System.out.println("Friday");
        else if(d==6)
            System.out.println("Saturday");
        else
        System.out.println("Sunday");

    }
}