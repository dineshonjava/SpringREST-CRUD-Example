/**
 * 
 */
package com.doj.restapi.web;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.doj.restapi.config.InfrastructureConfig;
import com.doj.restapi.web.config.RestApplicationConfig;

/**
 * @author Dinesh.Rajput
 *
 */
public class RestApplicationInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class[] { InfrastructureConfig.class };
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class[] { RestApplicationConfig.class };
	}

	@Override
	protected String[] getServletMappings() {
		return new String[] { "/" };
	}
}
