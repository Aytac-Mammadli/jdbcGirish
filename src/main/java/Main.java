import entity.Muellim;
import entity.Telebe;
import manager.MuellimManager;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws SQLException {

        MuellimManager manager = new MuellimManager();

        System.out.println(manager.getAll());


        manager.updateEntity(6,new Muellim("Memmedli"));

        System.out.println(manager.getAll());


    }
}