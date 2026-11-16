package by.itAcademy.satsuk.isDigit;

public class IsDigit {
    public static void main(String[] args) {
        String str1 = "123456789";
        String str2 = "1234567 89";
        String str3 = "123qwe";
        String str4 = "QWE";

        System.out.println(DigitChecker.containsOnlyDigits(str1));
        System.out.println(DigitChecker.containsOnlyDigits(str2));
        System.out.println(DigitChecker.containsOnlyDigits(str3));
        System.out.println(DigitChecker.containsOnlyDigits(str4));

    }
}
