package moviepackage;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Jdbc {
    public static Connection getConnection() {
        String url = "Jdbc:mysql://localhost:3306/Movie_rent"; // table details
        String username = "root"; // MySQL credentials
        String password = "shAy@n720227";
        Connection con  = null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");// Driver name
            con = DriverManager.getConnection(url, username, password);
        }catch (
                Exception e
        ) {
            e.printStackTrace();
        }
        return con;

//        PreparedStatement st = conn.prepareStatement("select * from movies");
//        String query = "select * from Clients";
//        ResultSet rs = st.executeQuery(query); // Execute querys
//        while(rs.next()){
//            System.out.println(rs.getInt("ClientId") + ", " +  rs.getString("ClientName") + ", " + rs.getString("ClientAddress"));
//        }
//
//        rs.next();
//        String name
//                = rs.getString("name"); // Retrieve name from db
//
//        System.out.println(name); // Print result on console
//        st.close(); // close statement
//        con.close(); // close connection
//        System.out.println("Connection Closed....");

    }


}
