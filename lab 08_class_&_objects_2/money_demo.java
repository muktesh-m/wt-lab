public class money_demo{
    public static void main(String[] args){
        money m1 = new money();
        m1.setMoney(50,60);
        m1.show();
        money m2 = new money();
        m2.setMoney(20,50);
        m2.show();
        money m3 = new money();
        m3=m1.addMoney(m2);
        m3.show();
    }
}