//package brightlogic.numberclassification.utils;
//
//import org.springframework.stereotype.Component;
//import org.springframework.stereotype.Service;
//
//import java.util.ArrayList;
//import java.util.List;
//
//@Component
//public class NumberPropertiesUtils {
//
//    public static boolean isPrime(int number) {
//        if (number <= 1) return false;
//        for (int i = 2; i <= Math.sqrt(number); i++) {
//            if (number % i == 0) return false;
//        }
//        return true;
//    }
//
//    public static boolean isPerfect(int number) {
//        int sum = 1;
//        for (int i = 2; i <= number / 2; i++) {
//            if (number % i == 0) sum += i;
//        }
//        return sum == number && number != 1;
//    }
//
//    public static boolean isArmstrong(int number) {
//        int sum = 0, temp = number, digits = String.valueOf(number).length();
//        while (temp != 0) {
//            int remainder = temp % 10;
//            sum += Math.pow(remainder, digits);
//            temp /= 10;
//        }
//        return sum == number;
//    }
//
//    public static List<String> getProperties(int number) {
//        List<String> properties = new ArrayList<>();
//        if (isArmstrong(number)) properties.add("armstrong");
//        if (number % 2 == 0) properties.add("even");
//        else properties.add("odd");
//        return properties;
//    }
//
//    public static int getDigitSum(int number) {
//        int sum = 0;
//        while (number != 0) {
//            sum += number % 10;
//            number /= 10;
//        }
//        return sum;
//    }
//}
