public class StartrichtungEN {
  
  public static void start() {
    if (VarsEN.SwordOflight == "None") {
      
      ClearEN.clear();
      System.out.println("You are in your house. Where do you want to go?");
      System.out.println("\n-------------------------------------------");
      System.out.println("\n[1] River");
      System.out.println("[2] Cave");
      System.out.println("[3] Town");
      System.out.println("[4] Gobiln");
      System.out.println("\n[0] Look at your Inventory");
      System.out.println("-------------------------------------------");
      System.out.print("answer: ");
      int richtung = ScannerEN.NoSkipScanner(StartrichtungEN::start, "1|2|3|4|0");
      if (richtung == 1) {
        FeeraumEN.start();
      } 
      else if (richtung == 2) {                                                                                                  
        CaveEN.start();     
      } 
      else if (richtung == 3) {
        TownEN.start(); 
      } 
      else if (richtung == 4) {
        GoblinTownEN.start();    
      } 
      else if (richtung == 0) {
        InventarEN.StartrichtungEN();    
      } 
      else {
        start();
      }  
    }
    else {
      ClearEN.clear();
      System.out.println("You are in your house. Where do you want to go?");
      System.out.println("\n-------------------------------------------");
      System.out.println("\n[1] River");
      System.out.println("[2] Cave");
      System.out.println("[3] Town");
      System.out.println("[4] Gobiln");
      System.out.println("[5] Go to the house behind the Cave");
      System.out.println("\n[0] Look at your Inventory");
      System.out.println("-------------------------------------------");
      System.out.print("answer: ");
      int richtung = ScannerEN.NoSkipScanner(StartrichtungEN::start, "1|2|3|4|5|0");
      if (richtung == 1) {
        FeeraumEN.start();
      } 
      else if (richtung == 2) {                                                                                                  
        CaveEN.start();     
      } 
      else if (richtung == 3) {
        TownEN.start(); 
      } 
      else if (richtung == 4) {
        GoblinTownEN.start();    
      } 
      else if (richtung == 5) {
        housebehindcaveEN.start();    
      } 
      else if (richtung == 0) {
        InventarEN.StartrichtungEN();    
      } 
      else {
        start();
      }    
    }
      
  }

}

