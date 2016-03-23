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
@Table(name = "PATH_CLIENT_CHRONIC_HOMELESS")
public class ChronicHomelessness extends AbstractEntity {

    private static final long serialVersionUID = 1L;

    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PRIMARY_KEY")
    @InjectMethods(include = Method.ALL)
    protected Integer id;
    
    @Column(name = "HOMELESS_STATUS_KEY",
            table = "PATH_CLIENT_CHRONIC_HOMELESS")
    private Integer residencePrior;

    @Size(max = 45)
    @Column(name = "PRIOR_RESIDENCE_OTHER",
            table = "PATH_CLIENT_CHRONIC_HOMELESS")
    private String otherResidencePrior;

    @Column(name = "PRIOR_NIGHTS_RESIDENCE_KEY",
            table = "PATH_CLIENT_CHRONIC_HOMELESS")
    private Integer residencePriorLengthOfStay;

    @Column(name = "CONTINUOUSLY_HL_ONEYEAR",
            table = "PATH_CLIENT_CHRONIC_HOMELESS")
    private String continuouslyHomelessOneYear;

    @Column(name = "TIMES_HL_PAST_THREEYEARS",
            table = "PATH_CLIENT_CHRONIC_HOMELESS")
    private Integer timesHomelessPastThreeYears;

    @Column(name = "MONTHS_HL_PAST_THREEYEARS",
            table = "PATH_CLIENT_CHRONIC_HOMELESS")
    private Integer monthsHomelessPastThreeYears;

    @Column(name = "YEARS_HL_CONTINUOUSLY",
            table = "PATH_CLIENT_CHRONIC_HOMELESS")
    private Integer yearsHomeless;

    @Column(name = "STATUS_DOCUMENTED",
            table = "PATH_CLIENT_CHRONIC_HOMELESS")
    private String statusDocumented;

    @Column(name = "DISABLING_CONDITION",
            table = "PATH_CLIENT_CHRONIC_HOMELESS")
    private Integer disablingCondition;

    @Column(name = "HOUSING_STATUS_KEY",
            table = "PATH_CLIENT_CHRONIC_HOMELESS")
    private Integer housingStatus;
    
    @Column(name = "EXIT_DATE")
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date exitDate;

    @JoinColumn(name = "CLIENT_KEY", referencedColumnName = "CLIENT_KEY")
    @ManyToOne(optional = false)
    private Client personalID;

    public ChronicHomelessness() {
    }

    public ChronicHomelessness(Integer id) {
        this.id = id;
    }

    public Integer getId() {
    	return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getResidencePrior() {
        return residencePrior;
    }

    @JsonProperty("ResidencePrior")
    public void setResidencePrior(Integer residencePrior) {
        this.residencePrior = residencePrior;
    }

    public String getOtherResidencePrior() {
        return otherResidencePrior;
    }

    @JsonProperty("OtherResidencePrior")
    public void setOtherResidencePrior(String otherResidencePrior) {
        this.otherResidencePrior = otherResidencePrior;
    }

    public Integer getResidencePriorLengthOfStay() {
        return residencePriorLengthOfStay;
    }

    @JsonProperty("ResidencePriorLengthOfStay")
    public void setResidencePriorLengthOfStay(Integer residencePriorLengthOfStay) {
        this.residencePriorLengthOfStay = residencePriorLengthOfStay;
    }

    public Integer getContinuouslyHomelessOneYear() {
        return Integer.parseInt(continuouslyHomelessOneYear);
    }

    @JsonProperty("ContinuouslyHomelessOneYear")
    public void setContinuouslyHomelessOneYear(Integer continuouslyHomelessOneYear) {
        this.continuouslyHomelessOneYear = continuouslyHomelessOneYear.toString();
    }

    public Integer getTimesHomelessPastThreeYears() {
        return timesHomelessPastThreeYears;
    }

    @JsonProperty("TimesHomelessPastThreeYears")
    public void setTimesHomelessPastThreeYears(Integer timesHomelessPastThreeYears) {
        this.timesHomelessPastThreeYears = timesHomelessPastThreeYears;
    }

    public Integer getMonthsHomelessPastThreeYears() {
        return monthsHomelessPastThreeYears;
    }

    @JsonProperty("MonthsHomelessPastThreeYears")
    public void setMonthsHomelessPastThreeYears(Integer monthsHomelessPastThreeYears) {
        this.monthsHomelessPastThreeYears = monthsHomelessPastThreeYears;
    }

    public Integer getMonthsHomelessThisTime() {
        return 0;
    }

    @JsonProperty("MonthsHomelessThisTime")
    public void setMonthsHomelessThisTime(Integer monthsHomelessThisTime) {
    }

    public Integer getYearsHomeless() {
        return yearsHomeless;
    }

    @JsonProperty("YearsHomeless")
    public void setYearsHomeless(Integer yearsHomeless) {
        this.yearsHomeless = yearsHomeless;
    }

    public Integer getStatusDocumented() {
        return Integer.parseInt(statusDocumented);
    }

    @JsonProperty("StatusDocumented")
    public void setStatusDocumented(Integer statusDocumented) {
        this.statusDocumented = statusDocumented.toString();
    }

    public Integer getDisablingCondition() {
        return disablingCondition;
    }

    @JsonProperty("DisablingCondition")
    public void setDisablingCondition(Integer disablingCondition) {
        this.disablingCondition = disablingCondition;
    }

    public Integer getHousingStatus() {
        return housingStatus;
    }

    @JsonProperty("HousingStatus")
    public void setHousingStatus(Integer housingStatus) {
        this.housingStatus = housingStatus;
    }

    public Client getPersonalID() {
        return personalID;
    }

    @JsonProperty("PersonalID")
    public void setPersonalID(Client personalID) {
        this.personalID = personalID;
    }
}
