import com.google.common.collect.ImmutableList;
import com.google.common.collect.Sets;

import java.util.*;

/**
 * Created by joe on 2016/11/3.
 * 只读测试
 */
public class ReadOnlyDemo {
    public static void main(String[] args) {

        guavaImpl();
        System.out.println(listStr);
        System.out.println(listStr);

    }

    /**
     * list只读jdk实现
     */
    public static void jdkImpl() {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("张三");
        arrayList.add("李四");
        arrayList.add("王五");

        List<String> list = Collections.unmodifiableList(arrayList);

        //Exception in thread "main" java.lang.UnsupportedOperationException，无效的操作异常
        //list.add("赵六");

        arrayList.add("hh");

        //[张三, 李四, 王五, hh]
        System.out.println(Arrays.toString(list.toArray()));
        //对原list进行操作，新的list也改变，不符合要求


    }

    public static void guavaImpl() {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("张三");
        arrayList.add("李四");
        arrayList.add("王五");
        ImmutableList<String> immutableList = ImmutableList.copyOf(arrayList);
        //Exception in thread "main" java.lang.UnsupportedOperationException
//        immutableList.add("asd");
        arrayList.add("赵六");
        //[张三, 李四, 王五]
        System.out.println(immutableList);
        //对原list操作，新的list未发生改变
    }

}
