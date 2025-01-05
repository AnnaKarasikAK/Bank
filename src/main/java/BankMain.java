public class BankMain {
    public static void main(String[] args) {
        Manager manager1 = new Manager("Bugs Bunny", 1, "Dec 12, 1998", "Holon");
        Clerk clerk1 = new Clerk("Daffy Duck", 2, "Apr 12, 2000", "Jerusalem");
        Clerk clerk2 = new Clerk("Porky Pig", 3, "June 01, 1995", "Bat Yam");
        Clerk clerk3 = new Clerk("Martin the Martian", 4, "Apr 12, 2000", "Winnipeg");
        Accountant accountant1 = new Accountant("Wile E.Coyote", 5, "Apr 12, 2000", "Haifa");
        Accountant accountant2 = new Accountant("Tweety", 6, "Apr 12, 2000", "Toronto");
        Accountant accountant3 = new Accountant("Silvester", 7, "Apr 12, 2000", "Ottawa");
        Accountant accountant4 = new Accountant("Granny", 8, "Apr 12, 2000", "Calgary");
        Accountant accountant5 = new Accountant("Road Runner", 9, "Apr 12, 2000", "Edmonton");

        System.out.println(manager1.toString());
        System.out.println(clerk1.toString());
        System.out.println(clerk2.toString());
        System.out.println(clerk3.toString());
        System.out.println(accountant1.toString());
        System.out.println(accountant2.toString());
        System.out.println(accountant3.toString());
        System.out.println(accountant4.toString());
        System.out.println(accountant5.toString());

        System.out.println("***");
        System.out.println(manager1.receiveSalary());

        System.out.println("***");
        accountant3.createReport();

        System.out.println("***");
        clerk2.answerIncomingCall();

        System.out.println("***");
        manager1.hire("Vasiliy Pupkin");
    }
}
