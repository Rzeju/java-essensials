package pl.string_class;

public class StringExample {

    public static void main(String[] args) {

        String string1 = "Text";
        String string2 = "Text";
        String string3 = "OtherText";

        System.out.println(string1.equals(string2));
        System.out.println(string1 == string2);
        System.out.println(string1.equals(string3));
        System.out.println(string1 == string3);

        String objectString1 = new String("Text");
        String objectString2 = new String("Text");
        String objectString3 = new String("OtherText");
        System.out.println(objectString1.equals(objectString2));
        System.out.println(objectString1 == objectString2);
        System.out.println(objectString1.equals(objectString3));
        System.out.println(objectString1 == objectString3);

        char char1 = objectString1.charAt(0);
        System.out.println(char1);
        System.out.println(char1 + 1);
        char char2 = (char) (char1 + 1);
        System.out.println(char2);

        char[] charArray = string3.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            System.out.print(charArray[i] + " ");
        }
        System.out.println("\n");
        for (int i = 0; i < string3.length(); i++) {
            System.out.print(string3.charAt(i) + " ");
        }
        System.out.println("\n");
        for (char c : string3.toCharArray()) {
            System.out.print(c + " ");
        }
        System.out.println("\n");
        for (String s : objectString3.split("")) {
            System.out.print(s + " ");
        }

        System.out.println("\n");
        System.out.println(objectString3.compareTo(objectString2));
        objectString3.isBlank();
        objectString3.isEmpty();
    }
}
