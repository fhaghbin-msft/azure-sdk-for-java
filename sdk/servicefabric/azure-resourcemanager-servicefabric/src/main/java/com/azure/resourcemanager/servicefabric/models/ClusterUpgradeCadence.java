// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicefabric.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for ClusterUpgradeCadence. */
public final class ClusterUpgradeCadence extends ExpandableStringEnum<ClusterUpgradeCadence> {
    /** Static value Wave0 for ClusterUpgradeCadence. */
    public static final ClusterUpgradeCadence WAVE0 = fromString("Wave0");

    /** Static value Wave1 for ClusterUpgradeCadence. */
    public static final ClusterUpgradeCadence WAVE1 = fromString("Wave1");

    /** Static value Wave2 for ClusterUpgradeCadence. */
    public static final ClusterUpgradeCadence WAVE2 = fromString("Wave2");

    /**
     * Creates or finds a ClusterUpgradeCadence from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ClusterUpgradeCadence.
     */
    @JsonCreator
    public static ClusterUpgradeCadence fromString(String name) {
        return fromString(name, ClusterUpgradeCadence.class);
    }

    /** @return known ClusterUpgradeCadence values. */
    public static Collection<ClusterUpgradeCadence> values() {
        return values(ClusterUpgradeCadence.class);
    }
}