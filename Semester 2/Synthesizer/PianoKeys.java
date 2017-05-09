package Synthesizer;

import javax.swing.*;
import Synthesizer.interfaces.Observer;

/**
 * Created by jerdys on 09.05.17.
 */

public class PianoKeys {
    ImageFrame frame1 = new ImageFrame();

    protected void changePianoKey(ImageIcon pianoKey) {
        frame1.imageLabel = new JLabel(pianoKey);

        frame1.window.add(frame1.imageLabel);
        frame1.window.invalidate();
        frame1.window.validate();
        frame1.window.repaint();
    }
}
