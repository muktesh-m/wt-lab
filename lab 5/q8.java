public class q8{
    public static void main(String[] args){
        int n=468;
        int rem=0,c=0;
        for(int i=0; i<=n; i++){
            rem=n%10;
            c=c+rem;
            n=n/10;
        }
        System.out.println("Sum="+c);

    }
}