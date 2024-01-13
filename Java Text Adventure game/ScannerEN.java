import java.util.Scanner;

public class ScannerEN {
  
  private static Runnable ScannerMethode;
  private static String ScannerAnzahl;
  
  public static double convertToDouble(String str){
    double val = 0;
    try {
      val = Double.parseDouble(str);
    }
    catch (NumberFormatException e) {
    }
    return val;
  } 
  public static int NoSkipScanner(Runnable Methode, String Anzahl) {
  
    ScannerMethode = Methode; 
    ScannerAnzahl = Anzahl;
    
    Scanner sc = new Scanner(System.in);
    String input = "";
    double ret = 0;
    boolean hold = true;
    while(hold==true){
      input = sc.nextLine();
      if(input.matches("\\d+")){
        if (!input.matches("")) {
          if (input.matches(ScannerAnzahl)) {
            ret = convertToDouble(input);
            hold=false;
          }
          else {
            ScannerMethode.run();
          }
          
        }
        
      }
      else {
        ScannerMethode.run();
      } 
    }
    return (int) ret;
  } 
  
  public static String NoSkipScannerString(Runnable Methode) {
  
    ScannerMethode = Methode; 
    
    Scanner sc = new Scanner(System.in);
    String input = "";
    boolean hold = true;
    while(hold==true){
      input = sc.nextLine().toLowerCase();
      if (!input.matches("")) {
        hold=false;
      }
      else {
        ScannerMethode.run();
      } 
    }
    return input;
  } 
  public static String nextline() {
    Scanner sc = new Scanner(System.in);
    String input;                 
    input = sc.nextLine();
    return input;   
  }
  public static String nextLineLow() {
    Scanner sc = new Scanner(System.in);
    String input;                 
    input = sc.nextLine().toLowerCase();
    return input;    
  }     
  
}
