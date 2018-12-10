package adapter_pattern;

public class EmployeeDB implements Employee {
    private String id;
    private String firstName;
    private String lastName;
    private String email;

    public EmployeeDB(String id, String firstName, String lastName, String email){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    @Override
    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String getID() {
        return this.id;
    }

    @Override
    public String getFirstName() {
        return this.firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public String getEmailID() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String toString() {
        return "ID: " + id + ", First name: " + firstName + ", Last name: " + lastName + ", Email: " + email;
    }

}
