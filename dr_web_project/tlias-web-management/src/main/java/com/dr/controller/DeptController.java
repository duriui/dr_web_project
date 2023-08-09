package com.dr.controller;

import com.dr.pojo.Dept;
import com.dr.pojo.Result;
import com.dr.service.DeptService;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.annotations.Delete;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author DR
 * @Date 2023/8/7
 */

@Slf4j  //定义日志记录对象
@RestController
@RequestMapping("/depts")
public class DeptController {

    //private static Logger log = LoggerFactory.getLogger(DeptController.class);

    @Autowired
    private DeptService deptService;

    @GetMapping()
    public Result list(){
        log.info("查询全部部门数据");
        List<Dept> DeptList = deptService.list();
        return Result.success(DeptList);
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id){ //@PathVariable 获取/depts/{id}的id绑定给id
        log.info("根据id删除部门：{}",id);
        deptService.delete(id);
        return Result.success();
    }

    @PostMapping("")
    public Result add(@RequestBody Dept dept){ //@RequestBody 前端传过来的json对象封装到dept中
        log.info("新增部门：{}",dept);
        deptService.insert(dept);
        return Result.success();
    }

    @PutMapping("")
    public Result update(@RequestBody Dept dept){
        log.info("修改部门：{}",dept);
        deptService.update(dept);
        return Result.success();
    }
}
