import algos.Misc;
import algos.Sum;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Prob042 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader;
        reader = new BufferedReader(new FileReader("files\\prob42.txt"));
        String line = reader.readLine().replace("\"", "");
        String[] words = line.split(",");
        reader.close();

        int cnt = 0;
        int value = 0;
        for (String word : words) {
            value = Misc.word_value(word);
            if (Sum.is_triangular(value))
                cnt++;
        }

        System.out.println(cnt);
    }
}
