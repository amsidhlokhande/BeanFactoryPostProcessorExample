/**
 * 
 */
package com.amsidh.bean.factory.postprocessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;

/**
 * @author VIRU
 *
 */
public class LoadPropertiesBeforeLoadingAnyBean implements
		BeanFactoryPostProcessor {

	/* (non-Javadoc)
	 * @see org.springframework.beans.factory.config.BeanFactoryPostProcessor#postProcessBeanFactory(org.springframework.beans.factory.config.ConfigurableListableBeanFactory)
	 */
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory context)
			throws BeansException {
		PropertyPlaceholderConfigurer cfg=new PropertyPlaceholderConfigurer();
		cfg.setLocation(new ClassPathResource("shape.properties"));
		System.out.println("Initializing properties file");
		cfg.postProcessBeanFactory(context);

	}

}
