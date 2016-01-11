package com.innoppl.outreach.data.model;

import java.util.List;

import javax.persistence.Basic;
import javax.persistence.Cacheable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import org.codehaus.jackson.annotate.JsonIgnore;

import com.innoppl.outreach.data.utils.InjectMethods;
import com.innoppl.outreach.data.utils.Method;

/**
 *
 * @author Jerald Mejarla
 */
@Cacheable
@Entity
@Table(name = "Project")
public class Project extends AbstractEntity {
    private static final long serialVersionUID = 1L;
    
    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    @InjectMethods(include = Method.ALL)
    protected Integer id;
    
    @Column(name = "ProjectName")
    private String projectName;
    
    @Column(name = "ContinuumProject")
    private Integer continuumProject;
    
    @Column(name = "ProjectType")
    private Integer projectType;
    
    @JsonIgnore
    @JoinColumn(name = "OrganizationID", referencedColumnName = "ID")
    @ManyToOne
    private Organization organizationID;
    
    @JsonIgnore
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "projectID")
    private List<Enrollment> enrollmentList;

    public Project() {
    }

    public Project(Integer id) {
        this.id = id;
    }

    public Integer getId() {
    	return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public Integer getContinuumProject() {
        return continuumProject;
    }

    public void setContinuumProject(Integer continuumProject) {
        this.continuumProject = continuumProject;
    }

    public Integer getProjectType() {
        return projectType;
    }

    public void setProjectType(Integer projectType) {
        this.projectType = projectType;
    }

    public Organization getOrganizationID() {
        return organizationID;
    }

    public void setOrganizationID(Organization organizationID) {
        this.organizationID = organizationID;
    }

    public List<Enrollment> getEnrollmentList() {
        return enrollmentList;
    }

    public void setEnrollmentList(List<Enrollment> enrollmentList) {
        this.enrollmentList = enrollmentList;
    }
}
