/*
 * @author z.reif
 */

package dv;

public class DivineVengeance {
    
    public static void main(String[] args) {
        
        // note: need to change 'waterLevel' either to an int array of actual depths 
        // or just use the int waterLevel and multiply it by a math.random 
        // to get a depth each time
        
        // note: once oxen is zero, can the family buy more? when oxen = 0, pace should be
        // very slow. probably half of what is was before
        
        // note: is extremeWeather whether there is a thunderstorm/whatever RIGHT THEN
        // or is it whether it is possible for there to be extreme weather at any time
        // in the game???
        
        // note for next class: matthew wants to add a box where people
        // enter their name n shit so maybe he can do that next class if we have
        // the points and everything else worked out
        
        DivineVengeance work = new DivineVengeance();
        int level = work.start();
        work.generatefamily();
        String[] usersActions = work.selectaction();
        work.takeaction(usersActions, level);
        work.winorlose();
        
        System.exit(0);
    }
    
    private int start() {
        Start work = new Start();
        int level = work.go();
        
        return level;
    }
    
    private void generatefamily() {
        // note: why do we need the levelPlaceHolder ???
        int levelPlaceHolder = 0;
        GenerateFamily work = new GenerateFamily();
        work.go(levelPlaceHolder);
    }
    
    private String[] selectaction() {
        SelectAction work = new SelectAction();
        String[] usersActions = work.go();
        
        return usersActions;
    }
    
    private void takeaction(String[] usersActions, int level) {
        GenerateFamily stuff = new GenerateFamily();
        TakeAction work = new TakeAction();
        work.go(usersActions);
    }
    
    private void winorlose() {
        WinOrLose work = new WinOrLose();
        work.go();
    }
}