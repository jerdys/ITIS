package Synthesizer;

import Synthesizer.interfaces.Observer;

import javax.swing.*;
import java.awt.*;

/**
 * Created by jerdys on 09.05.17.
 */

public class ImageFrame extends JFrame {
    JFrame window = new JFrame("Musical Synthesizer");
    JLabel imageLabel;

    protected void startGUI(JFrame window) {
        window.setSize(960, 602);
        window.setFocusable(true);
        window.setVisible(true);
        window.setContentPane(new BackgroundImage(new ImageIcon("/home/jerdys/IdeaProjects/" +
                "Informatics-1/Semester 2/Synthesizer/resources/pianokeys.png")));
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(false);
        window.setLayout(new FlowLayout());
    }

    protected void changePianoKey(ImageIcon pianoKey) {
        imageLabel = new JLabel(pianoKey);

        window.add(imageLabel);
        window.invalidate();
        window.validate();
        window.repaint();
    }
}
