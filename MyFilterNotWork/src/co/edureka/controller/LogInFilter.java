package co.edureka.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

/**
 * Servlet Filter implementation class LogInFilter
 */
@WebFilter("/LogInFilter")
public class LogInFilter implements Filter {

	
	public void destroy() {
		
		System.out.println("--------Filter Destroy--------");
	}

	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
	
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		//preprocessing code goes here
		out.print("PreProcessing");
		String email=request.getParameter("txtemail");
		String password=request.getParameter("txtPassword");
		
		if(!email.isEmpty() && !password.isEmpty()) {
			chain.doFilter(request, response);
			//forward request response to the servlet.
			
		}
		else
		{
			out.print("validation failed ok filter catchaup!");
		}

		// pass the request along the filter chain
		
		
		//postProcessing code goes here
		out.print("postProcessing");
	}

	
	public void init(FilterConfig fConfig) throws ServletException {
	
		System.out.println("----Filter init------");
	}

}
