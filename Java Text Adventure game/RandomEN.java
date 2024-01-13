import java.util.Random;

public class RandomEN {
  
  public static int nextInt(int from, int to) {
    Random rm = new Random();
    int rand = rm.nextInt(to) + from;
    return rand;  
    
  }

}