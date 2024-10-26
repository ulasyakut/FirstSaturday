
/**
 * Write a description of class src.main.java.WriteIFs here.
 *
 * @author (ulasyakut)
 * @version (10/25/2024)
 */
public class WriteIFs
{
 
    public void playerDied(boolean player1) {
        // Write an IF statement that checks “player1.isAlive()” 
        // and if that’s false, calls “displayGameOver(player1)”
     
    }
    
    public Object thermoSTAT(int room) {

        if (70 > room) {

            return heatOn();
        }   else {
            return coolOn();
        }
        // Write an IF statement that checks the 
        // “temperature(room)” and if that check is less than 70, 
        // calls “heatOn()” else calls “coolOn()”
    }

    public void fireplaceControl(Object fireplace1) {

        if( oo2 < 50 && oo1 < 62){

            startAFire();
        }
        //inside oo1 outside oo2
        // Write an IF statement that checks
        // “outsideTemp()” is less than 50 
        // AND 
        // “insideTemp()” is less than 62, 
        // calls “startAFire(fireplace1)”

    }

    public void checkFuel(double fuelLevel) {
        // Write an IF statement that checks “fuelLevel” 
        // and if that check is less than 0.08, calls “refuel()”

    }



    /**
     *  Pay no attention to the code below this point.
     *
     * 
     * instance variables
     */
    public int x;
    public int tt_t;
    public int tt_s;
    public int oo1, oo2;
    public String ss;


  /**
   * Constructor for objects of class src.main.java.WriteIFs
   */
  public WriteIFs()
  {
      // initialise instance variables
      x = 0;
      tt_t = 0;
      tt_s = 1;
      ss = "";
      oo1 = 61;
      oo2 = 49;
  }

    // associated routines
    public boolean isAlive(boolean p) {
        return !p;
    }
    private int tempurature(int t) {
        return t+2;
    }
    private String heatOn() {
        this.ss = "heating";
        return this.ss;
    }
    private Object coolOn() {
        this.ss = "cooling";
        return this.ss;
    }
 
    private int insideTemp() {
        return oo1;
    }
    private int outsideTemp() {
        return oo2;
    }
    private void startAFire() {
        this.tt_s = 213;
    }
    private void refuel() {
        this.x = 99;
    }
    private void displayGameOver(boolean b) {
        this.ss = "Game Over!";
    }

}
