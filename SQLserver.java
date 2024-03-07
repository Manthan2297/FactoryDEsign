package depaul.edu;

public class SQLserver implements Database{
  private String name;

public SQLserver(String name) {
    this.name = name;
  }
  
  
  public void connect() {
    System.out.println(name +" Connected to SQL server..");
  }
}
