package observer.utils;

public class PrintHelper {
    public static void printHeader(String header) {
        System.out.println("\n==================================================================================\n");
        System.out.println(header);
        System.out.println("\n==================================================================================\n");

    }

    public static void printImportantNews(String title, String body) {
        System.out.println("\n==================================================================================\n");

        System.out.println("                       " + title);
        System.out.println("\n" + body);

        System.out.println("\n==================================================================================\n");

    }
}
