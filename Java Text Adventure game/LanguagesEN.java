public class LanguagesEN {
  
  public static void start() {
    
    ClearEN.clear();
    System.out.println("-------------------------------------------");
    System.out.println("\n          Realm of the Lost King");
    System.out.println("\n   Enter EN or DE[Coming Soon] for your languages");
    System.out.println("\n          Enter nothing = EN");
    System.out.println("-------------------------------------------");
    System.out.print("\nLanguages: ");
    String Input = ScannerEN.nextLineLow();
    if (Input.equalsIgnoreCase("EN")) {
      VarsEN.Languages = "EN";
    }
    if (Input.equalsIgnoreCase("DE")) {
      //varsEN.Languages = "DE";  
      start();
    }
    else {
      VarsEN.Languages = "EN";    
    }               
  }    

}

