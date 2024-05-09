public class Task5 {
    public static void palindrome(String string){
        StringBuilder stringBuilder = new StringBuilder(string);
        stringBuilder.reverse();
        if(stringBuilder.toString().equals(string)){
            System.out.println("это палиндром");
        } else {
            System.out.println("это не палиндром");
        }
    }

    public static void main(String[] args) {
        String string1 = "абба";
        String string2 = "папа";
        palindrome(string1);
        palindrome(string2);
    }
}
//Палиндром