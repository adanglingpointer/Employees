package cloud.imail.employees;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String people = """
            Flinstone, Fred, 1/1/1900, Programmer
            Rubble, Barney, 2/2/1905, Manager
            Flinstone, Wilma, 3/3/1910, Analyst
            Rubble, Betty, 4/4/1915, CEO
            """;

        String regex = "(?<lastName>\\w+),\\s*(?<firstName>\\w+),\\s*(?<dob>\\d{1,2}/\\d{1,2}/\\d{4}),\\s*\\n";
        Pattern pat = Pattern.compile(regex);
        Matcher mat = pat.matcher(people);

        while (mat.find()) {
            System.out.printf("%s %s %s%n", mat.group("firstName"), mat.group("lastName"), mat.group("dob"));
        }
    }
}
