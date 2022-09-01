package qa.util;

import com.dingtalk.api.DefaultDingTalkClient;
import com.dingtalk.api.DingTalkClient;
import com.dingtalk.api.request.OapiRobotSendRequest;
import com.dingtalk.api.response.OapiRobotSendResponse;
import com.taobao.api.ApiException;

public class DingTest {
    public static void main(String[] args) throws ApiException {
        DingTalkClient client = new DefaultDingTalkClient("https://oapi.dingtalk.com/robot/send?access_token=220ecdf20c8f65ed393f916fc68b5575de51efd0309634c7b9f57c6d7354e40a");
        OapiRobotSendRequest request = new OapiRobotSendRequest();
        request.setMsgtype("text");
        OapiRobotSendRequest.Text text = new OapiRobotSendRequest.Text();

        text.setContent("test测试文本消息");
        request.setText(text);
        OapiRobotSendRequest.At at = new OapiRobotSendRequest.At();
//        at.setAtMobiles(Arrays.asList("132xxxxxxxx"));
        // isAtAll类型如果不为Boolean，请升级至最新SDK
        at.setIsAtAll(false);

//        at.setAtUserIds(Arrays.asList("109929", "32099"));
        request.setAt(at);
        OapiRobotSendResponse response = client.execute(request);
        System.out.println(response);

    }
}
