/*
 * Copyright 2012-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.devicefarm.model.transform;

import java.util.Map;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.devicefarm.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * AccountSettingsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AccountSettingsMarshaller {

    private static final MarshallingInfo<String> AWSACCOUNTNUMBER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("awsAccountNumber").build();
    private static final MarshallingInfo<Map> UNMETEREDDEVICES_BINDING = MarshallingInfo.builder(MarshallingType.MAP)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("unmeteredDevices").build();
    private static final MarshallingInfo<Map> UNMETEREDREMOTEACCESSDEVICES_BINDING = MarshallingInfo.builder(MarshallingType.MAP)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("unmeteredRemoteAccessDevices").build();

    private static final AccountSettingsMarshaller instance = new AccountSettingsMarshaller();

    public static AccountSettingsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AccountSettings accountSettings, ProtocolMarshaller protocolMarshaller) {

        if (accountSettings == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(accountSettings.getAwsAccountNumber(), AWSACCOUNTNUMBER_BINDING);
            protocolMarshaller.marshall(accountSettings.getUnmeteredDevices(), UNMETEREDDEVICES_BINDING);
            protocolMarshaller.marshall(accountSettings.getUnmeteredRemoteAccessDevices(), UNMETEREDREMOTEACCESSDEVICES_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
