/**
 * 
 */
package com.bna.shop.web.controller;

import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bna.shop.web.util.BowAndArrowConstants;

/**
 * @author Stumble
 *
 */
@Controller
public class BaseController
{
	private final static org.slf4j.Logger logger = LoggerFactory
			.getLogger(BaseController.class);

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String welcome(ModelMap model)
	{
		logger.debug("User Login");
		return BowAndArrowConstants.LOGIN_PAGE;

	}

	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String welcomeName()
	{
		return BowAndArrowConstants.ADMIN_HOME_PAGE;
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String userLogin()
	{
		return null;
	}

}
