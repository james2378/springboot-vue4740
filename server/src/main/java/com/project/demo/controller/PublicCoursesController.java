package com.project.demo.controller;

import com.project.demo.entity.PublicCourses;
import com.project.demo.service.PublicCoursesService;
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
 * 公共课程：(PublicCourses)表控制层
 *
 */
@RestController
@RequestMapping("/public_courses")
public class PublicCoursesController extends BaseController<PublicCourses, PublicCoursesService> {

    /**
     * 公共课程对象
     */
    @Autowired
    public PublicCoursesController(PublicCoursesService service) {
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
