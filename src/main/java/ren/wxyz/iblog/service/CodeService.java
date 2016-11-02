/**
 * Copyright (C) 2001-2016 wxyz <hyhjwzx@126.com>
 * <p>
 * This program can be distributed under the terms of the GNU GPL Version 2.
 * See the file LICENSE.
 */
package ren.wxyz.iblog.service;

import javax.servlet.ServletContext;

/**
 * 字典服务接口
 *
 * @author wxyz 2016-11-01_22:48
 * @since 0.1
 */
public interface CodeService {

    /**
     * 初始化 Servlet上下文 参数
     *
     * @param sc Servlet上下文
     */
    void init(ServletContext sc);
}
