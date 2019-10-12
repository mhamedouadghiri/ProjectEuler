import algos.Misc;
import algos.Sort;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Prob022 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader;
        reader = new BufferedReader(new FileReader("files\\prob22.txt"));
        String line = reader.readLine().replace("\"", "");
        String[] names = line.split(",");
        reader.close();
        Sort.selection_sort(names);
        int sum = 0;
        for (String name : names)
            sum += name_score(name, names);
        System.out.println(sum);
    }


    private static int name_score(String name, String[] names) {
        int nv = Misc.word_value(name);
        int ind = Misc.position(name, names);
        return ind * nv;
    }
}
