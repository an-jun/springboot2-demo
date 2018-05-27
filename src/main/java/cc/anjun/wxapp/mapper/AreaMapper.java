package cc.anjun.wxapp.mapper;

import cc.anjun.wxapp.entity.Area;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

@Mapper
public interface AreaMapper {
    @Select("select * from tb_area")
    List<Area>list();
    @Select("select * from tb_area where area_id=#{id}")
    Area get(int id);
    @Insert("insert into tb_area (area_name,priority,create_time,last_edit_time) value (#{areaName},#{priority},#{createTime},#{lastEditTime})")
    void insert(Area area);
    @Update("update tb_area set area_name=#{areaName},priority=#{priority},create_time=#{createTime},last_edit_time=#{lastEditTime} where area_id=#{areaId}")
    void update(Area area);
}
