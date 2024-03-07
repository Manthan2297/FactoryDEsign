package depaul.edu;
import java.util.*;

public class MainClass {
  public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
		try {
			
			scanner = new Scanner(System.in);
			System.out.println("Enter the database you want to connect (SQL/oracle): ");
			String databaseType = scanner.nextLine();
			if (databaseType.equalsIgnoreCase("Oracle")) {
				System.out.println("Enter your name : ");
				String name = scanner.nextLine();
				Database oracle = DatabaseFactory.getDatabase(databaseType, name);
				oracle.connect();
			} else if (databaseType.equalsIgnoreCase("SQL")) {
				System.out.println("Enter your name : ");
				String name = scanner.nextLine();
				Database sql = DatabaseFactory.getDatabase(databaseType, name);
				sql.connect();
			} else {
				System.out.println("Invalid database type");

			}

		} 
		catch (Exception e) {
			e.printStackTrace();

		}
	
}



}
