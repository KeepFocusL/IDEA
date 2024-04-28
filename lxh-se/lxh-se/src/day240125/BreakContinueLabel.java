package day240125;

public class BreakContinueLabel { public static void main(String[] args) {
    for (int i = 1; i <= 5; i++) {
        System.out.print(i + " ");
    }

    System.out.println();
    System.out.println("=== === ===");
    // 新需求：如果碰到4，直接跳过，不打印

    for (int i = 1; i <= 5; i++) {
        if (i == 4) {
            continue;
        }
        System.out.print(i + " ");
    }

    System.out.println();
    System.out.println("=== === ===");
    // 新需求：如果碰到4，就停止打印，后面5也不再执行

    for (int i = 1; i <= 5; i++) {
        if (i == 4) {
            break;
        }
        System.out.print(i + " ");
    }

    System.out.println();
    System.out.println("=== === ===");
    // 新需求：多重循环。重复执行上一个需求，3次

    for (int j = 1; j <= 3; j++) {
        for (int i = 1; i <= 5; i++) {
            if (i == 4) {
                break;
            }
            System.out.print(i + " ");
        }
        System.out.print(",");
    }

    System.out.println();
    System.out.println("=== --- --- --- ===");
    // 新需求：多重循环。break 的时候，指定 break 外层的 for 循环

    label: for (int j = 1; j <= 3; j++) {
        for (int i = 1; i <= 5; i++) {
            if (i == 4) {
                // continue label;
                break label;
            }
            System.out.print(i + " ");
        }
        System.out.print(",");
    }

    System.out.println();
 }
}

