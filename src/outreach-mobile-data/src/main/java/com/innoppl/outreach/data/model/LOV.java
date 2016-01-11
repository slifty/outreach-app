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

public abstract class LOV extends AbstractEntity {

    abstract public Integer getLovType();

    abstract public Integer getId();
    
    abstract public void setId(Integer id);

    abstract public void setLovType(Integer lovType);

    abstract public String getDisplayName();

    abstract public void setDisplayName(String displayName);

    abstract public String getValueString();

    abstract public void setValueString(String valueString);
}
