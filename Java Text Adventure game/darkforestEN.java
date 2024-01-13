public class darkforestEN {
  
  public static void start() {
    ClearEN.clear();
    System.out.println("-------------------------------------------");
    System.out.println("\nYou are in the lost forest. \nFind the right way, otherwise you won't get out");
    System.out.println("\n[1] Go in");
    System.out.println("\n[2] Leave the place"); 
    System.out.println("-------------------------------------------");
    System.out.print("answer: ");  
    int choice = ScannerEN.NoSkipScanner(darkforestEN::start, "1|2");
    if (choice == 1) {
      step1();
    } 
    else if (choice == 2) {                                                                                                  
      StartrichtungEN.start();    
    } 
  }
  
  public static void step1() {
    ClearEN.clear();
    System.out.println("-------------------------------------------");
    System.out.println("\nYou are at the beginning of the labyrinth.\nIn which direction do you want to go?");
    System.out.println("\n[1] Left");
    System.out.println("\n[2] Right"); 
    System.out.println("-------------------------------------------");
    System.out.print("answer: ");  
    int choice = ScannerEN.NoSkipScanner(darkforestEN::step1, "1|2");
    if (choice == 1) {
      step2();
    } 
    else if (choice == 2) {                                                                                                  
      step1();    
    } 
  }
  
  public static void step2() {
    ClearEN.clear();
    System.out.println("-------------------------------------------");
    System.out.println("\nCorrect! In which direction do you want to go?");
    System.out.println("\n[1] Left");
    System.out.println("\n[2] Right"); 
    System.out.println("-------------------------------------------");
    System.out.print("answer: ");  
    int choice = ScannerEN.NoSkipScanner(darkforestEN::step2, "1|2");
    if (choice == 1) {
      step3();
    } 
    else if (choice == 2) {                                                                                                  
      step1();    
    } 
  }
  
  public static void step3() {
    ClearEN.clear();
    System.out.println("-------------------------------------------");
    System.out.println("\nCorrect! In which direction do you want to go?");
    System.out.println("\n[1] Left");
    System.out.println("\n[2] Right"); 
    System.out.println("-------------------------------------------");
    System.out.print("answer: ");  
    int choice = ScannerEN.NoSkipScanner(darkforestEN::step3, "1|2");
    if (choice == 1) {
      step1();
    } 
    else if (choice == 2) {                                                                                                  
      step4();    
    } 
  }
  
  public static void step4() {
    ClearEN.clear();
    System.out.println("-------------------------------------------");
    System.out.println("\nCorrect! In which direction do you want to go?");
    System.out.println("\n[1] Left");
    System.out.println("\n[2] Right"); 
    System.out.println("-------------------------------------------");
    System.out.print("answer: ");  
    int choice = ScannerEN.NoSkipScanner(darkforestEN::step4, "1|2");
    if (choice == 1) {
      step5();
    } 
    else if (choice == 2) {                                                                                                  
      step1();    
    } 
  }
  
  public static void step5() {
    ClearEN.clear();
    System.out.println("-------------------------------------------");
    System.out.println("\nCorrect! In which direction do you want to go?");
    System.out.println("\n[1] Left");
    System.out.println("\n[2] Right");
    System.out.println("\n[3] Straight"); 
    System.out.println("-------------------------------------------");
    System.out.print("answer: ");  
    int choice = ScannerEN.NoSkipScanner(darkforestEN::step5, "1|2|3");
    if (choice == 1) {
      step1();
    } 
    else if (choice == 2) {                                                                                                  
      step1();    
    } 
    else if (choice == 3) {                                                                                                  
      stepfinish();    
    }  
  }
  public static void stepfinish() {
    ClearEN.clear();
    System.out.println("-------------------------------------------");
    System.out.println("\nYou managed it. You see the sword of light.");
    System.out.println("\n[1] Take it");
    if (VarsEN.SwordOflight == "None") {
      System.out.println("\n[2] Leave the place witout the sword of light.");
    }
    else {
      System.out.println("\n[2] Leave the place with the sword of light.");
    }
    System.out.println("-------------------------------------------");
    System.out.print("answer: ");  
    int choice = ScannerEN.NoSkipScanner(darkforestEN::stepfinish, "1|2|3");
    if (choice == 1) {
      VarsEN.SwordOflight = "Owned";
      VarsEN.playerdamage = 8;
      VarsEN.playerweapon = "Sword of light";
      stepfinish();
    } 
    else if (choice == 2) {                                                                                                  
      StartrichtungEN.start();   
    } 
  }
  
}
