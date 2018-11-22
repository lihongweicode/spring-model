package dppc.org.feign.model.service.hystric;

import dppc.org.feign.model.service.SchedualServiceHi;
import org.springframework.stereotype.Component;

/**
 * @描述 :
 * @作者 :	lhw
 * @日期 :	2018/10/22
 * @时间 :	14:16
 */
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name;
    }
}
