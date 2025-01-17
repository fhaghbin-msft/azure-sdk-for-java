// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicesbackup.models.DailySchedule;
import com.azure.resourcemanager.recoveryservicesbackup.models.DayOfWeek;
import com.azure.resourcemanager.recoveryservicesbackup.models.HourlySchedule;
import com.azure.resourcemanager.recoveryservicesbackup.models.ScheduleRunType;
import com.azure.resourcemanager.recoveryservicesbackup.models.SimpleSchedulePolicyV2;
import com.azure.resourcemanager.recoveryservicesbackup.models.WeeklySchedule;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class SimpleSchedulePolicyV2Tests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SimpleSchedulePolicyV2 model =
            BinaryData
                .fromString(
                    "{\"schedulePolicyType\":\"SimpleSchedulePolicyV2\",\"scheduleRunFrequency\":\"Weekly\",\"hourlySchedule\":{\"interval\":1164479404,\"scheduleWindowStartTime\":\"2021-08-20T21:03:29Z\",\"scheduleWindowDuration\":619944622},\"dailySchedule\":{\"scheduleRunTimes\":[\"2021-08-28T02:41:28Z\",\"2021-01-28T12:45:33Z\",\"2021-02-27T10:59:18Z\"]},\"weeklySchedule\":{\"scheduleRunDays\":[\"Friday\",\"Saturday\"],\"scheduleRunTimes\":[\"2021-02-02T03:22:38Z\",\"2021-08-15T22:01:32Z\",\"2021-11-18T02:38:40Z\",\"2021-05-12T17:46:54Z\"]}}")
                .toObject(SimpleSchedulePolicyV2.class);
        Assertions.assertEquals(ScheduleRunType.WEEKLY, model.scheduleRunFrequency());
        Assertions.assertEquals(1164479404, model.hourlySchedule().interval());
        Assertions
            .assertEquals(
                OffsetDateTime.parse("2021-08-20T21:03:29Z"), model.hourlySchedule().scheduleWindowStartTime());
        Assertions.assertEquals(619944622, model.hourlySchedule().scheduleWindowDuration());
        Assertions
            .assertEquals(
                OffsetDateTime.parse("2021-08-28T02:41:28Z"), model.dailySchedule().scheduleRunTimes().get(0));
        Assertions.assertEquals(DayOfWeek.FRIDAY, model.weeklySchedule().scheduleRunDays().get(0));
        Assertions
            .assertEquals(
                OffsetDateTime.parse("2021-02-02T03:22:38Z"), model.weeklySchedule().scheduleRunTimes().get(0));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SimpleSchedulePolicyV2 model =
            new SimpleSchedulePolicyV2()
                .withScheduleRunFrequency(ScheduleRunType.WEEKLY)
                .withHourlySchedule(
                    new HourlySchedule()
                        .withInterval(1164479404)
                        .withScheduleWindowStartTime(OffsetDateTime.parse("2021-08-20T21:03:29Z"))
                        .withScheduleWindowDuration(619944622))
                .withDailySchedule(
                    new DailySchedule()
                        .withScheduleRunTimes(
                            Arrays
                                .asList(
                                    OffsetDateTime.parse("2021-08-28T02:41:28Z"),
                                    OffsetDateTime.parse("2021-01-28T12:45:33Z"),
                                    OffsetDateTime.parse("2021-02-27T10:59:18Z"))))
                .withWeeklySchedule(
                    new WeeklySchedule()
                        .withScheduleRunDays(Arrays.asList(DayOfWeek.FRIDAY, DayOfWeek.SATURDAY))
                        .withScheduleRunTimes(
                            Arrays
                                .asList(
                                    OffsetDateTime.parse("2021-02-02T03:22:38Z"),
                                    OffsetDateTime.parse("2021-08-15T22:01:32Z"),
                                    OffsetDateTime.parse("2021-11-18T02:38:40Z"),
                                    OffsetDateTime.parse("2021-05-12T17:46:54Z"))));
        model = BinaryData.fromObject(model).toObject(SimpleSchedulePolicyV2.class);
        Assertions.assertEquals(ScheduleRunType.WEEKLY, model.scheduleRunFrequency());
        Assertions.assertEquals(1164479404, model.hourlySchedule().interval());
        Assertions
            .assertEquals(
                OffsetDateTime.parse("2021-08-20T21:03:29Z"), model.hourlySchedule().scheduleWindowStartTime());
        Assertions.assertEquals(619944622, model.hourlySchedule().scheduleWindowDuration());
        Assertions
            .assertEquals(
                OffsetDateTime.parse("2021-08-28T02:41:28Z"), model.dailySchedule().scheduleRunTimes().get(0));
        Assertions.assertEquals(DayOfWeek.FRIDAY, model.weeklySchedule().scheduleRunDays().get(0));
        Assertions
            .assertEquals(
                OffsetDateTime.parse("2021-02-02T03:22:38Z"), model.weeklySchedule().scheduleRunTimes().get(0));
    }
}
