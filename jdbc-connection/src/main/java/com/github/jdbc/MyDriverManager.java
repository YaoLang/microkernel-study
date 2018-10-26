package com.github.jdbc;

import java.util.HashMap;
import java.util.Map;

/**
 * 驱动管理，负责加载各客户方提供的数据源服务
 *
 * @author kongyaolang
 * @date 2018/10/26
 */
public class MyDriverManager {

    /**
     * 所有注册的数据源连接服务
     */
    private static final Map<String, MyDriver> registerDriver = new HashMap<String, MyDriver>();


    public static void registerDriver(String name, MyDriver driver) {
        registerDriver.put(name, driver);
    }

    public static MyConnection getConnection(String url) {
        for (String key : registerDriver.keySet()) {
            if (url.startsWith(key)) {
                return registerDriver.get(key).getConnection(url);
            }
        }
        throw new RuntimeException("no such provider");
    }

}
