import algos.NumberLetter;

public class Prob017 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i < 1001; i++) {
            sum += NumberLetter.to_english(i).replace(" ", "").length();
        }
        System.out.println(sum);
    }
}
