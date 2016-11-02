/**
 * Copyright (C) 2001-2016 wxyz <hyhjwzx@126.com>
 * <p>
 * This program can be distributed under the terms of the GNU GPL Version 2.
 * See the file LICENSE.
 */
package ren.wxyz.iblog.dao.jpa;

import org.springframework.data.repository.CrudRepository;
import ren.wxyz.iblog.domain.persistent.Code;

/**
 * 字典数据访问接口
 *
 * @author wxyz 2016-11-02_20:40
 * @since 0.1
 */
public interface CodeDaoJpa extends CrudRepository<Code, Integer> {

    /**
     * 通过字典类型查询字典项
     *
     * @param type 字典类型不定参数
     *
     * @return 字典集合
     */
    Iterable<Code> findByTypeIn(String... type);
}
