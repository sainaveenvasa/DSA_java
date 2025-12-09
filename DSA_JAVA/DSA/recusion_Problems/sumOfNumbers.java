public class sumOfNumbers {
    public static int sumofNum(int n){
        //base condition
        if (n == 0) {
            return 0;
        }
        
        // Recursive Step
        // sumofNum(n-1) returns the sum of the rest this is functional method
        return n + sumofNum(n - 1);

        // if (n<1){
        //     System.out.println(sum);
        //     return 0;
        // }
        // sumofNum(n-1, sum+n);// this is parameterized way od recursion
        // return sum;

    }
    public static void main(String args[]){
        int n=50;
        int sum=0;
        int res=sumofNum(n);
        System.out.println(res);
    }
    
}
