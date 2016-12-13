/**
 * Copyright (C) 2001-2016 wxyz <hyhjwzx@126.com>
 * <p/>
 * This program can be distributed under the terms of the GNU GPL Version 2.
 * See the file LICENSE.
 */
package ren.wxyz.iblog.domain.persistent;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

/**
 * 博客内容
 *
 * @author wxyz 2016-12-13_20:23
 * @since 0.1
 */
@Entity
@Table(name = "t_blog_content")
@Data
public class BlogContent implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 格式
     */
    private String format;

    /**
     * 博客内容
     */
    @Column(columnDefinition = "text")
    private String content;

    /**
     * 编辑时间
     */
    private Timestamp editTime;
}
