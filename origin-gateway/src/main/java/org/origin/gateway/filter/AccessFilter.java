package org.origin.gateway.filter;

import javax.servlet.http.HttpServletRequest;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;

/**
 * 
 * 自定义过滤器
 * 
 * @author wsp
 *
 */
public class AccessFilter extends ZuulFilter {

	/**
	 * 客户端请求Url是否带有accessToken参数
	 */
	@Override
	public Object run() {
		RequestContext requestContext= RequestContext.getCurrentContext();
		HttpServletRequest request= requestContext.getRequest();
		
		System.out.println("METHOD:"+request.getMethod());
		System.out.println("URL:"+request.getRequestURL().toString());
		
 		String accessToken=  request.getParameter("accessToken");
 		if(accessToken==null){
 			//请求URL未带accessToken 
 			System.out.println("access token is empty");
 			requestContext.setSendZuulResponse(false);
 			requestContext.setResponseStatusCode(401);
 			
 		}else{
 			System.out.println("access token ok");	
 		}
		
 		
 		
 		return null;
 		
		
	}

	@Override
	public boolean shouldFilter() {
		return true;
	}

	@Override
	public int filterOrder() {
		return 0;
	}

	@Override
	public String filterType() {
		return "pre";
	}

}
