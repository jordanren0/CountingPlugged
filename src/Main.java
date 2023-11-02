import java.io.IOException;
public class Main {
    public static void main(String[] args) throws IOException {
        topFive topFive = new topFive();
        topFive.topFiveWords("Nineteen+eighty-four.txt", "commonWords.txt");
    }
}
