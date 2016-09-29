package softheme_the_longest_sequence;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Softheme_The_longest_Sequence {

    private static final String INPUT_FILE = new File("INPUT.TXT").getAbsolutePath();
    private static final String OUTPUT_FILE = new File("OUTPUT.TXT").getAbsolutePath(); 
	
    public static void main(String[] args) {
	int max = 0;
		
	if (!new File(INPUT_FILE).exists()) {
            System.out.println("There is no file: " + INPUT_FILE);
            return;
	}
		
	try(FileReader reader = new FileReader(INPUT_FILE)) {
            int currentCharacter;
            int currentCount = 0;;

            while((currentCharacter=reader.read()) != -1) {
                if (currentCharacter == '1') {
                    currentCount++;
                }
                else {
                    if (currentCount > max) {
                        max = currentCount;
                    }

                    currentCount = 0;
                }
            } 
        }
        catch(IOException ex) {
            System.out.println(ex.getMessage());
        }   
		
	try(FileWriter writer = new FileWriter(OUTPUT_FILE, false)) {
            writer.write(String.valueOf(max));
            writer.flush();
        }catch(IOException ex){
            System.out.println(ex.getMessage());
        } 
    }
}
