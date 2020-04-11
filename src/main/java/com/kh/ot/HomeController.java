package com.kh.ot;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.kh.ot.admin.servie.adminService;
import com.kh.ot.admin.vo.Design;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	 
	@Autowired
	private adminService adService;

	@RequestMapping(value = "home.do", method = RequestMethod.GET)
	public ModelAndView home(ModelAndView mv,Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		ArrayList<Design> mainList = adService.selectMainList();
		Design video = adService.selectVideo();
		ArrayList<Design> instaList = adService.selectInstaList();
		
		mv.addObject("mainList",mainList);
		mv.addObject("video",video);
		mv.addObject("instaList",instaList);
		mv.setViewName("home");
		
		return mv;
	}
	
}
