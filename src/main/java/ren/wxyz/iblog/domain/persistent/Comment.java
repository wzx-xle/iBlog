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
 * 评论表
 *
 * @author wxyz 2016-12-13_21:31
 * @since 0.1
 */
@Entity
@Table(name = "t_comment")
@Data
public class Comment implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 博客ID
     */
    private Integer blogId;

    /**
     * 回复的评论ID
     */
    private Integer commentId;

    /**
     * 评论人名称
     */
    private String name;

    /**
     * 评论人编号
     */
    @Column(columnDefinition = "char")
    private String nameNo;

    /**
     * 评论内容
     */
    private String content;

    /**
     * 创建时间
     */
    private Timestamp createdTime;

    /**
     * 是否已删除
     */
    private Boolean deleted;
}
