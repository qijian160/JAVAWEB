import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import java.io.IOException;

@WebServlet("/lg")
public class demo3 extends HttpServlet {
    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        res.setContentType("text/html;charset=utf-8");
        //1.接受请求的参数1账号
        String username = req.getParameter("username");
        //2.接受请求的参数2密码
        String password =req.getParameter("password");
        //3.判断账号密码是否匹配
        if(username.equals("admin")&&password.equals("123")){
           res.getWriter()
			.append("<html>\r\n")
			.append("<head><title>登录成功</title>\r\n")
			.append("</head>\r\n")
			.append("<body>\r\n")
			.append("<div>恭喜你, 登录成功了! <span id=\"s\">10</span> 秒后自动跳转到主页</div>\r\n")
			.append("<script>\r\n")
			.append("function x1(){\r\n")
			.append("count--;\r\n")
			.append("s.innerHTML = count+'s';\r\n")
			.append("if(count==0){window.location.href='home.html';}\r\n")
			.append("}\r\n")
			.append("var s = document.getElementById('s')\r\n")
			.append("var count = 10;\r\n")
			.append("setInterval(x1,1000);\r\n")
			.append("</script>\r\n")
			.append("</body>\r\n")
			.append("</html>\r\n")
			;}else{
            res.getWriter().append("登录失败");
        }



    }
}
