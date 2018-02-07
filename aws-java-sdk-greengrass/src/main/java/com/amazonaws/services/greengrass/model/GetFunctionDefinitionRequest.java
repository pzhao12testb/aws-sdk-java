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
package com.amazonaws.services.greengrass.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/GetFunctionDefinition" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetFunctionDefinitionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /** the unique Id of the lambda definition */
    private String functionDefinitionId;

    /**
     * the unique Id of the lambda definition
     * 
     * @param functionDefinitionId
     *        the unique Id of the lambda definition
     */

    public void setFunctionDefinitionId(String functionDefinitionId) {
        this.functionDefinitionId = functionDefinitionId;
    }

    /**
     * the unique Id of the lambda definition
     * 
     * @return the unique Id of the lambda definition
     */

    public String getFunctionDefinitionId() {
        return this.functionDefinitionId;
    }

    /**
     * the unique Id of the lambda definition
     * 
     * @param functionDefinitionId
     *        the unique Id of the lambda definition
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetFunctionDefinitionRequest withFunctionDefinitionId(String functionDefinitionId) {
        setFunctionDefinitionId(functionDefinitionId);
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
        if (getFunctionDefinitionId() != null)
            sb.append("FunctionDefinitionId: ").append(getFunctionDefinitionId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetFunctionDefinitionRequest == false)
            return false;
        GetFunctionDefinitionRequest other = (GetFunctionDefinitionRequest) obj;
        if (other.getFunctionDefinitionId() == null ^ this.getFunctionDefinitionId() == null)
            return false;
        if (other.getFunctionDefinitionId() != null && other.getFunctionDefinitionId().equals(this.getFunctionDefinitionId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFunctionDefinitionId() == null) ? 0 : getFunctionDefinitionId().hashCode());
        return hashCode;
    }

    @Override
    public GetFunctionDefinitionRequest clone() {
        return (GetFunctionDefinitionRequest) super.clone();
    }

}
