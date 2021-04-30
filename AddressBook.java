public class AddressBook {
    String firstName;
    String lastName;
    String city;
    String state;
    Integer zipCode;
    Integer phoneNumber;
    String email;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Integer getZipCode() {
        return zipCode;
    }

    public void setZipCode(Integer zipCode) {
        this.zipCode = zipCode;
    }

    public Integer getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Integer phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public static void main(String[] args) {

        System.out.println("Welcome to Address Book Program");

        AddressBook addressBook = new AddressBook();
        addressBook.setFirstName("Akash");
        addressBook.setLastName("Shevgan");
        addressBook.setCity("Pune");
        addressBook.setEmail("akash.shevgan@gmail.com");
        addressBook.setState("Maharashtra");
        addressBook.setPhoneNumber(992299922);
        addressBook.setZipCode(12345);

        System.out.println("Record added in address book");
        System.out.println("FirstName = " + addressBook.getFirstName());
        System.out.println("lastName = " + addressBook.getLastName());
        System.out.println("City = " + addressBook.getCity());
        System.out.println("Email = " + addressBook.getEmail());
        System.out.println("State = " + addressBook.getState());
        System.out.println("PhoneNumber = " + addressBook.getPhoneNumber());
        System.out.println("Zipcode = " + addressBook.getZipCode());

    }


}


