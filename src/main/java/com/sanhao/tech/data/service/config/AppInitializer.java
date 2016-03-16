package com.sanhao.tech.data.service.config;

import javax.servlet.Filter;

// import org.slf4j.MDC;
import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.opensymphony.sitemesh.webapp.SiteMeshFilter;


/**
 * Java Config for this application.  Life begins here.
 *
 * @author lanyonm
 */
public class AppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// MDC.put("environment", System.getenv("APP_ENV") != null ? System.getenv("APP_ENV") : "dev");
		return new Class<?>[]{OrderServiceConfig.class,MybatisConfiguration.class};
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected String[] getServletMappings() {
		// TODO Auto-generated method stub
		return null;
	}

}
