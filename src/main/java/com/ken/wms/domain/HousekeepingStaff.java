package com.ken.wms.domain;

import java.io.Serializable;

/**
 * housekeeping_staff
 * @author 
 */
public class HousekeepingStaff implements Serializable {
    /**
     * 员工ID
     */
    private Long staffId;

    /**
     * 员工姓名
     */
    private String staffName;

    /**
     * 家政员工电话
     */
    private String staffPhone;

    /**
     * 家政人员地址信息
     */
    private String staffAddress;

    /**
     * 家政人员年龄
     */
    private String staffAge;

    /**
     * 家政人员客服务城市
     */
    private String staffCity;

    /**
     * 保姆类型 住家型、不住家型、钟点工
     */
    private String staffType;

    private static final long serialVersionUID = 1L;

    public Long getStaffId() {
        return staffId;
    }

    public void setStaffId(Long staffId) {
        this.staffId = staffId;
    }

    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }

    public String getStaffPhone() {
        return staffPhone;
    }

    public void setStaffPhone(String staffPhone) {
        this.staffPhone = staffPhone;
    }

    public String getStaffAddress() {
        return staffAddress;
    }

    public void setStaffAddress(String staffAddress) {
        this.staffAddress = staffAddress;
    }

    public String getStaffAge() {
        return staffAge;
    }

    public void setStaffAge(String staffAge) {
        this.staffAge = staffAge;
    }

    public String getStaffCity() {
        return staffCity;
    }

    public void setStaffCity(String staffCity) {
        this.staffCity = staffCity;
    }

    public String getStaffType() {
        return staffType;
    }

    public void setStaffType(String staffType) {
        this.staffType = staffType;
    }
}