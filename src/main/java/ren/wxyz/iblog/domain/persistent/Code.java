/**
 * Copyright (C) 2001-2016 wxyz <hyhjwzx@126.com>
 * <p>
 * This program can be distributed under the terms of the GNU GPL Version 2.
 * See the file LICENSE.
 */
package ren.wxyz.iblog.domain.persistent;

import lombok.Data;

import javax.persistence.*;
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
public class Code {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String code;

    private String value;

    private String type;

    private String typeName;

    private Boolean delete;

    private Timestamp deletedTime;
}
