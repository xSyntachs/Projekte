public class HaendlerEN {
  
  private static boolean firsttime = false;

  public static void start() {
    ClearEN.clear();
    VarsEN.FeeplayerHP = VarsEN.playerHP;
    if (firsttime == false) {
      System.out.println("-------------------------------------------");
      System.out.println("\nWorker: You want to buy typical items?");
      System.out.println("\nYou: Sure, why not");
      System.out.println("\nWorker: Okay press enter and I'll show you my large assortment");
      System.out.print("\n-------------------------------------------");
      firsttime = true;
      ScannerEN.nextline();
    }
    ClearEN.clear();
    System.out.println("-------------------------------------------");
    System.out.println("                   Merchant");
    System.out.println("\n[1] 1x Bread = 1 Gold (Instant 5 hp heal)");
    System.out.println("\n[2] 1x Doner = 2 Gold (Instant 10 hp heal)");
    System.out.println("\n[3] 1x Revive = 45 Gold (On death you respawn)");
    System.out.println("\n[4] 1x LSD = 5 Gold (1/3 chance | death/full hp/half hp)");
    System.out.println("\n[5] 1x fag = 1 Gold (Side effect unknown)");
    System.out.println("\n[6] 1x Oleg's chicken soup = 20 Gold (Full HP)");
    System.out.println("\n[7] Leave the place");
    System.out.println("\n\nYou currently have " + VarsEN.Gold + " Gold"); 
    System.out.println("-------------------------------------------");
    System.out.print("\nanswer: ");
    int choice = ScannerEN.NoSkipScanner(HaendlerEN::start, "1|2|3|4|5|6|7");
    if (choice == 1) {
      if (VarsEN.Gold > 0) {
        if (VarsEN.playerHP < 100) {
          VarsEN.playerHP = VarsEN.playerHP+5;
          VarsEN.Gold = VarsEN.Gold-1;
          VarsEN.FeeplayerHP = VarsEN.playerHP;
          ClearEN.clear();
          System.out.println("-------------------------------------------");
          System.out.println("\nYou bought bread and you now have " + VarsEN.playerHP + "/100 HP");
          System.out.print("\n-------------------------------------------");
          ScannerEN.nextline();
          start(); 
        }
        else {
          ClearEN.clear();
          System.out.println("-------------------------------------------");
          System.out.println("\nYour life is already 100/100 HP");
          System.out.print("\n-------------------------------------------");
          ScannerEN.nextline();
          start();
        }
      }
      else {
        ClearEN.clear();
        System.out.println("-------------------------------------------");
        System.out.println("\nYou don't have enough gold to buy bread");
        System.out.print("\n-------------------------------------------");
        ScannerEN.nextline();
        start();
      }
    } 
    else if (choice == 2) {                                                                                                  
      if (VarsEN.Gold > 1) {
        if (VarsEN.playerHP < 98) {
          VarsEN.playerHP = VarsEN.playerHP+10;
          VarsEN.Gold = VarsEN.Gold-2;
          ClearEN.clear();
          System.out.println("-------------------------------------------");
          System.out.println("\nYou bought Doner and you now have " + VarsEN.playerHP + "/100 HP");
          System.out.print("\n-------------------------------------------");
          ScannerEN.nextline();
          start(); 
        }
        else {
          ClearEN.clear();
          System.out.println("-------------------------------------------");
          System.out.println("\nYou must be missing at least 3 hp");
          System.out.print("\n-------------------------------------------");
          ScannerEN.nextline();
          start();
        }
      }
      else {
        ClearEN.clear();
        System.out.println("-------------------------------------------");
        System.out.println("\nYou don't have enough gold to buy Doner");
        System.out.print("\n-------------------------------------------");
        ScannerEN.nextline();
        start();
      }   
    }  
    else if (choice == 3) {
      if (VarsEN.Gold > 44) {
        if (VarsEN.playerRevive == false) {   
          VarsEN.Gold = VarsEN.Gold-45;
          ClearEN.clear(); 
          System.out.println("-------------------------------------------");
          System.out.println("\nYou bought a Revive | New item Revive Totem");
          System.out.print("\n-------------------------------------------");
          VarsEN.playerRevive = true;    
          ScannerEN.nextline();    
          start();    
        }
        else {
          ClearEN.clear();
          System.out.println("-------------------------------------------");
          System.out.println("\nYou have already purchased a Revive");
          System.out.print("\n-------------------------------------------");
          ScannerEN.nextline();
          start();  
        }  
      } 
      else {
        ClearEN.clear();
        System.out.println("-------------------------------------------");
        System.out.println("\nYou don't have enough gold to buy Revive");
        System.out.print("\n-------------------------------------------");
        ScannerEN.nextline();
        start();
      }   
    }
    else if (choice == 4) {
      if (VarsEN.Gold > 4) {
        if (VarsEN.playerHP > 1) { 
          VarsEN.Gold = VarsEN.Gold-5;
          int LSDChance = RandomEN.nextInt(1, 3);        
          if (LSDChance == 1) {
            VarsEN.playerHP = 100;
            ClearEN.clear();
            System.out.println("-------------------------------------------");
            System.out.println("\nThe LSD has fully generated your life\nNew hp -> 100/100");
            System.out.print("\n-------------------------------------------");
            ScannerEN.nextline();
            start();    
          }       
          if (LSDChance == 2) {   
            VarsEN.playerHP = VarsEN.playerHP/2;
            ClearEN.clear();
            System.out.println("-------------------------------------------");
            System.out.println("\nLSD cut your life in half\nNew hp -> " + VarsEN.playerHP + "/100");
            System.out.print("\n-------------------------------------------");
            ScannerEN.nextline();
            start(); 
          }       
          if (LSDChance == 3) {
            ClearEN.clear();
            if (VarsEN.playerRevive == true) {
              System.out.println("-------------------------------------------");
              System.out.println("\nThe LSD killed you. However, \nyou were revived and taken to your home");
              System.out.print("\n-------------------------------------------"); 
              VarsEN.playerRevive = false;
              VarsEN.playerHP = 100; 
              ScannerEN.nextline();      
              StartrichtungEN.start();    
            }    
            else {
              System.out.println("-------------------------------------------");
              System.out.println("\nThe LSD killed you\n\nGame Over!");
              System.out.print("\n-------------------------------------------");
              System.exit(0);  
            }
          }
        }
        else {
          ClearEN.clear();
          System.out.println("-------------------------------------------");
          System.out.println("\nYou must have at least two hp");
          System.out.print("\n-------------------------------------------");
          ScannerEN.nextline();
          start(); 
        }
      }
      else {
        ClearEN.clear();
        System.out.println("-------------------------------------------");
        System.out.println("\nYou don't have enough gold to buy LSD");
        System.out.print("\n-------------------------------------------");
        ScannerEN.nextline();
        start();
      }
    } 
    else if (choice == 5) {
      if (VarsEN.Gold > 0) {
        ClearEN.clear();
        VarsEN.playerHP = VarsEN.playerHP-5;
        VarsEN.Gold = VarsEN.Gold-1;        
        if (VarsEN.playerHP > 0) {       
          System.out.println("-------------------------------------------");
          System.out.println("\nYou bought a fag and smoked it. You lose 5 hp.\nNew hp -> " + VarsEN.playerHP + "/100\n\nDONT SMOKE!!!!!!");
          System.out.print("\n-------------------------------------------");
          ScannerEN.nextline();
          start();
        }
        else {
          ClearEN.clear();
          if (VarsEN.playerRevive == true) {
            System.out.println("-------------------------------------------");
            System.out.println("\nThe fag killed you. However, \nyou were revived and taken to your home");
            System.out.print("\n-------------------------------------------");
            VarsEN.playerRevive = false;
            VarsEN.playerHP = 100;
            ScannerEN.nextline();   
            StartrichtungEN.start();    
          }    
          else { 
            System.out.println("-------------------------------------------");
            System.out.println("\nThe fag killed you\n\nGame Over!");
            System.out.print("\n-------------------------------------------");
            System.exit(0);
          }
        }
      } 
      else {
        ClearEN.clear();
        System.out.println("-------------------------------------------");
        System.out.println("\nYou don't have enough gold to buy fag's");
        System.out.print("\n-------------------------------------------");
        ScannerEN.nextline();
        start();
      }       
    } 
    else if (choice == 6) {
      if (VarsEN.Gold > 19) {
        ClearEN.clear();
        VarsEN.playerHP = 100;
        VarsEN.Gold = VarsEN.Gold-20;         
        System.out.println("-------------------------------------------");
        System.out.println("\nYou ate Oleg's chicken soup and you feel better than ever\nNew hp -> " + VarsEN.playerHP + "/100");
        System.out.print("\n-------------------------------------------");
        ScannerEN.nextline();
        start();  
      } 
      else {
        ClearEN.clear();
        System.out.println("-------------------------------------------");
        System.out.println("\nYou don't have enough gold to buy Oleg's chicken soup");
        System.out.print("\n-------------------------------------------");
        ScannerEN.nextline();
        start();
      }     
    } 
    else if (choice == 7) {
      marktEN.start();       
    }
    else {
      start();  
    } 
      
  }

  

}
