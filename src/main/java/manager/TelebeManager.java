package manager;

import entity.Telebe;
import service.DatabaseService;

import java.util.List;

public class TelebeManager implements DatabaseService<Telebe> {
    @Override
    public List<Telebe> getAll() {
        return null;
    }

    @Override
    public Telebe getById(int id) {
        return null;
    }

    @Override
    public void updateEntity(int id, Telebe newEntity) {

    }

    @Override
    public void deleteEntityById(int id) {

    }
}
