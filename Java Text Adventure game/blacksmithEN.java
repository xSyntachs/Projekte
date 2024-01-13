public class blacksmithEN {
  
  private static boolean firsttime = false;
  
  public static void start() {
    VarsEN.FeeplayerHP = VarsEN.playerHP;
    ClearEN.clear();
    if (firsttime == false) {
      System.out.println("-------------------------------------------");
      System.out.println("\nWorker: You want tools and armor?");
      System.out.println("\nYou: Yes, what are you offering?");
      System.out.println("\nWorker: Press enter to see what I can give you");
      System.out.print("\n-------------------------------------------");
      firsttime = true;
      ScannerEN.nextline();
    }
    ClearEN.clear();
    System.out.println("-------------------------------------------");
    System.out.println("                 Blacksmith");
    System.out.println("\n[1] 1x Torch = 3 Gold");
    System.out.println("\n[2] 20x Armor = 1 Gold, 3 Steel");
    System.out.println("\n[3] Unique puzzle tip = 20 Gold");
    System.out.println("\n[4] Leave the place");
    System.out.println("\n\nYou currently have " + VarsEN.Gold + " Gold");
    System.out.println("-------------------------------------------");
    System.out.print("\nanswer: ");
    int choice = ScannerEN.NoSkipScanner(breweryEN::start, "1|2|3|4");
    if (choice == 1) {
      if (VarsEN.Gold > 2) {
        if (VarsEN.Torch == false) {
          ClearEN.clear();
          VarsEN.Torch = true;
          VarsEN.Gold = VarsEN.Gold-3;
          System.out.println("-------------------------------------------");
          System.out.println("\nYou bought a torch. Have fun with it");
          System.out.print("\n-------------------------------------------");
          ScannerEN.nextline();
          start();
        }
        else {
          ClearEN.clear();
          System.out.println("-------------------------------------------");
          System.out.println("\nYou already have a torch");
          System.out.print("\n-------------------------------------------");
          ScannerEN.nextline();
          start();  
        }  
      }
      else {
        ClearEN.clear();
        System.out.println("-------------------------------------------");
        System.out.println("\nYou don't have enough gold to buy a torch");
        System.out.print("\n-------------------------------------------");
        ScannerEN.nextline();
        start();
      }
       
    } 
    else if (choice == 2) {                                                                                                  
      if (VarsEN.Gold > 0) {
        if (VarsEN.Steel > 2) {
          if (VarsEN.playerarmor != 100) {
            ClearEN.clear();
            VarsEN.Steel = VarsEN.Steel-2;
            VarsEN.Gold = VarsEN.Gold-1;
            VarsEN.playerarmor = VarsEN.playerarmor+20;
            System.out.println("-------------------------------------------");
            System.out.println("\nYou bought 20 armor. New armor level -> " + VarsEN.playerarmor + "/100");
            System.out.print("\n-------------------------------------------");
            ScannerEN.nextline();
            start(); 
          }
          else {
            ClearEN.clear();
            System.out.println("-------------------------------------------");
            System.out.println("\nYou already have full armor");
            System.out.print("\n-------------------------------------------");
            ScannerEN.nextline();
            start();   
          }
        }
        else {
          ClearEN.clear();
          System.out.println("-------------------------------------------");
          System.out.println("\nYou don't have enough steel");
          System.out.print("\n-------------------------------------------");
          ScannerEN.nextline();
          start(); 
        }
      }
      else {
        ClearEN.clear();
        System.out.println("-------------------------------------------");
        System.out.println("\nYou don't have enough Gold");
        System.out.print("\n-------------------------------------------");
        ScannerEN.nextline();
        start(); 
      } 
    }  
    else if (choice == 3) {
      if (VarsEN.Gold > 19) {
        if (VarsEN.Rätselused == false) {
          ClearEN.clear();
          VarsEN.Rätselused = true;
          VarsEN.Gold = VarsEN.Gold-20;    
          System.out.println("-------------------------------------------");
          System.out.println("\nThe puzzle is about the shift in the alphabet");
          System.out.print("\n-------------------------------------------");
          ScannerEN.nextline();
          start();
        }
        else {
          ClearEN.clear();  
          System.out.println("-------------------------------------------");
          System.out.println("\nYou already got a tip, it was: \nThe puzzle is about the shift in the alphabet");
          System.out.print("\n-------------------------------------------");
          ScannerEN.nextline();
          start(); 
        }     
      }
      else {
        ClearEN.clear();
        System.out.println("-------------------------------------------");
        System.out.println("\nYou don't have enough Gold");
        System.out.print("\n-------------------------------------------");
        ScannerEN.nextline();
        start();   
      }        
    }
    else if (choice == 4) {
      marktEN.start();         
    } 
    else {
      start();  
    }  
  }
}
