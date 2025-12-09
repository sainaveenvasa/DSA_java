//package DSA.hashing;

import java.util.Scanner;

public class hashing1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1, 8, 9, 3, 2, 3, 1, 8, 9, 12, 3, 8, 9};
        int max=
        int[] hash = new int[15];
        //precomputation hashing
        for (int i = 0; i < arr.length; i++) {
            int j = arr[i];
            hash[j] = hash[j] + 1;
        }
        //hashiing array or frequncy array
        for (int i = 0; i < hash.length; i++) {
            System.out.println(hash[i]);
        }
        //now give some random number and fetch the frequncy of numbers
        System.out.print("How many numbers do you want to check? ");
        int m = sc.nextInt();
        for (int i = 0; i < m; i++) {
            System.out.print("Enter number to check frequency: ");
            int num = sc.nextInt();
            System.out.println(hash[num]);

        }
        sc.close();// always needs to close the scanner
    }

}
