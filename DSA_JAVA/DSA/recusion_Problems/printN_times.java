
public class printN_times {
    public static void printName(int n,String s){
        if(n>0){
            System.out.println(s);
            printName(n-1, s);
        }

    }
    public static void main(String[] args){
        String s="Naveen";
        int n=8;
        printName(n,s);   

    }
    
}
