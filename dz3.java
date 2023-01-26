
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class dz3 {
    public static void main(String[] args) {

        StringBuilder result = new StringBuilder();
        File file = new File("file.txt");

        try (FileReader fr = new FileReader(file)) {
            int content;
            while ((content = fr.read()) != -1) {
                result.append((char) content);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(result.toString());
        String str = result.toString();

        String[] perv_split = str.split(",");

        StringBuilder res = new StringBuilder();

        for (int i = 0; i < perv_split.length; i++) {
            String new_result = perv_split[i];
            String[] new_split = new_result.split(":");
            res.append(new_split[1]);
        }

        String res1 = res.substring(1, 7);
        String res2 = res.substring(9, 10);
        String res3 = res.substring(12, 22);
        String res4 = res.substring(25, 32);
        String res5 = res.substring(34, 35);
        String res6 = res.substring(37, 48);
        String res7 = res.substring(51, 58);
        String res8 = res.substring(60, 61);
        String res9 = res.substring(63, res.length() - 2);

        System.out.printf("Студент %s получил %s по предмету %s.\n", res1, res2, res3);
        System.out.printf("Студент %s получил %s по предмету %s.\n", res4, res5, res6);
        System.out.printf("Студент %s получил %s по предмету %s.\n", res7, res8, res9);
    }
}
