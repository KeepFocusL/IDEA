package SHomeWork.h1;

import javax.swing.*;

public class TriangleC {
    public static void main(String[] args) {
        String a = JOptionPane.showInputDialog("请输入边长a");
        String b = JOptionPane.showInputDialog("请输入边长b");
        String c = JOptionPane.showInputDialog("请输入边长c");
        double numbera = Double.parseDouble(a);
        double numberb = Double.parseDouble(b);
        double numberc = Double.parseDouble(c);
        double C = numbera + numberb + numberc;
        JOptionPane.showMessageDialog(null, "三角形周长为" + C);
    }
}
