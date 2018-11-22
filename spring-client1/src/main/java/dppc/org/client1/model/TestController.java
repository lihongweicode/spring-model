package dppc.org.client1.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @描述 :
 * @作者 :	lhw
 * @日期 :	2018/10/22
 * @时间 :	10:15
 */
@RestController
public class TestController {
    @Value("${server.port}")
    String port;

    @RequestMapping("/hi")
    public String test(@RequestParam String name){
        return "hi "+name+",i am from port:" +port;
    }
}
