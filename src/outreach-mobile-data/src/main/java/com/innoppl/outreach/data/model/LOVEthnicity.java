package com.innoppl.outreach.data.model;

import javax.persistence.Basic;
import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import org.codehaus.jackson.annotate.JsonProperty;

import com.innoppl.outreach.data.utils.InjectMethods;
import com.innoppl.outreach.data.utils.Method;

/**
 *
 * @author Jerald Mejarla
 */
@Cacheable
@Entity
@Table(name = "PATH_CODE_ETHNICITY")
public class LOVEthnicity extends LOV {

    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CODE_KEY", insertable=false, updatable=false)
    protected Integer id;
    
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 512)
    @Column(name = "DESCRIPTION")
    private String displayName;
    
    public Integer getLovType() {
        return 0; // TODO: This is terrible -- this should come from a central list somewhere.
    }

    public Integer getId() {
    	return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonProperty("type")
    public void setLovType(Integer lovType) {
    }

    public String getDisplayName() {
        return displayName;
    }

    @JsonProperty("name")
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getValueString() {
        return id.toString();
    }

    @JsonProperty("value")
    public void setValueString(String valueString) {
    }
}
