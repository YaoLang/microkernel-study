package chapter01;

import com.github.jdbc.MyConnection;
import com.github.jdbc.MyDriverManager;

/**
 * @author kongyaolang
 * @date 2018/10/26
 */
public class Main {

    public static void main(String[] args) throws ClassNotFoundException {
        Class.forName("com.github.mysql.chapter01.MysqlDriver");
        MyConnection myConnection = MyDriverManager.getConnection("mysql://localhost:8080");
        System.out.println(myConnection);
    }
}
