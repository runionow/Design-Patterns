package adapter_pattern;

public class EmployeeAdapterDemo implements Employee {
    private String cn;
    private String surname;
    private String givenName;
    private String mail;

    @Override
    public String getLastName() {
        return null;
    }

    @Override
    public String getID() {
        return null;
    }

    @Override
    public String getFirstName() {
        return null;
    }

    @Override
    public String getEmailID() {
        return null;
    }
}
