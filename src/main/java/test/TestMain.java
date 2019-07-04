package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @Author: 杨长江
 * @Date: 2019-06-11 21:07
 * @Description: 说明
 */
public class TestMain {

    public static void main(String[] args)throws Exception {

        List<M8> list = new ArrayList<M8>(100);

        for(int i =0; i<100 ;i++){
            M8 m8 = new M8();
            list.add(m8);
            Thread.sleep(4000L);
        }
    }


    static class M8 {

        int [] arr = new int[1024*256];
    }
}
