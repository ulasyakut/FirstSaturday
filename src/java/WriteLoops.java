
import java.util.concurrent.ThreadLocalRandom;

/**
 * Writeloops get you thinking about how to do different things with loops.
 *
 * @author anonymous coward
 * @version -0.3
 * 
 */
public class WriteLoops {

    private static final int _3 = 3;

    public int oneToFive() {
        int w = 0;
        while(w < 5){
            w = w + 1;
        }
        return w;
    }

    public int oneToTen() {
        int w = 0;
        while(w < 10){
            w = w + 1;
        }
        return w;
    }

    public int startAtTwentyOne() {
        int w = 21;
        int n = 0;
        while (n < 10){
            w = w - 1;
            n++;
        }
        return w;
    }

    public int countDown() {
        int n = 100;
        int w = 0;
        while (n > 0){
            n = n - 1;
            w++;

        }
        return w;
    }
        //i moved on this since it says some error things
//    public int byTwoTo32() {
//        int w = 0;
//        for(int i = 0;w < 32;i++){
//            if(i % 2 == 0){
//                w = w + 1;
//                return i;
//                 }       }return w;
//        }
        // Write a FOR loop from 0 to 32 by 2s.
        // calling

        // each time through the loop

    //}

//    public int countDownFrom5000() {
//        int w = 0;
//        int num = 0;
//        while (num < 5001){
//            num = num + 11;
//
//        // Write a FOR loop from 1 to less than 5001 by 11s.
//        // calling
//        w = w + 1;
//        // each time through the loop
//
//        return w;
//    }

    public int nestedFors() {
        int w = 0;
        for(int i = 0; i < 20; i++){
            for(int n = 0; n <= 4; n++){
                w = w + 1;}
        }
        return w;
    }

    public int helloZipCode() {
        int w = 0;
        for(int i=5;i<=105;i++){
            if(i>51){
                System.out.println("Hello Zipcode");
            }
            else{w = w + 1;}
        }
        return w;
    }

    public void simpleLoops() {
        int i = 0;

        // sample while loop
        while (i <= 5) {
            System.out.println("Eww.");
            i = i + 1;
        }

        // sample do...while loop
        i = 8;
        do {
            System.out.println("Eww.");
            i = i - 1;
        } while (i > 0);
        // what's the primary difference between them?!?
    }


    public int driveHome() {
        int w = 0;
        while(!gpsCurrentLocation().equals("Home")){
            driveSomeMore();
            w = w + 1;
        }
        return w;
    }

    // Getting harder...
    // First declare and set “highestScore” to 236. Then set “currentScore” to
    // “gameNextScore()”. Then write a WHILE loop that checks "runningScore"
    // is less than “highestScore” and if it is, adds “currentScore” to
    // "runningScore"
    // and then sets “currentScore” to “gameNextScore()”
    public int checkGameScore() {
        int w = 0;
        int highestScore = 236;
        int currentScore = gameNextScore();
        int runningScore = 0;

        // do your while loop here

            // calling
            w = w + 1;
            // each time through the inner loop

        return w; // >= 3;
    }

    // Rewrite the previous WHILE loop as a DO..WHILE loop.
    // Notice how the “runningScore” variable usage is different.
    public boolean checkGameScoreDoWhile() {
        int w = 0;
        int highestScore = 236;
        int currentScore = gameNextScore();
        int runningScore = 0;

        // do your while loop here

            // calling
            w = w + 1;
            // each time through the inner loop

        return w >= 3;
    }

    // Write a WHILE loop that checks “serverIsRunning()” and if true
    // calls “waitFor(5)” After the loop, write an IF and check “serverIsRunning()”
    // is false, and if so, call “sendEmergencyText(“Help!”, adminPhoneNumber)”
    // and also calls “tryServerRestart()”
    public int checkServerStatus() {
        int w = 0;
        String adminPhoneNumber = "+1 202 456 1111";


        // calling
        w = w + 1;
        // each time through the inner loop

        return w;
    }

    // Declare an “int” i. Set i to 7.
    // Write a WHILE loop that checks “i” is less than 50,
    // and if it is, add 7 to “i”
    public int loop50by7() {
        int w = 0;


            // calling
            w = w + 1;
            // each time through the inner loop

        return w;
    }

    int[] threes_array = { 3, 6, 9, 12, 15, 18, 21 };

