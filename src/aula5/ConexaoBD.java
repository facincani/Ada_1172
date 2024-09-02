package aula5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoBD {

    public Connection getConnection(){
        try {
            return DriverManager.getConnection("jdbc:mysql://localhost:3306/carloca", "root", "");
        } catch (SQLException e){
            e.printStackTrace();
            return null;
        }
    }

}
