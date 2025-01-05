public abstract class BankEmployee {


    private String name;
    private int id; // (unique for each one)
    private String title;
    private String dateOfBirth;
    private String address; // (the city is enough)
    private double salary;

    public BankEmployee(String eeName, int eeId, String eeTitle, String eeDateOfBirth, double eeSalary, String eeAddress) {
        this.name = eeName;
        this.id = eeId;
        this.title = eeTitle;
        this.dateOfBirth = eeDateOfBirth;
        this.address = eeAddress;
        this.salary = eeSalary;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getId() {
        return id;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }
    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public String toString(){
        String str = String.format("Name: %s,  Title: %s, Address: %s, Birth Date: %s, Salary: %f", name, title, address, dateOfBirth, salary);
        return str;
    }

    public String receiveSalary(){
        String receiveSalary = String.format("The salary was sent to %s bank account", getName());
        return receiveSalary;
    }



}
