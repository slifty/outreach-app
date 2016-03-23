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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonProperty;
import org.springframework.format.annotation.DateTimeFormat;

import com.innoppl.outreach.data.utils.InjectMethods;
import com.innoppl.outreach.data.utils.Method;

/**
 *
 * @author Jerald Mejarla
 */
@Cacheable
@Entity
@Table(name = "PATH_CLIENT_CONTACT_NEED")
public class Services extends AbstractEntity {

    private static final long serialVersionUID = 1L;

    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CONTACT_NEED_KEY")
    @InjectMethods(include = Method.ALL)
    protected Integer id;
    
    @Basic(optional = false)
    @NotNull
    @Column(name = "SERVICE_DATE")
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    @DateTimeFormat(iso=DateTimeFormat.ISO.DATE)
    private Date dateProvided;

    // @Basic(optional = false)
    // @NotNull
    // @Column(name = "RecordType")
    // private Integer recordType;
    
    // @Basic(optional = false)
    // @Column(name = "TypeProvided")
    // private Integer typeProvided;

    // @Size(min = 0, max = 256)
    // @Column(name = "OtherTypeProvided")
    // private String otherTypeProvided;

    // @Column(name = "SubTypeProvided")
    // private Integer subTypeProvided;

    // @Column(name = "FAAmount")
    // private Float fAAmount;

    @Column(name = "OUTCOME_KEY")
    private Integer referralOutcome;

    @JsonIgnore
    @JoinColumn(name = "ProjectEntryID", referencedColumnName = "PROGRAM_KEY")
    @ManyToOne(optional = false)
    private Enrollment projectEntryID;

    public Services() {
    }

    public Services(Integer id) {
        this.id = id;
    }

    public Integer getId() {
    	return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDateProvided() {
        return dateProvided;
    }

    @JsonProperty("DateProvided")
    public void setDateProvided(Date dateProvided) {
        this.dateProvided = dateProvided;
    }

    public Integer getRecordType() {
        return 0;
    }

    @JsonProperty("RecordType")
    public void setRecordType(Integer recordType) {
    }

    public Integer getTypeProvided() {
    	return 0;
    }

    public void setTypeProvided(Integer typeProvided) {
    }

    public String getOtherTypeProvided() {
    	return "";
    }

    @JsonProperty("DateProvided")
    public void setOtherTypeProvided(String otherTypeProvided) {
    }

    public Integer getSubTypeProvided() {
    	return 0;
    }

    public void setSubTypeProvided(Integer subTypeProvided) {
    }

    public Float getfAAmount() {
    	return Float.parseFloat("0");
    }

    public void setfAAmount(Float fAAmount) {
    }

    public Integer getReferralOutcome() {
        return referralOutcome;
    }

    @JsonProperty("ReferralOutcome")
    public void setReferralOutcome(Integer referralOutcome) {
        this.referralOutcome = referralOutcome;
    }
    
    public Enrollment getProjectEntryID() {
        return projectEntryID;
    }

    public void setProjectEntryID(Enrollment projectEntryID) {
        this.projectEntryID = projectEntryID;
    }
}
