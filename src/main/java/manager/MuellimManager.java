package manager;

import entity.Muellim;
import entity.Telebe;
import service.DatabaseService;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MuellimManager implements DatabaseService<Muellim> {

    Connection connection;

    {
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            connection = DriverManager
                    .getConnection("jdbc:mysql://localhost:3306/course", "root", "Aytc7mDl");
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<Muellim> getAll() throws SQLException {

        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select * from muellim");

        ArrayList<Muellim> muellims = new ArrayList<>();
        while (resultSet.next()) {
            int id = resultSet.getInt(1);
            String fullName = resultSet.getString(2);
            String tevellud = resultSet.getString(3);
            String ishe_girish = resultSet.getString(4);
            Double maash = resultSet.getDouble(5);
            String phone = resultSet.getString(6);

            Muellim muellim = new Muellim(id, fullName, tevellud, ishe_girish, maash, phone);
            muellims.add(muellim);
        }

        return muellims;
    }

    @Override
    public Muellim getById(int id) {

        return null;
    }

    @Override
    public void updateEntity(int id, Muellim newEntity) throws SQLException {
        PreparedStatement statement = connection
                .prepareStatement("insert into muellim");

    }

    @Override
    public void deleteEntityById(int id) throws SQLException {
        PreparedStatement statement = connection.prepareStatement("delete from muellim where id=?");
        statement.setInt(1,id);
        statement.executeUpdate();
    }
}
