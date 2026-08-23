package StringsPractice;

public class PrettyPrinting {
    public static void main(String[] args) {
        String movie = "Ultimate Spider Man";
        int ticketPrice = 150;
        System.out.println("||-------------Mall----------||");
        System.out.printf("%-15s : %s%n", "Movie Name", movie);
        System.out.printf("%-15s : %d%n","Ticket Price", ticketPrice);
        System.out.println("Enjoy!");
    }
}
