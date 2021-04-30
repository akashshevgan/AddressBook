import java.util.Scanner;

public class AddressBook {

    Person person;
    Contact contact;

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public static void main(String[] args) {

        System.out.println("Welcome to Address Book Program");
        Scanner in = new Scanner(System.in);
        Person person = new Person();
        Contact contact = new Contact();
        System.out.println("Enter first name ");
        String s = in.nextLine();
        person.setFirstName(s);
        System.out.println("Enter last name ");
        s = in.nextLine();
        person.setLastName(s);
        System.out.println("Enter city ");
        s = in.nextLine();
        contact.setCity(s);
        System.out.println("Enter email ");
        s = in.nextLine();
        contact.setEmail(s);
        System.out.println("Enter state ");
        s = in.nextLine();
        contact.setState(s);
        System.out.println("Enter phone number ");
        int a = in.nextInt();
        contact.setPhoneNumber(a);
        System.out.println("Enter zipcode ");
        a = in.nextInt();
        contact.setZipCode(a);

        System.out.println("Record added in address book");

        AddressBook addressBook = new AddressBook();
        addressBook.setPerson(person);
        addressBook.setContact(contact);
        System.out.println("FirstName = " + addressBook.getPerson().getFirstName());
        System.out.println("lastName = " + addressBook.getPerson().getLastName());
        System.out.println("City = " + addressBook.getContact().getCity());
        System.out.println("Email = " + addressBook.getContact().getEmail());
        System.out.println("State = " + addressBook.getContact().getState());
        System.out.println("PhoneNumber = " + addressBook.getContact().getPhoneNumber());
        System.out.println("Zipcode = " + addressBook.getContact().getZipCode());

    }


}

class Person {

    String firstName;
    String lastName;

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
}

class Contact {
    String city;
    String state;
    Integer zipCode;
    Integer phoneNumber;
    String email;


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
}

