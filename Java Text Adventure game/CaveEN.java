public class CaveEN {
  
  public static void start() {

    if (VarsEN.Cavein == true) {
      incave();
    }
    else {
      ClearEN.clear();
      if (VarsEN.Torch == false) {
        System.out.println("\n-------------------------------------------");
        System.out.println("\nYou are headed east and will come across a cave.");
        System.out.println("\nYou: It is too dark to go into the cave.");
        System.out.println("Maybe I can find a torch that can help me.");
        System.out.println("\nYou are going back to your house");
        System.out.print("-------------------------------------------");
        ScannerEN.nextline();
        DiebEN.CaveDieb();
        StartrichtungEN.start();
      } 
      else {
        ClearEN.clear();
        System.out.println("\n-------------------------------------------");
        System.out.println("\nYou are headed east and will come across a cave.");
        System.out.println("\nYou: It's dark here... Luckily, I have a torch.");
        System.out.println("-------------------------------------------");
        ScannerEN.nextline();
        incave();
      }
    }       
  }
  public static void incave() {
    VarsEN.Cavein = true;
    if (VarsEN.Spinne1Used == false) {
      Monster.Monster(RandomEN.nextInt(4, 5), 20, "SpiderLeg", "SpiderEye",VarsEN.SpiderLeg, VarsEN.SpiderEye, RandomEN.nextInt(6, 9), "Spinne1Used", VarsEN.Spinne1Used, "Spider", CaveEN::start, StartrichtungEN::start, true, true, "true", true);   
    }
    ClearEN.clear();
    System.out.println("\n-------------------------------------------");
    System.out.println("\nYou are in the cave. Where do you want to go?");
    System.out.println("\n[1] Mine");
    System.out.println("[2] Back to your House");
    System.out.println("\n-------------------------------------------");
    System.out.print("choice: ");
    int choice = ScannerEN.NoSkipScanner(CaveEN::incave, "1|2"); 
    ClearEN.clear();
    if (choice == 1) {
      MineEN.start();
    }
    if (choice == 2) {
      DiebEN.CaveDieb();
      StartrichtungEN.start();
    }
    else {
      incave();
    } 
  }
   
}
