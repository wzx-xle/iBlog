/**
 * Copyright (C) 2001-2016 wxyz <hyhjwzx@126.com>
 * <p>
 * This program can be distributed under the terms of the GNU GPL Version 2.
 * See the file LICENSE.
 */
package ren.wxyz.iblog.domain.persistent;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

/**
 * 字典表
 *
 * @author wxyz 2016-11-01_22:50
 * @since 0.1
 */
@Entity
@Table(name = "t_code")
@Data
public class Code implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 编码
     */
    private String code;

    /**
     * 值
     */
    private String value;

    /**
     * 类型
     */
    private String type;

    /**
     * 类型名称
     */
    private String typeName;

    /**
     * 已删除
     */
    private Boolean deleted;

    /**
     * 更新时间
     */
    private Timestamp updatedTime;
}
