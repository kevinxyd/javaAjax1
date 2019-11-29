package pojo;

import java.io.Serializable;

//实体类 javabean
public class User implements Serializable {

    private Integer id;
    private Integer pid;

    //年龄
    private String area;

    private Integer type;

    public User() {
    }

    public User(Integer id, Integer pid, String area, Integer type) {
        this.id = id;
        this.pid = pid;
        this.area = area;
        this.type = type;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", pid=" + pid +
                ", area='" + area + '\'' +
                ", type=" + type +
                '}';
    }
}
