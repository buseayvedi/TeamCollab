package utils;

import java.io.File;
import java.time.LocalDate;

public class MainUtils {

    public static boolean isFileExists(String filePath) {
        return new File(filePath).exists();
    }

    public static long getFileSize(String filePath) {
        return new File(filePath).length();
    }

    public static void deleteFile(String filePath) {
        new File(filePath).delete();
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static double divide(int numerator, int denominator) {
        if (denominator == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return (double) numerator / denominator;
    }

    public static boolean isSameDay(LocalDate date1, LocalDate date2) {
        return date1.isEqual(date2);
    }

    public static LocalDate addDays(LocalDate date, int days) {
        return date.plusDays(days);
    }

    public static boolean isFutureDate(LocalDate date) {
        return date.isAfter(LocalDate.now());
    }

    public static boolean isPastDate(LocalDate date) {
        return date.isBefore(LocalDate.now());
    }
}
