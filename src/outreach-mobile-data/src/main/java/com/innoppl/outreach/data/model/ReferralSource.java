package com.innoppl.outreach.data.model;

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
import javax.validation.constraints.NotNull;
import org.codehaus.jackson.annotate.JsonIgnore;

import com.innoppl.outreach.data.utils.InjectMethods;
import com.innoppl.outreach.data.utils.Method;

/**
 *
 * @author Jerald Mejarla
 */
@Cacheable
@Entity
@Table(name = "ReferralSource")
public class ReferralSource extends AbstractEntity {

    private static final long serialVersionUID = 1L;

    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    @InjectMethods(include = Method.ALL)
    protected Integer id;
    
    @Basic(optional = false)
    @NotNull
    @Column(name = "ReferralSource")
    private Integer referralSource;

    @Basic(optional = false)
    @Column(name = "CountOutreachReferralApproached")
    private Integer countOutreachReferralApproached;

    @JsonIgnore
    @JoinColumn(name = "ProjectEntryID", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private Enrollment projectEntryID;

    public ReferralSource() {
    }

    public ReferralSource(Integer id) {
        this.id = id;
    }

    public Integer getId() {
    	return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getReferralSource() {
        return referralSource;
    }

    public void setReferralSource(Integer referralSource) {
        this.referralSource = referralSource;
    }

    public Integer getCountOutreachReferralApproached() {
        return countOutreachReferralApproached;
    }

    public void setCountOutreachReferralApproached(Integer countOutreachReferralApproached) {
        this.countOutreachReferralApproached = countOutreachReferralApproached;
    }

    public Enrollment getProjectEntryID() {
        return projectEntryID;
    }

    public void setProjectEntryID(Enrollment projectEntryID) {
        this.projectEntryID = projectEntryID;
    }
}
