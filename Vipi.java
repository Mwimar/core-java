class Student {
    int rollno;
    String name;
    int marks;
}

   


class Vipi {

    public static void main(String a[]) {

        Student s1 = new Student();
        s1.rollno = 20;
        s1.name = "Spinabenz";
        s1.marks = 78;

        Student s2 = new Student();
        s2.rollno = 30;
        s2.name = "Sniper";
        s2.marks = 92;

        Student s3 = new Student();
        s3.rollno = 40;
        s3.name = "Von";
        s3.marks = 78;

        Student students[] = new Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        // for (int i = 0; i < students.length; i++) {

        //     System.out.println(students[i].name + ":" + students[i].marks);
        // }

        for (Student stud : students) {
            System.out.println(stud.name + ":" + stud.marks);
        }

        // int nums[][] = new int[3][4];
        // int nums[][] = new int[3][];// jagged array
        // nums[0] = new int[3];
        // nums[1] = new int[4];
        // nums[2] = new int[2];

        // // int nums[][][] = new int[3][4][5];//3D Array;

        // for (int i = 0; i <nums.length; i++) {
        //     for (int j = 0; j <nums[i].length; j++) {
        //         nums[i][j] = (int) (Math.random()*10);
        //     }

        // }

        // // for (int i = 0; i < 3; i++) {
        // //     for (int j = 0; j < 4; j++) {
        // //         System.out.print(nums[i][j] + " ");
        // //     }
        // //     System.out.println();
        // // }

        // for (int n[] : nums) {
        //     for (int m : n) {
        //         System.out.print(m + " ");
        //     }
        //     System.out.println();
        // }

        int[] nums = new int[3];
        nums[0] = 4;
        nums[1] = 7;
        nums[2] = 3;

        // for (int i = 0; i < nums.length; i++) {
        //     System.out.println(nums[i]);
        // }

        //Enhanced for loop or forEach loop;
        // for(int n:nums){
        //     System.out.println(n);
        // }

        String name = "Kevin";
        // System.out.println(name.concat(" Gates"));

        StringBuffer sb = new StringBuffer("Kevin");
        sb.append(" Gates");
        // System.out.println(sb);
        // System.out.println(sb.capacity());
        String str = sb.toString();
        System.out.println(str);

    }
    }

