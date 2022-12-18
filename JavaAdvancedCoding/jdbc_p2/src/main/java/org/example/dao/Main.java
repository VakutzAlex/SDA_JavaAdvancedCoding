package org.example.dao;

import org.example.day1.DataBaseConnection;

import java.sql.Date;
import java.sql.SQLException;

public class Main {

    public static void main(String[] args) throws SQLException {

        MarketingCampaign marketingCampaign = new MarketingCampaign(null, "Name", Date.valueOf("2022-12-11"), 3579d);
        MarketingCampaginDAO marketingCampaginDAO = new MarketingCampaginDAO(DataBaseConnection.getConnection());

        //marketingCampaginDAO.createTable();
        //marketingCampaginDAO.initialize();
        //marketingCampaginDAO.create(marketingCampaign);

//        MarketingCampaign marketingCampaign1 = new MarketingCampaign(null, "Name", Date.valueOf("2022-12-21"), 12345.56);
//        marketingCampaginDAO.createWithPreparedStatement(marketingCampaign1);

        System.out.println("Find all: " + marketingCampaginDAO.findAll());
        System.out.println("Find all by name: " + marketingCampaginDAO.searchByName("ex"));
        System.out.println("Find all by date: " + marketingCampaginDAO.searchBetweenDates(Date.valueOf("2022-12-16"), Date.valueOf("2022-12-20")));
    }
}
