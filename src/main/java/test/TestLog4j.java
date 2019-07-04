package test;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.Log4jEntityResolver;
import org.junit.Test;

import java.time.LocalDate;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;

/**
 * @Author: 杨长江
 * @Description:
 * @Date: 2019/3/19 9:11
 */
public class TestLog4j {

    /**
     * 记录日志
     */
    private static Logger LOGGER = Logger.getLogger(TestLog4j.class);

    public static void main(String[] args){

        San san = new San("杨长江",25,true);

        Map<String,Object> map = new HashMap<String, Object>();

        map.put("第一个",5);
        map.put("第二个","zxcvbnm");
        Parm parm = new Parm(1,"acd",map,san);
        LOGGER.debug("debug级别日志"+parm);
        LOGGER.info("info级别日志"+parm);
        LOGGER.warn("warn级别日志");
        LOGGER.error("error级别日志");

    }

    @Test
    public void test(){
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);

        Map<String,String> map = new HashMap<>(2);
        map.put("1","");
    }
}
