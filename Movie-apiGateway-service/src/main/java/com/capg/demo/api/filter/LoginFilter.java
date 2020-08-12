package com.capg.demo.api.filter;

import javax.servlet.http.HttpServletRequest;



import org.springframework.stereotype.Component;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
@Component

public class LoginFilter extends ZuulFilter {

	
	
	@Override
	public boolean shouldFilter() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override

	public Object run() throws ZuulException {
	RequestContext context=	RequestContext.getCurrentContext();
		HttpServletRequest req=context.getRequest();
		
		if(req.getRequestURI().equalsIgnoreCase("post")) {
			
		}
		if(req.getRequestURI().contains("catlog")) {
			context.setSendZuulResponse(false);
			context.setResponseStatusCode(400);
			context.setResponseBody("you cannot access this url");
		}
		System.err.println("\n\nfilter success");
		return context;
	}

	@Override
	public String filterType() {
		// TODO Auto-generated method stub
		return "post";
	}

	@Override
	public int filterOrder() {
		// TODO Auto-generated method stub
		return 1;
	}

}
