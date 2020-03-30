import java.io.File;
import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        CoursePicker c = new CoursePicker();
        c.findSequence(new File(System.getProperty("user.dir") + "/src/ok.txt"));
    }
}