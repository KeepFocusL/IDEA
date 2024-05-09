package day240508.CountTime;

public abstract class Time {
    public abstract void count();
    public void getTime() {
        long start = System.currentTimeMillis();
        count();
        long end = System.currentTimeMillis();
        System.out.println(end - start);

    }

}
