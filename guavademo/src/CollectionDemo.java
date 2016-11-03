import com.google.common.base.Predicate;
import com.google.common.collect.Collections2;
import com.google.common.collect.Lists;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by joe on 2016/11/3.
 */
public class CollectionDemo {
    public static void main(String[] args) {


        ArrayList list = Lists.newArrayList();

        list.add("123");

        Collection collection = Collections2.filter(list, new Predicate() {
            public boolean apply(Object input) {

                return false;
            }
        });


        System.out.println(list);

    }
}
