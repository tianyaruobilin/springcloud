package com.springcloudoauth2.zuul.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@Slf4j
@Component
public class LoginFilter extends ZuulFilter {

    /**
     * 配置过滤类型，有四种不同生命周期的过滤器类型
     * 1. pre：路由之前
     * 2. routing：路由之时
     * 3. post：路由之后
     * 4. error：发送错误调用
     * @return 路由过滤类型
     */
    @Override
    public String filterType() {
        return "pre";
    }

    /**
     * 配置过滤的顺序
     * @return 过滤顺序
     */
    @Override
    public int filterOrder() {
        return 0;
    }


    /**
     * 是否需要过滤，这里是 true，需要过滤
     * @return 需要过滤
     */
    @Override
    public boolean shouldFilter() {
        return true;
    }

    /**
     * 过滤的具体业务代码
     * @return
     * @throws ZuulException
     */
    @Override
    public Object run() throws ZuulException {
        RequestContext requestContext=RequestContext.getCurrentContext();//获取当前请求上下文
        HttpServletRequest request = requestContext.getRequest();
        log.info("请求方法{}>>>请求地址{}",request.getMethod(),request.getRequestURL().toString());
        String token = request.getParameter("token");
        if (token == null) {
            log.warn("Token is empty");
            requestContext.setSendZuulResponse(false);
            requestContext.setResponseStatusCode(401);//未能正确登陆
            try {
                requestContext.getResponse().getWriter().write("Token is empty");
            } catch (IOException e) {
                throw new RuntimeException("用户Token有误",e);
            }
        }else {
            log.info("ok");
        }

        return null;
    }
}
