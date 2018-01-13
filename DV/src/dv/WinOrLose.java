/*
 * @author z.reif
 */

package dv;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class WinOrLose {
    
    // note: this code don do jack shit rn b/c distance and familyMembers and all the
    // stats aren't bein changed in gameplay or imported so u always
    // fuckin win
    
    int distance;
    int familyMembers;
    
    public void go() {
        WinOrLose work = new WinOrLose();
        work.WinOrLose();
        
        System.out.println("\ndone wit winorlose\n");
    }
    
    private void WinOrLose()
    {
        if(distance<100&&familyMembers==0)
        {
            ImageIcon win = new ImageIcon("WIN.PNG");
            JOptionPane.showMessageDialog(null, "", "", JOptionPane.PLAIN_MESSAGE, win);
        }
        else
        {
            ImageIcon lose = new ImageIcon("LOSE.PNG");
            JOptionPane.showMessageDialog(null, "","", JOptionPane.PLAIN_MESSAGE, lose);
        }
    }
}
