//package DSA.recusion_Problems;

public class fibnocci {
    public static void main(String args[]){
        int n=35;
        int m=fibb(n);
        System.out.println(m);
    }
    static int fibb(int n){
        if(n<=1){
            return n;
        }
        int last=fibb(n-1);
        int slast=fibb(n-2);
        return last+slast;
    }
    
}
