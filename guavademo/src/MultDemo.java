import com.google.common.collect.HashMultimap;
import com.google.common.collect.HashMultiset;
import com.google.common.collect.Multimap;
import com.google.common.collect.Multiset;

import java.util.HashSet;

/**
 * Created by joe on 2016/11/29.
 */
public class MultDemo {
    public static void main(String[] args) {
        mapDemo();
    }

    public static void setDemo() {

        HashSet<String> hashSet = new HashSet();
        hashSet.add("123");
        hashSet.add("123");
//        System.out.println(hashSet.size());

        Multiset<String> set = HashMultiset.create();
        set.add("123");
        set.add("123");
        set.add("234");
        set.addAll(hashSet);


        System.out.println(set.size());
        System.out.println(set.count("123"));

    }

    public static void mapDemo(){
        Multimap<String,String> map = HashMultimap.create();
        map.put("张三","老师");
        map.put("李四","学生");
        map.put("李四","老师");
        map.put("王五","老师");


        System.out.println(map.get("李四"));
        //[老师, 学生]



    }


}
