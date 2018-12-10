package adapter_pattern;

public class EmployeeAdapterLDAP implements Employee{
    private EmployeeLdap instance;

    public EmployeeAdapterLDAP(EmployeeLdap instance){
        this.instance = instance;
    }

    @Override
    public String getLastName() {
        return instance.getSurname();
    }

    @Override
    public String getID() {
        return instance.getCn();
    }

    @Override
    public String getFirstName() {
        return instance.getGivenName();
    }

    @Override
    public String getEmailID() {
        return instance.getMail();
    }

    public String toString() {
        return "ID: " + this.getID() + ", First name: " + this.getFirstName() + ", Last name: " + this.getLastName() + ", Email: " + this.getEmailID();
    }
}
