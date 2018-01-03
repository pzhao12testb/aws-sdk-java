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
package com.amazonaws.services.route53domains.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * The RetrieveDomainAuthCode response includes the following element.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53domains-2014-05-15/RetrieveDomainAuthCode"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RetrieveDomainAuthCodeResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The authorization code for the domain.
     * </p>
     */
    private String authCode;

    /**
     * <p>
     * The authorization code for the domain.
     * </p>
     * 
     * @param authCode
     *        The authorization code for the domain.
     */

    public void setAuthCode(String authCode) {
        this.authCode = authCode;
    }

    /**
     * <p>
     * The authorization code for the domain.
     * </p>
     * 
     * @return The authorization code for the domain.
     */

    public String getAuthCode() {
        return this.authCode;
    }

    /**
     * <p>
     * The authorization code for the domain.
     * </p>
     * 
     * @param authCode
     *        The authorization code for the domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RetrieveDomainAuthCodeResult withAuthCode(String authCode) {
        setAuthCode(authCode);
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
        if (getAuthCode() != null)
            sb.append("AuthCode: ").append(getAuthCode());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RetrieveDomainAuthCodeResult == false)
            return false;
        RetrieveDomainAuthCodeResult other = (RetrieveDomainAuthCodeResult) obj;
        if (other.getAuthCode() == null ^ this.getAuthCode() == null)
            return false;
        if (other.getAuthCode() != null && other.getAuthCode().equals(this.getAuthCode()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAuthCode() == null) ? 0 : getAuthCode().hashCode());
        return hashCode;
    }

    @Override
    public RetrieveDomainAuthCodeResult clone() {
        try {
            return (RetrieveDomainAuthCodeResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
