//package DSA.recusion_Problems;

class maths{
    public static void rev(int i,int[] arr,int n){
            if(i>=n/2){
                return ;
            }
            int temp=arr[i];
            arr[i]=arr[n-i-1];
            arr[n-i-1]=temp;
            rev(i+1,arr,n);
        }
    }
    
    public class reverse_array extends maths {
        public static void main(String[] args){
            int[] arr={1,2,3,4,5};
            int n=arr.length;
            rev(0,arr,n);
            System.out.println("Reversed Array:");
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[j] + " ");}
       
    }
    
}
