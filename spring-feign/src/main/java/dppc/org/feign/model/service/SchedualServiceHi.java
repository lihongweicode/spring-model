package dppc.org.feign.model.service;

import dppc.org.feign.model.service.hystric.SchedualServiceHiHystric;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @描述 :
 * @作者 :	lhw
 * @日期 :	2018/10/22
 * @时间 :	11:37
 */
@FeignClient(value = "service-hi",fallback = SchedualServiceHiHystric.class)  //配置服务名
public interface SchedualServiceHi {
    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    String sayHiFromClientOne(@RequestParam(value = "name") String name);
}
