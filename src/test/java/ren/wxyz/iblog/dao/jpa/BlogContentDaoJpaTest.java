/**
 * Copyright (C) 2001-2016 wxyz <hyhjwzx@126.com>
 * <p/>
 * This program can be distributed under the terms of the GNU GPL Version 2.
 * See the file LICENSE.
 */
package ren.wxyz.iblog.dao.jpa;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import ren.wxyz.iblog.domain.persistent.BlogContent;

import javax.transaction.Transactional;

import static org.junit.Assert.*;

/**
 * 测试博客内容访问接口
 *
 * @author wxyz 2016-12-13_22:14
 * @since 0.1
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath*:spring/applicationContext.xml")
@Transactional
public class BlogContentDaoJpaTest {

    @Autowired
    private BlogContentDaoJpa blogContentDaoJpa;

    @Test
    public void findTest() {
        assertEquals(1, blogContentDaoJpa.count());
        Iterable<BlogContent> contents = blogContentDaoJpa.findAll();
        for (BlogContent content : contents) {
            System.out.println(content.getContent());
        }
    }
}