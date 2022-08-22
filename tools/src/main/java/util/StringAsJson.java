package util;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

public class StringAsJson {

    public static void main(String[] args) {
        String str = "{\"code\":0,\"msg\":\"\",\"volumeDescs\":[{\"displayID\":\"NGD4yG\",\"volumeInfo\":{\"id\":0,\"type\":3,\"quotaGB\":10,\"root\":\"/iaas_group/530\",\"initialQuotaGB\":10,\"usageMB\":0},\"subject\":\"自动化测试_1\",\"ownerType\":3},{\"displayID\":\"124A6v\",\"volumeInfo\":{\"id\":0,\"type\":3,\"quotaGB\":10,\"root\":\"/iaas_group/531\",\"initialQuotaGB\":10,\"usageMB\":7},\"subject\":\"自动化测试-c19b01c6-9b47\",\"ownerType\":3},{\"displayID\":\"o0MZ1G\",\"volumeInfo\":{\"id\":0,\"type\":3,\"quotaGB\":10,\"root\":\"/iaas_group/533\",\"initialQuotaGB\":10,\"usageMB\":7},\"subject\":\"团队套餐\",\"ownerType\":3},{\"displayID\":\"AGqYJG\",\"volumeInfo\":{\"id\":0,\"type\":3,\"quotaGB\":10,\"root\":\"/iaas_group/534\",\"initialQuotaGB\":10,\"usageMB\":7},\"subject\":\"团队套餐1\",\"ownerType\":3},{\"displayID\":\"p0O1b2\",\"volumeInfo\":{\"id\":0,\"type\":3,\"quotaGB\":20,\"root\":\"/iaas_group/535\",\"initialQuotaGB\":20,\"usageMB\":7},\"subject\":\"团队套餐2\",\"ownerType\":3},{\"displayID\":\"X0Z1xv\",\"volumeInfo\":{\"id\":0,\"type\":3,\"quotaGB\":10,\"root\":\"/iaas_group/536\",\"initialQuotaGB\":10,\"usageMB\":7},\"subject\":\"大型团队套餐\",\"ownerType\":3},{\"displayID\":\"mGB4dv\",\"volumeInfo\":{\"id\":0,\"type\":3,\"quotaGB\":10,\"root\":\"/iaas_group/537\",\"initialQuotaGB\":10,\"usageMB\":7},\"subject\":\"自动化测试-4b18869d-cca3\",\"ownerType\":3},{\"displayID\":\"WG19ZG\",\"volumeInfo\":{\"id\":0,\"type\":3,\"quotaGB\":50,\"root\":\"/iaas_group/538\",\"initialQuotaGB\":50,\"usageMB\":7},\"subject\":\"自动化中型团队\",\"ownerType\":3},{\"displayID\":\"925yE2\",\"volumeInfo\":{\"id\":0,\"type\":3,\"quotaGB\":50,\"root\":\"/iaas_group/539\",\"initialQuotaGB\":50,\"usageMB\":7},\"subject\":\"自动化测试-3e1a0a2b-318d\",\"ownerType\":3},{\"displayID\":\"40J4K2\",\"volumeInfo\":{\"id\":0,\"type\":3,\"quotaGB\":500,\"root\":\"/iaas_group/540\",\"initialQuotaGB\":500,\"usageMB\":7},\"subject\":\"大型团队\",\"ownerType\":3},{\"displayID\":\"pGRRVG\",\"volumeInfo\":{\"id\":0,\"type\":3,\"quotaGB\":500,\"root\":\"/iaas_group/541\",\"initialQuotaGB\":500,\"usageMB\":7},\"subject\":\"自动化测试-9e916a60-3d27\",\"ownerType\":3},{\"displayID\":\"g2bkkv\",\"volumeInfo\":{\"id\":0,\"type\":3,\"quotaGB\":10,\"root\":\"/iaas_group/542\",\"initialQuotaGB\":10,\"usageMB\":7},\"subject\":\"自动化测试-d9f421f5-707e\",\"ownerType\":3},{\"displayID\":\"p0wmk2\",\"volumeInfo\":{\"id\":0,\"type\":3,\"quotaGB\":10,\"root\":\"/iaas_group/543\",\"initialQuotaGB\":10,\"usageMB\":7},\"subject\":\"自动化测试-2ac2d771-1167\",\"ownerType\":3},{\"displayID\":\"AGWOnG\",\"volumeInfo\":{\"id\":0,\"type\":3,\"quotaGB\":10,\"root\":\"/iaas_group/544\",\"initialQuotaGB\":10,\"usageMB\":7},\"subject\":\"自动化测试-360a0e6f-1903\",\"ownerType\":3},{\"displayID\":\"ZGn9N0\",\"volumeInfo\":{\"id\":0,\"type\":3,\"quotaGB\":500,\"root\":\"/iaas_group/545\",\"initialQuotaGB\":500,\"usageMB\":7},\"subject\":\"自动化测试-b3a210cb-3d89\",\"ownerType\":3},{\"displayID\":\"yv3jw2\",\"volumeInfo\":{\"id\":0,\"type\":3,\"quotaGB\":10,\"root\":\"/iaas_group/546\",\"initialQuotaGB\":10,\"usageMB\":7},\"subject\":\"自动化测试-846b87c2-5d87\",\"ownerType\":3},{\"displayID\":\"p0O132\",\"volumeInfo\":{\"id\":0,\"type\":3,\"quotaGB\":10,\"root\":\"/iaas_group/547\",\"initialQuotaGB\":10,\"usageMB\":7},\"subject\":\"自动化测试-b8c782f6-b715\",\"ownerType\":3},{\"displayID\":\"X0Z1mv\",\"volumeInfo\":{\"id\":0,\"type\":3,\"quotaGB\":50,\"root\":\"/iaas_group/548\",\"initialQuotaGB\":50,\"usageMB\":7},\"subject\":\"自动化测试-8c4d547b-99bc\",\"ownerType\":3},{\"displayID\":\"mGB43v\",\"volumeInfo\":{\"id\":0,\"type\":3,\"quotaGB\":500,\"root\":\"/iaas_group/549\",\"initialQuotaGB\":500,\"usageMB\":7},\"subject\":\"自动化测试-a67b26f5-b302\",\"ownerType\":3},{\"displayID\":\"WG19bG\",\"volumeInfo\":{\"id\":0,\"type\":3,\"quotaGB\":10,\"root\":\"/iaas_group/550\",\"initialQuotaGB\":10,\"usageMB\":7},\"subject\":\"自动化测试-5c928d09-3d09\",\"ownerType\":3},{\"displayID\":\"925ya2\",\"volumeInfo\":{\"id\":0,\"type\":3,\"quotaGB\":50,\"root\":\"/iaas_group/551\",\"initialQuotaGB\":50,\"usageMB\":7},\"subject\":\"自动化测试-2251edb3-bd19\",\"ownerType\":3},{\"displayID\":\"40J4E2\",\"volumeInfo\":{\"id\":0,\"type\":3,\"quotaGB\":500,\"root\":\"/iaas_group/552\",\"initialQuotaGB\":500,\"usageMB\":7},\"subject\":\"自动化测试-658938ed-5032\",\"ownerType\":3},{\"displayID\":\"pGRREG\",\"volumeInfo\":{\"id\":0,\"type\":3,\"quotaGB\":10,\"root\":\"/iaas_group/553\",\"initialQuotaGB\":10,\"usageMB\":7},\"subject\":\"自动化测试-b97ddc21-f9b3\",\"ownerType\":3},{\"displayID\":\"g2bkqv\",\"volumeInfo\":{\"id\":0,\"type\":3,\"quotaGB\":50,\"root\":\"/iaas_group/554\",\"initialQuotaGB\":50,\"usageMB\":7},\"subject\":\"自动化测试-9ca6ceab-599b\",\"ownerType\":3},{\"displayID\":\"p0wmP2\",\"volumeInfo\":{\"id\":0,\"type\":3,\"quotaGB\":500,\"root\":\"/iaas_group/555\",\"initialQuotaGB\":500,\"usageMB\":7},\"subject\":\"自动化测试-7d65159b-b84b\",\"ownerType\":3},{\"displayID\":\"AGWOkG\",\"volumeInfo\":{\"id\":0,\"type\":3,\"quotaGB\":10,\"root\":\"/iaas_group/556\",\"initialQuotaGB\":10,\"usageMB\":7},\"subject\":\"自动化测试-5b363807-35f3\",\"ownerType\":3},{\"displayID\":\"ZGn9y0\",\"volumeInfo\":{\"id\":0,\"type\":3,\"quotaGB\":50,\"root\":\"/iaas_group/557\",\"initialQuotaGB\":50,\"usageMB\":7},\"subject\":\"自动化测试-1a780c71-265f\",\"ownerType\":3},{\"displayID\":\"yv3jN2\",\"volumeInfo\":{\"id\":0,\"type\":3,\"quotaGB\":500,\"root\":\"/iaas_group/558\",\"initialQuotaGB\":500,\"usageMB\":7},\"subject\":\"自动化测试-09439e35-bd19\",\"ownerType\":3},{\"displayID\":\"a0K4OG\",\"volumeInfo\":{\"id\":0,\"type\":3,\"quotaGB\":10,\"root\":\"/iaas_group/559\",\"initialQuotaGB\":10,\"usageMB\":7},\"subject\":\"自动化测试-4f3e2102-85c9\",\"ownerType\":3},{\"displayID\":\"Avan60\",\"volumeInfo\":{\"id\":0,\"type\":3,\"quotaGB\":50,\"root\":\"/iaas_group/560\",\"initialQuotaGB\":50,\"usageMB\":7},\"subject\":\"自动化测试-56661240-6baf\",\"ownerType\":3},{\"displayID\":\"mvP5A0\",\"volumeInfo\":{\"id\":0,\"type\":3,\"quotaGB\":500,\"root\":\"/iaas_group/561\",\"initialQuotaGB\":500,\"usageMB\":7},\"subject\":\"自动化测试-076667f9-e549\",\"ownerType\":3},{\"displayID\":\"oGeNR2\",\"volumeInfo\":{\"id\":0,\"type\":3,\"quotaGB\":10,\"root\":\"/iaas_group/562\",\"initialQuotaGB\":10,\"usageMB\":7},\"subject\":\"自动化测试-3d72f49b-0431\",\"ownerType\":3},{\"displayID\":\"nGLOb0\",\"volumeInfo\":{\"id\":0,\"type\":3,\"quotaGB\":50,\"root\":\"/iaas_group/563\",\"initialQuotaGB\":50,\"usageMB\":7},\"subject\":\"自动化测试-856ae424-56d8\",\"ownerType\":3},{\"displayID\":\"pvQJZ0\",\"volumeInfo\":{\"id\":0,\"type\":3,\"quotaGB\":10,\"root\":\"/iaas_group/564\",\"initialQuotaGB\":10,\"usageMB\":7},\"subject\":\"自动化测试-8cdf53c4-90f8\",\"ownerType\":3},{\"displayID\":\"V091p0\",\"volumeInfo\":{\"id\":0,\"type\":3,\"quotaGB\":10,\"root\":\"/iaas_group/565\",\"initialQuotaGB\":10,\"usageMB\":7},\"subject\":\"自动化测试-04a619ad-6850\",\"ownerType\":3},{\"displayID\":\"X2Vny2\",\"volumeInfo\":{\"id\":0,\"type\":3,\"quotaGB\":50,\"root\":\"/iaas_group/566\",\"initialQuotaGB\":50,\"usageMB\":7},\"subject\":\"自动化测试-7f9bdd91-50c8\",\"ownerType\":3},{\"displayID\":\"12A4aG\",\"volumeInfo\":{\"id\":0,\"type\":3,\"quotaGB\":500,\"root\":\"/iaas_group/567\",\"initialQuotaGB\":500,\"usageMB\":7},\"subject\":\"自动化测试-018d58a2-04d9\",\"ownerType\":3},{\"displayID\":\"yGkjl0\",\"volumeInfo\":{\"id\":0,\"type\":3,\"quotaGB\":10,\"root\":\"/iaas_group/568\",\"initialQuotaGB\":10,\"usageMB\":7},\"subject\":\"自动化测试-1e3db777-6cd4\",\"ownerType\":3},{\"displayID\":\"pGzmO0\",\"volumeInfo\":{\"id\":0,\"type\":3,\"quotaGB\":50,\"root\":\"/iaas_group/569\",\"initialQuotaGB\":50,\"usageMB\":7},\"subject\":\"自动化测试-aef30d7c-6252\",\"ownerType\":3},{\"displayID\":\"nvgQPG\",\"volumeInfo\":{\"id\":0,\"type\":3,\"quotaGB\":500,\"root\":\"/iaas_group/570\",\"initialQuotaGB\":500,\"usageMB\":7},\"subject\":\"自动化测试-f7de707c-ce7c\",\"ownerType\":3},{\"displayID\":\"rG8B9v\",\"volumeInfo\":{\"id\":0,\"type\":3,\"quotaGB\":10,\"root\":\"/iaas_group/571\",\"initialQuotaGB\":10,\"usageMB\":7},\"subject\":\"自动化测试-8ca20a61-b5f7\",\"ownerType\":3},{\"displayID\":\"jvyde2\",\"volumeInfo\":{\"id\":0,\"type\":3,\"quotaGB\":50,\"root\":\"/iaas_group/572\",\"initialQuotaGB\":50,\"usageMB\":7},\"subject\":\"自动化测试-a1806b8e-8e20\",\"ownerType\":3},{\"displayID\":\"yvlEe0\",\"volumeInfo\":{\"id\":0,\"type\":3,\"quotaGB\":500,\"root\":\"/iaas_group/573\",\"initialQuotaGB\":500,\"usageMB\":7},\"subject\":\"自动化测试-c17d3d4b-7504\",\"ownerType\":3},{\"displayID\":\"J26Ozv\",\"volumeInfo\":{\"id\":0,\"type\":3,\"quotaGB\":10,\"root\":\"/iaas_group/574\",\"initialQuotaGB\":10,\"usageMB\":7},\"subject\":\"自动化测试-9f65311c-aada\",\"ownerType\":3},{\"displayID\":\"9GxxKG\",\"volumeInfo\":{\"id\":0,\"type\":3,\"quotaGB\":50,\"root\":\"/iaas_group/575\",\"initialQuotaGB\":50,\"usageMB\":7},\"subject\":\"自动化测试-9e1d94f2-3a12\",\"ownerType\":3},{\"displayID\":\"RG7mVv\",\"volumeInfo\":{\"id\":0,\"type\":3,\"quotaGB\":500,\"root\":\"/iaas_group/576\",\"initialQuotaGB\":500,\"usageMB\":7},\"subject\":\"自动化测试-eb7f6f00-4e8b\",\"ownerType\":3},{\"displayID\":\"gGjMY0\",\"volumeInfo\":{\"id\":0,\"type\":3,\"quotaGB\":10,\"root\":\"/iaas_group/577\",\"initialQuotaGB\":10,\"usageMB\":7},\"subject\":\"自动化测试-7c51d26c-9dda\",\"ownerType\":3},{\"displayID\":\"EGYnb2\",\"volumeInfo\":{\"id\":0,\"type\":3,\"quotaGB\":50,\"root\":\"/iaas_group/578\",\"initialQuotaGB\":50,\"usageMB\":7},\"subject\":\"自动化测试-28ef27ee-732d\",\"ownerType\":3},{\"displayID\":\"E2mor0\",\"volumeInfo\":{\"id\":0,\"type\":3,\"quotaGB\":500,\"root\":\"/iaas_group/579\",\"initialQuotaGB\":500,\"usageMB\":7},\"subject\":\"自动化测试-917cdcb7-c081\",\"ownerType\":3},{\"displayID\":\"42XW7G\",\"volumeInfo\":{\"id\":0,\"type\":3,\"quotaGB\":10,\"root\":\"/iaas_group/580\",\"initialQuotaGB\":10,\"usageMB\":0},\"subject\":\"自动化测试-3a3b0dca-123\",\"ownerType\":3},{\"displayID\":\"M0EBdG\",\"volumeInfo\":{\"id\":0,\"type\":3,\"quotaGB\":50,\"root\":\"/iaas_group/581\",\"initialQuotaGB\":50,\"usageMB\":0},\"subject\":\"自动化测试-dfe23170-60bf\",\"ownerType\":3},{\"displayID\":\"W0d9QG\",\"volumeInfo\":{\"id\":0,\"type\":3,\"quotaGB\":10,\"root\":\"/iaas_group/588\",\"initialQuotaGB\":10,\"usageMB\":0},\"subject\":\"自动化测试-942311d1-349d\",\"ownerType\":3},{\"displayID\":\"NGDZZv\",\"volumeInfo\":{\"id\":0,\"type\":3,\"quotaGB\":50,\"root\":\"/iaas_group/589\",\"initialQuotaGB\":50,\"usageMB\":0},\"subject\":\"自动化测试-ee1bf76d-a6d5\",\"ownerType\":3},{\"displayID\":\"124DM2\",\"volumeInfo\":{\"id\":0,\"type\":3,\"quotaGB\":500,\"root\":\"/iaas_group/590\",\"initialQuotaGB\":500,\"usageMB\":0},\"subject\":\"自动化测试-1907b99f-0e5f\",\"ownerType\":3},{\"displayID\":\"o0MnRG\",\"volumeInfo\":{\"id\":0,\"type\":3,\"quotaGB\":10,\"root\":\"/iaas_group/591\",\"initialQuotaGB\":10,\"usageMB\":0},\"subject\":\"自动化测试-fd34797a-06c4\",\"ownerType\":3},{\"displayID\":\"AGqLx0\",\"volumeInfo\":{\"id\":0,\"type\":3,\"quotaGB\":50,\"root\":\"/iaas_group/592\",\"initialQuotaGB\":50,\"usageMB\":0},\"subject\":\"自动化测试-a66013d2-eda2\",\"ownerType\":3},{\"displayID\":\"p0OO30\",\"volumeInfo\":{\"id\":0,\"type\":3,\"quotaGB\":500,\"root\":\"/iaas_group/593\",\"initialQuotaGB\":500,\"usageMB\":0},\"subject\":\"自动化测试-0f85cb36-b139\",\"ownerType\":3},{\"displayID\":\"yvlYe0\",\"volumeInfo\":{\"id\":0,\"type\":3,\"quotaGB\":10,\"root\":\"/iaas_group/620\",\"initialQuotaGB\":10,\"usageMB\":0},\"subject\":\"自动化测试-5e44eeef-12ee\",\"ownerType\":3},{\"displayID\":\"J26qzG\",\"volumeInfo\":{\"id\":0,\"type\":3,\"quotaGB\":50,\"root\":\"/iaas_group/621\",\"initialQuotaGB\":50,\"usageMB\":0},\"subject\":\"自动化测试-e4055555-f510\",\"ownerType\":3},{\"displayID\":\"9GxgK0\",\"volumeInfo\":{\"id\":0,\"type\":3,\"quotaGB\":500,\"root\":\"/iaas_group/622\",\"initialQuotaGB\":500,\"usageMB\":0},\"subject\":\"自动化测试-1098b8a7-9df6\",\"ownerType\":3},{\"displayID\":\"RG7MVv\",\"volumeInfo\":{\"id\":0,\"type\":3,\"quotaGB\":10,\"root\":\"/iaas_group/623\",\"initialQuotaGB\":10,\"usageMB\":0},\"subject\":\"自动化测试-86eda8aa-1102\",\"ownerType\":3},{\"displayID\":\"gGjrYG\",\"volumeInfo\":{\"id\":0,\"type\":3,\"quotaGB\":50,\"root\":\"/iaas_group/624\",\"initialQuotaGB\":50,\"usageMB\":0},\"subject\":\"自动化测试-882fde07-0b13\",\"ownerType\":3},{\"displayID\":\"EGYKbv\",\"volumeInfo\":{\"id\":0,\"type\":3,\"quotaGB\":500,\"root\":\"/iaas_group/625\",\"initialQuotaGB\":500,\"usageMB\":0},\"subject\":\"自动化测试-98d1ad73-9265\",\"ownerType\":3},{\"displayID\":\"E2mer2\",\"volumeInfo\":{\"id\":0,\"type\":3,\"quotaGB\":500,\"root\":\"/iaas_group/626\",\"initialQuotaGB\":500,\"usageMB\":0},\"subject\":\"自动化测试-ce9ec79f-5ab0\",\"ownerType\":3},{\"displayID\":\"42X37G\",\"volumeInfo\":{\"id\":0,\"type\":3,\"quotaGB\":500,\"root\":\"/iaas_group/627\",\"initialQuotaGB\":500,\"usageMB\":0},\"subject\":\"自动化测试-3736602e-dba7\",\"ownerType\":3},{\"displayID\":\"M0ErdG\",\"volumeInfo\":{\"id\":0,\"type\":3,\"quotaGB\":500,\"root\":\"/iaas_group/628\",\"initialQuotaGB\":500,\"usageMB\":0},\"subject\":\"自动化测试-4c74964e-8f07\",\"ownerType\":3},{\"displayID\":\"Pvoolv\",\"volumeInfo\":{\"id\":0,\"type\":3,\"quotaGB\":500,\"root\":\"/iaas_group/629\",\"initialQuotaGB\":500,\"usageMB\":0},\"subject\":\"自动化测试-850e1be1-cd21\",\"ownerType\":3},{\"displayID\":\"3vrYQ2\",\"volumeInfo\":{\"id\":0,\"type\":3,\"quotaGB\":500,\"root\":\"/iaas_group/630\",\"initialQuotaGB\":500,\"usageMB\":0},\"subject\":\"自动化测试-0b7d76ab-6e3f\",\"ownerType\":3},{\"displayID\":\"o2peDv\",\"volumeInfo\":{\"id\":0,\"type\":3,\"quotaGB\":500,\"root\":\"/iaas_group/631\",\"initialQuotaGB\":500,\"usageMB\":0},\"subject\":\"自动化测试-cd608117-8aee\",\"ownerType\":3},{\"displayID\":\"8GNZ7G\",\"volumeInfo\":{\"id\":0,\"type\":3,\"quotaGB\":500,\"root\":\"/iaas_group/632\",\"initialQuotaGB\":500,\"usageMB\":0},\"subject\":\"自动化测试-6c9b97ef\",\"ownerType\":3},{\"displayID\":\"W0djQ2\",\"volumeInfo\":{\"id\":0,\"type\":3,\"quotaGB\":500,\"root\":\"/iaas_group/633\",\"initialQuotaGB\":500,\"usageMB\":0},\"subject\":\"自动化测试-1514a1f3-4b03\",\"ownerType\":3},{\"displayID\":\"NGDMZ2\",\"volumeInfo\":{\"id\":0,\"type\":3,\"quotaGB\":500,\"root\":\"/iaas_group/634\",\"initialQuotaGB\":500,\"usageMB\":0},\"subject\":\"自动化测试-62088a4b-1b6a\",\"ownerType\":3},{\"displayID\":\"124MMv\",\"volumeInfo\":{\"id\":0,\"type\":3,\"quotaGB\":500,\"root\":\"/iaas_group/635\",\"initialQuotaGB\":500,\"usageMB\":7},\"subject\":\"自动化测试-8a74fdc4-a3c6\",\"ownerType\":3},{\"displayID\":\"o0MOR2\",\"volumeInfo\":{\"id\":0,\"type\":3,\"quotaGB\":500,\"root\":\"/iaas_group/636\",\"initialQuotaGB\":500,\"usageMB\":0},\"subject\":\"自动化测试-8e05ed49-df24\",\"ownerType\":3},{\"displayID\":\"AGqDx0\",\"volumeInfo\":{\"id\":0,\"type\":3,\"quotaGB\":500,\"root\":\"/iaas_group/637\",\"initialQuotaGB\":500,\"usageMB\":1},\"subject\":\"自动化测试-c4919207-0624\",\"ownerType\":3},{\"displayID\":\"12A1m2\",\"volumeInfo\":{\"id\":0,\"type\":1,\"quotaGB\":55,\"root\":\"/iaas/533\",\"initialQuotaGB\":5,\"usageMB\":2},\"subject\":\"\",\"ownerType\":1}]}";
        JSONObject jsonObject = JSONObject.parseObject(str);
        JSONArray volumeDescs = jsonObject.getJSONArray("volumeDescs");
        JSONObject display = volumeDescs.getJSONObject(volumeDescs.size() - 2);
        String displayID = (String) display.get("displayID");
        System.out.println(displayID);
    }
}
