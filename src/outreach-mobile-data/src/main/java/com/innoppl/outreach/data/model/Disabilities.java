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
import org.codehaus.jackson.annotate.JsonProperty;

import com.innoppl.outreach.data.utils.InjectMethods;
import com.innoppl.outreach.data.utils.Method;

/**
 *
 * @author Jerald Mejarla
 */
@Cacheable
@Entity
@Table(name = "PATH_CLIENT_SPECIAL_NEEDS")
public class Disabilities extends AbstractEntity {

    private static final long serialVersionUID = 1L;

    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    @InjectMethods(include = Method.ALL)
    protected Integer id;
    
    @Basic(optional = false)
    @NotNull
    @Column(name = "NEEDS_CODE_KEY")
    private Integer disabilityType;
    
    @Column(name = "SECONDARY_QUESTION_CODE_1")
    private Integer secondaryQuestionCode1;

    @Column(name = "SECONDARY_QUESTION_CODE_2")
    private Integer secondaryQuestionCode2;
    
    @Column(name = "SECONDARY_QUESTION_CODE_3")
    private Integer secondaryQuestionCode3;
    
    @Column(name = "SECONDARY_QUESTION_CODE_4")
    private Integer secondaryQuestionCode4;
    
    @Column(name = "SECONDARY_QUESTION_CODE_5")
    private Integer secondaryQuestionCode5;
    
    @Column(name = "SECONDARY_QUESTION_CODE_6")
    private Integer secondaryQuestionCode6;
    
    @Column(name = "SECONDARY_QUESTION_CODE_7")
    private Integer secondaryQuestionCode7;
    
    @Column(name = "SECONDARY_QUESTION_CODE_8")
    private Integer secondaryQuestionCode8;
    
    @Column(name = "SECONDARY_QUESTION_CODE_9")
    private Integer secondaryQuestionCode9;
    
    @Column(name = "RESPONSE_CODE")
    private Integer disabilityResponse;
    
    @JsonIgnore
    @JoinColumn(name = "CLIENT_KEY", referencedColumnName = "CLIENT_KEY")
    @ManyToOne(optional = false)
    private Client projectClientID;


    public Disabilities() {
    }

    public Disabilities(Integer disabilityType, Client projectClientID) {
        this.disabilityType = disabilityType;
        this.projectClientID = projectClientID;
    }

