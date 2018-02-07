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
package com.amazonaws.services.medialive.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * Placeholder documentation for CreateInputSecurityGroupResponse
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/CreateInputSecurityGroup" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateInputSecurityGroupResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    private InputSecurityGroup securityGroup;

    /**
     * @param securityGroup
     */

    public void setSecurityGroup(InputSecurityGroup securityGroup) {
        this.securityGroup = securityGroup;
    }

    /**
     * @return
     */

    public InputSecurityGroup getSecurityGroup() {
        return this.securityGroup;
    }

    /**
     * @param securityGroup
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateInputSecurityGroupResult withSecurityGroup(InputSecurityGroup securityGroup) {
        setSecurityGroup(securityGroup);
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
        if (getSecurityGroup() != null)
            sb.append("SecurityGroup: ").append(getSecurityGroup());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateInputSecurityGroupResult == false)
            return false;
        CreateInputSecurityGroupResult other = (CreateInputSecurityGroupResult) obj;
        if (other.getSecurityGroup() == null ^ this.getSecurityGroup() == null)
            return false;
        if (other.getSecurityGroup() != null && other.getSecurityGroup().equals(this.getSecurityGroup()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSecurityGroup() == null) ? 0 : getSecurityGroup().hashCode());
        return hashCode;
    }

    @Override
    public CreateInputSecurityGroupResult clone() {
        try {
            return (CreateInputSecurityGroupResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
