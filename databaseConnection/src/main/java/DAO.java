import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DAO {
    private Connection connection;

    private Connection startConnection() throws IOException, SQLException {
        Properties databaseProperties = this.getProperties();

        return DriverManager.getConnection(
            databaseProperties.getProperty("banco.url"),
            databaseProperties.getProperty("banco.user"),
            databaseProperties.getProperty("banco.password")
        );
    }

    public Connection getConnection() {
        try{
            if(
                this.connection == null ||
                this.connection.isClosed()
            )
                this.connection = this.startConnection();
        } catch(IOException e) {
            System.out.println("Database properties file not found");
        } catch (SQLException e) {
            System.out.println("It was not possible to start a connection to the database");
        }

        return this.connection;
    }

    private Properties getProperties() throws IOException {
        Properties databaseProperties = new Properties();
        databaseProperties.load(
            DAO.class.getResourceAsStream(
                "/database.properties"
            )
        );

        return databaseProperties;
    }
}
