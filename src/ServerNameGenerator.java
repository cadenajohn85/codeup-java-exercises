public class ServerNameGenerator {

    private static String[] adjectives = {"たのしい", "まじめな", "つまらない", "しんせつな", "うらやましい",
            "がんこな", "きびしい", "おだやかな", "おとなしい", "わがままな"};
    private static String[] nouns = {"教師", "生徒", "警官", "医者", "弁護士", "主婦", "看護師", "消防士", "農家", "学者"};

    public static void main(String[] args) {
//        for (int x = 1; x < 100; ++x) {
//            System.out.println(getRandomElement(adjectives));
//        }
        System.out.println("Here is your server name:");
        System.out.println(getRandomElement(adjectives) + "-" + getRandomElement(nouns));

    }

    private static String getRandomElement(String[] someStringArray) {
        int randomIndex = (int) (Math.random() * someStringArray.length);
        return someStringArray[randomIndex];
    }

}
