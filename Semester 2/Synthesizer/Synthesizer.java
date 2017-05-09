package Synthesizer;

import javax.sound.midi.MidiChannel;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.IOException;
import javax.swing.*;

/**
 * Created by jerdys on 09.05.17.
 */

public class Synthesizer {
    public static void main(String[] args) throws MidiUnavailableException, IOException {
        final ImageIcon piano = new ImageIcon("/home/jerdys/IdeaProjects/Informatics-1/Semester 2/" +
                "Synthesizer/resources/pianokeys.png");
        javax.sound.midi.Synthesizer synth = MidiSystem.getSynthesizer();
        ImageFrame frame = new ImageFrame();

        final int[] BUTTONS = {49, 50, 51, 52, 53, 54, 55};
        final int[] NOTES = {60, 62, 64, 65, 67, 69, 71};
        MidiChannel[] channels = synth.getChannels();

        frame.startGUI(frame.window);
        synth.open();

        frame.window.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                int keyCode = e.getKeyCode();

                for (int i = 0; i < BUTTONS.length; i++) {
                    if (keyCode == BUTTONS[i]) {
                        switch (keyCode) {
                            case 49:
                                frame.changePianoKey(new ImageIcon("/home/jerdys/IdeaProjects/" +
                                        "Informatics-1/Semester 2/Synthesizer/resources/pianokeys1.png"));
                                break;
                            case 50:
                                frame.changePianoKey(new ImageIcon("/home/jerdys/IdeaProjects/" +
                                        "Informatics-1/Semester 2/Synthesizer/resources/pianokeys2.png"));
                                break;
                            case 51:
                                frame.changePianoKey(new ImageIcon("/home/jerdys/IdeaProjects/" +
                                        "Informatics-1/Semester 2/Synthesizer/resources/pianokeys3.png"));
                                break;
                            case 52:
                                frame.changePianoKey(new ImageIcon("/home/jerdys/IdeaProjects/" +
                                        "Informatics-1/Semester 2/Synthesizer/resources/pianokeys4.png"));
                                break;
                            case 53:
                                frame.changePianoKey(new ImageIcon("/home/jerdys/IdeaProjects/" +
                                        "Informatics-1/Semester 2/Synthesizer/resources/pianokeys5.png"));
                                break;
                            case 54:
                                frame.changePianoKey(new ImageIcon("/home/jerdys/IdeaProjects/" +
                                        "Informatics-1/Semester 2/Synthesizer/resources/pianokeys6.png"));
                                break;
                            case 55:
                                frame.changePianoKey(new ImageIcon("/home/jerdys/IdeaProjects/" +
                                        "Informatics-1/Semester 2/Synthesizer/resources/pianokeys7.png"));
                                break;
                        }
                    }
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {
                int keyCode = e.getKeyCode();

                for (int i = 0; i < BUTTONS.length; i++) {
                    if (keyCode == BUTTONS[i]) {
                        channels[0].noteOn(NOTES[i], 80);

                        try {
                            Thread.sleep(300);
                        } catch (InterruptedException e1) {
                            e1.printStackTrace();
                        }

                        frame.window.remove(frame.imageLabel);
                        frame.imageLabel = new JLabel(piano);
                        frame.window.invalidate();
                        frame.window.validate();
                        frame.window.repaint();

                        channels[0].noteOff(NOTES[i]);
                    }
                }
            }
        });
    }
}
