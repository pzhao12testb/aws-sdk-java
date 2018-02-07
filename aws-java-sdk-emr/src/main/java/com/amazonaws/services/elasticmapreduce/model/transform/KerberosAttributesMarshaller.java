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
package com.amazonaws.services.elasticmapreduce.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.elasticmapreduce.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * KerberosAttributesMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class KerberosAttributesMarshaller {

    private static final MarshallingInfo<String> REALM_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Realm").build();
    private static final MarshallingInfo<String> KDCADMINPASSWORD_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("KdcAdminPassword").build();
    private static final MarshallingInfo<String> CROSSREALMTRUSTPRINCIPALPASSWORD_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CrossRealmTrustPrincipalPassword").build();
    private static final MarshallingInfo<String> ADDOMAINJOINUSER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ADDomainJoinUser").build();
    private static final MarshallingInfo<String> ADDOMAINJOINPASSWORD_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ADDomainJoinPassword").build();

    private static final KerberosAttributesMarshaller instance = new KerberosAttributesMarshaller();

    public static KerberosAttributesMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(KerberosAttributes kerberosAttributes, ProtocolMarshaller protocolMarshaller) {

        if (kerberosAttributes == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(kerberosAttributes.getRealm(), REALM_BINDING);
            protocolMarshaller.marshall(kerberosAttributes.getKdcAdminPassword(), KDCADMINPASSWORD_BINDING);
            protocolMarshaller.marshall(kerberosAttributes.getCrossRealmTrustPrincipalPassword(), CROSSREALMTRUSTPRINCIPALPASSWORD_BINDING);
            protocolMarshaller.marshall(kerberosAttributes.getADDomainJoinUser(), ADDOMAINJOINUSER_BINDING);
            protocolMarshaller.marshall(kerberosAttributes.getADDomainJoinPassword(), ADDOMAINJOINPASSWORD_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
