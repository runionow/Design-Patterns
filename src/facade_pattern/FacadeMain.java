package facade_pattern;

import java.util.List;

/**
 * Make an API easy to use
 * REduce dependencies on outside code
 * Simplify the interface or client usage
 * Usually a refactoring pattern
 * Examples: java.net.URL
 */
public class FacadeMain {
    public static void main(String[] args) {
        JDBCFacade jdbcFacade = new JDBCFacade();

        jdbcFacade.createTable();

        System.out.println("Table created.");

        jdbcFacade.insertIntoTable();

        System.out.println("Record inserted.");

        List<Address> addresses = jdbcFacade.getAddresses();

        for (Address address : addresses) {
            System.out.println(address.getId() + " " + address.getStreetName() + " " + address.getCity());
        }

    }
}
