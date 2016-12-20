import com.google.common.base.Function;
import com.google.common.base.Predicate;
import com.google.common.collect.Collections2;
import com.google.common.collect.Lists;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by joe on 2016/11/3.
 *
 * predicate断言
 * Function
 * 使用Collection2.filter（）
 * 使用Collection2.transform（）
 */
public class CollectionDemo {
    public static void main(String[] args) {
        System.out.println(listStr);
        ArrayList<Integer> list1 = Lists.newArrayList(1, 2, 3, 4, 5, 6);
        list1.add(5);

        //从集合中筛选一部分，选出新的集合
        Collection<Integer> list = Collections2.filter(list1, new Predicate<Integer>() {
            @Override
            public boolean apply(Integer input) {
                return !(input > 5);
            }
        });
        //类型转换，把Integer转换为String，
        Collection<String> listStr = Collections2.transform(list, new Function<Integer, String>() {
            @Override
            public String apply(Integer input) {
                return String.valueOf(input);
            }
        });
        System.out.println(listStr);
        System.out.println(listStr);

    }


}
