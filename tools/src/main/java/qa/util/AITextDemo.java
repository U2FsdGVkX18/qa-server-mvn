package qa.util;

import java.util.HashMap;

public class AITextDemo {
    public static void main(String[] args) {
        RestTemplateTool restTemplateTool = new RestTemplateTool();
        String url = "https://welm.weixin.qq.com/v1/completions";

        String text =
                "动漫：nekopara fantastically detailed reflecting eyes modern anime style art cute detailed ears cat girl neko dress portrait shinkai makoto vibrant Studio ghibli kyoto animation hideaki anno Sakimichan Stanley Artgerm Lau Rossdraws James Jean Marc Simonetti elegant highly detailed digital painting artstation pixiv \n" +
                        "3D动物：high quality 3 d render hyperrealist very cute pastel fluffy! red panda & tarsier hybrid eating giant ice cream full body, vray smooth, in the style of detective pikachu, charlie immer, very dramatic light, low angle, uhd 8 k, shallow depth or field \n" +
                        "景物：a highly detailed epic cinematic concept art CG render digital painting artwork: Lone house in the woods at night. By Greg Rutkowski, in the style of Francis Bacon and Syd Mead and Norman Rockwell and Beksinski, open ceiling, highly detailed, painted by Francis Bacon and Edward Hopper, painted by James Gilleard, surrealism, airbrush, Ilya Kuvshinov, WLOP, Stanley Artgerm, very coherent, triadic color scheme, art by Takato Yamamoto and James Jean \n" +
                        "风景建筑：ancient greek ruins, gray wasteland, many scrap cars, trash, rubble, overgrown, pillars and arches, flowers, vines, trees, hyperrealistic, highly detailed, cinematic, single ray of golden sunlight, beautiful, cgssociety, artstation, 8 k, oil painting by greg rutkowski, by artgerm, by wlop, by simon stalenhag \n" +
                        "人像：leanna stark angeline jolie, intricate, elegant, highly detailed, digital painting, artstation, concept art, smooth, sharp focus, illustration, art by artgerm and greg rutkowski and alphonse mucha and william - adolphe bouguereau \n" +
                        "二次元人物：nekopara fantastically detailed shining eyes modern anime style art cute vibrant detailed ears cat girl neko dress portrait  shinkai makoto Studio ghibli studio key hideaki anno Sakimichan Stanley Artgerm Lau Rossdraws James Jean Marc Simonetti elegant highly detailed digital painting artstation pixiv " +
                        "世界艾滋病日用AI守护爱:";

        HashMap<String, Object> p_map = new HashMap<>();
        p_map.put("prompt", text);
        p_map.put("model", "xl");
        p_map.put("max_tokens", 90);
        p_map.put("temperature", 0.85);
        p_map.put("top_p", 0.95);
        p_map.put("top_k", 50);
        p_map.put("n", 1);
        p_map.put("echo", false);
        p_map.put("stop", ",，.。\n");

//        ResponseEntity<JSONObject> response = restTemplateTool.sendPostRequest(url, getHeader(), new JSONObject(p_map));
//        System.out.println(response.getBody());
    }
}
