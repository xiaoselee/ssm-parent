package cn.je.index.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.je.index.service.IndexService;

@Controller
@RequestMapping("/index")
public class IndexController {
	
	@Autowired
	IndexService indexService;
	
	@RequestMapping("hello")
	@ResponseBody
	public String index() {
		//indexService = new IndexService();
		return indexService.hel()+"23336";
	}

}
