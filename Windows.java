
import java.awt.*;
import javax.swing.*;
import java.util.Random;
import java.awt.event.*;

public class Windows extends JFrame {

    String[] deadFish = {
            "C:/Users/User/Desktop/hw and shit/java_test/aquarium/fishAndBackg/deadfish.png",
            "C:/Users/User/Desktop/hw and shit/java_test/aquarium/fishAndBackg/dead-fish.png",
            "C:/Users/User/Desktop/hw and shit/java_test/aquarium/fishAndBackg/imgbin_stock.png" };

    static Random r = new Random();

    class ImagePanel extends JPanel{
        
    }



    public static void main(String args[]) {

        ShowFlowLayout frame = new ShowFlowLayout();
        frame.setSize(800, 550);
        frame.setLocationRelativeTo(null); // Center the frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setTitle("HARDPROJECT");
        // // back.setLayout(new BorderLayout());

        // JLabel back = new JLabel(new ImageIcon(Background));
        // JLabel pic = new JLabel(new ImageIcon(livefish[randomFish]));

        // // back.add(pic);
        // // frame.add(back);
        // frame.add(pic);
        // pic.setBounds(randomXLoc, randomYLoc, size.width, size.height);
    }

}


class ShowFlowLayout extends JFrame {
    String Background = "C:/Users/User/Desktop/hw and shit/java_test/aquarium/fishAndBackg/background.jpg";
    String[] livefish = { "C:/Users/User/Desktop/hw and shit/java_test/aquarium/fishAndBackg/Blue-Fish.png",
            "C:/Users/User/Desktop/hw and shit/java_test/aquarium/fishAndBackg/fish_.png",
            "C:/Users/User/Desktop/hw and shit/java_test/aquarium/fishAndBackg/tropical_seas.png" };
    
    Random r = new Random();
    int randomFish = r.nextInt(livefish.length);
    int randomXLoc = r.nextInt(800), randomYLoc = r.nextInt(300);


    public ShowFlowLayout() {
        JPanel pan = new JPanel();

        setLayout(new FlowLayout(FlowLayout.CENTER, 0, 0));
        JLabel pic = new JLabel(new ImageIcon(livefish[randomFish]));
        JLabel back = new JLabel(new ImageIcon(Background));

        back.add(pic);
        pan.add(back);
        add(pan);   

    }
    
}
