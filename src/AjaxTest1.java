import com.alibaba.fastjson.JSON;
import pojo.User;
import service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet("/province")
public class AjaxTest1 extends HttpServlet {

    private UserService userService= new UserService();
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setCharacterEncoding("utf-8");
        req.setCharacterEncoding("utf-8");
        PrintWriter out = resp.getWriter();
        List<User> list = userService.listPrivice();
        String str = JSON.toJSONString(list);
        System.out.println(str);
        out.write(str);
    }
}
