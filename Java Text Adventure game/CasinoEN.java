public class CasinoEN {
  
  private static boolean firsttime = false;
  
  public static void start() {
    ClearEN.clear();
    if (firsttime == false) {
      System.out.println("-------------------------------------------");
      System.out.println("\nWorker: You want to lose your money or double it?");
      System.out.println("\nYou: Yes, that's what I'm here for");
      System.out.println("\nWorker: Okay then press enter and you're good to go");
      System.out.print("\n-------------------------------------------");
      firsttime = true;
      ScannerEN.nextline();
    }
    ClearEN.clear();
    System.out.println("-------------------------------------------");
    System.out.println("                  Casino");
    System.out.println("\n[1] Coin flip (Double or lose your gold)");
    System.out.println("\n[2] Leave the place");
    System.out.println("\nYou currently have " + VarsEN.Gold + " Gold");
    System.out.println("-------------------------------------------");
    System.out.print("\nanswer: "); 
    int choice = ScannerEN.NoSkipScanner(CasinoEN::start, "1|2");
    if (choice == 1) {
      if (VarsEN.Gold > 0) {
        int FlipChance = RandomEN.nextInt(1, 3); 
        if (FlipChance == 1) {
          ClearEN.clear();
          VarsEN.Gold = VarsEN.Gold+VarsEN.Gold;  
          System.out.println("-------------------------------------------");
          System.out.println("\nYou have won and doubled your gold\nNew Balance -> " + VarsEN.Gold);
          System.out.print("\n-------------------------------------------");
          ScannerEN.nextline();
          start();   
        }
        if (FlipChance == 2) {
          ClearEN.clear();
          System.out.println("-------------------------------------------");
          System.out.println("\nThe coin fell on the funds. No loss No gain");
          System.out.print("\n-------------------------------------------");
          ScannerEN.nextline();
          start();   
        }
        if (FlipChance == 3) {
          ClearEN.clear();
          VarsEN.Gold = 0;  
          System.out.println("-------------------------------------------");
          System.out.println("\nYou lost \nNew Balance -> " + VarsEN.Gold);
          System.out.print("\n-------------------------------------------");
          ScannerEN.nextline();
          start();
        }
        else {
          start();    
        }
      }
      else {
        ClearEN.clear();
        System.out.println("-------------------------------------------");
        System.out.println("\nYou don't have enough gold to play coin flip");
        System.out.print("\n-------------------------------------------");
        ScannerEN.nextline();
        start();
      } 
    }
    else if (choice == 2) {
      marktEN.start();   
    }
    else {
      start();  
    }
  }
} 
