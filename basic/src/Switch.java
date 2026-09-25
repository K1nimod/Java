public class Switch {
    static void main() {
        String day = "SATURDAY";

        // 1. Using Arrow Syntax to return a value directly
        String assignment = switch (day) {
            case "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY" -> "Weekday";
            case "SATURDAY", "SUNDAY" -> "Weekend";
            default -> "Invalid day";
        };

        System.out.println(day + " is a " + assignment);




    }
}
