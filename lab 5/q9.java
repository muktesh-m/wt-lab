public class q9{
    public static void main(String[] args){
        int n=8,c=0;
        for(int i=0; i<n; i++){
            if(i%5==0)
            c++;

        }
        if(c==1){
            System.out.println("Prime");
        }
        else
        System.out.println("NON PRime");

    }
}
