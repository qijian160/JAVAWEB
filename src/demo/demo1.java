package demo;

import com.sun.xml.internal.bind.v2.model.core.ID;
import org.apache.commons.dbcp.BasicDataSourceFactory;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.ResourceBundle;

@WebServlet("/hello")
public class demo1 extends HttpServlet {


    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws IOException {
       resp.setContentType("text/html;charset=utf-8");
        DBUtil db=new DBUtil();
        List<bank> dbb= db.db();
          for(int i=0;i<dbb.size();i++){
            resp.getWriter().append(dbb.get(i).toString());
        }
    }
}
