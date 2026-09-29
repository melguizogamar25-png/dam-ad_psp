import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MyController {
    @GetMapping("/hello")
    public Greeting hello(
            @RequestParam(defaultValue = "World") String name) {
        //return "Hello World";
        return new Greeting("Hello", name);
    }

    @GetMapping("/hello/multiple")
    public List<Greeting> hellos() {
        return List.of(new Greeting("Hello", "World"));
    }

    record Greeting(String greeting, String name) {
    }

}
