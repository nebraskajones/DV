/*
 * @author z.reif
 */

package dv;

public class TakeAction {
    public void go(String[] usersActions) {
        TakeAction work = new TakeAction();
        work.choose(usersActions);
        work.action();
        
        System.out.println("\ndone w takeaction\n");
    }
    
    private void choose(String[] usersActions) {
        // basically the same as previous choosing actions except call sep. method
        
        // show the options they chose in SelectActions
        System.out.println("START TAKEACTION STUFF RIGHT NOW ---------------------------------------");
        for (String print: usersActions) {
            System.out.println(print);
        }
        
        // prints choices (imported from selectaction)
        // runs action (which runs whichever action method is needed)
        
    }
    
    private void action() {
        // calls action, does the action, and changes the stats - should
        // the "does the action" happen in a dif class? not gonna worry bout
        // it rn
        
        // make a method for every action possible
        // ""import"" variables from generate family
        // the program needs to ask the user which action (from usersActions) they
        // want to take, and then run a method that takes the action and changes
        // the variables
    }
    
    private void foodSpoils() {
        
    }
    
    private void forestFire() {
        
    }
    
    private void getLost() {
        
    }
    
    private void depression() {
        
    }
    
    private void thunderstorm() {
        
    }
    
    private void blizzard() {
        
    }
    
    private void thief() {
        
    }
    
    private void scurvy() {
        
    }
    
    private void frostBiteHeatStroke() {
        
    }
    
    private void pothole() {
        
    }
    
    private void loseDamageSupplies() {
        
    }
}