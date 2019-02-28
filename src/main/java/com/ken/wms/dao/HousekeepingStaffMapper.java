package com.ken.wms.dao;

import com.ken.wms.domain.HousekeepingStaff;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HousekeepingStaffMapper {
    int deleteByPrimaryKey(Long staffId);

    int insert(HousekeepingStaff record);

    int insertSelective(HousekeepingStaff record);

    HousekeepingStaff selectByPrimaryKey(Integer staffId);

    /**
     * 查询所有保姆信息
     * @return
     */
    List<HousekeepingStaff> selectAll();

    List<HousekeepingStaff> selectByCity(@Param("staffCity") String staffCity);

    int updateByPrimaryKeySelective(HousekeepingStaff record);

    int updateByPrimaryKey(HousekeepingStaff record);
}