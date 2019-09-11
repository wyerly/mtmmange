package net.mtmplateform.root.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Api("组织管理模块")
@RestController
@RequestMapping("/login")
public class GroupController {

    @ApiOperation(value = "分组管理",notes = "分组管理")
    @RequestMapping(value = "/hello",method = RequestMethod.POST)
    @ResponseBody
    public String hello(){
        return "Hello";
    }
}
