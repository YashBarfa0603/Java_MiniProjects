public class PracticeSet3 {
    public static void main(String[] args) {
        String name = "Aastha Pandyaa";
        name = name.toLowerCase();
        System.out.println(name);

        String text = "Hellooo Bhaiiiii Kem cho";
        text = text.replace(" ", "_");
        System.out.println(text);

        String letter = "Dear <|name|>, Thanks a lot";
        letter =letter.replace("<|name|>", "YASH");
        System.out.println(letter);

        String myString = "This string contains double  and tripple spaces";
        System.out.println(myString.indexOf("  "));
        System.out.println(myString.indexOf("   "));

        String meLetter = "Dear Yash, \n\tThis is day you will remember forever.\n\t";
        System.out.println(meLetter);

    }
}
