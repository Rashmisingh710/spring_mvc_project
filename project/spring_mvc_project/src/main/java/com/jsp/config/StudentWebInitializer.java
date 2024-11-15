package com.jsp.config;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class StudentWebInitializer extends AbstractAnnotationConfigDispatcherServletInitializer{
	@Override
	public Class<?>[] getServletConfigClasses() {
		
		return new Class[] {StudentConfig.class};
	}

	@Override
public String[] getServletMappings() {
		
		return new String[] {"/"};
	}

	@Override
	protected Class<?>[] getRootConfigClasses() {
		
		return null;
	}
}
