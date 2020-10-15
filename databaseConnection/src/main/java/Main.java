import java.sql.SQLException;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws SQLException {
        DAO dao = new DAO();

        Person person1 = new Person("Pedro Silva", Gender.MALE);
        PersonDAO.create(person1, dao);

        Person person2 = new Person(1, "Pedro Silva", Gender.MALE);
        PersonDAO.update(person2, dao);

        Person person3 = new Person(1, "Pedro Silva", Gender.MALE);
        PersonDAO.delete(person3, dao);

        HashSet<Person> people = PersonDAO.read(dao);
        for (Person person: people){
            System.out.println(
                "Name: " + person.getName() +
                "\nGender: " + person.getGender() +
                "\nID: " + person.getId()
            );
        }
    }
}
