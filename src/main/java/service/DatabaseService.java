package service;

import java.sql.SQLException;
import java.util.List;

public interface DatabaseService<T> {

    List<T> getAll() throws SQLException;

    T getById (int id);

    void updateEntity (int id, T newEntity) throws SQLException;

    void deleteEntityById (int id) throws SQLException;

}
