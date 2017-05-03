package MIDIPlayer;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;
import javax.sound.midi.*;

/**
 * Created by jerdys on 30.04.17.
 */

public class FileReader {
    File file = new File("/home/jerdys/IdeaProjects/Informatics-1/Semester 2/MusicalSynthesizer/" +
            "SyhthesizerCommands/example.mscm");
    Scanner sc = new Scanner(file);
    int[] commands = varInitialization();

    public FileReader() throws FileNotFoundException, MidiUnavailableException, InterruptedException {
    }

    public int[] varInitialization() throws MidiUnavailableException, InterruptedException {
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            String[] sCommands = line.split(":");
            int[] commands = Arrays.stream(sCommands).mapToInt(Integer::parseInt).toArray();

            playSounds(commands);
        }

        return commands;
    }

    public void playSounds(int[] commands) throws MidiUnavailableException, InterruptedException {
        Synthesizer synth = MidiSystem.getSynthesizer();
        MidiChannel[] channels = synth.getChannels();
        synth.open();

        channels[0].programChange(commands[3]);
        channels[0].noteOn(commands[1], 80);
        Thread.sleep(commands[0]);
        channels[0].noteOff(commands[1]);

        varInitialization();
    }
}
