package com.project.demo.controller;

import com.project.demo.entity.CoachUser;
import com.project.demo.service.CoachUserService;
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
 * 教练用户：(CoachUser)表控制层
 *
 */
@RestController
@RequestMapping("/coach_user")
public class CoachUserController extends BaseController<CoachUser, CoachUserService> {

    /**
     * 教练用户对象
     */
    @Autowired
    public CoachUserController(CoachUserService service) {
        setService(service);
    }

    @PostMapping("/add")
    @Transactional
    public Map<String, Object> add(HttpServletRequest request) throws IOException {
        Map<String,Object> paramMap = service.readBody(request.getReader());
        Map<String, String> mapcoach_no = new HashMap<>();
        mapcoach_no.put("coach_no",String.valueOf(paramMap.get("coach_no")));
        List listcoach_no = service.select(mapcoach_no, new HashMap<>()).getResultList();
        if (listcoach_no.size()>0){
            return error(30000, "字段教练编号内容不能重复");
        }
        this.addMap(paramMap);
        return success(1);
    }

}
