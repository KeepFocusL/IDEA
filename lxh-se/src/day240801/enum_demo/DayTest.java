package day240801.enum_demo;


public class DayTest {
    public static void main(String[] args) {
        System.out.println(Day.TUESDAY);

        for (Day day :Day.values()) {
            day.desc();
        }
    }
}
