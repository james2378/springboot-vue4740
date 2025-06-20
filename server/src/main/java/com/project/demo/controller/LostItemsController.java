package com.project.demo.controller;

import com.project.demo.entity.LostItems;
import com.project.demo.service.LostItemsService;
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
 * 遗失物品：(LostItems)表控制层
 *
 */
@RestController
@RequestMapping("/lost_items")
public class LostItemsController extends BaseController<LostItems, LostItemsService> {

    /**
     * 遗失物品对象
     */
    @Autowired
    public LostItemsController(LostItemsService service) {
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
