package depaul.edu;

abstract class DatabaseFactory {
		
    public static Database getDatabase(String databaseType, String name) {
      
      if (databaseType.equalsIgnoreCase("Oracle")){                                                                                 
        return new Oracleserver(name);
      }
     
      else if (databaseType.equalsIgnoreCase("SQL")) {
        return new SQLserver(name);
      }
	return null;
      
    
  

  
  }
}

	
  
  
