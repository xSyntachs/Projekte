public class MineEN {
  
  private static boolean firsttime = false;
  
  public static void start() {
    VarsEN.Spinne2Used = false; 
    ClearEN.clear();
    System.out.println("-------------------------------------------");
    System.out.println("                   Mine");
    System.out.println("\n[1] Mine ores");
    System.out.println("\n[2] Find a spider and kill it");
    System.out.println("\n[3] Talk to an old man");
    System.out.println("\n[4] Leave the place and go to your house");
    System.out.println("-------------------------------------------");
    System.out.print("\nanswer: ");
    int choice = ScannerEN.NoSkipScanner(MineEN::start, "1|2|3|4");    
    if (choice == 1) {
      mineores();  
    } 
    else if (choice == 2) {                                                                                                  
      Monster.Monster(RandomEN.nextInt(4, 5), 25, "SpiderLeg", "SpiderEye",VarsEN.SpiderLeg, VarsEN.SpiderEye, RandomEN.nextInt(8, 9), "Spinne2Used", VarsEN.Spinne2Used, "Spider", MineEN::start, MineEN::start, true, true, "None", false);     
    } 
    else if (choice == 3) {
      oldman();    
    } 
    else if (choice == 4) {
      StartrichtungEN.start();      
    } 
    else {
      start();
    }
    
    
  }
  
  private static void mineores() {
    ClearEN.clear();
    boolean mine = true;
    while (mine == true) { 
      ClearEN.clear();
      System.out.println("-------------------------------------------");
      System.out.println("Which ore do you want to mine?");
      System.out.println("\n[1] Coal");
      System.out.println("\n[2] Iron");
      System.out.println("\n[3] Leave the place");
      System.out.println("\nCurrent Coal count -> " + VarsEN.Coal);
      System.out.println("Current Iron count -> " + VarsEN.Iron); 
      System.out.println("-------------------------------------------");
      System.out.print("\nanswer: ");
      int choice = ScannerEN.NoSkipScanner(MineEN::mineores, "1|2|3");    
      if (choice == 1) {
        if (VarsEN.Pickaxe == true) {
          
          if (VarsEN.Pickaxedamage > 74) {
            ClearEN.clear();
            System.out.println("-------------------------------------------");
            System.out.println("\nYou can no longer mine coal because your pickaxe is worn out");
            System.out.print("\n-------------------------------------------");
            ScannerEN.nextline();
          }
          else {
            int count1 = RandomEN.nextInt(2, 3);
            VarsEN.Coal = VarsEN.Coal+count1; 
            VarsEN.Pickaxedamage++; 
          }
        }
        else {
          ClearEN.clear();
          System.out.println("-------------------------------------------");
          System.out.println("\nYou need a pickaxe to mine resources");
          System.out.print("\n-------------------------------------------");
          ScannerEN.nextline();  
        }
      } 
      else if (choice == 2) {
        if (VarsEN.Pickaxe == true) {
          
          if (VarsEN.Pickaxedamage > 74) {
            ClearEN.clear();
            System.out.println("-------------------------------------------");
            System.out.println("\nYou can no longer mine iron because your pickaxe is worn out");
            System.out.print("\n-------------------------------------------");
            ScannerEN.nextline();
          }
          else {
            int count2 = RandomEN.nextInt(2, 5);
            VarsEN.Iron = VarsEN.Iron+count2; 
            VarsEN.Pickaxedamage++; 
          }
        }
        else {
          ClearEN.clear();
          System.out.println("-------------------------------------------");
          System.out.println("\nYou need a pickaxe to mine resources");
          System.out.print("\n-------------------------------------------");
          ScannerEN.nextline();  
        }    
      } 
      else if (choice == 3) {
        mine = false;
      } 
      else {
        
      }
    }
    DiebEN.CaveDieb();
    start();  
  }
  public static void oldman() {
    ClearEN.clear();
    if (VarsEN.Pickaxedamage > 74) {
      ClearEN.clear();
      System.out.println("-------------------------------------------");
      System.out.println("\n               Old man");
      System.out.println("\n[1] Repair your pickaxe = 5 Gold");
      System.out.println("\n[2] Transform 5 Coal + 20 Iron = 1 Steel");
      System.out.println("\n[3] Leave the place");
      System.out.println("\nCurrent Coal count -> " + VarsEN.Coal);
      System.out.println("Current Iron count -> " + VarsEN.Iron); 
      System.out.println("Current Steel count -> " + VarsEN.Steel);
      System.out.println("-------------------------------------------");
      System.out.print("\nanswer: ");
      int choice = ScannerEN.NoSkipScanner(MineEN::oldman, "1|2|3");    
      if (choice == 1) { 
        if (VarsEN.Pickaxedamage > 74) {
          if (VarsEN.Gold > 4) {
            ClearEN.clear();
            System.out.println("-------------------------------------------");
            System.out.println("\nThe old man fixed your pickaxe");
            System.out.print("\n-------------------------------------------");
            VarsEN.Pickaxedamage = 0;
            VarsEN.Gold = VarsEN.Gold-5;
            ScannerEN.nextline();
            oldman();
          }
          else {
            ClearEN.clear();
            System.out.println("-------------------------------------------");
            System.out.println("\nYou don't have enough Gold to repair your pickaxe");
            System.out.print("\n-------------------------------------------");
            ScannerEN.nextline();
            oldman();  
          }
        }
        else {
          ClearEN.clear();
          System.out.println("-------------------------------------------");
          System.out.println("\nYou already got your free pickaxe");
          System.out.print("\n-------------------------------------------");
          ScannerEN.nextline();
          oldman();
        }
      } 
      else if (choice == 2) {                                                                                                  
        if (VarsEN.Coal > 4) {
          if (VarsEN.Iron > 19) { 
            ClearEN.clear();
            VarsEN.Steel++;
            VarsEN.Iron = VarsEN.Iron-20;
            VarsEN.Coal = VarsEN.Coal-5;
            oldman(); 
          }
          else {
            ClearEN.clear();
            System.out.println("-------------------------------------------");
            System.out.println("\nYou don't have enough Iron");
            System.out.print("\n-------------------------------------------");
            ScannerEN.nextline();
            oldman(); 
          }
        }
        else {
          ClearEN.clear();
          System.out.println("-------------------------------------------");
          System.out.println("\nYou don't have enough Coal");
          System.out.print("\n-------------------------------------------");
          ScannerEN.nextline();
          oldman(); 
        }    
      } 
      else if (choice == 3) {
        start();  
      } 
      else {
        start();
      }
    }
    else {

      if (firsttime == false) {
        if (VarsEN.dooractiv == false) {
          System.out.println("-------------------------------------------");
          System.out.println("\nOld man: Hello young man. \nWhat are you looking for here?");
          System.out.println("\nYou: I'm looking for the king");
          System.out.println("\nWorker: Ah okay I can give you a pickaxe. \nIf you mine Coal and Iron I can give you Steel. \nMaybe you can do something with it");
          System.out.print("\n-------------------------------------------");
          firsttime = true;
          ScannerEN.nextline();
        }
        else {
          System.out.println("-------------------------------------------");
          System.out.println("\nOld man: Hello young man. \nWhat are you looking for here?");
          System.out.println("\nYou: I'm looking for good Armor");
          System.out.println("\nWorker: Ah okay I can give you a pickaxe. \nIf you mine Coal and Iron I can give you Steel. \nMaybe you can do something with it");
          System.out.print("\n-------------------------------------------");
          firsttime = true;
          ScannerEN.nextline();  
        }
      }
      ClearEN.clear();
      System.out.println("-------------------------------------------");
      System.out.println("\n               Old man");
      System.out.println("\n[1] Get a free pickaxe");
      System.out.println("\n[2] Transform 5 Coal + 20 Iron = 1 Steel");
      System.out.println("\n[3] Leave the place");
      System.out.println("\nCurrent Coal count -> " + VarsEN.Coal);
      System.out.println("Current Iron count -> " + VarsEN.Iron); 
      System.out.println("Current Steel count -> " + VarsEN.Steel);
      System.out.println("-------------------------------------------");
      System.out.print("\nanswer: ");
      int choice = ScannerEN.NoSkipScanner(MineEN::oldman, "1|2|3");    
      if (choice == 1) { 
        if (VarsEN.Pickaxe == false) {
          ClearEN.clear();
          System.out.println("-------------------------------------------");
          System.out.println("\nThe old man gave you a free pickaxe");
          System.out.print("\n-------------------------------------------");
          VarsEN.Pickaxe = true;
          ScannerEN.nextline();
          oldman();
        }
        else {
          ClearEN.clear();
          System.out.println("-------------------------------------------");
          System.out.println("\nYou already got your free pickaxe");
          System.out.print("\n-------------------------------------------");
          ScannerEN.nextline();
          oldman();
        }
      } 
      else if (choice == 2) {                                                                                                  
        if (VarsEN.Coal > 4) {
          if (VarsEN.Iron > 19) { 
            ClearEN.clear();
            VarsEN.Steel++;
            VarsEN.Iron = VarsEN.Iron-20;
            VarsEN.Coal = VarsEN.Coal-5;
            oldman(); 
          }
          else {
            ClearEN.clear();
            System.out.println("-------------------------------------------");
            System.out.println("\nYou don't have enough Iron");
            System.out.print("\n-------------------------------------------");
            ScannerEN.nextline();
            oldman(); 
          }
        }
        else {
          ClearEN.clear();
          System.out.println("-------------------------------------------");
          System.out.println("\nYou don't have enough Coal");
          System.out.print("\n-------------------------------------------");
          ScannerEN.nextline();
          oldman(); 
        }    
      } 
      else if (choice == 3) {
        start();  
      } 
      else {
        start();
      }
    } 
  }

}
