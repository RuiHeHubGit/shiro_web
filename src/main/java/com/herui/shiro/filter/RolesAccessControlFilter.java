package com.herui.shiro.filter;

import org.apache.shiro.subject.Subject;
import org.apache.shiro.web.filter.AccessControlFilter;
import org.apache.shiro.web.util.WebUtils;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class RolesAccessControlFilter extends AccessControlFilter {
    public final static String LOGIN_URL = "login";
    public final static String UNAUTHORIZED_URL = "noAuth";

    protected boolean isAccessAllowed(ServletRequest request, ServletResponse response, Object mappedValue) {
        String[] roles = (String[])mappedValue;
        if(roles == null) {
            return true;//如果没有设置角色参数，默认成功
        }
        for(String role : roles) {
            if(getSubject(request, response).hasRole(role)) {
                return true;
            }
        }
        return false;//跳到onAccessDenied处理
    }

    @Override
    protected boolean onAccessDenied(ServletRequest request, ServletResponse response) throws Exception {
        Subject subject = getSubject(request, response);
        saveRequest(request);
        if (subject.getPrincipal() == null) {//表示没有登录，重定向到登录页面
            WebUtils.issueRedirect(request, response, LOGIN_URL);
        } else {
            WebUtils.issueRedirect(request, response, UNAUTHORIZED_URL);
        }
        return false;
    }
}
