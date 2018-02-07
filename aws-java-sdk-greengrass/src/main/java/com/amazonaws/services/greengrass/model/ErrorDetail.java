/*
 * Copyright 2013-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.greengrass.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * ErrorDetail
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/ErrorDetail" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ErrorDetail implements Serializable, Cloneable, StructuredPojo {

    /** Detailed Error Code */
    private String detailedErrorCode;
    /** Detailed Error Message */
    private String detailedErrorMessage;

    /**
     * Detailed Error Code
     * 
     * @param detailedErrorCode
     *        Detailed Error Code
     */

    public void setDetailedErrorCode(String detailedErrorCode) {
        this.detailedErrorCode = detailedErrorCode;
    }

    /**
     * Detailed Error Code
     * 
     * @return Detailed Error Code
     */

    public String getDetailedErrorCode() {
        return this.detailedErrorCode;
    }

    /**
     * Detailed Error Code
     * 
     * @param detailedErrorCode
     *        Detailed Error Code
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ErrorDetail withDetailedErrorCode(String detailedErrorCode) {
        setDetailedErrorCode(detailedErrorCode);
        return this;
    }

    /**
     * Detailed Error Message
     * 
     * @param detailedErrorMessage
     *        Detailed Error Message
     */

    public void setDetailedErrorMessage(String detailedErrorMessage) {
        this.detailedErrorMessage = detailedErrorMessage;
    }

    /**
     * Detailed Error Message
     * 
     * @return Detailed Error Message
     */

    public String getDetailedErrorMessage() {
        return this.detailedErrorMessage;
    }

    /**
     * Detailed Error Message
     * 
     * @param detailedErrorMessage
     *        Detailed Error Message
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ErrorDetail withDetailedErrorMessage(String detailedErrorMessage) {
        setDetailedErrorMessage(detailedErrorMessage);
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
        if (getDetailedErrorCode() != null)
            sb.append("DetailedErrorCode: ").append(getDetailedErrorCode()).append(",");
        if (getDetailedErrorMessage() != null)
            sb.append("DetailedErrorMessage: ").append(getDetailedErrorMessage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ErrorDetail == false)
            return false;
        ErrorDetail other = (ErrorDetail) obj;
        if (other.getDetailedErrorCode() == null ^ this.getDetailedErrorCode() == null)
            return false;
        if (other.getDetailedErrorCode() != null && other.getDetailedErrorCode().equals(this.getDetailedErrorCode()) == false)
            return false;
        if (other.getDetailedErrorMessage() == null ^ this.getDetailedErrorMessage() == null)
            return false;
        if (other.getDetailedErrorMessage() != null && other.getDetailedErrorMessage().equals(this.getDetailedErrorMessage()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDetailedErrorCode() == null) ? 0 : getDetailedErrorCode().hashCode());
        hashCode = prime * hashCode + ((getDetailedErrorMessage() == null) ? 0 : getDetailedErrorMessage().hashCode());
        return hashCode;
    }

    @Override
    public ErrorDetail clone() {
        try {
            return (ErrorDetail) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.greengrass.model.transform.ErrorDetailMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
