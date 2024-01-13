public class InventarEN {
  
  public static void start() {

    ClearEN.clear();
    System.out.println("-------------------------------------------");
    System.out.println("\n          Realm of the Lost King");
    System.out.println("\n     Hello " + VarsEN.Playername + " here is your Inventory");
    System.out.println("\nYour stats:");
    System.out.println("\nHP             -> [" + VarsEN.playerHP + "/" + VarsEN.maxplayerHP + "]");
    System.out.println("Armor          -> [" + VarsEN.playerarmor + "/" + VarsEN.maxplayerarmor + "] (reduces enemy damage)");
    System.out.println("\nYour inventory:");
    System.out.println("\nGold           -> [" + VarsEN.Gold + "]");
    if (VarsEN.Food != 0) {
      System.out.println("Food           -> [" + VarsEN.Food + "]");
    }
    if (VarsEN.SpiderLeg != 0) {
      System.out.println("Spider-leg     -> [" + VarsEN.SpiderLeg + "]");
    }
    if (VarsEN.SpiderEye != 0) {
      System.out.println("Spider-eye     -> [" + VarsEN.SpiderEye + "]");
    }
    if (VarsEN.Coal != 0) {
      System.out.println("Coal           -> [" + VarsEN.Coal + "]");
    }
    if (VarsEN.Iron != 0) {
      System.out.println("Iron           -> [" + VarsEN.Iron + "]");
    }
    if (VarsEN.Steel != 0) {
      System.out.println("Steel          -> [" + VarsEN.Steel + "]");
    }
    if (VarsEN.Pickaxe != false) {   
      System.out.println("Pickaxe        -> [Owned]");
    }
    if (VarsEN.magichat != 0) {     
      System.out.println("Magic-hat      -> [" + VarsEN.magichat + "]");
    }
    if (VarsEN.SwordOflight != "None") {
      System.out.println("Sword-of-light -> [" + VarsEN.SwordOflight + "]");
    }
    if (VarsEN.Torch == true) {
      System.out.println("Torch          -> [Owned]");
    }
    if (VarsEN.Goblinkey != 0) {
      System.out.println("Goblin-key     -> [" + VarsEN.Goblinkey + "]");
    }
    if (VarsEN.playerRevive == true) {
      System.out.println("Revive Totem   -> [Owned]");
    }
    if (VarsEN.invisibility == true) {
      System.out.println("Invis potion   -> [Owned]");
    }
    if (VarsEN.jumpboost == true) {
      System.out.println("Jump potion    -> [Owned]");
    }
    System.out.println("Weapon         -> [" + VarsEN.playerweapon + "]");
    System.out.println("\nYour abillitys:");
    System.out.println("\nPowerup   -> [" + VarsEN.playerpowerups + "]");
    System.out.print("\n-------------------------------------------");
    ScannerEN.nextline();
    StartrichtungEN.start();       
  }
  
  public static void StartrichtungEN() {

    
    ClearEN.clear();
    System.out.println("-------------------------------------------");
    System.out.println("\n          Realm of the Lost King");
    System.out.println("\n     Hello " + VarsEN.Playername + " here is your Inventory");
    System.out.println("\nYour stats:");
    System.out.println("\nHP             -> [" + VarsEN.playerHP + "/" + VarsEN.maxplayerHP + "]");
    System.out.println("Armor          -> [" + VarsEN.playerarmor + "/" + VarsEN.maxplayerarmor + "] (reduces enemy damage)");
    System.out.println("\nYour inventory:");
    System.out.println("\nGold           -> [" + VarsEN.Gold + "]");
    if (VarsEN.Food != 0) {
      System.out.println("Food           -> [" + VarsEN.Food + "]");
    }
    if (VarsEN.SpiderLeg != 0) {
      System.out.println("Spider-leg     -> [" + VarsEN.SpiderLeg + "]");
    }
    if (VarsEN.SpiderEye != 0) {
      System.out.println("Spider-eye     -> [" + VarsEN.SpiderEye + "]");
    }
    if (VarsEN.Coal != 0) {
      System.out.println("Coal           -> [" + VarsEN.Coal + "]");
    }
    if (VarsEN.Iron != 0) {
      System.out.println("Iron           -> [" + VarsEN.Iron + "]");
    }
    if (VarsEN.Steel != 0) {
      System.out.println("Steel          -> [" + VarsEN.Steel + "]");
    }
    if (VarsEN.Pickaxe != false) {   
      System.out.println("Pickaxe        -> [Owned]");
    }
    if (VarsEN.magichat != 0) {     
      System.out.println("Magic-hat      -> [" + VarsEN.magichat + "]");
    }
    if (VarsEN.SwordOflight != "None") {
      System.out.println("Sword-of-light -> [" + VarsEN.SwordOflight + "]");
    }
    if (VarsEN.Torch == true) {
      System.out.println("Torch          -> [Owned]");
    }
    if (VarsEN.Goblinkey != 0) {
      System.out.println("Goblin-key     -> [" + VarsEN.Goblinkey + "]");
    }
    if (VarsEN.playerRevive == true) {
      System.out.println("Revive Totem   -> [Owned]");
    }
    if (VarsEN.invisibility == true) {
      System.out.println("Invis potion   -> [Owned]");
    }
    if (VarsEN.jumpboost == true) {
      System.out.println("Jump potion    -> [Owned]");
    }
    System.out.println("Weapon         -> [" + VarsEN.playerweapon + "]");
    System.out.println("\nYour abillitys:");
    System.out.println("\nPowerup   -> [" + VarsEN.playerpowerups + "]");
    System.out.print("\n-------------------------------------------");
    ScannerEN.nextline();
    StartrichtungEN.start();        
  }
      
}
