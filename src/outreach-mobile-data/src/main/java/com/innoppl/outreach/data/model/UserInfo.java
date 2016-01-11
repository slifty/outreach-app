package com.innoppl.outreach.data.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

/**
 *
 * @author haravallabhanjn
 */
@Cacheable
@Entity
@Table(name = "PATH_USERS")
public class UserInfo implements Serializable {
    
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @NotNull
    @Column(name = "USER_KEY")
    private Integer userkey;
    
    @Column(name = "AGENCY_KEY")
    private Integer agencyKey;
    
    @Column(name = "USER_ID")
    private String userId;
    
    @Column(name = "PASSWORD")
    private String passwordEnc;
    
    // @Column(name = "PW_EXPIRE_DATE")
    // private Date pwExpireDate;
    
    @Column(name = "FIRST_NAME")
    private String nameFirst;
    
    @Column(name = "LAST_NAME")
    private String nameLast;
    
    // @Column(name = "USER_ACTIVE")
    // private Integer userActiveGCT;
    
    // @Column(name = "REC_ACTIVE") 
    // private Integer recActiveGCT;
    
    // @Column(name = "CREATE_DATE")
    // @Temporal(TemporalType.TIMESTAMP)
    // private Date entryDateTime;
    
    @Column(name = "CREATE_USER_KEY")
    private Integer entryUserkey;
    
    // @NotNull
    // @Column(name = "LOG_DATE_TIME")
    // @Temporal(TemporalType.TIMESTAMP)
    //private Date logDateTime;
    
    // @Column(name = "LOG_USER_KEY")
    //private Integer logUserkey;

    public Integer getUserkey() {
        return userkey;
    }

    public void setUserkey(Integer userkey) {
        this.userkey = userkey;
    }

    public Integer getAgencyKey() {
        return agencyKey;
    }

    public void setAgencyKey(Integer agencyKey) {
        this.agencyKey = agencyKey;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPasswordEnc() {
        return passwordEnc;
    }

    public void setPasswordEnc(String passwordEnc) {
        this.passwordEnc = passwordEnc;
    }

    public Date getPwExpireDate() {
        return new Date();
//        return pwExpireDate;
    }

    public void setPwExpireDate(Date pwExpireDate) {
        // this.pwExpireDate = pwExpireDate;
    }

    public String getNameFirst() {
        return nameFirst;
    }

    public void setNameFirst(String nameFirst) {
        this.nameFirst = nameFirst;
    }

    public String getNameLast() {
        return nameLast;
    }

    public void setNameLast(String nameLast) {
        this.nameLast = nameLast;
    }

    public Integer getUserActiveGCT() {
        return 0;
        // return userActiveGCT;
    }

    public void setUserActiveGCT(Integer userActiveGCT) {
        // this.userActiveGCT = userActiveGCT;
    }

    public Integer getRecActiveGCT() {
        // return recActiveGCT;
        return 0;
    }

    public void setRecActiveGCT(Integer recActiveGCT) {
        // this.recActiveGCT = recActiveGCT;
    }

    public Date getEntryDateTime() {
        // return entryDateTime;
        return new Date();
    }

    public void setEntryDateTime(Date entryDateTime) {
        // this.entryDateTime = entryDateTime;
    }

    public Integer getEntryUserkey() {
        return entryUserkey;
    }

    public void setEntryUserkey(Integer entryUserkey) {
        this.entryUserkey = entryUserkey;
    }

    public Date getLogDateTime() {
        //return logDateTime;
        return new Date();
    }

    public void setLogDateTime(Date logDateTime) {
        //this.logDateTime = logDateTime;
    }

    public Integer getLogUserkey() {
        //return logUserkey;
        return 0;
    }

    public void setLogUserkey(Integer logUserkey) {
        //this.logUserkey = logUserkey;
    }
}
