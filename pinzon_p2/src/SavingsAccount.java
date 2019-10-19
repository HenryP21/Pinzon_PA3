class SavingsAccount {
    private static double annualInterestRate;
    private double savingsBalance;

    SavingsAccount(double savingsBalance){
        this.savingsBalance = savingsBalance;
    }

    void calculateMonthlyInterest(){
        double interest = (savingsBalance * annualInterestRate) / 12.0;
        savingsBalance += interest;
    }

    static void modifyInterestRate(double newRate){

        annualInterestRate = newRate;
    }

    double getSavingsBalance(){
        return savingsBalance;
    }





}
