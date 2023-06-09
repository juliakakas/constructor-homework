public class Main {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota", "Camry", 2022);
        System.out.println(myCar.getBrand()); // Output: Toyota

        Car defaultCar = new Car();
        System.out.println(defaultCar.getModel()); // Output: Unknown

        BankAccount myAccount = new BankAccount("1778322544", "Kakas Júlia", 1506.5);
        System.out.println(myAccount.getBalance());

        BankAccount revolutAccount = new BankAccount("7889234566", "Júlia Kakas", 312.3);
        System.out.println(revolutAccount.getBalance());

        BankAccount account = new BankAccount("666");
        System.out.println(account.getAccountNumber());
        BankAccount newBalance = new BankAccount(456.8);
        System.out.println(newBalance.getBalance());

        BankAccount defaultAccount = new BankAccount();
        System.out.println(defaultAccount.getAccountHolder());
    }
}
