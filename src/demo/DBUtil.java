package demo;

import org.apache.commons.dbcp.BasicDataSourceFactory;

import javax.sql.DataSource;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class DBUtil {
        List<bank> bk=new ArrayList<bank>();
        public List<bank> db() throws IOException {
                Properties ppt=new Properties();
        InputStream is=demo1.class.getClassLoader().getResourceAsStream("dbcp.properties");
        ppt.load(is);
        DataSource ds = null;
        try {
            ds = BasicDataSourceFactory.createDataSource(ppt);
                    Connection conn=ds.getConnection();
        PreparedStatement ps=conn.prepareStatement("select * from lx");
        ResultSet rs=ps.executeQuery();

        while(rs.next()){
            bank bkk=new bank(rs.getInt("id"),rs.getString("name"),rs.getInt("qian"));
            bk.add(bkk);
        }
            return bk;
        } catch (Exception e) {
            e.printStackTrace();
             return bk;
        }
        }

}
