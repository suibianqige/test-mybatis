package mybatis测试;

/**
 * @Author: 杨长江
 * @Date: 2019-07-04 12:27
 * @Description: 说明
 */
public class Holder {

    private String name;

    private Person person;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person getPerson() {
        return person;
    }

    /*public void setPerson(Person person) {
        this.person = person;
    }*/

    public void setPerson(Man person) {
        this.person = person;
    }

    public void setPerson(Woman person) {
        this.person = person;
    }
}
