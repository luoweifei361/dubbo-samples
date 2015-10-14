package dubbo.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import dubbo.api.demo.api.RemoteServiceApi;

@Controller
public class WebController {

	@Autowired
	private RemoteServiceApi remtoteService;
	
	public RemoteServiceApi getRemtoteService() {
		return remtoteService;
	}

	public void setRemtoteService(RemoteServiceApi remtoteService) {
		this.remtoteService = remtoteService;
	}

	@RequestMapping("/")
	@ResponseBody
	public String index() {
		return String.format("call rpc:%s", remtoteService.getRpcInfo());
	}

	@RequestMapping("/user")
	@ResponseBody
	public String userInfo() {
		return remtoteService.getUser().toString();
	}
}
