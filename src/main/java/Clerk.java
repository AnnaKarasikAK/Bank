public class Clerk extends BankEmployee{


    public Clerk(String eeName, int eeId, String eeDateOfBirth, String eeAddress) {
        super(eeName, eeId, Constants.clerkTitle, eeDateOfBirth, Constants.clerkSalary, eeAddress);
    }

    // Clerk's role is to call to the customer and answer incoming calls
    public void callToCustomer(){
        System.out.println(String.format("The clerk %s will call to customer.", getName()));
    }

    public void answerIncomingCall(){
        System.out.println(String.format("The clerk %s will answer the incoming call", getName()));
    }

}

