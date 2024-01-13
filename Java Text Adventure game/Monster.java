import java.util.Random;
import java.util.Scanner;
import java.lang.reflect.Field;

public class Monster {
  
  static Random rm = new Random();
  static Scanner sc = new Scanner(System.in);
  private static int MonsterDamage;
  private static int MonsterLife;
  private static int input;
  private static String MonsterDrop;
  private static String MonsterDrop1;
  private static String MonsterDrop2;
  private static int MonsterDropVar1;
  private static int MonsterDropVar2;
  
  public static boolean UsedVar = false;
  private static String Used;
  
  public static boolean MonsterUsedVar = false;
  private static String MonsterUsed;
  
  private static String MonsterArt;
  private static int MonsterGolddrop = 0;
  private static boolean Fight;
  private static Runnable MonsterMethode1;
  private static Runnable MonsterMethode2;
  private static boolean ActiveFight;
  private static boolean lifereset = true;
  private static boolean Monsterdrop2;
  private static boolean Monsterbothdrop;
  private static String Monsterstarttext;
  private static boolean Monstersavedrop;
  
  

                                                                  
  public static void Monster(int Damage, int Life, String Drop1, String Drop2, int DropVar1, int DropVar2, int Golddrop, String Used, boolean UsedVar, String Art, Runnable Methode1, Runnable Methode2, boolean drop2, boolean bothdrop, String starttext, boolean savedrop) { 
    
    
    if (lifereset == true) {
      //lifereset = false;
      MonsterLife = Life;
    }
    if (VarsEN.SwordOflight == "Owned") {
      VarsEN.playerdamage = 9;
    }
    MonsterUsedVar = UsedVar;
    MonsterUsed = Used;
    
    Monstersavedrop = savedrop;
    Monsterstarttext = starttext;
    MonsterDamage = Damage;
    MonsterDrop1 = Drop1;
    MonsterDrop2 = Drop2;
    MonsterDropVar1 = DropVar1;
    MonsterDropVar2 = DropVar2;
    Monsterdrop2 = drop2;
    MonsterGolddrop = Golddrop;
    Monsterbothdrop = bothdrop;
    MonsterArt = Art;
    MonsterMethode1 = Methode1;
    MonsterMethode2 = Methode2;
  
    if (MonsterUsedVar == false) {
      fightstart();
    }
    MonsterMethode1.run();
  }
  public static void fightstart() {
    ClearEN.clear();
    System.out.println("\n------------------------------------------------------------------\n");
    if (Monsterstarttext != "None") {
      System.out.println("You fight the " + MonsterArt);
    }
    else {
      System.out.println("You see a " + MonsterArt + " that wants to attack you!");  
    }
    System.out.println("\nYour Weapon: " + VarsEN.playerweapon + " (" + VarsEN.playerdamage + " Damage)");
    System.out.println("Your HP: "+ VarsEN.playerHP);
    System.out.println(MonsterArt + " HP: " + MonsterLife);
    System.out.println("\n1: Start a Fight");
    System.out.println("2: Run away");
    System.out.println("\nAttention, if you leave the fight, your opponent will be fully\nrecovered again in the next fight");
    System.out.println("------------------------------------------------------------------"); 
    System.out.print("\nchoice: ");
    input = ScannerEN.NoSkipScanner(Monster::fightstart, "1|2");
    if (input == 1) {
      attack(); 
    } 
    if (input == 2) {
      ActiveFight = false;
      MonsterMethode2.run();
    }
  }
  public static void attack() {
    ClearEN.clear();
    System.out.println("\n------------------------------------------------------------------\n");
    System.out.println("You fight a " + MonsterArt);
    System.out.println("\nYour HP: "+ VarsEN.playerHP);
    System.out.println(MonsterArt + " HP: " + MonsterLife);
    System.out.println("\n1: Fight");
    System.out.println("2: Run away");
    System.out.println("\nAttention, if you leave the fight, your opponent will be fully\nrecovered again in the next fight");
    System.out.println("------------------------------------------------------------------\n");
    System.out.print("Choice: ");
    input = ScannerEN.NoSkipScanner(Monster::attack, "1|2");
    if (input == 1) {
      if (VarsEN.playerarmor > 0) {
        if (VarsEN.playerarmor > 80) {
          VarsEN.playerHP -= MonsterDamage-4;
        } else if (VarsEN.playerarmor >= 40) {
          VarsEN.playerHP -= MonsterDamage-2;
        } else if (VarsEN.playerarmor < 50) {
          VarsEN.playerHP -= MonsterDamage;
        }
      }
      else {
        VarsEN.playerHP -= MonsterDamage;
      }
      VarsEN.FeeplayerHP = VarsEN.playerHP;
      MonsterLife -= VarsEN.playerdamage;
      if (MonsterLife <= 0) {
        monsterdeath();
      }
      if (VarsEN.playerHP <= 0) {
        playerdeath();
      }
      attack();
    }
    if (input == 2) {
      ActiveFight = false;
      MonsterMethode2.run();       
    }   
  } 
   
