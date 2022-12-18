package org.example.day1;

import org.example.day1.DataBaseConnection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DataBaseConnectionExample {

    public static void main(String[] args) throws SQLException {
        createTableMarketingCampaign(DataBaseConnection.getConnection());
        initializeMarketingCampaign(DataBaseConnection.getConnection());
    }

    // create a table
    public static void createTableMarketingCampaign(Connection connection) {
        try{
            Statement statement = connection.createStatement();

            statement.execute("create table if not exists marketing_campaign (" +
                    "id int primary key auto_increment," +
                    "name varchar(200)," +
                    "start_date date, " +
                    "budget double);");
        }catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    // insert a row in table is empty
    public static void initializeMarketingCampaign(Connection connection) {
        try{
            Statement statement = connection.createStatement();

            ResultSet rs = statement.executeQuery("select count(*) from marketing_campaign");

            if(rs.next() && rs.getInt(1) == 0){
                statement.executeUpdate("insert into marketing_campaign (name, start_date, budget) value ('Alex', '2022-12-18', 1225.25), ('Andrei', '2022-12-17', 1325.25), ('Ion', '2022-11-18', 1260.25)");
            }else {
                System.out.println("Table already initialized");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    // display all values in a table
    public static void displayMarketingCampaignTable(Connection connection){

    }

    // search for a row by a value
}
