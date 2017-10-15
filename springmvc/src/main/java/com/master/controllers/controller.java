package com.master.controllers;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.master.services.producto;
import com.master.services.productolista;

@Controller
@SessionAttributes("productos")
public class controller {

	@Autowired
	private productolista plista;
	
	@RequestMapping("/greeting")
    public ModelAndView pagInic() {		
        return new ModelAndView("index");   
    }
	
	@RequestMapping(value = "/lista.html")
    public ModelAndView iteracion() {		
        return new ModelAndView("lista").addObject("productos", plista.getListProductos());   
    }
	
	@RequestMapping(value = "/nuevo.html")
    public ModelAndView insert() {		
        return new ModelAndView("nuevo");   
    }

	/*@RequestMapping(value="/iteracion")
	    public ModelAndView processPerson(@ModelAttribute productolista plista) {
	        ModelAndView modelAndView = new ModelAndView();
	        modelAndView.setViewName("lista");
	        
	        modelAndView.addObject("productos", plista);
	        return modelAndView;
	    }

   /* @RequestMapping("/iteracion")
    public ModelAndView iteracion() {		
        return new ModelAndView("lista").addObject("productos", plista.getListProductos());   
    }
    */
}
