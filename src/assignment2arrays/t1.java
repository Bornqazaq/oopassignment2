package assignment2arrays;

public class t1 {
    public static void main(String[] args) {
        int[] arr=new int[10];
        arr[2] = 4;
        arr[7] = 9;
        arr[9] = arr[2] + arr[5];
        for(int i=0;i<arr.length;i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        double[] arrDouble=new double[10];
        arrDouble[0] = 1.0;
        arrDouble[1] = 2.0;
        arrDouble[2] = 3.0;
        arrDouble[3] = 4.0;
        arrDouble[4] = 5.0;
        arrDouble[5] = 6.0;
        arrDouble[6] = 7.0;
        arrDouble[7] = 8.0;
        arrDouble[8] = 9.0;
        arrDouble[9] = 10.0;
        for(int i=0;i<arrDouble.length;i++) {
            System.out.print(arrDouble[i] + " ");
        }
    }
}
