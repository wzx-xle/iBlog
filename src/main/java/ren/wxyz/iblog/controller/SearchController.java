/**
 * Copyright (C) 2001-2017 wxyz <hyhjwzx@126.com>
 * <p/>
 * This program can be distributed under the terms of the GNU GPL Version 2.
 * See the file LICENSE.
 */
package ren.wxyz.iblog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * 搜索
 *
 * @author wxyz 2017-01-16_21:04
 * @since 0.1
 */
@Controller
public class SearchController {

    /**
     * 搜索入口
     *
     * @param key 关键词
     * @return
     */
    @RequestMapping("/search")
    public ModelAndView search(String key) {
        ModelAndView mv = new ModelAndView("public/search");
        return mv;
    }
}
