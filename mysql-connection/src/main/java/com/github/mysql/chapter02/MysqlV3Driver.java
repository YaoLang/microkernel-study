package com.github.mysql.chapter02;

import com.github.jdbc.MyConnection;
import com.github.jdbc.MyDriver;

/**
 * @author kongyaolang
 * @date 2018/10/26
 */
public class MysqlV3Driver implements MyDriver {

    public MysqlV3Driver() {
        System.out.println("constructV3");
    }

    public MyConnection getConnection(String url) {
        System.out.println("connect to mysql v3: url = " + url);
        return new MysqlV2Connection();
    }
}
