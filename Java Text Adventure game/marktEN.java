
public class marktEN {
  
  public static void start() {
    DiebEN.onMarktDieb();
    VarsEN.FeeplayerHP = VarsEN.playerHP;
    if (VarsEN.dooractiv == false) {
      
      ClearEN.clear();
      System.out.println("-------------------------------------------");
      if (VarsEN.firstmarkt == false) {
        System.out.println("\nYou walk around the castle and go to the market square.\n\nWhere do you want to go?");
        VarsEN.firstmarkt = true;
      }
      else {
        System.out.println("\nYou are at the market square. \n\nWhere do you want to go?");  
      }
      if (VarsEN.Begger1Used == false) {
        System.out.println("\n[1] Go to the Merchant");
        System.out.println("\n[2] Go to the brewery");
        System.out.println("\n[3] Go to the blacksmith");
        System.out.println("\n[4] Go to the Casino");
        System.out.println("\n[5] Go to the canyon");
        System.out.println("\n[6] Talk to a beggar");
        System.out.println("\n[7] Leave the place and go back to your house");
        System.out.println("-------------------------------------------");
        System.out.print("answer: ");  
        int choice = ScannerEN.NoSkipScanner(marktEN::start, "1|2|3|4|5|6|7");
        if (choice == 1) {
          HaendlerEN.start();
        } 
        else if (choice == 2) {                                                                                                  
          breweryEN.start();     
        }  
        else if (choice == 3) {
          blacksmithEN.start();       
        }
        else if (choice == 4) {
          CasinoEN.start();       
        } 
        else if (choice == 5) {
          canyonEN.start();       
        } 
        else if (choice == 6) {
          BeggerEN.start();       
        } 
        else if (choice == 7) {
          StartrichtungEN.start();       
        }
        else {
          start();
        }  
      }
      else {
        System.out.println("\n[1] Go to the Merchant");
        System.out.println("\n[2] Go to the brewery");
        System.out.println("\n[3] Go to the blacksmith");
        System.out.println("\n[4] Go to the Casino");
        System.out.println("\n[5] Go to the canyon");
        System.out.println("\n[6] Leave the place and go back to your house");
        System.out.println("-------------------------------------------");
        System.out.print("answer: ");  
        int choice = ScannerEN.NoSkipScanner(marktEN::start, "1|2|3|4|5|6");
        if (choice == 1) {
          HaendlerEN.start();
        } 
        else if (choice == 2) {                                                                                                  
          breweryEN.start();     
        }  
        else if (choice == 3) {
          blacksmithEN.start();       
        }
        else if (choice == 4) {
          CasinoEN.start();       
        } 
        else if (choice == 5) {
          canyonEN.start();        
        } 
        else if (choice == 6) {
          DiebEN.MarktDieb();
          StartrichtungEN.start();       
        }
        else {
          start();
        }    
      }
    } 
    else {
      ClearEN.clear();
      System.out.println("-------------------------------------------");
      if (VarsEN.firstmarkt == false) {
        System.out.println("\nYou walk around the castle and go to the market square.\n\nWhere do you want to go?");
        VarsEN.firstmarkt = true;
      }
      else {
        System.out.println("\nYou are at the market square. \n\nWhere do you want to go?");  
      }
      if (VarsEN.Begger1Used == false) {
        System.out.println("\n[1] Go to the Merchant");
        System.out.println("\n[2] Go to the brewery");
        System.out.println("\n[3] Go to the blacksmith");
        System.out.println("\n[4] Go to the Casino");
        System.out.println("\n[5] Go to the canyon");
        System.out.println("\n[6] Talk to a beggar");
        System.out.println("\n[7] Go in the castle");
        System.out.println("\n[8] Leave the place and go back to your house");
        System.out.println("-------------------------------------------");
        System.out.print("answer: ");  
        int choice = ScannerEN.NoSkipScanner(marktEN::start, "1|2|3|4|5|6|7|8");
        if (choice == 1) {
          HaendlerEN.start();
        } 
        else if (choice == 2) {                                                                                                  
          breweryEN.start();     
        }  
        else if (choice == 3) {
          blacksmithEN.start();       
        }
        else if (choice == 4) {
          CasinoEN.start();       
        } 
        else if (choice == 5) {
          canyonEN.start();       
        } 
        else if (choice == 6) {
          BeggerEN.start();       
        }
        else if (choice == 7) {
          TownEN.intown();       
        } 
        else if (choice == 8) {
          StartrichtungEN.start();       
        }
        else {
          start();
        }  
      }
      else {
        System.out.println("\n[1] Go to the Merchant");
        System.out.println("\n[2] Go to the brewery");
        System.out.println("\n[3] Go to the blacksmith");
        System.out.println("\n[4] Go to the Casino");
        System.out.println("\n[5] Go in the castle");
        System.out.println("\n[6] Leave the place and go back to your house");
        System.out.println("-------------------------------------------");
        System.out.print("answer: ");  
        int choice = ScannerEN.NoSkipScanner(marktEN::start, "1|2|3|4|5|6");
        if (choice == 1) {
          HaendlerEN.start();
        } 
        else if (choice == 2) {                                                                                                  
          breweryEN.start();     
        }  
        else if (choice == 3) {
          blacksmithEN.start();       
        }
        else if (choice == 4) {
          CasinoEN.start();       
        } 
        else if (choice == 5) {
          TownEN.intown();       
        } 
        else if (choice == 6) {
          DiebEN.MarktDieb();
          StartrichtungEN.start();       
        }
        else {
          start();
        }    
      }  
    }
  }

}
