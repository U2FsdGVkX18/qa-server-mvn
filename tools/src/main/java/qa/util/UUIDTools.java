package qa.util;

import java.nio.charset.StandardCharsets;
import java.util.Random;
import java.util.UUID;

public class UUIDTools {

    public static void main(String[] args) {
        UUID uuid = UUID.randomUUID();
        String s = uuid.toString();
        System.out.println(s);
        String replace = s.replace("-", "");
        System.out.println(replace);
        byte[] bytes = s.getBytes(StandardCharsets.UTF_8);
        System.out.println(bytes);
        String substring = s.substring(0, 13);
        boolean b = substring.contains("b");
        System.out.println(substring);
        System.out.println(b);

        Random random = new Random();
        for (int j = 0; j < 100; j++) {
            int i = random.nextInt(2);
            System.out.println(i);
        }


    }
}
