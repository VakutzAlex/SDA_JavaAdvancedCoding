package org.example.dao;

import javax.swing.plaf.nimbus.State;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MarketingCampaginDAO {

    private final Connection connection;

    public MarketingCampaginDAO(Connection connection) {
        this.connection = connection;
    }

    public void createTable() {
        try {
            Statement statement = connection.createStatement();

            statement.execute("create table if not exists marketing_campaign (" +
                    "id int primary key auto_increment," +
                    "name varchar(200)," +
                    "start_date date, " +
                    "budget double);");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void initialize() {
        try {
            Statement statement = connection.createStatement();

            ResultSet rs = statement.executeQuery("select count(*) from marketing_campaign");

            if (rs.next() && rs.getInt(1) == 0) {
                statement.executeUpdate("insert into marketing_campaign (name, start_date, budget) value ('Alex', '2022-12-18', 1225.25), ('Andrei', '2022-12-17', 1325.25), ('Ion', '2022-11-18', 1260.25)");
            } else {
                System.out.println("Table already initialized");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void create(MarketingCampaign marketingCampaign) {
        try {
            Statement statement = connection.createStatement();

            statement.execute("insert into marketing_campaign (name, start_date, budget) " + "value ('"
                    + marketingCampaign.getName() + "', ' "
                    + marketingCampaign.getStartDate() + "', "
                    + marketingCampaign.getBudget() + ");");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void createWithPreparedStatement(MarketingCampaign marketingCampaign) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("insert into marketing_campaign (name, start_date, budget) values (?, ?, ?);");
            preparedStatement.setString(1, marketingCampaign.getName());
            preparedStatement.setDate(2, marketingCampaign.getStartDate());
            preparedStatement.setDouble(3, marketingCampaign.getBudget());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    // find all <- return List/Set
    public List<MarketingCampaign> findAll() {
        try {
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("select * from marketing_campaign");

            List<MarketingCampaign> marketingCampaignList = new ArrayList<>();

            while (rs.next()) {
                MarketingCampaign marketingCampaign = new MarketingCampaign(rs.getInt(1), rs.getString(2), rs.getDate(3), rs.getDouble(4));
                marketingCampaignList.add(marketingCampaign);
            }

            return marketingCampaignList;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    // search by name -> prepared statement
    public List<MarketingCampaign> searchByName(String name) {
        try {
            List<MarketingCampaign> marketingCampaignList = new ArrayList<>();

            PreparedStatement searchName = connection.prepareStatement("select * from marketing_campaign where name like ?;");
            searchName.setString(1,"%" + name + "%");
            ResultSet rs = searchName.executeQuery();

            while (rs.next()){
                MarketingCampaign marketingCampaignElement = new MarketingCampaign(rs.getInt(1), rs.getString(2), rs.getDate(3), rs.getDouble(4));
                marketingCampaignList.add(marketingCampaignElement);
            }

            return marketingCampaignList;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    // search between dates (before, after) -> prepared statement
    public List<MarketingCampaign> searchBetweenDates(Date after, Date before){
        try{
            List<MarketingCampaign> marketingCampaignList = new ArrayList<>();

            PreparedStatement preparedStatement = connection.prepareStatement("select * from marketing_campaign where start_date >= ? and start_date <= ?");
            preparedStatement.setDate(1, after);
            preparedStatement.setDate(2, before);
            ResultSet rs = preparedStatement.executeQuery();

            while(rs.next()){
                MarketingCampaign marketingCampaignElement = new MarketingCampaign(rs.getInt(1), rs.getString(2), rs.getDate(3), rs.getDouble(4));
                marketingCampaignList.add(marketingCampaignElement);
            }

            return marketingCampaignList;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
