package com.innoppl.outreach.data.model;

import java.util.Date;
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
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.SecondaryTable;
import javax.persistence.SecondaryTables;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
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
@Table(name = "PATH_CLIENT_PROGRAM")

// TODO: This is the PROGRAM_ENROLLMENTS table in Compass
public class Enrollment extends AbstractEntity {

    private static final long serialVersionUID = 1L;

    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PROGRAM_KEY")
    @InjectMethods(include = Method.ALL)
    protected Integer id;
    
    @Basic(optional = false)
    @NotNull
    @Column(name = "ENTRY_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(iso=DateTimeFormat.ISO.DATE)
    private Date entryDate = new Date();

    // @Size(max = 45)
    // @Column(name = "HouseholdID")
    // private String householdID;

    // @Column(name = "RelationshipToHoH")
    // private Integer relationshipToHoH;
    
    @Column(name = "EXIT_DATE")
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date exitDate;

    // @JsonIgnore
    // @OneToMany(cascade = CascadeType.ALL, mappedBy = "projectEntryID")
    // private List<Services> servicesList;

    // @JsonIgnore
    // @OneToMany(cascade = CascadeType.ALL, mappedBy = "projectEntryID")
    // private List<DateOfEngagement> dateOfEngagementList;

    @JsonIgnore
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "projectClientID")
    private List<Disabilities> disabilitiesList;

    @JoinColumn(name = "CLIENT_KEY", referencedColumnName = "CLIENT_KEY")
    @ManyToOne(optional = false)
    private Client personalID;

    @JsonIgnore
    @JoinColumn(name = "PROGRAM_NAME_KEY", referencedColumnName = "PROGRAM_KEY")
    @ManyToOne(optional = false)
    private Project projectID;

    // @JsonIgnore
    // @OneToMany(cascade = CascadeType.ALL, mappedBy = "projectEntryID")
    // private List<ReferralSource> referralSourceList;

    // @JsonIgnore
    // @OneToMany(cascade = CascadeType.ALL, mappedBy = "projectEntryID")
    // private List<PATHStatus> pATHStatusList;

    public Enrollment() {
    }

    public Enrollment(Integer id) {
        this.id = id;
    }

    public Integer getId() {
    	return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    
    public Date getEntryDate() {
        return entryDate;
    }

    @JsonProperty("EntryDate")
    public void setEntryDate(Date entryDate) {
        this.entryDate = entryDate;
    }

    public String getHouseholdID() {
        return "";
    }

    @JsonProperty("HouseholdID")
    public void setHouseholdID(String householdID) {
        
    }

    public Integer getRelationshipToHoH() {
        return 0;
    }

    @JsonProperty("RelationshipToHoH")
    public void setRelationshipToHoH(Integer relationshipToHoH) {
    }

    public List<PATHStatus> getpATHStatusList() {
        return null;
    }

    public void setpATHStatusList(List<PATHStatus> pATHStatusList) {
    }

    public Integer getResidencePrior() {
        return 0;
    }

    @JsonProperty("ResidencePrior")
    public void setResidencePrior(Integer residencePrior) {
    }

    public String getOtherResidencePrior() {
        return "";
    }

    @JsonProperty("OtherResidencePrior")
    public void setOtherResidencePrior(String otherResidencePrior) {
    }

    public Integer getResidencePriorLengthOfStay() {
        return 0;
    }

    @JsonProperty("ResidencePriorLengthOfStay")
    public void setResidencePriorLengthOfStay(Integer residencePriorLengthOfStay) {
    }

    public Integer getContinuouslyHomelessOneYear() {
        return 0;
    }

    @JsonProperty("ContinuouslyHomelessOneYear")
    public void setContinuouslyHomelessOneYear(Integer continuouslyHomelessOneYear) {
    }

    public Integer getTimesHomelessPastThreeYears() {
        return 0;
    }

    @JsonProperty("TimesHomelessPastThreeYears")
    public void setTimesHomelessPastThreeYears(Integer timesHomelessPastThreeYears) {
    }

    public Integer getMonthsHomelessPastThreeYears() {
        return 0;
    }

    @JsonProperty("MonthsHomelessPastThreeYears")
    public void setMonthsHomelessPastThreeYears(Integer monthsHomelessPastThreeYears) {
    }

    public Integer getMonthsHomelessThisTime() {
        return 0;
    }

    @JsonProperty("MonthsHomelessThisTime")
    public void setMonthsHomelessThisTime(Integer monthsHomelessThisTime) {
    }

    public Integer getYearsHomeless() {
        return 0;
    }

    @JsonProperty("YearsHomeless")
    public void setYearsHomeless(Integer yearsHomeless) {
    }

    public Integer getStatusDocumented() {
        return 0;
    }

    @JsonProperty("StatusDocumented")
    public void setStatusDocumented(Integer statusDocumented) {
    }

    public Integer getDisablingCondition() {
        return 0;
    }

    @JsonProperty("DisablingCondition")
    public void setDisablingCondition(Integer disablingCondition) {
    }

    public Integer getHousingStatus() {
        return 0;
    }

    @JsonProperty("HousingStatus")
    public void setHousingStatus(Integer housingStatus) {
    }

    public Date getExitDate() {
        return exitDate;
    }

    public void setExitDate(Date exitDate) {
        this.exitDate = exitDate;
    }

    public List<Services> getServicesList() {
        return null;
    }

    public void setServicesList(List<Services> servicesList) {
    }

    public List<DateOfEngagement> getDateOfEngagementList() {
    	return null;
    }

    public void setDateOfEngagementList(List<DateOfEngagement> dateOfEngagementList) {
    }

    public List<Disabilities> getDisabilitiesList() {
        return disabilitiesList;
    }

    public void setDisabilitiesList(List<Disabilities> disabilitiesList) {
        this.disabilitiesList = disabilitiesList;
    }

    public Client getPersonalID() {
        return personalID;
    }

    @JsonProperty("PersonalID")
    public void setPersonalID(Client personalID) {
        this.personalID = personalID;
    }

    public Project getProjectID() {
        return projectID;
    }

    @JsonProperty("ProjectID")
    public void setProjectID(Project projectID) {
        this.projectID = projectID;
    }

    public List<ReferralSource> getReferralSourceList() {
        return null;
    }

    public void setReferralSourceList(List<ReferralSource> referralSourceList) {
    }

    public List<PATHStatus> getPATHStatusList() {
    	return null;
    }

    public void setPATHStatusList(List<PATHStatus> pATHStatusList) {
    }
}
