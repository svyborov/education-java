import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SmartJstack {
    public static void main(String[] args) throws IOException {
        String whatToFind = null;

        if (args.length > 0) {
            whatToFind = args[0];
        }
        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));

        String line;
        int lineNumber = 0;

        while ((line = br.readLine()) != null) {
            lineNumber++;
            if (whatToFind != null && line.contains(whatToFind)) {
                System.out.println(lineNumber + ": " + line);
            }
        }
    }
}