    public Integer getId() {
    	return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    
    public Integer getDisabilityType() {
        return disabilityType;
    }

    @JsonProperty("DisabilityType")
    public void setDisabilityType(Integer disabilityType) {
        this.disabilityType = disabilityType;
    }

    public Integer getDisabilityResponse() {
        return disabilityResponse;
    }

    @JsonProperty("DisabilityResponse")
    public void setDisabilityResponse(Integer disabilityResponse) {
        this.disabilityResponse = disabilityResponse;
    }

    public Integer getIndefiniteAndImpairs() {
    	switch(disabilityType) {
	    	case 11: // Mental Illness
	    		return this.secondaryQuestionCode1;
	    	case 15: // Physical disability
	    		return this.secondaryQuestionCode2;
	    	case 19: // HIV AIDS and related diseases
	    		return this.secondaryQuestionCode2;
	    	case 20: // Developmental disability
	    		return this.secondaryQuestionCode2;
	    	case 29: // Substance Abuse
	    		return this.secondaryQuestionCode1;
	    	case 30: // Chronic Health Condition
	    		return this.secondaryQuestionCode2;
    	}
        return 0;
    }

    @JsonProperty("IndefiniteAndImpairs")
    public void setIndefiniteAndImpairs(Integer indefiniteAndImpairs) {
    	switch(disabilityType) {
	    	case 11: // Mental Illness
	    		this.secondaryQuestionCode1 = indefiniteAndImpairs;
	    		break;
	    	case 15: // Physical disability
	    		this.secondaryQuestionCode2 = indefiniteAndImpairs;
	    		break;
	    	case 19: // HIV AIDS and related diseases
	    		this.secondaryQuestionCode2 = indefiniteAndImpairs;
	    		break;
	    	case 20: // Developmental disability
	    		this.secondaryQuestionCode2 = indefiniteAndImpairs;
	    		break;
	    	case 29: // Substance Abuse
	    		this.secondaryQuestionCode1 = indefiniteAndImpairs;
	    		break;
	    	case 30: // Chronic Health Condition
	    		this.secondaryQuestionCode2 = indefiniteAndImpairs;
	    		break;
		}
    }

    public Integer getDocumentationOnFile() {
    	switch(disabilityType) {
	    	case 11: // Mental Illness
	    		return this.secondaryQuestionCode3;
	    	case 15: // Physical disability
	    		return this.secondaryQuestionCode3;
	    	case 19: // HIV AIDS and related diseases
	    		return this.secondaryQuestionCode3;
	    	case 20: // Developmental disability
	    		return this.secondaryQuestionCode3;
	    	case 29: // Substance Abuse
	    		return this.secondaryQuestionCode3;
	    	case 30: // Chronic Health Condition
	    		return this.secondaryQuestionCode3;
		}
    	return 0;
    }

    @JsonProperty("DocumentationOnFile")
    public void setDocumentationOnFile(Integer documentationOnFile) {
    	switch(disabilityType) {
	    	case 11: // Mental Illness
	    		this.secondaryQuestionCode3 = documentationOnFile;
	    		break;
	    	case 15: // Physical disability
	    		this.secondaryQuestionCode3 = documentationOnFile;
	    		break;
	    	case 19: // HIV AIDS and related diseases
	    		this.secondaryQuestionCode3 = documentationOnFile;
	    		break;
	    	case 20: // Developmental disability
	    		this.secondaryQuestionCode3 = documentationOnFile;
	    		break;
	    	case 29: // Substance Abuse
	    		this.secondaryQuestionCode3 = documentationOnFile;
	    		break;
	    	case 30: // Chronic Health Condition
	    		this.secondaryQuestionCode3 = documentationOnFile;
	    		break;
		}
    }

    public Integer getReceivingServices() {
    	switch(disabilityType) {
	    	case 11: // Mental Illness
	    		return this.secondaryQuestionCode2;
	    	case 15: // Physical disability
	    		return this.secondaryQuestionCode1;
	    	case 19: // HIV AIDS and related diseases
	    		return this.secondaryQuestionCode1;
	    	case 20: // Developmental disability
	    		return this.secondaryQuestionCode1;
	    	case 29: // Substance Abuse
	    		return this.secondaryQuestionCode2;
	    	case 30: // Chronic Health Condition
	    		return this.secondaryQuestionCode1;
		}
    	return 0;
    }

    @JsonProperty("ReceivingServices")
    public void setReceivingServices(Integer receivingServices) {
    	switch(disabilityType) {
	    	case 11: // Mental Illness
	    		this.secondaryQuestionCode2 = receivingServices;
	    		break;
	    	case 15: // Physical disability
	    		this.secondaryQuestionCode1 = receivingServices;
	    		break;
	    	case 19: // HIV AIDS and related diseases
	    		this.secondaryQuestionCode1 = receivingServices;
	    		break;
	    	case 20: // Developmental disability
	    		this.secondaryQuestionCode1 = receivingServices;
	    		break;
	    	case 29: // Substance Abuse
	    		this.secondaryQuestionCode2 = receivingServices;
	    		break;
	    	case 30: // Chronic Health Condition
	    		this.secondaryQuestionCode1 = receivingServices;
	    		break;
		}
    }

    public Integer getpATHHowConfirmed() {
    	switch(disabilityType) {
	    	case 11: // Mental Illness
	    		return this.secondaryQuestionCode5;
	    	case 29: // Substance Abuse
	    		return this.secondaryQuestionCode4;
		}
    	return 0;
    }

    @JsonProperty("PATHHowConfirmed")
    public void setpATHHowConfirmed(Integer pATHHowConfirmed) {
    	switch(disabilityType) {
	    	case 11: // Mental Illness
	    		this.secondaryQuestionCode5 = pATHHowConfirmed;
	    		break;
	    	case 29: // Substance Abuse
	    		this.secondaryQuestionCode4 = pATHHowConfirmed;
	    		break;
		}
    }

    public Integer getpATHSMIInformation() {
    	switch(disabilityType) {
	    	case 11: // Mental Illness
	    		return this.secondaryQuestionCode4;
		}
    	return 0;
    }

    @JsonProperty("PATHSMIInformation")
    public void setpATHSMIInformation(Integer pATHSMIInformation) {
    	switch(disabilityType) {
    	case 11: // Mental Illness
    		this.secondaryQuestionCode4 = pATHSMIInformation;
    		break;
		}
    }

    public Enrollment getProjectEntryID() {
        return null;
    }

    @JsonProperty("ProjectEntryID")
    public void setProjectEntryID(Enrollment projectEntryID) {
    }
}
