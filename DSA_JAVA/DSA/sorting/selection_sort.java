//package DSA.sorting;

public class selection_sort {
    public static void main(String[] args) {
        
        int[] arr={13,46,24,56,20,9,323,1,2,5,7};
        for(int i=0;i<arr.length;i++){
            int min=i;
            for(int j=i;j<arr.length;j++){
                if(arr[min]>arr[j]){
                    min=j;    
                }
            }
            int temp=arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
        }
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    
}
