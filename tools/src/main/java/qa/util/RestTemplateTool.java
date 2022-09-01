package qa.util;

import com.alibaba.fastjson.JSONObject;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.ObjectUtils;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

@Slf4j
public class RestTemplateTool {

//    @Resource
//    private RestTemplate restTemplate;

    public static void main(String[] args) {

        String baseUrl = "https://restapi.amap.com/v3/geocode/geo";
        String key = "c17ba5b2f9277ed0326ab4fa6019b0cf";
        String url = baseUrl + "?key=" + key + "&address=" + "五常街道" + "&output=JSON";

        try {
            //做回调业务操作
            ResponseEntity<String> stringResponseEntity = sendGetRequest(url, new JSONObject());
            //if满足条件则接收消息,业务操作成功并结束
            if (ObjectUtils.isNotEmpty(stringResponseEntity)) {
                log.info("日志->>>RabbitMqListener->>>消费者接收到消息");
            } else {   //不满足条件则说明业务操作不通过,重新发送消息
                log.info("日志->>>RabbitMqListener->>>拒绝当前消息");
            }
        } catch (Exception e) {
            log.error("日志->>>RabbitMqListener->>>异常:{}", e.getMessage());
        }
    }

    private static HttpHeaders getHeader() {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        return headers;
    }

    private static ResponseEntity<String> sendGetRequest(String url, JSONObject params) {
        SimpleClientHttpRequestFactory clientHttpRequestFactory = new SimpleClientHttpRequestFactory();
        clientHttpRequestFactory.setConnectTimeout(900);
        clientHttpRequestFactory.setReadTimeout(10);
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.setRequestFactory(clientHttpRequestFactory);

        HttpEntity<JSONObject> requestEntity = new HttpEntity<>(params, getHeader());
        try {
            return restTemplate.getForEntity(url, String.class, requestEntity);
        } catch (RestClientException e) {
            log.error("日志->>>异常:{}", e.getMessage());
            return null;
        }
    }
}