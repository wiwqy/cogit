package com.test.git.controlller;
//123123
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 123456
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
