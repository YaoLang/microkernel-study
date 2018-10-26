package com.github.jdbc;

/**
 * 我的驱动
 *
 * @author kongyaolang
 * @date 2018/10/26
 */
public interface MyDriver {

    /**
     * 获取连接
     *
     * @return
     */
    MyConnection getConnection(String url);
}
