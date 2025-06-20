package com.project.demo.controller;

import com.project.demo.entity.MembershipCardInformation;
import com.project.demo.service.MembershipCardInformationService;
import com.project.demo.controller.base.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import javax.persistence.Query;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * 会员卡信息：(MembershipCardInformation)表控制层
 *
 */
@RestController
@RequestMapping("/membership_card_information")
public class MembershipCardInformationController extends BaseController<MembershipCardInformation, MembershipCardInformationService> {

    /**
     * 会员卡信息对象
     */
    @Autowired
    public MembershipCardInformationController(MembershipCardInformationService service) {
        setService(service);
    }

    @PostMapping("/add")
    @Transactional
    public Map<String, Object> add(HttpServletRequest request) throws IOException {
        Map<String,Object> paramMap = service.readBody(request.getReader());
        this.addMap(paramMap);
        return success(1);
    }

}
