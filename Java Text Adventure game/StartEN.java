public class StartEN {
  
  public static void main(String[] args) {
    
    LanguagesEN.start();  //Step 1 (Sprachabfrage)

    if (VarsEN.Languages == "EN") {

      StoryEN.start();          //Step 2 (Story austrahlung)
      NameabfrageEN.start();    //Step 3 (Nameabfrage)
      InventarEN.start();       //Step 3 (Inventar vorschau)
      
    }
    else {
      VarsEN.Languages = "EN";
    }
    
  }

}