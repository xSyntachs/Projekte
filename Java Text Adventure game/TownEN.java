public class TownEN {
  
  public static boolean firsttime = false;
  
  
  public static void start() {
    ClearEN.clear();
    if (VarsEN.knight1Used == false) {
      System.out.println("-------------------------------------------");
      System.out.println("\nYou head south and come upon a castle. \nYou make your way towards the castle gates.\nAt the gate you see a knight");
      System.out.println("\n[1] Attack the knight");
      System.out.println("[2] Proceed past the castle");
      System.out.println("[3] Ask for a High five");
      System.out.println("[4] Leave the place");
      System.out.println("-------------------------------------------");
      System.out.print("answer: ");
      int choice = ScannerEN.NoSkipScanner(TownEN::start, "1|2|3|4");
      if (choice == 1) {
        
        if (VarsEN.knight1Used == false) {
          Monster.Monster(12, 100, "nothing", "", VarsEN.nothing, VarsEN.nothing, RandomEN.nextInt(3, 5), "knight1Used", VarsEN.knight1Used, "knight", TownEN::start, TownEN::start, false, false, "true", false);
        }
        else {
          intown();  
        }
        start(); 
      } 
      else if (choice == 2) {                                                                                                  
        marktEN.start();    
      }  
      else if (choice == 3) {
        highfive();   
      }
      else if (choice == 4) {
        StartrichtungEN.start();       
      } 
      else {
        start();  
      }
    }
    else {
      System.out.println("-------------------------------------------");
      System.out.println("\nYou going to the castle. \nThere is no knight.");
      System.out.println("\n[1] Go in the Town");
      System.out.println("[2] Proceed past the castle");
      System.out.println("[3] Leave the place");
      System.out.println("-------------------------------------------");
      System.out.print("answer: ");
      int choice = ScannerEN.NoSkipScanner(TownEN::start, "1|2|3");
       
      if (choice == 1) {
        intown();
      } 
      else if (choice == 2) {                                                                                                  
        start();     
      }  
      else if (choice == 3) {
        StartrichtungEN.start(); 
      } 
      else {
        start();  
      }
    }

    
    
  }
  public static void intown() {
    if (VarsEN.dooractiv == true) {
      if (VarsEN.MagierUsed == false) {
        if (firsttime == false) {
          firsttime = true;   
          ClearEN.clear();
          System.out.println("-------------------------------------------");
          System.out.println("\nYou entered the castle with the king's golden key");
          System.out.print("\n-------------------------------------------");
          ScannerEN.nextline();
    
          ClearEN.clear();
          System.out.println("-------------------------------------------");
          System.out.println("\nYou entered the castle with the king's golden key");
          System.out.println("\nYou see a huge staircase. You go this high");
          System.out.print("\n-------------------------------------------");
          ScannerEN.nextline();
        }
        Monster.Monster(8, 100, "magichat", "magichat",VarsEN.magichat, VarsEN.magichat, 16, "MagierUsed", VarsEN.MagierUsed, "Wizard (boss)", marktEN::start, marktEN::start, false, false, "true", true);  
      }

      else {
        ClearEN.clear();
        System.out.println("-------------------------------------------");
        System.out.println("\nYou see a huge staircase but it has collapsed. \nYou go back to the marketplace");
        System.out.print("\n-------------------------------------------");
        ScannerEN.nextline();
        marktEN.start(); 
      }

    }
    else {
      if (VarsEN.MagierUsed == false) {
        if (firsttime == false) {
          firsttime = true;   
          ClearEN.clear();
          System.out.println("-------------------------------------------");
          System.out.println("\nYou entered the castle with the king's golden key");
          System.out.print("\n-------------------------------------------");
          ScannerEN.nextline();
    
          ClearEN.clear();
          System.out.println("-------------------------------------------");
          System.out.println("\nYou entered the castle with the king's golden key");
          System.out.println("\nYou see a huge staircase. You go this high");
          System.out.print("\n-------------------------------------------");
          ScannerEN.nextline();
        }
        Monster.Monster(8, 100, "magichat", "magichat",VarsEN.magichat, VarsEN.magichat, 0, "MagierUsed", VarsEN.MagierUsed, "Wizard (boss)", marktEN::start, marktEN::start, false, false, "true", true);  
      }
    }
  }
  public static void highfive() {
    ClearEN.clear();
    System.out.println("-------------------------------------------");
    System.out.println("\nYou ask the knight for a high five");
    System.out.println("\nHe refuses and stares at you");
    System.out.println("\nYou back off");
    System.out.print("-------------------------------------------");
    ScannerEN.nextline();
    start();   
  }
  

}
