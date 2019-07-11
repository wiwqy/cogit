package com.test.git.controlller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 12345
 * @author Administrator
 *
 */
@RestController
public class MyGitTest {
	@RequestMapping("/index")
	
	public String gShe() {
		return "this is a springboot project!";
	}
}
