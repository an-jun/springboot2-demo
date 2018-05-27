package cc.anjun.wxapp.controller;

import cc.anjun.wxapp.entity.Area;
import cc.anjun.wxapp.mapper.AreaMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/test")
public class TestController {
    @Autowired
    private   AreaMapper areaMapper;
    @RequestMapping(value = "/index",method = RequestMethod.GET)
    public List<Area> index(){
      return   areaMapper.list();
    }
}
