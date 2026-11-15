package by.itAcademy.satsuk.isDigit;

public class IsDigit {
    public static void main(String[] args) {
        String str1 = "123456789 ";

        boolean isDigit1 = true;

        for (int i = 0; i < str1.length(); i++) {
            if (!Character.isDigit(str1.charAt(i))) {
                isDigit1 = false;
                break;
            }
        }
        if(isDigit1){
            System.out.println("Строка содержит только цифры");
        } else {
            System.out.println("Строка содержит не только цифры");
        }

    }
}
