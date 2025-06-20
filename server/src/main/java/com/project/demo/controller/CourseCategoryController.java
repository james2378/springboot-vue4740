package com.project.demo.controller;

import com.project.demo.entity.CourseCategory;
import com.project.demo.service.CourseCategoryService;
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
 * 课程类别：(CourseCategory)表控制层
 *
 */
@RestController
@RequestMapping("/course_category")
public class CourseCategoryController extends BaseController<CourseCategory, CourseCategoryService> {

    /**
     * 课程类别对象
     */
    @Autowired
    public CourseCategoryController(CourseCategoryService service) {
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
