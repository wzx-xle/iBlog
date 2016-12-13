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
 * 标签表
 *
 * @author wxyz 2016-12-13_21:26
 * @since 0.1
 */
@Entity
@Table(name = "t_tag")
@Data
public class Tag implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 标签名
     */
    private String name;

    /**
     * 已删除
     */
    private Boolean deleted;

    /**
     * 更新时间
     */
    private Timestamp updatedTime;
}
