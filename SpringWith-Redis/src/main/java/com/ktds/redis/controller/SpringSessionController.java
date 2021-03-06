package com.ktds.redis.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SpringSessionController {

	@GetMapping("/")
	public String home(Model redisModel, HttpSession redisSession) {

		@SuppressWarnings("unchecked")
		List<String> messages = (List<String>) redisSession.getAttribute("REDIS_SESSION_MESSAGES");

		if (messages == null) {
			messages = new ArrayList<>();
		}
		redisModel.addAttribute("sessionMessages", messages);
		redisModel.addAttribute("sessionId", redisSession.getId());

		return "index";
	}

	@PostMapping("/persistMessage")
	public String persistMessage(@RequestParam("msg") String msg, HttpServletRequest redisRequest) {
		@SuppressWarnings("unchecked")
		List<String> msgs = (List<String>) redisRequest.getSession().getAttribute("REDIS_SESSION_MESSAGES");
		if (msgs == null) {
			msgs = new ArrayList<>();
			redisRequest.getSession().setAttribute("REDIS_SESSION_MESSAGES", msgs);
		}
		msgs.add(msg);
		redisRequest.getSession().setAttribute("REDIS_SESSION_MESSAGES", msgs);
		return "redirect:/";
	}

	@PostMapping("/destroy")
	public String destroySession(HttpServletRequest redisRequest) {
		redisRequest.getSession().invalidate();
		return "redirect:/";
	}

	@PostMapping("/destroyAll")
	public String destroyAllSession(HttpServletRequest redisRequest) {
		redisRequest.getSession().invalidate();
		return "redirect:/";
	}

}
