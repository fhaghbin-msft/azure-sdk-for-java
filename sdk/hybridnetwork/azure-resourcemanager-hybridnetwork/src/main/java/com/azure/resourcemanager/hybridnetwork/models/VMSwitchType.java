// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridnetwork.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for VMSwitchType. */
public final class VMSwitchType extends ExpandableStringEnum<VMSwitchType> {
    /** Static value Unknown for VMSwitchType. */
    public static final VMSwitchType UNKNOWN = fromString("Unknown");

    /** Static value Management for VMSwitchType. */
    public static final VMSwitchType MANAGEMENT = fromString("Management");

    /** Static value Wan for VMSwitchType. */
    public static final VMSwitchType WAN = fromString("Wan");

    /** Static value Lan for VMSwitchType. */
    public static final VMSwitchType LAN = fromString("Lan");

    /**
     * Creates or finds a VMSwitchType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding VMSwitchType.
     */
    @JsonCreator
    public static VMSwitchType fromString(String name) {
        return fromString(name, VMSwitchType.class);
    }

    /** @return known VMSwitchType values. */
    public static Collection<VMSwitchType> values() {
        return values(VMSwitchType.class);
    }
}