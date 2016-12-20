import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;

import java.util.Map;

/**
 * Created by joe on 2016/11/29.
 */
public class biDemo {
    public static void main(String[] args) {
        bimapDemo();

    }
    public  static void bimapDemo(){
        HashBiMap<String, String> biMap = HashBiMap.create();
        biMap.put("小王","xiaowang@q.com");
//        biMap.put("小李","xiaowang@q.com");
        biMap.put("小明","xiaoming@q.com");
        biMap.put("小狗","xiaogou@q.com");

       BiMap<String, String> inverse = biMap.inverse();

        for (Map.Entry<String,String> entry:inverse.entrySet()) {
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }
}