    // Foo is method that add the first 7 factors of three together and prints
    // out the sum of them all.
    public int foo() {
        int w = 0;
        // this is an array of ints. it is of length 7 (from 0 -> 6)
        int sumOfThrees = 0;

        // this is a so called Enhanced for loop
        for (int index : threes_array) {
            sumOfThrees = sumOfThrees + threes_array[index];
            // calling
            w = w + 1;
            // each time through the inner loop
        }
        System.out.print("The Sum is ");
        System.out.println(sumOfThrees);

        return w;
    }

    // Ponder this: can all FOR loops be rewritten as WHILE loops?
    // rewrite the loop inside of "foo()" as a standard for loop
    // with 'i' as its index variable.
    public int rewriteFooAsFor() {
        int w = 0;
        int sumOfThrees = 0;


            // calling
            w = w + 1;
            // each time through the inner loop

        System.out.print("The Sum is ");
        System.out.println(sumOfThrees);

        return w;
    }

    // Ponder this: can all WHILE loops be rewritten as FOR loops?
    // rewrite the loop inside of "foo()" as a 'while' loop
    public int rewriteFooAsWhile() {
        int w = 0;
        int sumOfThrees = 0;


            // calling
            w = w + 1;
            // each time through the inner loop

        System.out.print("The Sum is ");
        System.out.println(sumOfThrees);

        return w;
    }

    // Declare a boolean “yardNeedsMowed” and initialize to true.
    // Write WHILE loop that checks for “isSummer()”.
    // inside the loop, write an IF that checks “yardNeedsMowed” and if true calls
    // “yellAtJuniorToMowLawn()”
    // After loop, call
    // “sendJuniorBackToSchool()” with an argument that decribes the day junior goes
    // back.
    public int manageYardAndJunior() {
        int w = 0;
        boolean onTime = true;

        // ADD YOUR CODE here.

            // be sure to call
            w = w + 1;
            // each time inside the loop

        return w;
    }

    String voteTallies[] = { "Lincoln", "Washington", "Adams", "Lincoln", "Washington", "Adams", "Lincoln",
            "Washington", "Adams", "Lincoln", "Washington", "Adams", "Roosevelt" };

    // Given an array voteTallies[], write a FOR loop that prints out each value in
    // the array.
    public int tallyVote1() {
        int w = 0;
        int numberOfVotes = voteTallies.length;


            // calling
            w = w + 1;
            // each time through the inner loop

        return w;
    }

    // Given an array voteTallies[], write a WHILE loop that prints out each value
    // in the array. You should declare and use an index “idx” to keep track of
    // where you are.
    public int tallyVote2() {
        int w = 0;
        int numberOfVotes = voteTallies.length;


            // calling
            w = w + 1;
            // each time through the inner loop

        return w;
    }

    /**
     * CONGRATS, you've written all the code. Does it all pass their tests?!?
     * 
     * 
     * If not, why not? :-)
     * 
     * 
     */

    /**
     * IGNORE the CODER behind the CURTAIN. These are the support routines to make
     * all the examples interesting.
     */
    // instance variables - replace the example below with your own
    public int x;

    /**
     * Constructor for objects of class src.main.java.WriteLoops
     */
    public WriteLoops() {
        // initialise instance variables
        x = 0;
    }

    private int gps = 0;

    private String gpsCurrentLocation() {
        if (this.gps > 5) {
            return "Home";
        }
        return "Not Home";
    }

    private void driveSomeMore() {
        this.gps += 1;
    }

    private int scr = 31;

    private int gameNextScore() {

// nextInt is normally exclusive of the top value,
// so add 1 to make it inclusive

        return this.scr += ThreadLocalRandom.current().nextInt(20, 99 + 1);
    }

    private void yellAtJuniorToMowLawn() {
        /* dammit, mow the yard */
    }

    private void sendJuniorBackToSchool(String timeForSchool) {
        if (!timeForSchool.equalsIgnoreCase("First Day of School")) {
            throw new IllegalArgumentException();
        }
        /* dammit, mow the yard */}

    // private Supplier<Boolean> isSummer = () -> {
    //     int i = 0;
    //     return Supplier<Boolean> () -> {
    //         i = i + 1;
    //         return (i >= 3);
    //     };
    // };
        private int summer = 0;
        private boolean isSummer() {
            if (summer == 3) {
                return true;
            }
            summer++;
            return false;
        }
    private void sendEmergencyText(String mesg, String phone) {
    }

    private void tryServerRestart(String mesg, String phone) {
    }

    int serverStatus = 5;

    private boolean serverIsRunning() {
        return (serverStatus < 20);
    }

    private void waitFor(int interval) {
        serverStatus += interval;
    }


}
