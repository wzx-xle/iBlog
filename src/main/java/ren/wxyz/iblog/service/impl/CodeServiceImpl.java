/**
 * Copyright (C) 2001-2016 wxyz <hyhjwzx@126.com>
 * <p>
 * This program can be distributed under the terms of the GNU GPL Version 2.
 * See the file LICENSE.
 */
package ren.wxyz.iblog.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ren.wxyz.iblog.dao.jpa.CodeDaoJpa;
import ren.wxyz.iblog.domain.persistent.Code;
import ren.wxyz.iblog.service.CodeService;

import javax.servlet.ServletContext;

/**
 * 字典服务实现
 *
 * @author wxyz 2016-11-01_22:51
 * @since 0.1
 */
@Service
@Slf4j
public class CodeServiceImpl implements CodeService {

    /**
     * 非敏感字典类型
     */
    private static final String[] NOT_SENSITIVE_TYPE = new String[] {"BLOG_METADATA"};

    @Autowired
    private CodeDaoJpa codeDaoJpa;

    /**
     * Servlet上下文实例
     */
    private ServletContext sc;

    @Override
    public void init(ServletContext sc) {
        this.sc = sc;
        init();
    }

    /**
     * 读取数据库字典信息并填充到servlet上下文实例中
     */
    @Transactional(readOnly = true)
    private void init() {
        Iterable<Code> codes = codeDaoJpa.findByTypeIn(NOT_SENSITIVE_TYPE);
        if (null == codes) {
            log.warn("数据库字典读取失败！");
            return;
        }

        for (Code code : codes) {
            if (!code.getDeleted()) {
                sc.setAttribute(code.getCode(), code.getValue());
            }
        }
    }
}
