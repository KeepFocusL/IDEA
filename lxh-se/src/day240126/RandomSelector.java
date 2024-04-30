package day240126;

import java.util.Random;

public class RandomSelector {
  public static void main(String[] args) {
    String[] students = new String[]{"小红","小蓝","小白","小黑","小紫"};
    Random random = new Random();
   int randomIndex = random.nextInt(students.length);
   System.out.println(students[randomIndex]);
 }
}

