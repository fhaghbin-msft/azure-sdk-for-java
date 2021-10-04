// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.callingserver.implementation.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for RecordingContent. */
public final class RecordingContent extends ExpandableStringEnum<RecordingContent> {
    /** Static value audio for RecordingContent. */
    public static final RecordingContent AUDIO = fromString("audio");

    /** Static value audioVideo for RecordingContent. */
    public static final RecordingContent AUDIO_VIDEO = fromString("audioVideo");

    /**
     * Creates or finds a RecordingContent from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding RecordingContent.
     */
    @JsonCreator
    public static RecordingContent fromString(String name) {
        return fromString(name, RecordingContent.class);
    }

    /** @return known RecordingContent values. */
    public static Collection<RecordingContent> values() {
        return values(RecordingContent.class);
    }
}