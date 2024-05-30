package day240515;

public class Test2 {
    public static void main(String[] args) {
        // 回顾 char 类型以及对应的数值
       /* char a = 'A';
        char c = 'C';
        char z = 'Z';
        System.out.println((int)a);
        System.out.println((int)c);
        System.out.println((int)z);*/

        // 新需求：支持按学生姓名的姓氏首字母排序
        int size = 5;
        Student[] studentArr = new Student[size];
        studentArr[0] = new Student("Z老师", 'Z', 23);
        studentArr[1] = new Student("G老师", 'G', 22);
        studentArr[2] = new Student("C老师", 'C', 21);
        studentArr[3] = new Student("A老师", 'A', 20);
        studentArr[4] = new Student("E老师", 'E', 19);

        MySortUtil.print(studentArr);
        // MySortUtil.sort(studentArr, new StudentFirstLetterComparator());
        MySortUtil.sort(studentArr, new StudentAgeComparator());
        MySortUtil.print(studentArr);
    }
}
