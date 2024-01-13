public class breweryEN {
  
  private static boolean firsttime = false;
  
  public static void start() {
  
  
    VarsEN.FeeplayerHP = VarsEN.playerHP;
    ClearEN.clear();
    if (firsttime == false) {
      System.out.println("-------------------------------------------");
      System.out.println("\nWorker: You wanna get buffed?");
      System.out.println("\nYou: Yes what do you offer?");
      System.out.println("\nWorker: Press enter to see what I can give you");
      System.out.print("\n-------------------------------------------");
      firsttime = true;
      ScannerEN.nextline();
    }
    ClearEN.clear();
    System.out.println("-------------------------------------------");
    System.out.println("                   Brewery");
    System.out.println("\n[1] 1x Regeneration potion = 1 Gold, 1 spiderleg ");
    System.out.println("\n[2] 1x Jump boost potion = 2 Gold, 1 spidereye");
    System.out.println("\n[3] 1x Invisibility potion = 5 Gold, magic hat");
    System.out.println("\n[4] Leave the place");
    System.out.println("\n\nYou currently have:\n");
    System.out.println("Gold      -> " + VarsEN.Gold); 
    System.out.println("Spiderleg -> " + VarsEN.SpiderLeg); 
    System.out.println("Spidereye -> " + VarsEN.SpiderEye); 
    System.out.println("Magichat  -> " + VarsEN.magichat); 
    System.out.println("-------------------------------------------");
    System.out.print("\nanswer: ");
    int choice = ScannerEN.NoSkipScanner(breweryEN::start, "1|2|3|4");
    if (choice == 1) {
      if (VarsEN.Gold > 0) {
        if (VarsEN.SpiderLeg > 0) {
          if (VarsEN.playerHP != 100) {     
            ClearEN.clear();
            VarsEN.playerHP = VarsEN.playerHP+20;
            if (VarsEN.playerHP <= 100) {
              VarsEN.Gold--;
              VarsEN.SpiderLeg--;
              System.out.println("-------------------------------------------");
              System.out.println("\nYou bought a regeneration potion and drank it.\nYou gained 20 hp. New hp -> " + VarsEN.playerHP + "/100");
              System.out.print("\n-------------------------------------------");
              ScannerEN.nextline();
              start();
            }
            else {
              VarsEN.playerHP = 100;
              VarsEN.Gold--;
              VarsEN.SpiderLeg--;
              System.out.println("-------------------------------------------");
              System.out.println("\nYou bought a regeneration potion and drank it.\nYou have been fully healed.\n\nNew hp -> 100/100");
              System.out.print("\n-------------------------------------------");
              ScannerEN.nextline();
              start();
            }
          }
          else {
            ClearEN.clear();
            System.out.println("-------------------------------------------");
            System.out.println("\nYou are already full life so you cannot buy the potion");
            System.out.print("\n-------------------------------------------");
            ScannerEN.nextline();
            start();  
          }
        }
        else {
          ClearEN.clear();
          System.out.println("-------------------------------------------");
          System.out.println("\nYou don't have enough spiderleg's to buy a Regeneration potion");
          System.out.print("\n-------------------------------------------");
          ScannerEN.nextline();
          start();  
        }
      }
      else {
        ClearEN.clear();
        System.out.println("-------------------------------------------");
        System.out.println("\nYou don't have enough gold to buy a Regeneration potion");
        System.out.print("\n-------------------------------------------");
        ScannerEN.nextline();
        start();  
      }
    } 
    else if (choice == 2) {                                                                                                  
      if (VarsEN.Gold > 1) {
        if (VarsEN.SpiderEye > 0) {
          if (VarsEN.jumpboost == false) {
            ClearEN.clear();
            VarsEN.jumpboost = true;
            VarsEN.Gold = VarsEN.Gold-2;
            VarsEN.SpiderEye--;
            System.out.println("-------------------------------------------");
            System.out.println("\nYou bought a jump boost potion.\nLet's see what you can use it for");
            System.out.print("\n-------------------------------------------");
            ScannerEN.nextline();
            start();
          }
          else {
            ClearEN.clear();
            System.out.println("-------------------------------------------");
            System.out.println("\nYou already have a Jump boost potion.");
            System.out.print("\n-------------------------------------------");
            ScannerEN.nextline();
            start(); 
          }
        }
        else {
          ClearEN.clear();
          System.out.println("-------------------------------------------");
          System.out.println("\nYou don't have enough spidereye's to buy a jump boost potion");
          System.out.print("\n-------------------------------------------");
          ScannerEN.nextline();
          start();  
        }
      }
      else {
        ClearEN.clear();
        System.out.println("-------------------------------------------");
        System.out.println("\nYou don't have enough gold to buy a Regeneration potion");
        System.out.print("\n-------------------------------------------");
        ScannerEN.nextline();
        start();  
      }   
    }  
    else if (choice == 3) {
      if (VarsEN.Gold > 4) {
        if (VarsEN.magichat > 0) { 
          if (VarsEN.invisibility == false) {
            ClearEN.clear();
            VarsEN.invisibility = true;
            VarsEN.Gold = VarsEN.Gold-5;
            VarsEN.magichat--;
            System.out.println("-------------------------------------------");
            System.out.println("\nYou bought a invisibility potion.\nLet's see what you can use it for");
            System.out.print("\n-------------------------------------------"); 
            ScannerEN.nextline();
            start();
          }      
          else {
            ClearEN.clear();
            System.out.println("-------------------------------------------");
            System.out.println("\nYou already have a invisibility potion.");
            System.out.print("\n-------------------------------------------");
            ScannerEN.nextline();
            start();
          }
        }
        else {
          ClearEN.clear();
          System.out.println("-------------------------------------------");
          System.out.println("\nYou don't have enough magic hats's to buy a Invisibility potion");
          System.out.print("\n-------------------------------------------");
          ScannerEN.nextline();
          start();  
        }
      }
      else {
        ClearEN.clear();
        System.out.println("-------------------------------------------");
        System.out.println("\nYou don't have enough gold to buy a Invisibility potion");
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
