package com.bocom.jwj.controller;

import com.bocom.jwj.utils.StringUtils;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class PageViewController {


    @Resource
    private HttpServletRequest request;

    @Resource
    private HttpSession session;

    @GetMapping("/manage/index/toUrl")
    public String toUrl() {
        String url = request.getParameter("url");
        if (StringUtils.isNullOrEmpty(url)) {
            return "index";
        }
        return url;
    }


    @RequestMapping("/anon")
    @ResponseBody
    public String anon() {
        return "anon success";
    }

    @RequestMapping("/")
    public String index() {
        return "index";
    }

    @RequestMapping("/login")
    public String login() {
        return "index";
    }

    @RequestMapping("/logout")
    @ResponseBody
    public String logout() {
        session.invalidate();
        return "logout success";
    }

    @PreAuthorize("hasAuthority('TEST')")//有TEST权限的才能访问
    @RequestMapping("/security")
    @ResponseBody
    public String security() {
        return "hello world security";
    }

    @PreAuthorize("hasAuthority('ADMIN')")//必须要有ADMIN权限的才能访问
    @RequestMapping("/authorize")
    @ResponseBody
    public String authorize() {
        return "有权限访问";
    }

}