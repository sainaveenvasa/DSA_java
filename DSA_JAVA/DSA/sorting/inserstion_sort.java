public class inserstion_sort {
    public static void main(String[] args){
        int[] arr={1,6,4,0,3,8,9,3,23,12,17,74,2};
        for (int i = 0; i < arr.length; i++) {
            int j=i;
            while(j>0 && arr[j-1]> arr[j]){
                int temp=arr[j-1];
                arr[j-1]=arr[j];
                arr[j]=temp;
                j--;
            }
            
        }
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        
    }
    
}
