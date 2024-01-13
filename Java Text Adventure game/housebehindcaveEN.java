public class housebehindcaveEN {

  public static boolean first = false;
  public static boolean first2 = false;
  
  public static void start() {
    
    ClearEN.clear();
    System.out.println("-------------------------------------------");
    if (first == false) {
      System.out.println("\nYou see an underground lake with a boat");
      first = true;
    }
    else {
      System.out.println("\nYou are in the underground sea. \nWhat do you want to do?");  
    }
    System.out.println("\n[1] Go to the boat");
    System.out.println("\n[2] Leave the place and go home");
    System.out.println("\n-------------------------------------------");
     System.out.print("answer: ");  
    int richtung = ScannerEN.NoSkipScanner(housebehindcaveEN::start, "1|2");
    if (richtung == 1) {
      gointheboat();
    } 
    else if (richtung == 2) {                                                                                                  
      StartrichtungEN.start();     
    }  
  }
  public static void gointheboat() {
    ClearEN.clear();
    System.out.println("-------------------------------------------");
    System.out.println("\nYou are in the boat what do you want to do");
    System.out.println("\n[1] Drive to the left");
    System.out.println("\n[2] Drive straight out");
    System.out.println("\n[3] Leave the place and go home");
    System.out.println("\n-------------------------------------------");
    System.out.print("answer: ");  
    int richtung = ScannerEN.NoSkipScanner(housebehindcaveEN::gointheboat, "1|2|3");
    if (richtung == 1) {
      weinkeller();  
    } 
    else if (richtung == 2) {                                                                                                  
      Drivestraight();      
    } 
    else if (richtung == 3) {                                                                                                  
      StartrichtungEN.start();     
    }
    
    
  }
  public static void weinkeller() {
    ClearEN.clear();
    if (VarsEN.reatsel == false) {
      
      System.out.println("-------------------------------------------");
      System.out.println("\nYou're in a wine cellar.\n\nYou: Nothing suspicious.");
      System.out.println("\n[1] Go in the Boat");
      System.out.println("\n-------------------------------------------");
      System.out.print("answer: ");
      int richtung = ScannerEN.NoSkipScanner(housebehindcaveEN::weinkeller, "1");
      if (richtung == 1) {
        gointheboat();  
      } 
    }
    else {
      System.out.println("-------------------------------------------");
      System.out.println("\nYou're in a wine cellar.\n\nYou: Oh a secret passage");
      System.out.println("\n[1] Go in the Boat");
      System.out.println("\n[2] Go through the secret passage");
      System.out.println("\n-------------------------------------------");
      System.out.print("answer: ");
      int richtung = ScannerEN.NoSkipScanner(housebehindcaveEN::weinkeller, "1|2");
      if (richtung == 1) {
        gointheboat();  
      }
      else if (richtung == 2) {
        secretpassage();  
      } 
    }  
 
  }
  
  public static void secretpassage() {
    ClearEN.clear();
    if (VarsEN.Goblinkey == 0) {
      System.out.println("-------------------------------------------");
      System.out.println("\nYou found a Goblin key. Let's see what you can do with it");
      System.out.print("\n-------------------------------------------");
      VarsEN.Goblinkey = 1;
      ScannerEN.nextline(); 
      weinkeller(); 
    }
    else {
      System.out.println("-------------------------------------------");
      System.out.println("\nCan't find anything else here");
      System.out.print("\n-------------------------------------------");
      ScannerEN.nextline(); 
      weinkeller(); 
    }
  }
  
  public static void Drivestraight() {
    ClearEN.clear();
    System.out.println("-------------------------------------------");
    System.out.println("\nYou went straight. What do you want to do?");
    System.out.println("\n[1] Go right");
    System.out.println("\n[2] Go left");
    System.out.println("\n[3] go upstairs");
    System.out.println("\n[4] Turn the boat and go back");
    System.out.println("\n-------------------------------------------");
    System.out.print("answer: ");  
    int richtung = ScannerEN.NoSkipScanner(housebehindcaveEN::Drivestraight, "1|2|3|4");
    if (richtung == 1) {
      schlafzimmer();  
    } 
    else if (richtung == 2) {                                                                                                  
      puzzel();       
    } 
    else if (richtung == 3) {                                                                                                  
      dorwithkey();    
    }  
    else if (richtung == 4) {                                                                                                  
      gointheboat();    
    }   
  }
  public static void schlafzimmer() {
    ClearEN.clear();
    System.out.println("-------------------------------------------");
    System.out.println("\nIt looks like we've found the goblin's bedroom");
    System.out.println("But there is nothing more here");
    System.out.println("\nYou go out of the bedroom");
    System.out.print("-------------------------------------------");
    ScannerEN.nextline();
    Drivestraight();
  }
  public static void dorwithkey() {
    if (VarsEN.Goblinkey == 0) {
      ClearEN.clear();
      System.out.println("-------------------------------------------");
      System.out.println("\nYou go upstairs and find a huge door \nthat can be opened with a key. \nOn the door is a symbol of a goblin");
      System.out.print("\n-------------------------------------------");
      ScannerEN.nextline();
      Drivestraight();
    }
    else {
      if (first2 == false) {
        first2 = true;
        ClearEN.clear();
        System.out.println("-------------------------------------------");
        System.out.println("\nYou can open the door with your key");
        System.out.println("\nPress enter to open the door");
        System.out.print("-------------------------------------------");
        ScannerEN.nextline();
        ClearEN.clear();
        System.out.println("-------------------------------------------");
        System.out.println("\nOMG you see the goblin (final boss).");
        System.out.println("\n[1] Fight the Goblin");
        System.out.println("\n[2] Leave the place and go back to your house"); 
        System.out.println("\nATTENTION there is no turning back");
        System.out.println("-------------------------------------------");
        System.out.print("answer: ");  
        int richtung = ScannerEN.NoSkipScanner(housebehindcaveEN::dorwithkey, "1|2");
        if (richtung == 1) {
          fight();  
        } 
        else if (richtung == 2) {                                                                                                  
          StartrichtungEN.start();       
        } 
      }
      else {
        ClearEN.clear();
        System.out.println("-------------------------------------------");
        System.out.println("\nWhat do you want to do?");
        System.out.println("\n[1] Fight the Goblin");
        System.out.println("\n[2] Leave the place and go back to your house");
        System.out.println("\nATTENTION there is no turning back"); 
        System.out.println("-------------------------------------------");
        System.out.print("answer: ");  
        int richtung = ScannerEN.NoSkipScanner(housebehindcaveEN::dorwithkey, "1|2");
        if (richtung == 1) {
          fight();  
        } 
        else if (richtung == 2) {
          StartrichtungEN.start(); 
        }     
      }
    } 
  }
  
  public static void fight() {
    Monster.Monster(12, 100, "nothing", "", VarsEN.nothing, VarsEN.nothing, RandomEN.nextInt(500, 800), "Boss", VarsEN.Boss, "Goblin-Final-Boss", EndeEN::start, housebehindcaveEN::noflieh, false, false, "true", false);
  }
  
  public static void noflieh() {
    ClearEN.clear();
    System.out.println("-------------------------------------------");
    System.out.println("\nYou can't escape | I warned you");
    System.out.print("\n-------------------------------------------");
    ScannerEN.nextline();
    fight();  
  }
  
  public static void puzzel() {
    if (VarsEN.reatsel == false) {
      
      ClearEN.clear();
      System.out.println("-------------------------------------------");
      System.out.println("\nYou go left and you find a room with 5 caskets.");
      System.out.println("It is a treasure that the goblin has hidden");
      System.out.println("\nThe treasure consists of 5 caskets, \nbut only if you open all of them you will get the key \nwith which you can open the Goblin's room");
      System.out.print("\n-------------------------------------------");
      ScannerEN.nextline();
      puzzel1();
    }
    else {
      ClearEN.clear();
      System.out.println("-------------------------------------------");
      System.out.println("\nYou have already solved the riddle");
      System.out.print("\n-------------------------------------------");
      ScannerEN.nextline();
      Drivestraight();
    }
  }
  public static void puzzel1() {
    ClearEN.clear();
    System.out.println("-------------------------------------------");
    System.out.println("\nThe caskets are all locked and labeled with coded messages");
    System.out.println("\nCaskets 1: wkh");
    System.out.println("\nCaskets 2: ogtk");
    System.out.println("\nCaskets 3: ku");
    System.out.println("\nCaskets 4: yjr");
    System.out.println("\nCaskets 5: prh");
    System.out.println("\n[6] Leave the place");
    System.out.println("\nSolve each Casket and you get your key");
    System.out.println("-------------------------------------------");
    System.out.print("Caskets 1: "); 
    String Caskets = ScannerEN.NoSkipScannerString(housebehindcaveEN::puzzel1);
    System.out.print("answer: ");  
    if (Caskets.equals("the")) {
      puzzel2(); 
    }
    else if (Caskets.equals("6")) {                                                                                                 
      housebehindcaveEN.Drivestraight();     
    }
    else {                                                                                               
      puzzel1();       
    } 
  }
  
  public static void puzzel2() {
    ClearEN.clear();
    System.out.println("-------------------------------------------");
    System.out.println("\nThe caskets are all locked and labeled with coded messages");
    System.out.println("\nCaskets 1: wkh");
    System.out.println("\nCaskets 2: ogtk");
    System.out.println("\nCaskets 3: ku");
    System.out.println("\nCaskets 4: yjr");
    System.out.println("\nCaskets 5: prh");
    System.out.println("\n[6] Leave the place");
    System.out.println("\nSolve each Casket and you get your key");
    System.out.println("-------------------------------------------");
    System.out.print("Caskets 2: "); 
    String Caskets = ScannerEN.NoSkipScannerString(housebehindcaveEN::puzzel1);
    System.out.print("answer: ");  
    if (Caskets.equals("goal")) {
      puzzel3();  
    } 
    else if (Caskets.equals("6")) {                                                                                                 
      housebehindcaveEN.Drivestraight();     
    }
    else {                                                                                               
      puzzel2();       
    } 
  }
  public static void puzzel3() {
    ClearEN.clear();
    System.out.println("-------------------------------------------");
    System.out.println("\nThe caskets are all locked and labeled with coded messages");
    System.out.println("\nCaskets 1: wkh");
    System.out.println("\nCaskets 2: ogtk");
    System.out.println("\nCaskets 3: ku");
    System.out.println("\nCaskets 4: yjr");
    System.out.println("\nCaskets 5: prh");
    System.out.println("\n[6] Leave the place");
    System.out.println("\nSolve each Casket and you get your key");
    System.out.println("-------------------------------------------");
    System.out.print("Caskets 3: "); 
    String Caskets = ScannerEN.NoSkipScannerString(housebehindcaveEN::puzzel1);
    System.out.print("answer: ");  
    if (Caskets.equals("is")) {
      puzzel4();  
    }
    else if (Caskets.equals("6")) {                                                                                                 
      housebehindcaveEN.Drivestraight();     
    }
    else {                                                                                               
      puzzel3();       
    } 
  }
  public static void puzzel4() {
    ClearEN.clear();
    System.out.println("-------------------------------------------");
    System.out.println("\nThe caskets are all locked and labeled with coded messages");
    System.out.println("\nCaskets 1: wkh");
    System.out.println("\nCaskets 2: ogtk");
    System.out.println("\nCaskets 3: ku");
    System.out.println("\nCaskets 4: yjr");
    System.out.println("\nCaskets 5: prh");
    System.out.println("\n[6] Leave the place");
    System.out.println("\nSolve each Casket and you get your key");
    System.out.println("-------------------------------------------");
    System.out.print("Caskets 4: "); 
    String Caskets = ScannerEN.NoSkipScannerString(housebehindcaveEN::puzzel1);
    System.out.print("answer: ");  
    if (Caskets.equals("the")) {
      puzzel5();  
    }
    else if (Caskets.equals("6")) {                                                                                                 
      housebehindcaveEN.Drivestraight();     
    }
    else {                                                                                               
      puzzel4();       
    } 
  }
  public static void puzzel5() {
    ClearEN.clear();
    System.out.println("-------------------------------------------");
    System.out.println("\nThe caskets are all locked and labeled with coded messages");
    System.out.println("\nCaskets 1: wkh");
    System.out.println("\nCaskets 2: ogtk");
    System.out.println("\nCaskets 3: ku");
    System.out.println("\nCaskets 4: yjr");
    System.out.println("\nCaskets 5: prh");
    System.out.println("\n[6] Leave the place");
    System.out.println("\nSolve each Casket and you get your key");
    System.out.println("-------------------------------------------");
    System.out.print("Caskets 5: "); 
    String Caskets = ScannerEN.NoSkipScannerString(housebehindcaveEN::puzzel1);
    System.out.print("answer: ");  
    if (Caskets.equals("key")) {
      puzzelfinish();  
    }
    else if (Caskets.equals("6")) {                                                                                                 
      housebehindcaveEN.Drivestraight();     
    } 
    else {                                                                                               
      puzzel5();       
    } 
  }
  
  public static void puzzelfinish() {
    ClearEN.clear();
    System.out.println("-------------------------------------------");
    System.out.println("\nRight you solved the riddle and heard a noise. \nHave a look around again");
    System.out.print("\n-------------------------------------------");
    VarsEN.reatsel = true;
    ScannerEN.nextline();
    Drivestraight();
  }

}
