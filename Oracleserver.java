package depaul.edu;

public class Oracleserver implements Database{
  private String name ;

  public Oracleserver(String name) {
    this.name = name;
  }
  public void connect() {
    System.out.println(name +" Connected to Oracle server..");
  }

}
