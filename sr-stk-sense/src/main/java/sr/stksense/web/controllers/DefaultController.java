package sr.stksense.web.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DefaultController {
	
	@RequestMapping( path="/")
	public ResponseEntity<Map<String,String>> defaultResponse() {
		Map<String,String> map = new HashMap<String, String>();
		map.put("status", "good");
		
		return  new ResponseEntity<Map<String,String>>(map, HttpStatus.OK);
		
	}
	
	@RequestMapping( path="/index")
	public ModelAndView indexResponse() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("index");
		
		return  mav;
		
	}
	
	@RequestMapping( path="/apidocs")
	public ModelAndView apiResponse() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("apidocs");
		return  mav;
	}

}
