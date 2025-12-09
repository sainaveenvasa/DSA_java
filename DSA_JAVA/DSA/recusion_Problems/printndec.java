public class printndec {
    public static void printNDec(int n){
        if (n>0){
            System.out.println(n);
            printNDec(n-1);
        }
    }
    public static void main(String[] arg){
        int n=10;
        printNDec(n);
    }
    
}
