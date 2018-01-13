package dv;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Start {
    
    int level;
    
    public int go() {
        Start work = new Start();
        work.Confirmation();
        level = work.OpeningAndCharacter();
        System.out.println("Level: " + level);
        System.out.println("\ndone w/ start\n");
        
        return level;
    }

    private void Confirmation() {
        if (JOptionPane.showConfirmDialog(new JFrame(),
        "Would you like to become master of the Oregon Trail?", "Oregon Trail 2: Divine Vengeance",
        JOptionPane.YES_NO_OPTION) == JOptionPane.NO_OPTION)
        System.exit(0);
    }
    
    private int OpeningAndCharacter() {
        
        JOptionPane.showMessageDialog(null,"Objective:\n\n            In this long awaited sequel to 'Oregon Trail', the game takes a dark twist."
                + "\nThe main objective of the game is not to survive the Oregon Trail, but to instead stop those trying to travel it."
                + "\nActing out the role of God along the trail, your mission is to kill the travelers before they reach their destination,"
                + "\nwhatever the cost. Earn points and use them to plague the family with disasters, but be strategic in the"
                + "\nway that you spend them.",
                "Oregon Trail 2: Divine Vengeance",JOptionPane.PLAIN_MESSAGE);
        Object[] Class = {"1", "2", "3",};
        ImageIcon logo = new ImageIcon("Logo.PNG");
        String Class1 = (String) JOptionPane.showInputDialog
            (null, "Welcome to the Oregon Trail!!!   Please select a character to play against:\n\n1. Farmer(Easy)\n2. Carpenter(Medium)\n3. Banker(Hard)\n\n", 
                "Oregon Trail 2: Divine Vengeance", JOptionPane.QUESTION_MESSAGE, logo, Class, null);
            if("1".equals(Class1)) {
                level = 1;
                ImageIcon Farmer = new ImageIcon("Farmer.JPG");
                JOptionPane.showMessageDialog(null, "You have chosen to try and kill the Farmer!!!","Oregon Trail 2: Divine Vengeance", 0, Farmer);
            }
            if("2".equals(Class1)) {  
                level = 2;
                ImageIcon Carpenter = new ImageIcon("Carpenter.PNG");
                JOptionPane.showMessageDialog(null, "You have chosen to try and kill the Carpenter!!!","Oregon Trail 2: Divine Vengeance", 0, Carpenter);
            }
            if("3".equals(Class1)) {  
                level = 3;
                ImageIcon Banker = new ImageIcon("Banker.JPG");
                JOptionPane.showMessageDialog(null, "You have chosen to try and kill the Banker!!!","Oregon Trail 2: Divine Vengeance", 0, Banker);
            }
            
            return level;
    }
}
