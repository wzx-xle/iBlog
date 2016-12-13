/**
 * Copyright (C) 2001-2016 wxyz <hyhjwzx@126.com>
 * <p/>
 * This program can be distributed under the terms of the GNU GPL Version 2.
 * See the file LICENSE.
 */
package ren.wxyz.iblog.dao.jpa;

import org.springframework.data.repository.CrudRepository;
import ren.wxyz.iblog.domain.persistent.BlogContent;

/**
 * 博客内容访问接口
 *
 * @author wxyz 2016-12-13_21:47
 * @since 0.1
 */
public interface BlogContentDaoJpa extends CrudRepository<BlogContent, Integer> {
}
