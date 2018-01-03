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
package com.amazonaws.services.simplesystemsmanagement.model.transform;

import java.util.Map;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.simplesystemsmanagement.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * MaintenanceWindowRunCommandParametersMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class MaintenanceWindowRunCommandParametersMarshaller {

    private static final MarshallingInfo<String> COMMENT_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Comment").build();
    private static final MarshallingInfo<String> DOCUMENTHASH_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DocumentHash").build();
    private static final MarshallingInfo<String> DOCUMENTHASHTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DocumentHashType").build();
    private static final MarshallingInfo<StructuredPojo> NOTIFICATIONCONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("NotificationConfig").build();
    private static final MarshallingInfo<String> OUTPUTS3BUCKETNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("OutputS3BucketName").build();
    private static final MarshallingInfo<String> OUTPUTS3KEYPREFIX_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("OutputS3KeyPrefix").build();
    private static final MarshallingInfo<Map> PARAMETERS_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Parameters").build();
    private static final MarshallingInfo<String> SERVICEROLEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ServiceRoleArn").build();
    private static final MarshallingInfo<Integer> TIMEOUTSECONDS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TimeoutSeconds").build();

    private static final MaintenanceWindowRunCommandParametersMarshaller instance = new MaintenanceWindowRunCommandParametersMarshaller();

    public static MaintenanceWindowRunCommandParametersMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(MaintenanceWindowRunCommandParameters maintenanceWindowRunCommandParameters, ProtocolMarshaller protocolMarshaller) {

        if (maintenanceWindowRunCommandParameters == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(maintenanceWindowRunCommandParameters.getComment(), COMMENT_BINDING);
            protocolMarshaller.marshall(maintenanceWindowRunCommandParameters.getDocumentHash(), DOCUMENTHASH_BINDING);
            protocolMarshaller.marshall(maintenanceWindowRunCommandParameters.getDocumentHashType(), DOCUMENTHASHTYPE_BINDING);
            protocolMarshaller.marshall(maintenanceWindowRunCommandParameters.getNotificationConfig(), NOTIFICATIONCONFIG_BINDING);
            protocolMarshaller.marshall(maintenanceWindowRunCommandParameters.getOutputS3BucketName(), OUTPUTS3BUCKETNAME_BINDING);
            protocolMarshaller.marshall(maintenanceWindowRunCommandParameters.getOutputS3KeyPrefix(), OUTPUTS3KEYPREFIX_BINDING);
            protocolMarshaller.marshall(maintenanceWindowRunCommandParameters.getParameters(), PARAMETERS_BINDING);
            protocolMarshaller.marshall(maintenanceWindowRunCommandParameters.getServiceRoleArn(), SERVICEROLEARN_BINDING);
            protocolMarshaller.marshall(maintenanceWindowRunCommandParameters.getTimeoutSeconds(), TIMEOUTSECONDS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
