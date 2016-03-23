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
import javax.validation.constraints.NotNull;
import org.springframework.format.annotation.DateTimeFormat;

import com.innoppl.outreach.data.utils.InjectMethods;
import com.innoppl.outreach.data.utils.Method;

/**
 *
 * @author Jerald Mejarla
 */
@Cacheable
@Entity
@Table(name = "PATH_CLIENT_PROGRAMTYPE_PATH")
public class PATHStatus extends AbstractEntity {

    private static final long serialVersionUID = 1L;

    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CLIENT_KEY")
    @InjectMethods(include = Method.ALL)
    protected Integer id;
    
    @Basic(optional = false)
    @NotNull
    @Column(name = "ENTERED_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private Date dateOfStatus;

    @Basic(optional = false)
    @NotNull
    @Column(name = "QUEST10")
    private Integer clientEnrolledInPATH;

    @Basic(optional = false)
    @NotNull
    @Column(name = "QUEST20")
    private Integer reasonNotEnrolled;

    @JoinColumn(name = "PROGRAM_KEY", referencedColumnName = "PROGRAM_KEY")
    @ManyToOne(optional = false)
    private Enrollment projectEntryID;

    public PATHStatus() {
    }

    public PATHStatus(Integer id) {
        this.id = id;
    }

    public Integer getId() {
    	return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDateOfStatus() {
        return dateOfStatus;
    }

    public void setDateOfStatus(Date dateOfStatus) {
        this.dateOfStatus = dateOfStatus;
    }

    public Integer getClientEnrolledInPATH() {
        return clientEnrolledInPATH;
    }

    public void setClientEnrolledInPATH(Integer clientEnrolledInPATH) {
        this.clientEnrolledInPATH = clientEnrolledInPATH;
    }

    public Integer getReasonNotEnrolled() {
        return reasonNotEnrolled;
    }

    public void setReasonNotEnrolled(Integer reasonNotEnrolled) {
        this.reasonNotEnrolled = reasonNotEnrolled;
    }

    public Enrollment getProjectEntryID() {
        return projectEntryID;
    }

    public void setProjectEntryID(Enrollment projectEntryID) {
        this.projectEntryID = projectEntryID;
    }
}
