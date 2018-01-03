/*
 * Copyright 2012-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.guardduty.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * CreateThreatIntelSet request body.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/CreateThreatIntelSet" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateThreatIntelSetRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /** A boolean value that indicates whether GuardDuty is to start using the uploaded ThreatIntelSet. */
    private Boolean activate;
    /** The unique ID of the detector that you want to update. */
    private String detectorId;
    /** The format of the file that contains the ThreatIntelSet. */
    private String format;
    /**
     * The URI of the file that contains the ThreatIntelSet. For example
     * (https://s3.us-west-2.amazonaws.com/my-bucket/my-object-key).
     */
    private String location;
    /**
     * A user-friendly ThreatIntelSet name that is displayed in all finding generated by activity that involves IP
     * addresses included in this ThreatIntelSet.
     */
    private String name;

    /**
     * A boolean value that indicates whether GuardDuty is to start using the uploaded ThreatIntelSet.
     * 
     * @param activate
     *        A boolean value that indicates whether GuardDuty is to start using the uploaded ThreatIntelSet.
     */

    public void setActivate(Boolean activate) {
        this.activate = activate;
    }

    /**
     * A boolean value that indicates whether GuardDuty is to start using the uploaded ThreatIntelSet.
     * 
     * @return A boolean value that indicates whether GuardDuty is to start using the uploaded ThreatIntelSet.
     */

    public Boolean getActivate() {
        return this.activate;
    }

    /**
     * A boolean value that indicates whether GuardDuty is to start using the uploaded ThreatIntelSet.
     * 
     * @param activate
     *        A boolean value that indicates whether GuardDuty is to start using the uploaded ThreatIntelSet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateThreatIntelSetRequest withActivate(Boolean activate) {
        setActivate(activate);
        return this;
    }

    /**
     * A boolean value that indicates whether GuardDuty is to start using the uploaded ThreatIntelSet.
     * 
     * @return A boolean value that indicates whether GuardDuty is to start using the uploaded ThreatIntelSet.
     */

    public Boolean isActivate() {
        return this.activate;
    }

    /**
     * The unique ID of the detector that you want to update.
     * 
     * @param detectorId
     *        The unique ID of the detector that you want to update.
     */

    public void setDetectorId(String detectorId) {
        this.detectorId = detectorId;
    }

    /**
     * The unique ID of the detector that you want to update.
     * 
     * @return The unique ID of the detector that you want to update.
     */

    public String getDetectorId() {
        return this.detectorId;
    }

    /**
     * The unique ID of the detector that you want to update.
     * 
     * @param detectorId
     *        The unique ID of the detector that you want to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateThreatIntelSetRequest withDetectorId(String detectorId) {
        setDetectorId(detectorId);
        return this;
    }

    /**
     * The format of the file that contains the ThreatIntelSet.
     * 
     * @param format
     *        The format of the file that contains the ThreatIntelSet.
     * @see ThreatIntelSetFormat
     */

    public void setFormat(String format) {
        this.format = format;
    }

    /**
     * The format of the file that contains the ThreatIntelSet.
     * 
     * @return The format of the file that contains the ThreatIntelSet.
     * @see ThreatIntelSetFormat
     */

    public String getFormat() {
        return this.format;
    }

    /**
     * The format of the file that contains the ThreatIntelSet.
     * 
     * @param format
     *        The format of the file that contains the ThreatIntelSet.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ThreatIntelSetFormat
     */

    public CreateThreatIntelSetRequest withFormat(String format) {
        setFormat(format);
        return this;
    }

    /**
     * The format of the file that contains the ThreatIntelSet.
     * 
     * @param format
     *        The format of the file that contains the ThreatIntelSet.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ThreatIntelSetFormat
     */

    public CreateThreatIntelSetRequest withFormat(ThreatIntelSetFormat format) {
        this.format = format.toString();
        return this;
    }

    /**
     * The URI of the file that contains the ThreatIntelSet. For example
     * (https://s3.us-west-2.amazonaws.com/my-bucket/my-object-key).
     * 
     * @param location
     *        The URI of the file that contains the ThreatIntelSet. For example
     *        (https://s3.us-west-2.amazonaws.com/my-bucket/my-object-key).
     */

    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * The URI of the file that contains the ThreatIntelSet. For example
     * (https://s3.us-west-2.amazonaws.com/my-bucket/my-object-key).
     * 
     * @return The URI of the file that contains the ThreatIntelSet. For example
     *         (https://s3.us-west-2.amazonaws.com/my-bucket/my-object-key).
     */

    public String getLocation() {
        return this.location;
    }

    /**
     * The URI of the file that contains the ThreatIntelSet. For example
     * (https://s3.us-west-2.amazonaws.com/my-bucket/my-object-key).
     * 
     * @param location
     *        The URI of the file that contains the ThreatIntelSet. For example
     *        (https://s3.us-west-2.amazonaws.com/my-bucket/my-object-key).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateThreatIntelSetRequest withLocation(String location) {
        setLocation(location);
        return this;
    }

    /**
     * A user-friendly ThreatIntelSet name that is displayed in all finding generated by activity that involves IP
     * addresses included in this ThreatIntelSet.
     * 
     * @param name
     *        A user-friendly ThreatIntelSet name that is displayed in all finding generated by activity that involves
     *        IP addresses included in this ThreatIntelSet.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * A user-friendly ThreatIntelSet name that is displayed in all finding generated by activity that involves IP
     * addresses included in this ThreatIntelSet.
     * 
     * @return A user-friendly ThreatIntelSet name that is displayed in all finding generated by activity that involves
     *         IP addresses included in this ThreatIntelSet.
     */

    public String getName() {
        return this.name;
    }

    /**
     * A user-friendly ThreatIntelSet name that is displayed in all finding generated by activity that involves IP
     * addresses included in this ThreatIntelSet.
     * 
     * @param name
     *        A user-friendly ThreatIntelSet name that is displayed in all finding generated by activity that involves
     *        IP addresses included in this ThreatIntelSet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateThreatIntelSetRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getActivate() != null)
            sb.append("Activate: ").append(getActivate()).append(",");
        if (getDetectorId() != null)
            sb.append("DetectorId: ").append(getDetectorId()).append(",");
        if (getFormat() != null)
            sb.append("Format: ").append(getFormat()).append(",");
        if (getLocation() != null)
            sb.append("Location: ").append(getLocation()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateThreatIntelSetRequest == false)
            return false;
        CreateThreatIntelSetRequest other = (CreateThreatIntelSetRequest) obj;
        if (other.getActivate() == null ^ this.getActivate() == null)
            return false;
        if (other.getActivate() != null && other.getActivate().equals(this.getActivate()) == false)
            return false;
        if (other.getDetectorId() == null ^ this.getDetectorId() == null)
            return false;
        if (other.getDetectorId() != null && other.getDetectorId().equals(this.getDetectorId()) == false)
            return false;
        if (other.getFormat() == null ^ this.getFormat() == null)
            return false;
        if (other.getFormat() != null && other.getFormat().equals(this.getFormat()) == false)
            return false;
        if (other.getLocation() == null ^ this.getLocation() == null)
            return false;
        if (other.getLocation() != null && other.getLocation().equals(this.getLocation()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getActivate() == null) ? 0 : getActivate().hashCode());
        hashCode = prime * hashCode + ((getDetectorId() == null) ? 0 : getDetectorId().hashCode());
        hashCode = prime * hashCode + ((getFormat() == null) ? 0 : getFormat().hashCode());
        hashCode = prime * hashCode + ((getLocation() == null) ? 0 : getLocation().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        return hashCode;
    }

    @Override
    public CreateThreatIntelSetRequest clone() {
        return (CreateThreatIntelSetRequest) super.clone();
    }

}
