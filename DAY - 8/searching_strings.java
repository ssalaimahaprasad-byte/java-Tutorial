package day8;

public class searching_strings {

    public static void main(String[] args) {

        String name = "hello world";
        char target = 'd';

        if (search(name, target)) {
            System.out.println("Found");
        } else {
            System.out.println("Not Found");
        }
    }

    public static boolean search(String str, char target) {

        char[] name1 = str.toCharArray();

        for (int i = 0; i < name1.length; i++) {
            if (name1[i] == target) {
                return true;
            }
        }

        return false;
    }
}