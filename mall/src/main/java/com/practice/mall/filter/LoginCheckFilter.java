package com.practice.mall.filter;

import com.practice.mall.utils.JwtUtils;
import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.util.StringUtils;

import java.io.IOException;

@WebFilter(urlPatterns = "/*")
public class LoginCheckFilter implements Filter {

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request=(HttpServletRequest) servletRequest;
        HttpServletResponse response=(HttpServletResponse) servletResponse;
        String url=request.getRequestURL().toString();
        if (url.contains("login")){
            filterChain.doFilter(servletRequest,servletResponse);
            return;
        }

        String jwt=request.getHeader("token");
        if (!StringUtils.hasLength(jwt)){
            response.setContentType("text/plain;charset=utf-8");
            response.getWriter().write("登陆失败");
            return;
        }
        try {
            JwtUtils.parseJwt(jwt);
        } catch (Exception e) {
            e.printStackTrace();
            response.setContentType("text/plain;charset=utf-8");
            response.getWriter().write("登陆失败");
            return;
        }
        filterChain.doFilter(servletRequest,servletResponse);

    }
}
