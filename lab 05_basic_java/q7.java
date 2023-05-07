public class q7{
    public static void main(String[] args){
        int decimal = 10;
        int binary[] = new int[8];
        int index = 0;
        
        while (decimal > 0) {
            binary[index++] = decimal % 2;
            decimal = decimal / 2;
        }
        
        for (int i = 7; i >= 0; i--) {
            System.out.print(binary[i]);
        }    
        

    }
}