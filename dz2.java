
// Реализуйте алгоритм сортировки пузырьком числового массива,
//  результат после каждой итерации запишите в лог-файл.
import java.util.Arrays;
import java.io.IOException;
import java.util.logging.*;

public class dz2 {

    public static void main(String[] args) throws IOException  {

        Logger logger = Logger.getLogger(dz2.class.getName());
        FileHandler fh = new FileHandler("log.txt");
        logger.addHandler(fh);
        SimpleFormatter sFormat = new SimpleFormatter();
        fh.setFormatter(sFormat);

        int[] array = { 4, 5, 3, 10, 9, 17, 43, 6 };
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = array.length - 1; j > i; j--) {
                if (array[j - 1] > array[j]) {
                    int tmp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = tmp;
                    logger.info("Сравниваем числа попарно");
                    System.out.printf("Меняем Число %d и число %d \n",array[j - 1],array[j]);

                }
            }
        }
        System.out.println(Arrays.toString(array));

    }
}