import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashSet;

public class PersonDAO {
    public static void create(Person person, DAO dao) {
        try{
            PreparedStatement preparedStatement = dao
                .getConnection()
                .prepareStatement(
                    "INSERT INTO person(name, gender) VALUES(?, ?)"
                );

            preparedStatement.setString(1, person.getName());
            preparedStatement.setInt(2, person.getGender());

            preparedStatement.execute();
            preparedStatement.close();
        } catch (SQLException e){
            System.out.println("Something with the query went wrong");
        }
    };

    public static HashSet<Person> read(DAO dao){
        try{
            ResultSet resultSet = dao
                .getConnection()
                .prepareStatement(
                        "SELECT * FROM person"
                ).executeQuery();

            HashSet<Person> people = new HashSet();

            while(resultSet.next()){
                people.add(
                    new Person(
                        resultSet.getInt("person_id"),
                        resultSet.getString("name"),
                        resultSet.getInt("gender")                                
                    )
                );
            }

            return people;
        } catch (SQLException e){
            System.out.println("Something with the query went wrong");
        }

        return new HashSet();
    }

    public static void update(Person person, DAO dao) {
        try{
            PreparedStatement preparedStatement = dao
                    .getConnection()
                    .prepareStatement(
                            "UPDATE person SET name = ?, Gender = ? WHERE person_id = ?"
                    );

            preparedStatement.setString(1, person.getName());
            preparedStatement.setInt(2, person.getGender());
            preparedStatement.setInt(3, person.getId());

            preparedStatement.execute();
            preparedStatement.close();
        } catch (SQLException e){
            System.out.println("Something with the query went wrong");
        }
    };

    public static void delete(Person person, DAO dao) {
        try{
            PreparedStatement preparedStatement = dao
                    .getConnection()
                    .prepareStatement(
                            "DELETE FROM person WHERE person_id = ?"
                    );

            preparedStatement.setInt(1, person.getId());


            if(preparedStatement.executeUpdate() > 0){
                System.out.println("Pessoa excluida");
            } else {
                System.out.println("Usuário inexistente");
            }

            preparedStatement.close();
        } catch (SQLException e){
            System.out.println("Something with the query went wrong");
        }
    };
}
