package com.gaia.server.controller;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.gaia.server.vo.ProductVo;

@Controller
@RequestMapping("/home")
public class HomeController {
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index(Model model) {
		List<ProductVo> products = new ArrayList<>();
		ProductVo vo = new ProductVo("三星显示屏",new BigDecimal("620.87"),"/images/feature-pic1.jpg");
		products.add(vo);
		vo = new ProductVo("多功能音响",new BigDecimal("899.75"),"/images/feature-pic2.jpg");
		products.add(vo);
		vo = new ProductVo("Nikon数码相机",new BigDecimal("599.00"),"/images/feature-pic3.jpg");
		products.add(vo);
		vo = new ProductVo("LED超大宽屏",new BigDecimal("679.87"),"/images/feature-pic4.jpg");
		products.add(vo);
		List<ProductVo> products2 = new ArrayList<>();
		vo = new ProductVo("佳能数码相机",new BigDecimal("849.99"),"/images/new-pic1.jpg");
		products2.add(vo);
		vo = new ProductVo("索尼音响",new BigDecimal("599.99"),"/images/new-pic2.jpg");
		products2.add(vo);
		vo = new ProductVo("等离子电视",new BigDecimal("799.99"),"/images/new-pic4.jpg");
		products2.add(vo);
		vo = new ProductVo("德国森海塞尔音响设备",new BigDecimal("899.99"),"/images/new-pic3.jpg");
		products2.add(vo);
		model.addAttribute("products", products);
		model.addAttribute("products2", products2);
		
		Locale locale = LocaleContextHolder.getLocale();
		model.addAttribute("language", locale.getLanguage());
		model.addAttribute("url", "home");
		
		return "home";
	}
	
	@RequestMapping(value = "preview", method = RequestMethod.GET)
	public String preview(Model model) {
		Locale locale = LocaleContextHolder.getLocale();
		model.addAttribute("language", locale.getLanguage());
		
		return "preview";
	}

}
