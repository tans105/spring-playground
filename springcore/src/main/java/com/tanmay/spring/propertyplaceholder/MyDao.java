package com.tanmay.spring.propertyplaceholder;

/**
 * @author Tanmay
 * @date 05/10/19
 **/
public class MyDao {

    public MyDao(String dbServer) {
        this.dbServer = dbServer;
    }

    @Override
    public String toString() {
        return "MyDao{" +
                "dbServer='" + dbServer + '\'' +
                '}';
    }

    private String dbServer;
}
