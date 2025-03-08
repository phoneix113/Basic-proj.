import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import javax.sound.sampled.*;
public class AudioMain {
    public static void main(String[] args) throws UnsupportedAudioFileException,IOException, LineUnavailableException
    { 
        Scanner scanner = new Scanner(System.in);
        //creating a File object, passing path of audio file as a string
        File file = new File("C:\\Users\\garim\\OneDrive\\Desktop\\java\\Intermediate\\Taylor Swift - Snow On The Beach (Feat. More Lana Del Rey).wav");
        //create audioinput stream object which reads audio file you want to read.
        AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
        //placing file as an argumet to this method of getAudioInputStream
        //suround this with try or catch block or use throws declaration 
        Clip clip = AudioSystem.getClip();
        //clip object , reference to a clip that can be used to manipulate and play audio 
        clip.open(audioStream);
    //open method used to open this clip object passing the audioStream in the parameters
        //clip.start();
        // only if we end there the program will terminate as the audio will play in bg threads so to keep it running either
        //create a gooe system and till x is clicked, it continues playing, or create scanner for input
        String response = ""; // I forgot this that's why it went infinite lmao
        while(!response.equals("Q")){
            System.out.println("p=play,S=Stop,R=Reset,Q=Quit");
            System.out.println("Enter your choice:");
            response = scanner.next();
            response = response.toUpperCase();
            //both are used to take next response and create it upper case so that no lower case exception is there
            switch(response){
                case("P")->clip.start();
                case("S")->clip.stop();
                case("Q")->clip.close();
                case("R")->clip.setMicrosecondPosition(0); 
                //where it should set final position to start from
                default->System.out.println("Not a Valid response");
                //no break statement here so that loop repeats again

            }
        }
        System.out.println("Byeeee!");
        scanner.close();
    }
}
