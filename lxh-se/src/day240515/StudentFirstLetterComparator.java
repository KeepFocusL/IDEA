package day240515;

public class StudentFirstLetterComparator implements MyComparator {
    @Override
    public int compare(Object o1, Object o2) {
        Student s1 = (Student) o1;
        Student s2 = (Student) o2;
        if (s1.firstLetter == s2.firstLetter) {
            return 0;
        } else if (s1.firstLetter > s2.firstLetter) {
            return 1;
        } else {
            return -1;
        }
    }
}
