public class ArrayExample {
    void func() {
        int ar[] = new int[5];
        ar[0] = 10;
        ar[1] = 20;
        ar[2] = 30;
        ar[3] = 40;
        ar[4] = 50;

        System.out.println("-----------Array Elements----------");
        // for (int i = 0; i < ar.length; i++) {
        // System.out.println("Array Element " + (i + 1) + " is: " + ar[i]);
        // }
        for (int i : ar) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        ArrayExample obj = new ArrayExample();
        obj.func();
    }
}
