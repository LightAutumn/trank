import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by yinyuxia on 2016/5/18.
 */
public class JdbcUtils {
    private static final String driverUrl = "org.postgresql.Driver";

    private static final String url = "jdbc:postgresql://localhost:5432/smail?useUnicode=true&amp;characterEncoding=UTF-8";

    private static final String username = "postgres";

    private static final String password = "123456";

    public static Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName(driverUrl);
            connection = DriverManager.getConnection(url, username, password);
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }
    // 测试Oracle连接是否成功
    public static void main(String[] args) {
        Connection connection = JdbcUtils.getConnection();
        System.out.println("连接成功：" + connection);

    }
}
