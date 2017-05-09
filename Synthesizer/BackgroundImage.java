package Synthesizer;

import javax.swing.*;
import java.awt.*;

/**
 * Created by jerdys on 09.05.17.
 */
public class BackgroundImage extends JComponent {
    private ImageIcon background;

    public BackgroundImage(ImageIcon background) {
        this.background = background;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(background.getImage(), 0, 5, this);
    }
}
