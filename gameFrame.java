package snake;

import javax.swing.JFrame;

public class gameFrame extends JFrame{
    
    gameFrame(){
    
        this.add(new gamePanel());
        this.setTitle("Snake Game by arwa");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null); 
        
        //(164,32,105)
        //(200,121,165)
        //(160,96,132)
        
    }
    
}
