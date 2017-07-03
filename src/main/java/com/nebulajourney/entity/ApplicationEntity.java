package com.nebulajourney.entity;

import javax.persistence.*;

/**
 * Created by mr_zhou on 2017/6/27.
 */
@Entity
@Table(name = "application", schema = "journey")
public class ApplicationEntity {
    private int id;
    private String userName;
    private String destination;
    private int days;
    private String phone;
    private String idea;
    private String createDate;
    private short status;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "user_name")
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Basic
    @Column(name = "destination")
    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    @Basic
    @Column(name = "days")
    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    @Basic
    @Column(name = "phone")
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Basic
    @Column(name = "idea")
    public String getIdea() {
        return idea;
    }

    public void setIdea(String idea) {
        this.idea = idea;
    }

    @Basic
    @Column(name = "create_date")
    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    @Basic
    @Column(name = "status")
    public short getStatus() {
        return status;
    }

    public void setStatus(short status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ApplicationEntity that = (ApplicationEntity) o;

        if (id != that.id) return false;
        if (days != that.days) return false;
        if (status != that.status) return false;
        if (userName != null ? !userName.equals(that.userName) : that.userName != null) return false;
        if (destination != null ? !destination.equals(that.destination) : that.destination != null) return false;
        if (phone != null ? !phone.equals(that.phone) : that.phone != null) return false;
        if (idea != null ? !idea.equals(that.idea) : that.idea != null) return false;
        if (createDate != null ? !createDate.equals(that.createDate) : that.createDate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (userName != null ? userName.hashCode() : 0);
        result = 31 * result + (destination != null ? destination.hashCode() : 0);
        result = 31 * result + days;
        result = 31 * result + (phone != null ? phone.hashCode() : 0);
        result = 31 * result + (idea != null ? idea.hashCode() : 0);
        result = 31 * result + (createDate != null ? createDate.hashCode() : 0);
        result = 31 * result + (int) status;
        return result;
    }
}
