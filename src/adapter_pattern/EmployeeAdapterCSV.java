package adapter_pattern;

public class EmployeeAdapterCSV implements Employee {
    private EmployeeCSV instance;
    EmployeeAdapterCSV(EmployeeCSV instance){
        this.instance = instance;
    }

    @Override
    public String getLastName() {
        return instance.getLastName();
    }

    @Override
    public String getID() {
        return instance.getId()+" ";
    }

    @Override
    public String getFirstName() {
        return instance.getFirstName();
    }

    @Override
    public String getEmailID() {
        return instance.getEmailAddress();
    }

    public String toString() {
        return "ID: " + this.getID() + ", First name: " + this.getFirstName() + ", Last name: " + this.getLastName() + ", Email: " + this.getEmailID();
    }
}
