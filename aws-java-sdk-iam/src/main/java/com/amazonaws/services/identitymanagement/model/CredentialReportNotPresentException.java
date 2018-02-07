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
package com.amazonaws.services.identitymanagement.model;

import javax.annotation.Generated;

/**
 * <p>
 * The request was rejected because the credential report does not exist. To generate a credential report, use
 * <a>GenerateCredentialReport</a>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CredentialReportNotPresentException extends com.amazonaws.services.identitymanagement.model.AmazonIdentityManagementException {
    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new CredentialReportNotPresentException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public CredentialReportNotPresentException(String message) {
        super(message);
    }

}
