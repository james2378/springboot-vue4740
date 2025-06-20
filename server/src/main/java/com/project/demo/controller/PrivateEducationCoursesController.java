package com.project.demo.controller;

import com.project.demo.entity.PrivateEducationCourses;
import com.project.demo.service.PrivateEducationCoursesService;
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
 * 私教课程：(PrivateEducationCourses)表控制层
 *
 */
@RestController
@RequestMapping("/private_education_courses")
public class PrivateEducationCoursesController extends BaseController<PrivateEducationCourses, PrivateEducationCoursesService> {

    /**
     * 私教课程对象
     */
    @Autowired
    public PrivateEducationCoursesController(PrivateEducationCoursesService service) {
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
