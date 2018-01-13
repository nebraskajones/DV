/*
 * @author z.reif
 */

package dv;

import java.util.Scanner;

public class SelectAction {
    public String[] go() {
        // call everything publicly
        SelectAction stuff = new SelectAction();
        String[] allActions = stuff.print();
        String[] usersActions = stuff.choose(allActions);
        
        return usersActions;
    }
    
    private String[] print() {
        // prints choices
        String[] allActions = {"0.food spoils", "1.forest fire", "2.get lost", "3.depression", "4.thunderstorm", "5.blizzard", "6.thief", "7.scurvy", "8.frostbite/heatstroke", "9.pothole", "10.lose/damage supplies"};
        for (String action : allActions) {
            System.out.println(action);
        }
        
        System.out.println("");
        
        return allActions;
    }
    
    private String[] choose(String[] usersActions) {
        int a=0;
        int numChoices= 1 + (int)(Math.random() * ((3 - 1) + 1));
        String[] usersChoices = new String[numChoices];
        while(a < numChoices){
            // choose action:
            Scanner input = new Scanner(System.in);
            System.out.println("Choose an action: ");
            int choice = input.nextInt();

            usersChoices[a] = usersActions[choice];
            a++;
        }
        
        System.out.println("Your actions are: ");

        for (String usersChoice : usersChoices) {
            System.out.println(usersChoice);
        }
        
        return usersChoices;
    }
}
