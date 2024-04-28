package day240308;

public class StringConcat {
    public static void main(String[] args) {
        String b = "-";
        String c = ",";
        String d = "!";
        String e = "=";
        String f = "";
        String p = "Hello" + b + "World" + b + d;
        String q = "Hello" + c + "World" + c + d;
        String r = "Hello" + e + "World" + e + d;
        String x = f.concat(p);
        String y = f.concat(q);
        String z = f.concat(r);
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        //concat("-","hello","world","!");
        //concat(",","hello","world","!");
        //concat("=","hello","world","!");
    }
}