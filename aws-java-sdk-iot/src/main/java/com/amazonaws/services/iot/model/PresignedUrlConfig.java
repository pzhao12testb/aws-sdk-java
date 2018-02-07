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
package com.amazonaws.services.iot.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Configuration for pre-signed S3 URLs.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PresignedUrlConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ARN of an IAM role that grants grants permission to download files from the S3 bucket where the job
     * data/updates are stored. The role must also grant permission for IoT to download the files.
     * </p>
     */
    private String roleArn;
    /**
     * <p>
     * How long (in seconds) pre-signed URLs are valid. Valid values are 60 - 3600, the default value is 3600 seconds.
     * Pre-signed URLs are generated when Jobs receives an MQTT request for the job document.
     * </p>
     */
    private Long expiresInSec;

    /**
     * <p>
     * The ARN of an IAM role that grants grants permission to download files from the S3 bucket where the job
     * data/updates are stored. The role must also grant permission for IoT to download the files.
     * </p>
     * 
     * @param roleArn
     *        The ARN of an IAM role that grants grants permission to download files from the S3 bucket where the job
     *        data/updates are stored. The role must also grant permission for IoT to download the files.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The ARN of an IAM role that grants grants permission to download files from the S3 bucket where the job
     * data/updates are stored. The role must also grant permission for IoT to download the files.
     * </p>
     * 
     * @return The ARN of an IAM role that grants grants permission to download files from the S3 bucket where the job
     *         data/updates are stored. The role must also grant permission for IoT to download the files.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The ARN of an IAM role that grants grants permission to download files from the S3 bucket where the job
     * data/updates are stored. The role must also grant permission for IoT to download the files.
     * </p>
     * 
     * @param roleArn
     *        The ARN of an IAM role that grants grants permission to download files from the S3 bucket where the job
     *        data/updates are stored. The role must also grant permission for IoT to download the files.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PresignedUrlConfig withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * How long (in seconds) pre-signed URLs are valid. Valid values are 60 - 3600, the default value is 3600 seconds.
     * Pre-signed URLs are generated when Jobs receives an MQTT request for the job document.
     * </p>
     * 
     * @param expiresInSec
     *        How long (in seconds) pre-signed URLs are valid. Valid values are 60 - 3600, the default value is 3600
     *        seconds. Pre-signed URLs are generated when Jobs receives an MQTT request for the job document.
     */

    public void setExpiresInSec(Long expiresInSec) {
        this.expiresInSec = expiresInSec;
    }

    /**
     * <p>
     * How long (in seconds) pre-signed URLs are valid. Valid values are 60 - 3600, the default value is 3600 seconds.
     * Pre-signed URLs are generated when Jobs receives an MQTT request for the job document.
     * </p>
     * 
     * @return How long (in seconds) pre-signed URLs are valid. Valid values are 60 - 3600, the default value is 3600
     *         seconds. Pre-signed URLs are generated when Jobs receives an MQTT request for the job document.
     */

    public Long getExpiresInSec() {
        return this.expiresInSec;
    }

    /**
     * <p>
     * How long (in seconds) pre-signed URLs are valid. Valid values are 60 - 3600, the default value is 3600 seconds.
     * Pre-signed URLs are generated when Jobs receives an MQTT request for the job document.
     * </p>
     * 
     * @param expiresInSec
     *        How long (in seconds) pre-signed URLs are valid. Valid values are 60 - 3600, the default value is 3600
     *        seconds. Pre-signed URLs are generated when Jobs receives an MQTT request for the job document.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PresignedUrlConfig withExpiresInSec(Long expiresInSec) {
        setExpiresInSec(expiresInSec);
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
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
        if (getExpiresInSec() != null)
            sb.append("ExpiresInSec: ").append(getExpiresInSec());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PresignedUrlConfig == false)
            return false;
        PresignedUrlConfig other = (PresignedUrlConfig) obj;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getExpiresInSec() == null ^ this.getExpiresInSec() == null)
            return false;
        if (other.getExpiresInSec() != null && other.getExpiresInSec().equals(this.getExpiresInSec()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getExpiresInSec() == null) ? 0 : getExpiresInSec().hashCode());
        return hashCode;
    }

    @Override
    public PresignedUrlConfig clone() {
        try {
            return (PresignedUrlConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iot.model.transform.PresignedUrlConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
