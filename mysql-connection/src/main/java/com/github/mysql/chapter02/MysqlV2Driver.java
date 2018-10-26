package com.github.mysql.chapter02;

import com.github.jdbc.MyConnection;
import com.github.jdbc.MyDriver;

/**
 * @author kongyaolang
 * @date 2018/10/26
 */
public class MysqlV2Driver implements MyDriver {

    public MysqlV2Driver() {
        System.out.println("constructV2");
    }

    public MyConnection getConnection(String url) {
        System.out.println("connect to mysql v2: url = " + url);
        return new MysqlV2Connection();
    }
}
