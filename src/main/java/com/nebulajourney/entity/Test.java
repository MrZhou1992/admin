package com.nebulajourney.entity;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by mr_zhou on 2017/6/29.
 */
@Entity
@Table(name="test", schema = "journey")
public class Test {

    @Id
    private String testid;

    private Date createDate;

    private String test;

    @ManyToOne
    @JoinColumn(name = "sss",referencedColumnName = "id")
    private AdminEntity adminEntity;

    public AdminEntity getAdminEntity() {
        return adminEntity;
    }

    public void setAdminEntity(AdminEntity adminEntity) {
        this.adminEntity = adminEntity;
    }

    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test;
    }

    public String getTestid() {
        return testid;
    }

    public void setTestid(String testid) {
        this.testid = testid;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}
