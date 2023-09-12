import java.time.LocalDate;

public class Main {

    public static void printBonusDatesBetween(int fromYear, int toYear) {
        for (int year = fromYear; year <= toYear; year++) {
            String yearStr = Integer.toString(year);
            String reversedYearStr = new StringBuilder(yearStr).reverse().toString();

            int month, day;
            try {
                month = Integer.parseInt(reversedYearStr.substring(0, 2));
                day = Integer.parseInt(reversedYearStr.substring(2, 4));
            } catch (NumberFormatException e) {
                continue;
            }

            if (month < 1 || month > 12 || day < 1 || day > 31) {
                continue;
            }

            try {
                LocalDate date = LocalDate.of(year, month, day);
                System.out.println(date);
            } catch (Exception e) {
                // Ignore invalid dates like February 30
            }
        }
    }
}