  public static void playerdeath() {
    ClearEN.clear();
    if (VarsEN.playerRevive == true) {
      System.out.println("-------------------------------------------");
      System.out.println("\nThe " + MonsterArt + " killed you. However, \nyou were revived and taken to your home");
      System.out.print("\n-------------------------------------------");
      VarsEN.playerRevive = false;
      VarsEN.playerHP = 100;
      ScannerEN.nextline();   
      StartrichtungEN.start();    
    }    
    else { 
      System.out.println("\n------------------------------------------------------------------\n");
      System.out.println("The " + MonsterArt + " killed you");
      System.out.println("\nYour HP: 0");
      System.out.println(MonsterArt + " HP: " + MonsterLife);
      System.out.println("\nGame Over");
      System.out.println("\n------------------------------------------------------------------\n");
      System.exit(0);
     }
  }
  public static void monsterdeath() {
    if (Monstersavedrop == false) {
      
      int drop = RandomEN.nextInt(1, 3);
      if (drop == 1) { 
        if (MonsterDrop1 == "nothing") {
          MonsterDrop = "The " + MonsterArt + " did not drop any item";  
        }
        else {
          MonsterDrop = "The " + MonsterArt + " dropped one " + MonsterDrop1;  
        }
        try {
          Field field = VarsEN.class.getField(MonsterDrop1);
          field.set(null, MonsterDropVar1=MonsterDropVar1+1);
        } catch (NoSuchFieldException | IllegalAccessException e) {     
          e.printStackTrace();
        }
      }
      if (drop == 2) {
        if (Monsterdrop2 == true) { 
          if (MonsterDrop1 == "nothing") {
            MonsterDrop = "The " + MonsterArt + " did not drop any item";  
          }
          else {
            MonsterDrop = "The " + MonsterArt + " dropped one " + MonsterDrop1;  
          }
          try {
            Field field = VarsEN.class.getField(MonsterDrop2);
            field.set(null, MonsterDropVar2=MonsterDropVar2+1);
          } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
          }
        }
        else {
          if (MonsterDrop1 == "nothing") {
            MonsterDrop = "The " + MonsterArt + " did not drop any item";  
          }
          else {
            MonsterDrop = "The " + MonsterArt + " dropped one " + MonsterDrop1;  
          }
          try {
            Field field = VarsEN.class.getField(MonsterDrop1);
            field.set(null, MonsterDropVar1=MonsterDropVar1+1);
          } catch (NoSuchFieldException | IllegalAccessException e) {     
            e.printStackTrace();
          }
        }    
       
      }
      if (drop == 3) {
        if (Monsterbothdrop == true) { 
          MonsterDrop = "The " + MonsterArt + " dropped one " + MonsterDrop1 + " and one " + MonsterDrop2;
          try {
            Field field = VarsEN.class.getField(MonsterDrop1);
            field.set(null, MonsterDropVar1=MonsterDropVar1+1);
          } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
          }
          try {
            Field field = VarsEN.class.getField(MonsterDrop2);
            field.set(null, MonsterDropVar2=MonsterDropVar2+1);
          } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
          }
        }
        else {
          if (MonsterDrop1 == "nothing") {
            MonsterDrop = "The " + MonsterArt + " did not drop any item";  
          }
          else {
            MonsterDrop = "The " + MonsterArt + " dropped one " + MonsterDrop1; 
          }
          try {
            Field field = VarsEN.class.getField(MonsterDrop1);
            field.set(null, MonsterDropVar1=MonsterDropVar1+1);
          } catch (NoSuchFieldException | IllegalAccessException e) {     
            e.printStackTrace();
          }
        }
      }
    }
    
    
    else {
      int drop = 3;
      if (drop == 1) { 
        if (MonsterDrop1 == "nothing") {
          MonsterDrop = "The " + MonsterArt + " did not drop any item";  
        }
        else {
          MonsterDrop = "The " + MonsterArt + " dropped one " + MonsterDrop1;  
        }
        try {
          Field field = VarsEN.class.getField(MonsterDrop1);
          field.set(null, MonsterDropVar1=MonsterDropVar1+1);
        } catch (NoSuchFieldException | IllegalAccessException e) {     
          e.printStackTrace();
        }
      }
      if (drop == 2) {
        if (Monsterdrop2 == true) { 
          if (MonsterDrop1 == "nothing") {
            MonsterDrop = "The " + MonsterArt + " did not drop any item";  
          }
          else {
            MonsterDrop = "The " + MonsterArt + " dropped one " + MonsterDrop1;  
          }
          try {
            Field field = VarsEN.class.getField(MonsterDrop2);
            field.set(null, MonsterDropVar2=MonsterDropVar2+1);
          } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
          }
        }
        else {
          if (MonsterDrop1 == "nothing") {
            MonsterDrop = "The " + MonsterArt + " did not drop any item";  
          }
          else {
            MonsterDrop = "The " + MonsterArt + " dropped one " + MonsterDrop1;  
          }
          try {
            Field field = VarsEN.class.getField(MonsterDrop1);
            field.set(null, MonsterDropVar1=MonsterDropVar1+1);
          } catch (NoSuchFieldException | IllegalAccessException e) {     
            e.printStackTrace();
          }
        }    
       
      }
      if (drop == 3) {
        if (Monsterbothdrop == true) { 
          MonsterDrop = "The " + MonsterArt + " dropped one " + MonsterDrop1 + " and one " + MonsterDrop2;
          try {
            Field field = VarsEN.class.getField(MonsterDrop1);
            field.set(null, MonsterDropVar1=MonsterDropVar1+1);
          } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
          }
          try {
            Field field = VarsEN.class.getField(MonsterDrop2);
            field.set(null, MonsterDropVar2=MonsterDropVar2+1);
          } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
          }
        }
        else {
          if (MonsterDrop1 == "nothing") {
            MonsterDrop = "The " + MonsterArt + " did not drop any item";  
          }
          else {
            MonsterDrop = "The " + MonsterArt + " dropped one " + MonsterDrop1; 
          }
          try {
            Field field = VarsEN.class.getField(MonsterDrop1);
            field.set(null, MonsterDropVar1=MonsterDropVar1+1);
          } catch (NoSuchFieldException | IllegalAccessException e) {     
            e.printStackTrace();
          }
        }
      } 
    }
    
    
    
    ClearEN.clear();
    if (VarsEN.playerHP <= 0) {
      VarsEN.playerHP = 1;
    }
    System.out.println("\n------------------------------------------------------------------\n");
    System.out.println("You killed the " + MonsterArt + "!");
    if (MonsterDrop != null) {
      System.out.println(MonsterDrop);
    }
    if (MonsterGolddrop > 0) {
      System.out.println("The " + MonsterArt + " drops " + MonsterGolddrop + " Gold.");
      VarsEN.Gold=VarsEN.Gold+MonsterGolddrop;
    }
    System.out.println("\nYour HP: "+ VarsEN.playerHP);
    System.out.println(MonsterArt + " HP: 0");
    System.out.print("\n------------------------------------------------------------------");
    try {
      Field field = VarsEN.class.getField(MonsterUsed);
      field.set(null, true);
    } catch (NoSuchFieldException | IllegalAccessException e) {
      e.printStackTrace();
    }
    sc.nextLine();
    VarsEN.FeeplayerHP = VarsEN.playerHP;
    MonsterMethode1.run(); 
  }
}  
