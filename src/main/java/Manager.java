public class Manager extends BankEmployee{


    public Manager(String eeName, int eeId, String eeDateOfBirth, String eeAddress) {
        super(eeName, eeId, Constants.managerTitle, eeDateOfBirth, Constants.managerSalary, eeAddress);
    }

    // The manager should be able to hire and fire employees
    public void hire(String eeName){
        System.out.println(String.format("The manager %s will hire employee %s", getName(), eeName));
    }

    public void fire(String eeName){
        System.out.println(String.format("The manager %s will fire employee", getName(), eeName));
    }
}
