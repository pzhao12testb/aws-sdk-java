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
package com.amazonaws.services.dax.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.dax.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * IncreaseReplicationFactorRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class IncreaseReplicationFactorRequestMarshaller {

    private static final MarshallingInfo<String> CLUSTERNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ClusterName").build();
    private static final MarshallingInfo<Integer> NEWREPLICATIONFACTOR_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("NewReplicationFactor").build();
    private static final MarshallingInfo<List> AVAILABILITYZONES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AvailabilityZones").build();

    private static final IncreaseReplicationFactorRequestMarshaller instance = new IncreaseReplicationFactorRequestMarshaller();

    public static IncreaseReplicationFactorRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(IncreaseReplicationFactorRequest increaseReplicationFactorRequest, ProtocolMarshaller protocolMarshaller) {

        if (increaseReplicationFactorRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(increaseReplicationFactorRequest.getClusterName(), CLUSTERNAME_BINDING);
            protocolMarshaller.marshall(increaseReplicationFactorRequest.getNewReplicationFactor(), NEWREPLICATIONFACTOR_BINDING);
            protocolMarshaller.marshall(increaseReplicationFactorRequest.getAvailabilityZones(), AVAILABILITYZONES_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
