/**
 * 
 */
package com.bna.shop.web.adapter;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.resource.PathResourceResolver;

/**
 * @author Stumble
 *
 */
@Configuration
@EnableWebMvc
@ComponentScan(basePackages = { "com.bna.shop.web.controller" })
public class BNAWebAdapter extends WebMvcConfigurerAdapter
{

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter
	 * #addResourceHandlers(org.springframework.web.servlet.config.annotation.
	 * ResourceHandlerRegistry)
	 */
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry)
	{
		super.addResourceHandlers(registry);
		registry.addResourceHandler("/js/**").addResourceLocations("/js/").setCachePeriod(3600).resourceChain(true)
				.addResolver(new PathResourceResolver());
		registry.addResourceHandler("/css/**").addResourceLocations("/css/").setCachePeriod(3600).resourceChain(true)
				.addResolver(new PathResourceResolver());
		registry.addResourceHandler("/fonts/**").addResourceLocations("/fonts/").setCachePeriod(3600)
				.resourceChain(true).addResolver(new PathResourceResolver());
		registry.addResourceHandler("/scss/**").addResourceLocations("/scss/").setCachePeriod(3600).resourceChain(true)
				.addResolver(new PathResourceResolver());
		registry.addResourceHandler("/less/**").addResourceLocations("/less/").setCachePeriod(3600)
				.resourceChain(true).addResolver(new PathResourceResolver());
	}

	/**
	 * Configure TilesConfigurer.
	 */
	/*
	 * @Bean public TilesConfigurer tilesConfigurer() { TilesConfigurer
	 * tilesConfigurer = new TilesConfigurer();
	 * tilesConfigurer.setDefinitions(new String[] { "/WEB-INF/tiles/tiles.xml"
	 * }); tilesConfigurer.setCheckRefresh(true); return tilesConfigurer; }
	 * 
	 *//**
		 * Configure ViewResolvers to deliver preferred views.
		 *//*
		 * @Override public void configureViewResolvers(ViewResolverRegistry
		 * registry) { TilesViewResolver viewResolver = new TilesViewResolver();
		 * registry.viewResolver(viewResolver); }
		 */
}
