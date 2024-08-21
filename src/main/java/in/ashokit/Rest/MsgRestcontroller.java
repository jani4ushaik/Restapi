package in.ashokit.Rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MsgRestcontroller {

	@GetMapping("/welcome")
	public String getWelcomeMsg() {
	String msg = "welcome to Rest Api...!";
	return msg;
	
	
	//@GetMapping("/greet")
	//public String getGreetMsg() {
		//String m ="Good Morning...!!";
		//return m;
	//}

}
}