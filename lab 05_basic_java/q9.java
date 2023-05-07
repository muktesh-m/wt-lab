public class q9{
    public static void main(String[] args){
        int n=7,c=0;
        for(int i=0; i<n; i++){
            if(i% n==0)
            c++;

        }
        if(c==1){
            System.out.println("Prime");
        }
        else
        System.out.println("NON PRime");

    }
}
