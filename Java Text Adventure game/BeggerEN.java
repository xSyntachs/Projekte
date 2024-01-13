public class BeggerEN {
  
  public static void start() {
  
    ClearEN.clear();
    System.out.println("-------------------------------------------");
    if (VarsEN.Beggerfirstcontact == false) {
      System.out.println("\nYou see a Begger. \nHe is showing a sign in your direction");
    }
    else {
      System.out.println("You are with the beggar");  
    }
    VarsEN.Beggerfirstcontact = true;
    System.out.println("\n[1] Talk to him");
    System.out.println("\n[2] Fight with him");
    System.out.println("\n[3] Donate gold");
    System.out.println("\n[4] Rob him");
    System.out.println("\n[5] Leave the place");
    System.out.println("-------------------------------------------");
    System.out.print("\nanswer: ");
    int choice = ScannerEN.NoSkipScanner(BeggerEN::start, "1|2|3|4|5");
    if (choice == 1) {
      if (VarsEN.dooractiv == false) {
        
        ClearEN.clear();
        System.out.println("-------------------------------------------");
        System.out.println("\nYou: How is it on the streets?");
        System.out.println("\nBegger: It's very bad here since the king dissapeared.\nI really hope he will come back to help us.");
        System.out.println("\nYou: Where can i find the King?");
        System.out.println("\nBegger: The King? no idea. I wish i knew myself.");
        System.out.println("\nYou: okay thanks man");
        System.out.print("-------------------------------------------");
        ScannerEN.nextline();
        start();
      }
      else {
        ClearEN.clear();
        System.out.println("-------------------------------------------");
        System.out.println("\nYou: How is it on the streets?");
        System.out.println("\nBegger: It's very bad here since the king dissapeared.\nI really hope he will come back to help us.");
        System.out.println("\nYou: Where can i find the Goblin?");
        System.out.println("\nBegger: The Goblin? no idea. I wish i knew myself.");
        System.out.println("\nYou: okay thanks man");
        System.out.print("-------------------------------------------");
        ScannerEN.nextline();  
      }
    }
    else if (choice == 2) {
      Monster.Monster(RandomEN.nextInt(2, 3), 15, "nothing", "",VarsEN.nothing, VarsEN.nothing, RandomEN.nextInt(5, 7), "Begger1Used", VarsEN.Begger1Used, "Begger", marktEN::start, marktEN::start, false, false, "true", false);   
    }
    else if (choice == 3) {
      if (VarsEN.Gold > 0) {
        ClearEN.clear();
        VarsEN.Gold--;
        System.out.println("-------------------------------------------");
        System.out.println("\nYou donate 1 Gold to the Begger");
        System.out.print("\n-------------------------------------------");
        ScannerEN.nextline(); 
        start();
      }
      else {
        ClearEN.clear();
        System.out.println("-------------------------------------------");
        System.out.println("\nYou don't have enough gold to donate");
        System.out.print("\n-------------------------------------------");
        ScannerEN.nextline(); 
        start();   
      }
    }
    else if (choice == 4) {
      ClearEN.clear(); 
      int get = RandomEN.nextInt(4, 6);
      VarsEN.Gold = VarsEN.Gold+get;
      VarsEN.Begger1Used = true;      
      System.out.println("-------------------------------------------");
      System.out.println("\nYou robbed the poor beggar. \nWhen he tried to stop you, you killed him\nYou got " + get + " gold");
      System.out.print("\n-------------------------------------------");
      ScannerEN.nextline(); 
      marktEN.start();  
    }
    else if (choice == 5) {
      marktEN.start();  
    }
    else {
      start();
    }
  }
}

