public class Accountant extends BankEmployee{


    public Accountant(String eeName, int eeId, String eeDateOfBirth, String eeAddress) {
        super(eeName, eeId, Constants.accountantTitle, eeDateOfBirth, Constants.accountantSalary, eeAddress);
    }

    // The accountant can open a new account, close account and create reports
    public void openNewAccount(){
        System.out.println(String.format("The accountant %s will open new account.", getName()));
    }

    public void createReport(){
        System.out.println(String.format("The accountant %s will create report.", getName()));
    }

}

