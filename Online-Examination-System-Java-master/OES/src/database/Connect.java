package database;

import java.sql.*;
import java.sql.DriverManager;
import javax.swing.JOptionPane;


public class Connect {
	public Connection con;
	public Connect(String username,String password) {

		try{
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver Loaded");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/oes",username,password);
			System.out.println("Connection Established.");

		}
		catch(ClassNotFoundException e)
		{
			System.out.println("Driver is not Loaded.");
			System.out.println("Exception : "+e.getMessage());
		}
		catch(SQLException e)
		{
			JOptionPane.showMessageDialog(null, "Can't connect to server.");
			System.out.println("Connection is not established : "+e.getMessage()+"\n\n"+e);
		}

	}
	public static void main(String []args)
	{
		new Connect("root","");
	}

}

//import java.sql.Connection;
//import java.sql.DriverManager;
//import javax.swing.JOptionPane;
//
//public class Connect{
//    public  Connection con()
//    {
//        Connection conn =null;
//        try{
//            Class.forName("com.mysql.jdbc.Driver");
//            conn=DriverManager.getConnection("jdbc:mysql://localhost:80/oes","username","password");
//            JOptionPane.showMessageDialog(null,"connection success");
//        }
//        catch(Exception e){
//            System.out.println("inter.DBConnect.connect()");
//        }
//        return conn;
//    }
//}

