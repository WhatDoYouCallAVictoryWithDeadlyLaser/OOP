public class Company {
    private static Company instance;

    private String companyName;
    private String address;
    private String phoneNumber;
    private String email;
    private String owner;

    private Company() {
        this.companyName = "My Company";
        this.address = "Ben Cat, Binh Duong, Viet Nam";
        this.phoneNumber = "002347212";
        this.email = "info@eiu.edu.com";
        this.owner = "EIU";
    }

    public static synchronized Company getInstance() {
        if (instance == null) {
            instance = new Company();
        }
        return instance;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void displayInfo() {
        System.out.println("Company Name: " + companyName);
        System.out.println("Address: " + address);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Email: " + email);
        System.out.println("Owner: " + owner);
    }
}