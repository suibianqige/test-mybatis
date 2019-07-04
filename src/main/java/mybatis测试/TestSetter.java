package mybatis测试;

import org.apache.ibatis.reflection.DefaultReflectorFactory;
import org.apache.ibatis.reflection.MetaClass;
import org.apache.ibatis.reflection.invoker.Invoker;
import org.junit.Test;

/**
 * @Author: 杨长江
 * @Date: 2019-07-04 12:24
 * @Description: 说明
 */
public class TestSetter {


    @Test
    public void testSetter(){

        MetaClass metaClass = MetaClass.forClass(Holder.class,new DefaultReflectorFactory());

        System.out.println(metaClass.hasGetter("person"));

        for(String s :metaClass.getSetterNames()){
            System.out.println(s);
        }

        Invoker invoker = metaClass.getSetInvoker("person");
        System.out.println(invoker);
    }
}
