//package DSA.recusion_Problems;

public class palindrom {
    public static void main(String[] args) {
        String s="navan";
        int n=s.length();
        if(!palin(0,s)){
            System.out.println("not palindrome");
        }
        else{
            System.out.println("palindrome");
        }
    }
    static boolean  palin(int i,String s){
        if(i>=s.length()/2){
            return false;
        }
        else if(s.charAt(i)!= s.charAt(s.length()-i-1)){
            return false ;
        }
        palin(i+1,s);
        return true;
    }
    
}
