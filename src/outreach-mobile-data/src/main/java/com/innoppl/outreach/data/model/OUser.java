package com.innoppl.outreach.data.model;

import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;

import com.innoppl.outreach.data.utils.InjectMethods;
import com.innoppl.outreach.data.utils.Method;

/**
 *
 * @author Jerald Mejarla
 */
@Cacheable
@Entity
@Table(name = "OUser")
public class OUser extends AbstractEntity {

    private static final long serialVersionUID = 1L;

    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    @InjectMethods(include = Method.ALL)
    protected Integer id;
    
    @Size(max = 256)
    @Column(name = "token")
    private String token;

    @Column(name = "tokenExpiry")
    @Temporal(TemporalType.TIMESTAMP)
    private Date tokenExpiry;

    @JoinColumn(name = "USER_KEY", referencedColumnName = "USER_KEY")
    @ManyToOne(optional = false)
    private UserInfo userKey;

    public OUser() {
    }

    public OUser(Integer id) {
        this.id = id;
    }

    public Integer getId() {
    	return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Date getTokenExpiry() {
        return tokenExpiry;
    }

    public void setTokenExpiry(Date tokenExpiry) {
        this.tokenExpiry = tokenExpiry;
    }

    public UserInfo getUserKey() {
        return userKey;
    }

    public void setUserKey(UserInfo userKey) {
        this.userKey = userKey;
    }
}
