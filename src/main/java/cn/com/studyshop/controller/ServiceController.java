package cn.com.studyshop.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/service")
public class ServiceController {

	private Logger logger = LoggerFactory.getLogger(ServiceController.class);

	@RequestMapping(path = "/status")
	public String serviceStatus() {

		logger.debug("[服务状态确认] Service in normal status!");

		return "Service in normal status!";
	}
}
