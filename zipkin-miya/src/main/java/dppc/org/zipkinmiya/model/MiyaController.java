package dppc.org.zipkinmiya.model;

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
 * @时间 :	9:17
 */
@RestController
public class MiyaController {
    private static final Logger LOG = Logger.getLogger(MiyaController.class.getName());
    @Autowired
    private RestTemplate restTemplate;


    @RequestMapping("/hi")
    public String home(){
        LOG.log(Level.INFO, "hi is being called");
        return "hi i'm miya!";
    }

    @RequestMapping("/miya")
    public String info(){
        LOG.log(Level.INFO, "info is being called");
        return restTemplate.getForObject("http://localhost:8988/info",String.class);
    }

}
