import entity.Telebe;
import manager.MuellimManager;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws SQLException {

        MuellimManager manager = new MuellimManager();

        manager.deleteEntityById(7);

        System.out.println(manager.getAll());

    }
}