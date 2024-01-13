public class canyonEN {
  
  public static boolean bridgefallsdown = false;

  public static void start() {
  
    if (VarsEN.dooractiv == false) {
      if (VarsEN.jumpboost == false) {
        
        ClearEN.clear();
        System.out.println("-------------------------------------------"); 
        System.out.println("You go to the canyon\n\nYou: I have to find another way \nto get across the canyon");
        System.out.print("\n-------------------------------------------");
        ScannerEN.nextline();
        marktEN.start(); 
      }
      else {
        if (bridgefallsdown == true) {
          ClearEN.clear();
          System.out.println("-------------------------------------------"); 
          System.out.println("You go to the canyon\n\nYou: I can use the bridge to get across the canyon");
          System.out.print("\n-------------------------------------------"); 
          ScannerEN.nextline(); 
          jumpaccept(); 
        }
        else {
          ClearEN.clear();
          System.out.println("-------------------------------------------"); 
          System.out.println("You go to the canyon\n\nYou: I can use the jump potion \nto get across the canyon");
          System.out.print("\n-------------------------------------------"); 
          ScannerEN.nextline();
          ClearEN.clear();
          System.out.println("-------------------------------------------"); 
          System.out.println("\nYou jumped over the canyon and you see a lever. \nYou pull it and a bridge extends. \nNow you can always go across the canyon");
          System.out.print("\n-------------------------------------------");
          bridgefallsdown = true; 
          ScannerEN.nextline();
          jumpaccept(); 
        }
      }
    }
    else {
      ClearEN.clear();
      System.out.println("-------------------------------------------");
      System.out.println("\nThere was only the king. But I don't want to disturb him\nYou go back to the market square"); 
      System.out.print("\n-------------------------------------------");
      ScannerEN.nextline();
      marktEN.start();
    }
    
  }
  public static void jumpaccept() {
    
    ClearEN.clear();
    System.out.println("-------------------------------------------"); 
    System.out.println("You keep walking and you see a house");
    System.out.println("\n[1] Go in the house");
    System.out.println("[2] Leave the place and go back to the market square");
    System.out.println("\n-------------------------------------------"); 
    System.out.print("answer: ");
    int richtung = ScannerEN.NoSkipScanner(canyonEN::jumpaccept, "1|2");
    if (richtung == 1) {
      goinhouse();
    } 
    else if (richtung == 2) {                                                                                                  
      marktEN.start();
    }
    
  }
  public static void goinhouse() {
  
    ClearEN.clear();
    System.out.println("-------------------------------------------");
    System.out.println("You go into the house and find the king");
    System.out.println("\nYou: King I finally found you.");
    System.out.print("-------------------------------------------");
    ScannerEN.nextline();
    ClearEN.clear();
    System.out.println("-------------------------------------------");
    System.out.println("You go into the house and find the king");
    System.out.println("\nYou: King I finally found you.");
    System.out.println("\nKing: Please save my kingdom.");
    System.out.print("-------------------------------------------");
    ScannerEN.nextline();
    ClearEN.clear();
    System.out.println("-------------------------------------------");
    System.out.println("You go into the house and find the king");
    System.out.println("\nYou: King I finally found you.");
    System.out.println("\nKing: Please save my kingdom.");
    System.out.println("\nYou: Yes i will do. You know how i can defeat the goblin?");
    System.out.print("-------------------------------------------");
    ScannerEN.nextline();
    ClearEN.clear();
    System.out.println("-------------------------------------------");
    System.out.println("You go into the house and find the king");
    System.out.println("\nYou: King I finally found you.");
    System.out.println("\nKing: Please save my kingdom.");
    System.out.println("\nYou: Yes i will do. You know how i can defeat the goblin?");
    System.out.println("\nKing: West of the goblin village is the lost forest.\nThere you can find the Sword of Light.");
    System.out.print("-------------------------------------------");
    ScannerEN.nextline();
    ClearEN.clear();
    System.out.println("-------------------------------------------");
    System.out.println("You go into the house and find the king");
    System.out.println("\nYou: King I finally found you.");
    System.out.println("\nKing: Please save my kingdom.");
    System.out.println("\nYou: Yes i will do. You know how i can defeat the goblin?");
    System.out.println("\nKing: West of the goblin village is the lost forest.\nThere you can find the Sword of Light.");
    System.out.println("\nYou: But how am I supposed to get past the goblins.");
    System.out.print("-------------------------------------------");
    ScannerEN.nextline();
    ClearEN.clear();
    System.out.println("-------------------------------------------");
    System.out.println("You go into the house and find the king");
    System.out.println("\nYou: King I finally found you.");
    System.out.println("\nKing: Please save my kingdom.");
    System.out.println("\nYou: Yes i will do. You know how i can defeat the goblin?");
    System.out.println("\nKing: West of the goblin village is the lost forest.\nThere you can find the Sword of Light.");
    System.out.println("\nKing: You need an invisibility potion from the brewery. \nHere 20 gold and my Golden key with that you can buy the potion. \nAll you need is a magic hat");    System.out.print("-------------------------------------------");
    ScannerEN.nextline();
    ClearEN.clear();
    System.out.println("-------------------------------------------");
    System.out.println("You go into the house and find the king");
    System.out.println("\nYou: King I finally found you.");
    System.out.println("\nKing: Please save my kingdom.");
    System.out.println("\nYou: Yes i will do. You know how i can defeat the goblin?");
    System.out.println("\nKing: West of the goblin village is the lost forest.\nThere you can find the Sword of Light.");
    System.out.println("\nYou: But how am I supposed to get past the goblins.");
    System.out.println("\nKing: You need an invisibility potion from the brewery. \nHere 20 gold and my Golden key with that you can buy the potion. \nAll you need is a magic hat");
    System.out.println("\nYou: Okay king I won't let you down.");
    System.out.print("-------------------------------------------");
    VarsEN.Gold = VarsEN.Gold+20;
    ScannerEN.nextline();
    gointown();
  }
  public static void gointown() {
    ClearEN.clear();
    System.out.print("-------------------------------------------");
    System.out.println("\n\nYou go back to market square. \nYou see a door at the back of the castle.");
    System.out.println("\n[1] Go in the castle");
    System.out.println("\n[2] Stay on the market square");
    System.out.println("\n-------------------------------------------");
    System.out.print("answer: ");
    VarsEN.dooractiv = true;
    int richtung = ScannerEN.NoSkipScanner(canyonEN::gointown, "1|2");
    if (richtung == 1) {
      TownEN.intown();
    } 
    else if (richtung == 2) {                                                                                                  
      marktEN.start();
    }  
  }

}
