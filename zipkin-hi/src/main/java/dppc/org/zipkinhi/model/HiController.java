package dppc.org.zipkinhi.model;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.logging.Level;
import java.util.logging.Logger;


/**
 * @描述 :
 * @作者 :	lhw
 * @日期 :	2018/11/5
 * @时间 :	9:01
 */
@RestController
public class HiController {
    @Autowired
    private RestTemplate restTemplate;
    private static final Logger LOG = Logger.getLogger(HiController.class.getName());

    @RequestMapping("/hi")
    public String callHome(){
        LOG.log(Level.INFO, "calling trace zipkin-hi  ");
        return restTemplate.getForObject("http://localhost:8989/miya", String.class);
    }
    @RequestMapping("/info")
    public String info(){
        LOG.log(Level.INFO, "calling trace zipkin-hi ");

        return "i'm zipkin-hi";

    }
}
