public class FeeraumEN {
  
  public static void start() {
    
    VarsEN.FeeplayerHP = VarsEN.playerHP;
    if (VarsEN.Feeused == false) {
      while (true) {
        if (VarsEN.playerHP != VarsEN.maxplayerHP) {
          ClearEN.clear();
             
          for (int x=0;VarsEN.FeeplayerHP < VarsEN.maxplayerHP;x++ ) {
            VarsEN.FeeplayerHP++;
            VarsEN.playerHPFeeHeald++;
          }
          System.out.println("-------------------------------------------");
          System.out.println("\nYou are headed north and will come across a \nriver where a fairy resides.");
          System.out.println("\nFairy: Hello I am a fairy. I see you have " + VarsEN.playerHP + "/" + VarsEN.maxplayerHP + " HP \nFairy: I can give you " + VarsEN.playerHPFeeHeald  + " HP.");
          System.out.println("\nDo you want to take them? (yes/no)");
          System.out.println("\nAttention, use this wisely, you still need the 100 hp");
          System.out.println("-------------------------------------------");
          System.out.print("\nanswer: ");
          String choice = ScannerEN.nextLineLow();
          
          if (choice.equalsIgnoreCase("yes")) {
            ClearEN.clear();
            VarsEN.playerHP = VarsEN.maxplayerHP;
            VarsEN.Feeused = true;
            System.out.println("-------------------------------------------");
            System.out.println("\nYou take the heal from the fairy");
            System.out.println("You now have " + VarsEN.playerHP + "/" + VarsEN.maxplayerHP + " HP.");
            System.out.println("\n\nYou are going back to your house");
            System.out.print("-------------------------------------------");
            ScannerEN.nextline();
            DiebEN.FeeraumDieb();
            StartrichtungEN.start();
            
          } 
          if (choice.equalsIgnoreCase("no")) {
            ClearEN.clear();
            System.out.println("-------------------------------------------");
            System.out.println("\nYou chose not to take the HP. \nYour current HP is " + VarsEN.playerHP + "/" + VarsEN.maxplayerHP);
            System.out.println("\n\nYou are going back to your house");
            System.out.print("-------------------------------------------");
            ScannerEN.nextline();
            DiebEN.FeeraumDieb();
            StartrichtungEN.start();
            
          }
          else {
          }
        }  
        else {
          ClearEN.clear();
          System.out.println("-------------------------------------------");
          System.out.println("\nYou are headed north and will come across a \nriver where a fairy resides.");
          System.out.println("\nFairy: Hello I am a fairy. I see you have 100/100 HP\nCome back if you need heal.");
          System.out.println("\n\nYou are going back to your house");
          System.out.print("-------------------------------------------");
          String choice = ScannerEN.nextLineLow();
          DiebEN.FeeraumDieb();
          StartrichtungEN.start();    
        }  
      
      }
      
    }
    else {
      ClearEN.clear();
      System.out.println("-------------------------------------------");
      System.out.println("\nYou are headed north and will come across a river");
      System.out.println("\nYou: A beautiful river and it's so calm");
      System.out.println("\n\nYou are going back to your house");
      System.out.print("-------------------------------------------");
      ScannerEN.nextline();
      DiebEN.FeeraumDieb();
      ClearEN.clear();
      StartrichtungEN.start();
    } 
  }
}
