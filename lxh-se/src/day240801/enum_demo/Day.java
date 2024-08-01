package day240801.enum_demo;

public enum Day implements FofEnumDemo {
    MONDAY,
    TUESDAY,
    MEDNESDAY,
    THURDAY,
    FIRDAY,
    SATURDAY,
    SUNDAY;


    @Override
    public void desc() {
        System.out.println("XXX");
    }
}
