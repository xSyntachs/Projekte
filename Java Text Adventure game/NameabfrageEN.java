public class NameabfrageEN {
  
  public static void start() {
  
    ClearEN.clear();
    System.out.println("\n-------------------------------------------");
    System.out.println("\nOnce upon a time, there was a powerful King\nwho lived in his castle in the village.");
    System.out.println("\nOne day, he suddenly heard screams and saw \navicious goblin killing his knights.\nA powerful Wizard had joined forces with the\ngoblin and together they set the village in fear\nand terror. The wizard had enchanted all the\nvillagers to serve him.The king was beside\nhimself with rage and horrified.");
    System.out.println("\nHe left the castle through a secret passage\nand was never seen again... It is your\ntask to defeat the evil and rescue the king.");
    System.out.println("\nYou set off on a journey to find the Wizard\nand goblin and fight against them. Along\nthe way, you will encounter many difficulties\nand dangers. Will you be able to defeat the \nwizard and goblin and break the curse on \nthe village?");
    System.out.println("\n         Whats your name Hero?");
    System.out.println("\n-------------------------------------------");
    System.out.print("\nYour name: ");
    String Playername = ScannerEN.nextline();
    if (Playername.isEmpty()) {
      start();
    }
    else {
      VarsEN.Playername = Playername; 
    }
    
    
    
  }
}
