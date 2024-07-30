package day240730.non_enum_demo;

public class Day {
    public static final Day MONDAY = new Day("MONDAY");
    public static final Day TUESDAY = new Day("TUESDAY");
    public static final Day WEDNESDAY = new Day("WEDNESDAY");
    public static final Day THURSDAY = new Day("THURSDAY");
    public static final Day FRIDAY = new Day("FRIDAY");
    public static final Day SATURDAY = new Day("SATURDAY");
    public static final Day SUNDAY = new Day("SUNDAY");

    private final String name;

    private Day(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
