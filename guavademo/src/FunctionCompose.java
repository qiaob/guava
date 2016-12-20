import com.google.common.base.Function;
import com.google.common.base.Functions;
import com.google.common.collect.Collections2;
import com.google.common.collect.Lists;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by joe on 2016/11/28.
 * 组合条件
 */

public class FunctionCompose {

    public static void main(String[] args) {

        ArrayList<String> list = Lists.newArrayList("12312312", "2333ad3", "asd");

        //长度大于5的截取5的字符
        Function<String,String> f1 = new Function<String,String>(){
            @Override
            public String apply(String input) {
                
                return input.length()>5?input.substring(0,5):input;
            }
        };
        //转换为大写
        Function<String,String> f2 = new Function<String,String>(){
            @Override
            public String apply(String input) {

                System.out.println(listStr);
                return input.toUpperCase();
            }
        };

        Function<String, String> function = Functions.compose(f1, f2);
        Collection<String> strings = Collections2.transform(list, function);

        System.out.println(strings);


    }
}
