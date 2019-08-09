package b11;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import oracle.jdbc.pool.OracleDataSource;

public class S120b {
	private static final String URL = "jdbc:oracle:thin:@localhost:1521/xe";
	private static final String USER = "me";
	private static final String PASSWORD = "password";

	private OracleDataSource ods;

	public S120b() throws SQLException {
		ods = new OracleDataSource();

		ods.setURL(URL);
		ods.setUser(USER);
		ods.setPassword(PASSWORD);
	}

	public List<Coder> getCoders() throws SQLException {
		try (Connection conn = ods.getConnection(); //
				Statement stmt = conn.createStatement()) {
			ResultSet rs = stmt.executeQuery("SELECT first_name, last_name, salary FROM coders ORDER BY 1");

			List<Coder> results = new ArrayList<>();
			while (rs.next()) {
				results.add(new Coder(rs.getString(1), rs.getString(2), rs.getInt(3)));
			}
			return results;
		}
	}

	public List<Coder> getCodersBySalary(double lower) throws SQLException {
		try (Connection conn = ods.getConnection(); //
				Statement stmt = conn.createStatement()) {
			String query = "SELECT first_name, last_name, salary FROM coders WHERE salary >= " + lower + " ORDER BY 3 DESC";
			ResultSet rs = stmt.executeQuery(query);

			List<Coder> results = new ArrayList<>();
			while (rs.next()) {
				results.add(new Coder(rs.getString(1), rs.getString(2), rs.getInt(3)));
			}
			return results;
		}
	}

	public static void main(String[] args) {
		try {
			S120b sample = new S120b();
			List<Coder> coders = sample.getCoders();
			System.out.println("Coder names are: " + coders);

			coders = sample.getCodersBySalary(6000);
			System.out.println("Rich coders are: " + coders);
		} catch (SQLException e) {
			e.printStackTrace();
			return;
		}

	}
}

class Coder {
	private String firstName;
	private String lastName;
	private int salary;

	public Coder() {

	}

	public Coder(String firstName, String lastName, int salary) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public int getSalary() {
		return salary;
	}

	@Override
	public String toString() {
		return "[firstName=" + firstName + ", lastName=" + lastName + ", salary=" + salary + "]";
	}

}
