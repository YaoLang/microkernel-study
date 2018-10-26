package com.github.mysql.chapter01;


import com.github.jdbc.MyConnection;
import com.github.jdbc.MyDriver;
import com.github.jdbc.MyDriverManager;

/**
 * @author kongyaolang
 * @date 2018/10/26
 */
public class MysqlDriver implements MyDriver {

    static {
        MyDriverManager.registerDriver("mysql", new MysqlDriver());
    }

    public MyConnection getConnection(String url) {
        System.out.println("connect to mysql: url = " + url);
        return new MysqlConnection();
    }
}
