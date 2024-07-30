package day240729.notificator;

import java.util.List;

public class NopeNotificator implements Notificator {

    @Override
    public void notice(List<String> result, String keywords) {
        System.out.println("keywords=" + keywords);
        System.out.println("假装我已经处理了");
    }
}
