package inheritance;

public class Main {

    public static void main(String[] args) {
        // car
//        Car porsche = new Car();
//        Car holden = new Car();
//
//        porsche.setModel("Carrera");
//        System.out.println(porsche.getModel());

        //bank account
//        BankAccount myAccount = new BankAccount("838729", 90.00, "John Wick", "jown@wick.com", "7789900333");
//        myAccount.withdraw(100);
//
//        myAccount.deposit(100.0);
//        myAccount.withdraw(50.00);
//        System.out.println(myAccount.getBalance());

        // animal
        Dog dog = new Dog("Yorkie", 8,20,2,4,1,20,"long silky");
        dog.eat();
        dog.walk();
        dog.run();

    }

}
