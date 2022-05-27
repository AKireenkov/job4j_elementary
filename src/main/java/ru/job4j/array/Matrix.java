package ru.job4j.array;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class Matrix {
    public static int[][] multiple(int size) {
        int[][] array = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                array[i][j] = (i + 1) * (j + 1);
            }
        }
        try (FileOutputStream out = new FileOutputStream("result.txt")) {
            out.write(Arrays.deepToString(array).getBytes());
            out.write(System.lineSeparator().getBytes());
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        return array;
    }
}
