package MusicalSynthesizer;

import java.awt.*;
import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyAdapter;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiChannel;
import javax.sound.midi.Synthesizer;
import javax.sound.midi.MidiUnavailableException;

/**
 * Created by jerdys on 02.05.17.
 */

public class SynthesizerFrame extends JFrame {
    private final int[] BUTTONS = {49, 50, 51, 52, 53, 54, 55};
    private final int[] NOTES = {60, 62, 64, 65, 67, 69, 71};

    Synthesizer synth = MidiSystem.getSynthesizer();
    MidiChannel[] channels = synth.getChannels();

    public SynthesizerFrame() throws MidiUnavailableException {
        super("Musical Synthesizer");
        createGUI();
    }

    public void createGUI() throws MidiUnavailableException {
        synth.open();
        channels[10].programChange(35);

        JFrame frame = new JFrame("Musical Synthesizer");
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setSize(400, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        frame.add(panel);

        panel.setLayout(new BorderLayout());
        panel.setFocusable(true);
        panel.setBackground(Color.GRAY);

        panel.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                int keyCode = e.getKeyCode();

                for (int i = 0; i < BUTTONS.length; i++) {
                    if (keyCode == BUTTONS[i]) {
                        channels[0].noteOn(NOTES[i], 80);

                        try {
                            Thread.sleep(350);
                        } catch (InterruptedException e1) {
                            e1.printStackTrace();
                        }

                        channels[0].noteOff(NOTES[i]);
                    }
                }
            }
        });
    }
}
