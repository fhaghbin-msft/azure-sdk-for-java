// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.frontdoor.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.frontdoor.fluent.models.ManagedRuleSetDefinitionProperties;

public final class ManagedRuleSetDefinitionPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ManagedRuleSetDefinitionProperties model =
            BinaryData
                .fromString(
                    "{\"provisioningState\":\"havgrvk\",\"ruleSetId\":\"ovjzhpjbibgjmfx\",\"ruleSetType\":\"vfcluyovwxnbkfe\",\"ruleSetVersion\":\"xscyhwzdgirujbz\",\"ruleGroups\":[{\"ruleGroupName\":\"zzbtdcqvpniyujvi\",\"description\":\"wdsh\",\"rules\":[]},{\"ruleGroupName\":\"rbgyefry\",\"description\":\"gaojf\",\"rules\":[]},{\"ruleGroupName\":\"otmrfhir\",\"description\":\"ymoxoftpipiwyczu\",\"rules\":[]}]}")
                .toObject(ManagedRuleSetDefinitionProperties.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ManagedRuleSetDefinitionProperties model = new ManagedRuleSetDefinitionProperties();
        model = BinaryData.fromObject(model).toObject(ManagedRuleSetDefinitionProperties.class);
    }
}
