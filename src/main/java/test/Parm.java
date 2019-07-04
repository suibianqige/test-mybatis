package test;

import java.util.Map;

/**
 * @Author: 杨长江
 * @Description:
 * @Date: 2019/3/20 9:34
 */
public class Parm {

    private int a;
    private String b;
    private Map<String,Object> p ;
    private San san;

    public Parm(int a, String b, Map<String, Object> p, San san) {
        this.a = a;
        this.b = b;
        this.p = p;
        this.san = san;
    }


    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }

    public Map<String, Object> getP() {
        return p;
    }

    public void setP(Map<String, Object> p) {
        this.p = p;
    }

    public San getSan() {
        return san;
    }

    public void setSan(San san) {
        this.san = san;
    }

    @Override
    public String toString() {
        return "Parm{" +
                "a=" + a +
                ", b='" + b + '\'' +
                ", p=" + p +
                ", san=" + san +
                '}';
    }
}

class San {
    private String name;
    private int age;
    private boolean sex;

    public San(String name, int age, boolean sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "San{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                '}';
    }
}
