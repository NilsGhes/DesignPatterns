
import java.awt.Graphics;
import javax.swing.JFrame;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nils
 */
public class NewMain extends JFrame {

    /**
     * @param args the command line arguments
     */
    public NewMain(String title){
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(300,300);
        this.setVisible(true);
    }
    
    public void paint(Graphics graphics){
        super.paint(graphics);
        String msg = "I rule!!";
        graphics.drawString(msg,100,100);
    }
    
    
    public static void main(String[] args) {
        NewMain myFrame = new NewMain("Head First Design Patterns");
    }
    
}
