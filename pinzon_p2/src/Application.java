public class Application {



    public static void main(String[] args){
        SavingsAccount saver1 = new SavingsAccount(2000.00);
        SavingsAccount saver2 = new SavingsAccount(3000.00);
        SavingsAccount.modifyInterestRate(0.04);

        System.out.println("Saver1's new balances through 12 months(4%):");
        for(int i = 1; i <= 12; i++){
            saver1.calculateMonthlyInterest();
            System.out.print("Month " + i);
            System.out.printf(" %.2f", saver1.getSavingsBalance());
            System.out.println();
        }

        System.out.println();
        System.out.println("Saver2's new balances through 12 months(4%):");
        for(int i = 1; i <= 12; i++){
            saver2.calculateMonthlyInterest();
            System.out.print("Month " + i);
            System.out.printf(" %.2f", saver2.getSavingsBalance());
            System.out.println();
        }

        SavingsAccount.modifyInterestRate(0.05);
        System.out.println();
        System.out.println("Saver1's new balances through 12 months(5%):");

        for(int i = 1; i <=12; i++){
            saver1.calculateMonthlyInterest();
            System.out.print("Month " + i);
            System.out.printf(" %.2f", saver1.getSavingsBalance());
            System.out.println();
        }
        System.out.println();
        System.out.println("Saver2's new balances through 12 months(5%):");

        for(int i = 1; i <=12; i++){
            saver2.calculateMonthlyInterest();
            System.out.print("Month " + i);
            System.out.printf(" %.2f", saver2.getSavingsBalance());
            System.out.println();
        }

    }

}