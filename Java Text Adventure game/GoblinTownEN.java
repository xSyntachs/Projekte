public class GoblinTownEN {
  
  public static boolean firstime = false;
  public static boolean firstime2 = false;
  
  public static void start() {
     if (VarsEN.Goblin1Used == false) {
       Monster.Monster(RandomEN.nextInt(3, 5), 20, "nothing", "", VarsEN.nothing, VarsEN.nothing, RandomEN.nextInt(5, 8), "Goblin1Used", VarsEN.Goblin1Used, "Gobiln", GoblinTownEN::town, StartrichtungEN::start, false, false, "None", false);
     }
     town();                                 
  }
                                                                                                                                                                              
  public static void town() {
    if (VarsEN.invisibility == false) {
      
      if (firstime == false) {
        ClearEN.clear();
        firstime = true;
        System.out.println("-------------------------------------------");
        System.out.println("\nFrom a distance, far off, you can see a goblin village.");
        System.out.println("\nYou: Alone, I cannot slay every goblin in sight. \nI must devise another plan.");
        System.out.println("\n\nYou are going back to your house");
        System.out.print("-------------------------------------------");
        ScannerEN.nextline(); 
        StartrichtungEN.start();
      }
      else {
        ClearEN.clear();
        System.out.println("-------------------------------------------");
        System.out.println("\nI still can't do anything about all the goblins");
        System.out.print("\n-------------------------------------------");
        ScannerEN.nextline(); 
        StartrichtungEN.start(); 
      }
    }
    else {
      if (firstime2 == false) {
        firstime2 = true;
        ClearEN.clear();
        System.out.println("-------------------------------------------");
        System.out.println("\nYou are in front of the goblin village. \nWhat do you want to do");
        System.out.println("\n[1] Drink invisibility potion and go past the village");
        System.out.println("\n[2] Leave the place and go back to your house");
        System.out.println("\n-------------------------------------------");
        System.out.print("answer: ");
        int choice = ScannerEN.NoSkipScanner(GoblinTownEN::start, "1|2");
        if (choice == 1) {
          darkforestEN.start();
        } 
        else if (choice == 2) {                                                                                                  
          StartrichtungEN.start();    
        } 
        else {
          start(); 
        }
      }
      else {
        ClearEN.clear();
        System.out.println("-------------------------------------------");
        System.out.println("\nYou are in front of the goblin village. \nWhat do you want to do");
        System.out.println("\n[1] Past the village");
        System.out.println("\n[2] Leave the place and go back to your house");
        System.out.println("\n-------------------------------------------");
        System.out.print("answer: ");
        int choice = ScannerEN.NoSkipScanner(GoblinTownEN::start, "1|2");
        if (choice == 1) {
          darkforestEN.start();
        } 
        else if (choice == 2) {                                                                                                  
          StartrichtungEN.start();    
        } 
        else {
          start(); 
        }  
      }
    }
  }

}
