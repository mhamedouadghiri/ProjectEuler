import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Prob067 {
    public static void main(String[] args) {
        try {
            int[][] tree = make_tree(new File("files\\prob67.txt"));
            System.out.println(traverse(tree));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static int traverse(int[][] tree) {
        for (int y = tree.length - 2; y >= 0; y--) {
            for (int x = 0; x < tree[y].length; x++) {
                tree[y][x] += Math.max(tree[y + 1][x], tree[y + 1][x + 1]);
            }
        }
        return tree[0][0];
    }

    private static int[][] make_tree(File file) throws IOException {
        BufferedReader reader;

        reader = new BufferedReader(new FileReader(file));
        int nb_lines = 0;
        while (reader.readLine() != null)
            nb_lines++;
        reader.close();


        reader = new BufferedReader(new FileReader(file));

        int[][] tree = new int[nb_lines][];
        String[] line_t;
        int[] line_t_int;
        int c = 0;

        String line = reader.readLine();
        while (line != null) {
            line_t = line.split(" ");
            line_t_int = new int[line_t.length];
            for (int i = 0; i < line_t.length; i++)
                line_t_int[i] = Integer.parseInt(line_t[i]);
            tree[c] = line_t_int;
            line = reader.readLine();
            c++;
        }

        reader.close();
        return tree;
    }
}
