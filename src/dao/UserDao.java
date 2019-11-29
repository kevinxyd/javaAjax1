package dao;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import pojo.User;
import util.JdbcTemplateUtil;

import java.util.List;

public class UserDao {

    private JdbcTemplate template = new JdbcTemplate(JdbcTemplateUtil.getDataSource());


    public List<User> listPrice() {
        String sql = "select * from tb_area where type = 1";
        return template.query(sql, new BeanPropertyRowMapper<>(User.class));
    }
    public List<User> listPrice2(Integer pid) {
        String sql = "select * from tb_area where pid = ?";
        return template.query(sql, new BeanPropertyRowMapper<>(User.class),pid);
    }
}
