package collectiontutorial;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;
//import oracle.jdbc.driver.*;

class Java_19_Jdbcconnection {
	public static void main(String a[]) {
		// Creating the connection
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "system";
		String pass = "12345";

		// Entering the data
		Scanner k = new Scanner(System.in);
		System.out.println("enter name");
		String name = k.next();
		System.out.println("enter roll no");
		int roll = k.nextInt();
		System.out.println("enter class");
		String cls = k.next();

		// Inserting data using SQL query
		String sql = "insert into student1 values('" + name + "'," + roll + ",'" + cls + "')";
		Connection con = null;
		try {
			DriverManager.registerDriver(new oracle.jdbc.OracleDriver());

			// Reference to connection interface
			con = DriverManager.getConnection(url, user, pass);

			Statement st = con.createStatement();
			int m = st.executeUpdate(sql);
			if (m == 1)
				System.out.println("inserted successfully : " + sql);
			else
				System.out.println("insertion failed");

			ResultSet rs = st.executeQuery("SELECT * from student");

			while (rs.next()) {
				String dbName = rs.getString("name");
				int dbage = rs.getInt("age");
				String dbAddress = rs.getString("Address");
				System.out.println(dbName + dbage + dbAddress);

			}

			con.close();
		} catch (Exception ex) {
			System.err.println(ex);
		}

	}
}