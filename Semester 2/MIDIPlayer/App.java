package MIDIPlayer;

import javax.sound.midi.MidiUnavailableException;
import java.io.FileNotFoundException;

/**
 * Created by jerdys on 30.04.17.
 */

public class App {
    public static void main(String[] args) throws FileNotFoundException, InterruptedException, MidiUnavailableException {
        FileReader fileReader = new FileReader();
        fileReader.varInitialization();
    }
}
