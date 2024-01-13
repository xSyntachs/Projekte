public class DiebEN {

  public static void FeeraumDieb() {
    
    if (RandomEN.nextInt(1, 9) == 1) {
      if (VarsEN.Gold > 1) {
        if (VarsEN.DiebFeeraum == false) {
          ClearEN.clear();
          int Amount = RandomEN.nextInt(1, 2);  
          System.out.println("-------------------------------------------");
          System.out.println("\nThere came a thief from behind!");
          System.out.println("He stole you " + Amount + " Gold");
          VarsEN.Gold = VarsEN.Gold-Amount;
          System.out.println("\n\nNew Balance: " + VarsEN.Gold + " Gold");
          System.out.print("-------------------------------------------");
          VarsEN.DiebFeeraum = true;
          ScannerEN.nextline();
        }
      } 
    }
  }
  
  public static void CaveDieb() {

    if (RandomEN.nextInt(1, 5) == 1) {
      if (VarsEN.Gold > 1) {
        if (VarsEN.DiebCave == false) {
          ClearEN.clear();
          int Amount = RandomEN.nextInt(1, 2);    
          System.out.println("-------------------------------------------");
          System.out.println("\nThere came a thief from behind!");
          System.out.println("He stole you " + Amount + " Gold");
          VarsEN.Gold = VarsEN.Gold-Amount;
          System.out.println("\n\nNew Balance: " + VarsEN.Gold + " Gold");
          System.out.print("-------------------------------------------");
          VarsEN.DiebCave = true;
          ScannerEN.nextline();
        }
      } 
    }
  }
  public static void MarktDieb() {

    if (RandomEN.nextInt(1, 5) == 1) {
      if (VarsEN.Gold > 1) {
        if (VarsEN.DiebMark == false) {
          ClearEN.clear();
          int Amount = RandomEN.nextInt(1, 2);    
          System.out.println("-------------------------------------------");
          System.out.println("\nThere came a thief from behind!");
          System.out.println("He stole you " + Amount + " Gold");
          VarsEN.Gold = VarsEN.Gold-Amount;
          System.out.println("\n\nNew Balance: " + VarsEN.Gold + " Gold");
          System.out.print("-------------------------------------------");
          VarsEN.DiebMark = true;
          ScannerEN.nextline();
        }
      } 
    }
  } 
  public static void onMarktDieb() {

    if (RandomEN.nextInt(1, 5) == 1) {
      if (VarsEN.Gold > 1) {
        if (VarsEN.onMarktDieb == false) {
          ClearEN.clear();
          int Amount = RandomEN.nextInt(1, 2);    
          System.out.println("-------------------------------------------");
          System.out.println("\nThere came a thief from behind!");
          System.out.println("He stole you " + Amount + " Gold");
          VarsEN.Gold = VarsEN.Gold-Amount;
          System.out.println("\n\nNew Balance: " + VarsEN.Gold + " Gold");
          System.out.print("-------------------------------------------");
          VarsEN.onMarktDieb = true;
          ScannerEN.nextline();
        }
      } 
    }
  }
}
