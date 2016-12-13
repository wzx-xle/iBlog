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
 * 博客基本信息实体
 *
 * @author wxyz 2016-12-13_20:04
 * @since 0.1
 */
@Entity
@Table(name = "t_blog")
@Data
public class Blog implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 博客标题
     */
    private String title;

    /**
     * 是否原创
     */
    private Boolean original;

    /**
     * 是否置顶
     */
    private Boolean top1;

    /**
     * 是否开启打赏
     */
    private Boolean reward;

    /**
     * 是否已发布
     */
    private Boolean published;

    /**
     * 发布时间
     */
    private Timestamp publishedTime;

    /**
     * 阅读数
     */
    private Integer readNum;

    /**
     * 收藏数
     */
    private Integer favorNum;

    /**
     * 点赞数
     */
    private Integer voteNum;

    /**
     * 评论数
     */
    private Integer commentNum;

    /**
     * 分享数
     */
    private Integer shareNum;

    /**
     * 编辑时间
     */
    private Timestamp editTime;
}
