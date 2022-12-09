package qa.util;

import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

public class RequestDemo {
    public static void main(String[] args) {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.set("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJleHAiOjE2NzAzMDY4ODYsIm9yaWdfaWF0IjoxNjY5NzAyMDg2LCJ1c2VyX2luZm8iOiJZT0RwbGJQUzdURitHbjlUS2pXa1BkZVkrVklXWXVMTVcyQkpRMnNGTGk0c3BhRXllVTZ6ZVdUVXFQU2VaT3Npb3JIeVdnOW44cEMrVEs5dFdYcGJDU0p4TnlHaFl6SzkxWTE5Nnl5S2lFMTJzMWw1bUJlQnBVZlVpeURjZnExMSIsInYiOiIwLjE0LjAifQ.H8SJamuvGMnlaf-kPQt5jA5DK-XLgYwliEI9JgQlGtc");

        RestTemplate restTemplate = new RestTemplate();

        String machineStatusUrl = "https://matpool.com/api/nodes?order={order}&page={page}&per_page={per_page}";

        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("order", false);
        hashMap.put("page", 1);
        hashMap.put("per_page", 10);

        HttpEntity<Map<String, Object>> mapHttpEntity = new HttpEntity<>(headers);

        ResponseEntity<String> response = restTemplate.exchange(machineStatusUrl, HttpMethod.GET, mapHttpEntity, String.class, hashMap);

        System.out.println(response.getBody());
    }
}
