/**
 * Copyright (C) 2001-2016 wxyz <hyhjwzx@126.com>
 * <p>
 * This program can be distributed under the terms of the GNU GPL Version 2.
 * See the file LICENSE.
 */
package ren.wxyz.iblog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 主页
 *
 * @author wxyz 2016-10-31_22:58
 * @since 0.1
 */
@Controller
public class IndexController {

    /**
     * 首页
     *
     * @return 首页视图
     */
    @RequestMapping("/")
    public String index() {
        return "index";
    }

    @RequestMapping("/archives")
    public String archives() {
        return "public/archives";
    }

    @RequestMapping("/tags")
    public String tags() {
        return "public/tags";
    }

    @RequestMapping("/about")
    public String about() {
        return "public/about";
    }
}
