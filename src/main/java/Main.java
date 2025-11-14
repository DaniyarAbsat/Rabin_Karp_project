public class Main {
    public static void main(String[] args) {

        RabinKarp rk = new RabinKarp();

        // Load test input files from resources
        String shortText = FileReaderUtil.readFile("src/main/resources/short_input.txt");
        String mediumText = FileReaderUtil.readFile("src/main/resources/medium_input.txt");
        String longText = FileReaderUtil.readFile("src/main/resources/long_input.txt");

        String pattern = "test";  // pattern to search in text

        System.out.println("Short input index:  " + rk.search(shortText, pattern));
        System.out.println("Medium input index: " + rk.search(mediumText, pattern));
        System.out.println("Long input index:   " + rk.search(longText, pattern));
    }
}
