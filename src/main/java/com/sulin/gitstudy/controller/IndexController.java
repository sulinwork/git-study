package com.sulin.gitstudy.controller;

import com.sulin.gitstudy.vo.ApiVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping
public class IndexController {

    @RequestMapping
    private ApiVO<?> index(){
        return ApiVO.ok(null);
    }
}
