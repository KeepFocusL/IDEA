package day240802;

import java.util.List;
import java.util.Vector;

/**
 * 模拟车站买票的场景：总共有 10000 张票，同时开放 10 个窗口对外售卖
 * <p>
 * 写一个程序，模拟该场景
 * <p>
 * 分析下面的程序：会不会出问题？会出什么问题？为什么？如何改进？
 */
public class TicketWindows {
    static List<String> tickets = new Vector<>();

    static {
        for (int i = 0; i < 10000; i++) {
            tickets.add("车票编码---" + i);
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    while (!tickets.isEmpty()) {
                        try {
                            Thread.sleep(1);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                        // 加了小小睡眠之后，更直观的感受：isEmpty + remove 两个动作不是原子操作
                        System.out.println("售出===" + tickets.remove(0));
                    }
                }
            }).start();
        }
    }
}