/**
 * Copyright (C) 2001-2016 wxyz <hyhjwzx@126.com>
 * <p/>
 * This program can be distributed under the terms of the GNU GPL Version 2.
 * See the file LICENSE.
 */
package ren.wxyz.iblog.dao.jpa;

import org.springframework.data.repository.CrudRepository;
import ren.wxyz.iblog.domain.persistent.Blog;

/**
 * 博客访问接口
 *
 * @author wxyz 2016-12-13_21:44
 * @since 0.1
 */
public interface BlogDaoJpa extends CrudRepository<Blog, Integer> {
}
