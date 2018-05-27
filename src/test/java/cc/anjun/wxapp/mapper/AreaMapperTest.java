package cc.anjun.wxapp.mapper;

import cc.anjun.wxapp.entity.Area;
import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class AreaMapperTest {
    @Autowired
    AreaMapper areaMapper;
    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void list() {
       List<Area> areaList =  areaMapper.list();
       assertEquals(2,areaList.size());
    }

    @Test
    public void get() {
        Area area = areaMapper.get(1);
        assertEquals("南苑",area.getAreaName());
    }

    @Test
    @Ignore
    public void insert() {
        Area area = new Area();
        area.setAreaName("东院");
        area.setPriority(3);
        areaMapper.insert(area);
    }

    @Test
    public void update() {
        Area area = areaMapper.get(2);
        area.setPriority(5);
        area.setCreateTime(new Date());
        areaMapper.update(area);
        assertEquals(5,Integer.parseInt(area.getPriority().toString()));
    }
}