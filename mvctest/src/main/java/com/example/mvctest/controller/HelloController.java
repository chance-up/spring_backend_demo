import org.springframework.stereotype.Controller;

@Controller
public class HelloController {
    @Autowired
    HelloService service;

    @GetMapping("user/{id}")
    public @ResponseBody User hello(@PathVariable Long id) {
        System.out.println("this is Controller!!");
        return service.findUser(id);
    }

}
