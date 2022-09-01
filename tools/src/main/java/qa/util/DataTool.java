package qa.util;

import lombok.extern.slf4j.Slf4j;
import net.datafaker.Faker;
import org.apache.commons.lang3.RandomStringUtils;

import java.util.Locale;


@Slf4j
public class DataTool {
    public static void main(String[] args) {
        Faker faker = new Faker(Locale.CHINA);
        String name = faker.name().fullName();
        String firstName = faker.name().firstName();
        String lastName = faker.name().lastName();
        String streetAddress = faker.address().streetAddress();
        String city = faker.address().city();
        String city1 = faker.address().cityName();
        String city2 = faker.address().fullAddress();
        String city3 = faker.address().state();
        String city4 = faker.address().secondaryAddress();
        String city5 = faker.address().streetName();
        String image = faker.avatar().image();
        String pw = faker.internet().password();
        String s = faker.phoneNumber().cellPhone();
        String s1 = faker.idNumber().validZhCNSsn();
        String quote = faker.bigBangTheory().quote();
        String valid = faker.idNumber().valid();
        String s2 = faker.idNumber().peselNumber();
        String name1 = faker.currency().name();
//        for (int i = 0; i < 10; i++) {
//            image = faker.avatar().image();
//            log.debug(image);
//        }

        log.debug(streetAddress);
        log.debug(city);
        log.debug(city1);
        log.debug(city2);
        log.debug(city3);
        log.debug(city4);
        log.debug(city5);
        log.debug(name1);
        log.debug(valid);
        log.debug(s1);
        log.debug(s2);


        System.out.println(RandomStringUtils.randomAlphanumeric(8));
        System.out.println(RandomStringUtils.randomAscii(32));
    }
}
