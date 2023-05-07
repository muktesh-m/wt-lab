class Account {
    int accNo;
    double balance;
    
    void disp() {
        System.out.println("Account No: " + accNo);
        System.out.println("Balance: " + balance);
    }
}

class Person extends Account {
    String name;
    int aadharNo;
    
    void disp() {
        System.out.println("Name: " + name);
        System.out.println("Aadhar No: " + aadharNo);
        super.disp();
    }
}

public class q5 {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.accNo = 1001;
        person1.balance = 5000;
        person1.name = "John";
        person1.aadharNo = 123456789;
        person1.disp();
        
        Person person2 = new Person();
        person2.accNo = 1002;
        person2.balance = 7000;
        person2.name = "Mary";
        person2.aadharNo = 987654321;
        person2.disp();
        
        Person person3 = new Person();
        person3.accNo = 1003;
        person3.balance = 9000;
        person3.name = "Bob";
        person3.aadharNo = 246810121;
        person3.disp();
        
        Person person4 = new Person();
        person4.accNo = 1004;
        person4.balance = 12000;
        person4.name = "Alice";
        person4.aadharNo = 369121518;
        person4.disp();
        
        Person person5 = new Person();
        person5.accNo = 1005;
        person5.balance = 15000;
        person5.name = "Peter";
        person5.aadharNo = 151413121;
        person5.disp();
    }
}
