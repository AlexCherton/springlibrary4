package ru.javabegin.training.library;
import java.sql.*;
import javax.naming.*;
import javax.sql.*;
public class DbConnection {


    public class SQLConnection {

        private InitialContext ic;
        private DataSource ds;

        public Connection getConnection() throws SQLException, NamingException	{
            ic = new InitialContext();
            ds = (DataSource) ic.lookup("java:/comp/env/jdbc/library"); // вместо написать java:/comp/env/jdbc/TestDB
            return ds.getConnection();
        }

    }
}
