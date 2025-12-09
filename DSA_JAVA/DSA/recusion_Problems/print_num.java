
class print_num {
    public static void print_N_Asc(int n){
        // can be done in either ways in recursion first one is backtracking and second one is brutal force approach
        if(n>0){
            print_N_Asc(n-1);
            System.out.println(n);
        }
        // if(i<=n){
        //     System.out.println(i);
        //     print_N_Asc(n,i+1);

        // }
    }
    public static void main(String args[]){
        //Scanner sc=new Scanner(System.in);
        //int n= sc.nextInt();
        int n=12;
        //int i=1;
        print_N_Asc(n);
        //sc.close();
    }
    
}
