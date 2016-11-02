/**
 * Copyright (C) 2001-2016 wxyz <hyhjwzx@126.com>
 * <p>
 * This program can be distributed under the terms of the GNU GPL Version 2.
 * See the file LICENSE.
 */
package ren.wxyz.iblog.helper;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.context.ServletContextAware;
import ren.wxyz.iblog.service.CodeService;

import javax.servlet.ServletContext;

/**
 * 初始化系统参数
 *
 * @author wxyz 2016-11-02_21:05
 * @since 0.1
 */
@Slf4j
@Component
public class SysInitBean implements ServletContextAware {

    @Autowired
    private CodeService codeService;

    @Override
    public void setServletContext(ServletContext servletContext) {
        codeService.init(servletContext);
    }
}
