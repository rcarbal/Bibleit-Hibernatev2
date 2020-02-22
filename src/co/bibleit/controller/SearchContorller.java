package co.bibleit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/search")
public class SearchContorller {
	
	@RequestMapping("/sections")
	public String search(Model theModel) {
		return "search";
	}

}
