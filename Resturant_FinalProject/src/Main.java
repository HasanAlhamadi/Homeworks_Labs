import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Viewer viewer=new Viewer();
        while (true)
            if (viewer.start())
                break;
    }
}
