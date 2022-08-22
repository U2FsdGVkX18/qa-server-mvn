package util;

import lombok.extern.slf4j.Slf4j;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

@Slf4j
public class TimeTool {

    public static void main(String[] args) throws ParseException {
        String dateTime = getDateTime();
//        log.info(dateTime);
        System.out.println(dateTime);

        Long timeStamp = getTimeStamp(dateTime);
//        log.info(timeStamp.toString());
        System.out.println(timeStamp);

        Calendar cal = Calendar.getInstance();
        System.out.println("cal:" + cal.getTime());

        String dateTime13 = getDateTime13(1658911042945L);
        System.out.println(dateTime13);
    }

    // 获取当前时间后5分钟格式化时间
    public static String getDateTime() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.MINUTE, 5);
        return simpleDateFormat.format(cal.getTime());
    }

    // 传入日期时间型参数,获取当前时间后5分钟时间戳时间
    public static Long getTimeStamp(String s) throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = simpleDateFormat.parse(s);
        long time = date.getTime();
        return time / 1000L;
    }

    //传入时间戳格式时间,获取日期时间型时间-13位时间戳
    public static String getDateTime13(Long time) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String format = simpleDateFormat.format(time);
        return format;
    }


    public void getTime() {

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);

        Date date = new Date();
        long time = date.getTime();
        System.out.println(time / 1000);

        long l = System.currentTimeMillis();
        System.out.println(l / 1000);

        System.out.println(date);

        String format = simpleDateFormat.format(date);
        System.out.println(format);

        Calendar cal = Calendar.getInstance();
        System.out.println("cal:" + cal.getTime());

        cal.add(Calendar.MINUTE, 5);
//        Date time1 = cal.getTime();
//        String format1 = simpleDateFormat.format(time1);
//        System.out.println(format1);
        System.out.println(cal.getTime());

    }
}
