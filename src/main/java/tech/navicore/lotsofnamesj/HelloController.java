package tech.navicore.lotsofnamesj;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/")
	public String index() {
		return "If are reading this, I trust you and you trust me.\n";
	}

}

