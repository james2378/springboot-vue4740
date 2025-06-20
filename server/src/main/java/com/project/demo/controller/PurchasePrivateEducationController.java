package com.project.demo.controller;

import com.project.demo.entity.PurchasePrivateEducation;
import com.project.demo.service.PurchasePrivateEducationService;
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
 * 购买私教：(PurchasePrivateEducation)表控制层
 *
 */
@RestController
@RequestMapping("/purchase_private_education")
public class PurchasePrivateEducationController extends BaseController<PurchasePrivateEducation, PurchasePrivateEducationService> {

    /**
     * 购买私教对象
     */
    @Autowired
    public PurchasePrivateEducationController(PurchasePrivateEducationService service) {
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
