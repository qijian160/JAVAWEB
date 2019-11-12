package demo;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import java.io.IOException;
@WebServlet("/hh")
public class demo2 extends HttpServlet {
    @Override
    public void init() throws ServletException {
        System.out.println("servlet1正在创建");
    }

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        System.out.println("有新的用户在执行service方法");
        res.getWriter().append("ok");
    }

    @Override
    public void destroy() {
        System.out.println("servlet1即将销毁");
    }
}
