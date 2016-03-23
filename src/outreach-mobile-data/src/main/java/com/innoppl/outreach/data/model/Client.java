package com.innoppl.outreach.data.model;


import com.innoppl.outreach.data.utils.InjectMethods;
import com.innoppl.outreach.data.utils.Method;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Cacheable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.Basic;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonProperty;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

/**
 *
 * @author Jerald Mejarla
 */
@Cacheable
@Entity
@Table(name = "PATH_CLIENT")
public class Client extends AbstractEntity {

    private static final long serialVersionUID = 1L;

    @SequenceGenerator(name="client_sequence", sequenceName="CLIENT_KEY_SQ")
    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy=GenerationType.AUTO, generator="client_sequence")
    @Column(name = "CLIENT_KEY")
    @InjectMethods(include = Method.ALL)
    protected Integer id;

    @Size(max = 256)
    @Column(name = "FIRST_NAME")
    private String firstName;

    @Size(max = 256)
    @Column(name = "MIDDLE_NAME")
    private String middleName;

    @Size(max = 256)
    @Column(name = "LAST_NAME")
    private String lastName;

    @Size(max = 45)
    @Column(name = "SUFFIX")
    private String nameSuffix;

    @Basic(optional = false)
    @NotNull
    @Column(name = "NAME_TYPE")
    private Integer nameDataQuality;

    @Size(max = 45)
    @Column(name = "IDENTIFICATION")
    private String ssn;

    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_TYPE")
    private Integer sSNDataQuality;

    @Column(name = "DATE_OF_BIRTH")
    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(iso=ISO.DATE)
    private Date dob;

    @Basic(optional = false)
    @NotNull
    @Column(name = "DOB_TYPE")
    private Integer dobDataQuality;

    @Basic(optional = false)
    @NotNull
    @Column(name = "GENDER_KEY")
    private Integer gender;

    @Size(max = 45)
    @Column(name = "GENDER_DESC")
    private String otherGender;

    @Basic(optional = false)
    @NotNull
    @Column(name = "ETHNICITY_KEY")
    private Integer ethnicity;

    @Basic(optional = false)
    @NotNull
    @Column(name = "RACE_KEY")
    private Integer race;

    @Size(max = 1024)
    @Column(name = "PICTURE_NAME")
    private String imageUrl;

    @Basic(optional = false)
    @NotNull
    @Column(name = "VETERAN")
    private Integer veteranStatus;

//    @JsonIgnore
//    @OneToMany(cascade = CascadeType.ALL, mappedBy = "personalID")
//    private List<Enrollment> enrollmentList;

//    @OneToOne(cascade = CascadeType.ALL, mappedBy = "personalID")
//    private VeteranInfo veteranInfo;

    @JsonIgnore
    @Transient
    private Integer age;
    
    @JsonIgnore
    @Transient
    private String imageData;
    
    @Transient
    private Integer projectID;
    

    public Client() {
    }

    public Client(Integer id) {
        this.id = id;
    }

    public Integer getId() {
    	return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    @JsonProperty("FirstName")
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    @JsonProperty("MiddleName")
    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    @JsonProperty("LastName")
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getNameDataQuality() {
        return nameDataQuality;
    }

    @JsonProperty("NameDataQuality")
    public void setNameDataQuality(Integer nameDataQuality) {
        this.nameDataQuality = nameDataQuality;
    }

    public String getSsn() {
        return ssn;
    }

    @JsonProperty("SSN")
    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public Integer getsSNDataQuality() {
        return sSNDataQuality;
    }

    @JsonProperty("SSNDataQuality")
    public void setsSNDataQuality(Integer sSNDataQuality) {
        this.sSNDataQuality = sSNDataQuality;
    }

    public Date getDob() {
        return dob;
    }

    @JsonProperty("DOB")
    public void setDob(Date dob) {
        this.dob = dob;
        Calendar dobCal = Calendar.getInstance();
        dobCal.setTime(dob);
        Calendar today = Calendar.getInstance();
        this.age = today.get(Calendar.YEAR) - dobCal.get(Calendar.YEAR);
        if (today.get(Calendar.MONTH) < dobCal.get(Calendar.MONTH)) {
            this.age--;
        } else if (today.get(Calendar.MONTH) == dobCal.get(Calendar.MONTH)
                && today.get(Calendar.DAY_OF_MONTH) < dobCal.get(Calendar.DAY_OF_MONTH)) {
            this.age--;
        }
    }
    
    

    public Integer getGender() {
        return gender;
    }

    @JsonProperty("Gender")
    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public String getOtherGender() {
        return otherGender;
    }

    @JsonProperty("OtherGender")
    public void setOtherGender(String otherGender) {
        this.otherGender = otherGender;
    }

    public Integer getEthnicity() {
        return ethnicity;
    }

    @JsonProperty("Ethnicity")
    public void setEthnicity(Integer ethnicity) {
        this.ethnicity = ethnicity;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    @JsonProperty("ImageUrl")
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Integer getVeteranStatus() {
        return veteranStatus;
    }

    @JsonProperty("VeteranStatus")
    public void setVeteranStatus(Integer veteranStatus) {
        this.veteranStatus = veteranStatus;
    }

    public List<Enrollment> getEnrollmentList() {
//        return enrollmentList;
    	// TODO: re enable enrollments
    	return null;
    }

    public void setEnrollmentList(List<Enrollment> enrollmentList) {
//        this.enrollmentList = enrollmentList;
    }

    public VeteranInfo getVeteranInfo() {
//        return veteranInfo;
    	return null;
    }

    @JsonProperty("VeteranInfo")
    public void setVeteranInfo(VeteranInfo veteranInfo) {
//        this.veteranInfo = veteranInfo;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {

    }

    public String getNameSuffix() {
        return nameSuffix;
    }

    @JsonProperty("NameSuffix")
    public void setNameSuffix(String nameSuffix) {
        this.nameSuffix = nameSuffix;
    }

    public Integer getDobDataQuality() {
        return dobDataQuality;
    }

    @JsonProperty("DOBDataQuality")
    public void setDobDataQuality(Integer dobDataQuality) {
        this.dobDataQuality = dobDataQuality;
    }

    public Integer getRace() {
        return race;
    }

    @JsonProperty("Race")
    public void setRace(Integer race) {
        this.race = race;
    }    

    public String getImageData() {
        return imageData;
    }

    public void setImageData(String imageData) {
        this.imageData = imageData;
    }

    public Integer getProjectID() {
        return projectID;
    }

    public void setProjectID(Integer projectID) {
        this.projectID = projectID;
    }


    
    
    
}
