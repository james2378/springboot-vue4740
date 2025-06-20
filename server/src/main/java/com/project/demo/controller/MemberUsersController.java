package com.project.demo.controller;

import com.project.demo.entity.MemberUsers;
import com.project.demo.service.MemberUsersService;
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
 * 会员用户：(MemberUsers)表控制层
 *
 */
@RestController
@RequestMapping("/member_users")
public class MemberUsersController extends BaseController<MemberUsers, MemberUsersService> {

    /**
     * 会员用户对象
     */
    @Autowired
    public MemberUsersController(MemberUsersService service) {
        setService(service);
    }

    @PostMapping("/add")
    @Transactional
    public Map<String, Object> add(HttpServletRequest request) throws IOException {
        Map<String,Object> paramMap = service.readBody(request.getReader());
        Map<String, String> mapmember_no = new HashMap<>();
        mapmember_no.put("member_no",String.valueOf(paramMap.get("member_no")));
        List listmember_no = service.select(mapmember_no, new HashMap<>()).getResultList();
        if (listmember_no.size()>0){
            return error(30000, "字段会员编号内容不能重复");
        }
        this.addMap(paramMap);
        return success(1);
    }

}
