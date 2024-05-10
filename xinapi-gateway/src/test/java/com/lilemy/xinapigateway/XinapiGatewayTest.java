package com.lilemy.xinapigateway;

import com.lilemy.xinapicommon.model.entity.User;
import com.lilemy.xinapicommon.service.InnerInterfaceInfoService;
import com.lilemy.xinapicommon.service.InnerUserInterfaceInfoService;
import com.lilemy.xinapicommon.service.InnerUserService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class XinapiGatewayTest {
    @DubboReference
    private InnerUserService innerUserService;

    @DubboReference
    private InnerInterfaceInfoService innerInterfaceInfoService;

    @DubboReference
    private InnerUserInterfaceInfoService innerUserInterfaceInfoService;

    @Test
    void dubboTest() {
        User invokeUser = innerUserService.getInvokeUser("4d828325bdf61f28ce8ca8bb79c54726");
        System.out.println(invokeUser);
    }

}
