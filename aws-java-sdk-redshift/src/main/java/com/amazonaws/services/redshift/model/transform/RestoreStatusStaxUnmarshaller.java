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
package com.amazonaws.services.redshift.model.transform;

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.redshift.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * RestoreStatus StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RestoreStatusStaxUnmarshaller implements Unmarshaller<RestoreStatus, StaxUnmarshallerContext> {

    public RestoreStatus unmarshall(StaxUnmarshallerContext context) throws Exception {
        RestoreStatus restoreStatus = new RestoreStatus();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return restoreStatus;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("Status", targetDepth)) {
                    restoreStatus.setStatus(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("CurrentRestoreRateInMegaBytesPerSecond", targetDepth)) {
                    restoreStatus.setCurrentRestoreRateInMegaBytesPerSecond(DoubleStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("SnapshotSizeInMegaBytes", targetDepth)) {
                    restoreStatus.setSnapshotSizeInMegaBytes(LongStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ProgressInMegaBytes", targetDepth)) {
                    restoreStatus.setProgressInMegaBytes(LongStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ElapsedTimeInSeconds", targetDepth)) {
                    restoreStatus.setElapsedTimeInSeconds(LongStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("EstimatedTimeToCompletionInSeconds", targetDepth)) {
                    restoreStatus.setEstimatedTimeToCompletionInSeconds(LongStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return restoreStatus;
                }
            }
        }
    }

    private static RestoreStatusStaxUnmarshaller instance;

    public static RestoreStatusStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new RestoreStatusStaxUnmarshaller();
        return instance;
    }
}
