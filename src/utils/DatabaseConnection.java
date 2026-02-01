package utils;

import java.sql.*;

public class DatabaseConnection {

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection("jdbc:postgresql://localhost:1111/restaurant_db", "postgres", "DIXlol666");
    }

    public static void main(String[] args){
        String connectionUrl="jdbc:postgresql://localhost:1111/restaurant_db";
        Connection con=null;
        ResultSet rs=null;
        Statement stmt=null;

        try{
            Class.forName("org.postgresql.Driver");

            con= DriverManager.getConnection(connectionUrl,"postgres","DIXlol666");

            stmt=con.createStatement();

            rs=stmt.executeQuery("SELECT * FROM dishes");

            while (rs.next()){
                System.out.println(rs.getInt("id")+" "+rs.getString("name"));
            }
        }catch (Exception e){
            System.out.println(e);
        }
        finally {
            try{
                rs.close();
                stmt.close();
                con.close();
            }catch (SQLException throwables){
                throwables.printStackTrace();
            }
        }
    }


}
