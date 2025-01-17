// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicesbackup.models.DailyRetentionFormat;
import com.azure.resourcemanager.recoveryservicesbackup.models.DailyRetentionSchedule;
import com.azure.resourcemanager.recoveryservicesbackup.models.DayOfWeek;
import com.azure.resourcemanager.recoveryservicesbackup.models.LongTermRetentionPolicy;
import com.azure.resourcemanager.recoveryservicesbackup.models.MonthOfYear;
import com.azure.resourcemanager.recoveryservicesbackup.models.MonthlyRetentionSchedule;
import com.azure.resourcemanager.recoveryservicesbackup.models.RetentionDuration;
import com.azure.resourcemanager.recoveryservicesbackup.models.RetentionDurationType;
import com.azure.resourcemanager.recoveryservicesbackup.models.RetentionScheduleFormat;
import com.azure.resourcemanager.recoveryservicesbackup.models.WeekOfMonth;
import com.azure.resourcemanager.recoveryservicesbackup.models.WeeklyRetentionFormat;
import com.azure.resourcemanager.recoveryservicesbackup.models.WeeklyRetentionSchedule;
import com.azure.resourcemanager.recoveryservicesbackup.models.YearlyRetentionSchedule;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class LongTermRetentionPolicyTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        LongTermRetentionPolicy model =
            BinaryData
                .fromString(
                    "{\"retentionPolicyType\":\"LongTermRetentionPolicy\",\"dailySchedule\":{\"retentionTimes\":[\"2021-02-14T11:00:53Z\"],\"retentionDuration\":{\"count\":290394700,\"durationType\":\"Weeks\"}},\"weeklySchedule\":{\"daysOfTheWeek\":[\"Wednesday\",\"Thursday\"],\"retentionTimes\":[\"2021-08-05T06:49:59Z\"],\"retentionDuration\":{\"count\":656291257,\"durationType\":\"Weeks\"}},\"monthlySchedule\":{\"retentionScheduleFormatType\":\"Weekly\",\"retentionScheduleDaily\":{\"daysOfTheMonth\":[]},\"retentionScheduleWeekly\":{\"daysOfTheWeek\":[\"Friday\",\"Tuesday\",\"Tuesday\",\"Wednesday\"],\"weeksOfTheMonth\":[\"Last\",\"Fourth\",\"First\",\"Fourth\"]},\"retentionTimes\":[\"2021-10-24T23:00:05Z\",\"2021-05-10T14:49:05Z\",\"2021-03-25T18:49:09Z\"],\"retentionDuration\":{\"count\":1077682035,\"durationType\":\"Invalid\"}},\"yearlySchedule\":{\"retentionScheduleFormatType\":\"Invalid\",\"monthsOfYear\":[\"September\",\"November\",\"December\",\"December\"],\"retentionScheduleDaily\":{\"daysOfTheMonth\":[]},\"retentionScheduleWeekly\":{\"daysOfTheWeek\":[\"Tuesday\",\"Friday\",\"Monday\",\"Friday\"],\"weeksOfTheMonth\":[\"Third\",\"First\",\"Third\"]},\"retentionTimes\":[\"2021-03-21T08:13:48Z\",\"2021-11-16T20:15:57Z\",\"2021-01-01T06:59:38Z\"],\"retentionDuration\":{\"count\":1115734201,\"durationType\":\"Days\"}}}")
                .toObject(LongTermRetentionPolicy.class);
        Assertions
            .assertEquals(OffsetDateTime.parse("2021-02-14T11:00:53Z"), model.dailySchedule().retentionTimes().get(0));
        Assertions.assertEquals(290394700, model.dailySchedule().retentionDuration().count());
        Assertions.assertEquals(RetentionDurationType.WEEKS, model.dailySchedule().retentionDuration().durationType());
        Assertions.assertEquals(DayOfWeek.WEDNESDAY, model.weeklySchedule().daysOfTheWeek().get(0));
        Assertions
            .assertEquals(OffsetDateTime.parse("2021-08-05T06:49:59Z"), model.weeklySchedule().retentionTimes().get(0));
        Assertions.assertEquals(656291257, model.weeklySchedule().retentionDuration().count());
        Assertions.assertEquals(RetentionDurationType.WEEKS, model.weeklySchedule().retentionDuration().durationType());
        Assertions.assertEquals(RetentionScheduleFormat.WEEKLY, model.monthlySchedule().retentionScheduleFormatType());
        Assertions
            .assertEquals(DayOfWeek.FRIDAY, model.monthlySchedule().retentionScheduleWeekly().daysOfTheWeek().get(0));
        Assertions
            .assertEquals(WeekOfMonth.LAST, model.monthlySchedule().retentionScheduleWeekly().weeksOfTheMonth().get(0));
        Assertions
            .assertEquals(
                OffsetDateTime.parse("2021-10-24T23:00:05Z"), model.monthlySchedule().retentionTimes().get(0));
        Assertions.assertEquals(1077682035, model.monthlySchedule().retentionDuration().count());
        Assertions
            .assertEquals(RetentionDurationType.INVALID, model.monthlySchedule().retentionDuration().durationType());
        Assertions.assertEquals(RetentionScheduleFormat.INVALID, model.yearlySchedule().retentionScheduleFormatType());
        Assertions.assertEquals(MonthOfYear.SEPTEMBER, model.yearlySchedule().monthsOfYear().get(0));
        Assertions
            .assertEquals(DayOfWeek.TUESDAY, model.yearlySchedule().retentionScheduleWeekly().daysOfTheWeek().get(0));
        Assertions
            .assertEquals(WeekOfMonth.THIRD, model.yearlySchedule().retentionScheduleWeekly().weeksOfTheMonth().get(0));
        Assertions
            .assertEquals(OffsetDateTime.parse("2021-03-21T08:13:48Z"), model.yearlySchedule().retentionTimes().get(0));
        Assertions.assertEquals(1115734201, model.yearlySchedule().retentionDuration().count());
        Assertions.assertEquals(RetentionDurationType.DAYS, model.yearlySchedule().retentionDuration().durationType());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        LongTermRetentionPolicy model =
            new LongTermRetentionPolicy()
                .withDailySchedule(
                    new DailyRetentionSchedule()
                        .withRetentionTimes(Arrays.asList(OffsetDateTime.parse("2021-02-14T11:00:53Z")))
                        .withRetentionDuration(
                            new RetentionDuration().withCount(290394700).withDurationType(RetentionDurationType.WEEKS)))
                .withWeeklySchedule(
                    new WeeklyRetentionSchedule()
                        .withDaysOfTheWeek(Arrays.asList(DayOfWeek.WEDNESDAY, DayOfWeek.THURSDAY))
                        .withRetentionTimes(Arrays.asList(OffsetDateTime.parse("2021-08-05T06:49:59Z")))
                        .withRetentionDuration(
                            new RetentionDuration().withCount(656291257).withDurationType(RetentionDurationType.WEEKS)))
                .withMonthlySchedule(
                    new MonthlyRetentionSchedule()
                        .withRetentionScheduleFormatType(RetentionScheduleFormat.WEEKLY)
                        .withRetentionScheduleDaily(new DailyRetentionFormat().withDaysOfTheMonth(Arrays.asList()))
                        .withRetentionScheduleWeekly(
                            new WeeklyRetentionFormat()
                                .withDaysOfTheWeek(
                                    Arrays
                                        .asList(
                                            DayOfWeek.FRIDAY,
                                            DayOfWeek.TUESDAY,
                                            DayOfWeek.TUESDAY,
                                            DayOfWeek.WEDNESDAY))
                                .withWeeksOfTheMonth(
                                    Arrays
                                        .asList(
                                            WeekOfMonth.LAST,
                                            WeekOfMonth.FOURTH,
                                            WeekOfMonth.FIRST,
                                            WeekOfMonth.FOURTH)))
                        .withRetentionTimes(
                            Arrays
                                .asList(
                                    OffsetDateTime.parse("2021-10-24T23:00:05Z"),
                                    OffsetDateTime.parse("2021-05-10T14:49:05Z"),
                                    OffsetDateTime.parse("2021-03-25T18:49:09Z")))
                        .withRetentionDuration(
                            new RetentionDuration()
                                .withCount(1077682035)
                                .withDurationType(RetentionDurationType.INVALID)))
                .withYearlySchedule(
                    new YearlyRetentionSchedule()
                        .withRetentionScheduleFormatType(RetentionScheduleFormat.INVALID)
                        .withMonthsOfYear(
                            Arrays
                                .asList(
                                    MonthOfYear.SEPTEMBER,
                                    MonthOfYear.NOVEMBER,
                                    MonthOfYear.DECEMBER,
                                    MonthOfYear.DECEMBER))
                        .withRetentionScheduleDaily(new DailyRetentionFormat().withDaysOfTheMonth(Arrays.asList()))
                        .withRetentionScheduleWeekly(
                            new WeeklyRetentionFormat()
                                .withDaysOfTheWeek(
                                    Arrays
                                        .asList(
                                            DayOfWeek.TUESDAY, DayOfWeek.FRIDAY, DayOfWeek.MONDAY, DayOfWeek.FRIDAY))
                                .withWeeksOfTheMonth(
                                    Arrays.asList(WeekOfMonth.THIRD, WeekOfMonth.FIRST, WeekOfMonth.THIRD)))
                        .withRetentionTimes(
                            Arrays
                                .asList(
                                    OffsetDateTime.parse("2021-03-21T08:13:48Z"),
                                    OffsetDateTime.parse("2021-11-16T20:15:57Z"),
                                    OffsetDateTime.parse("2021-01-01T06:59:38Z")))
                        .withRetentionDuration(
                            new RetentionDuration()
                                .withCount(1115734201)
                                .withDurationType(RetentionDurationType.DAYS)));
        model = BinaryData.fromObject(model).toObject(LongTermRetentionPolicy.class);
        Assertions
            .assertEquals(OffsetDateTime.parse("2021-02-14T11:00:53Z"), model.dailySchedule().retentionTimes().get(0));
        Assertions.assertEquals(290394700, model.dailySchedule().retentionDuration().count());
        Assertions.assertEquals(RetentionDurationType.WEEKS, model.dailySchedule().retentionDuration().durationType());
        Assertions.assertEquals(DayOfWeek.WEDNESDAY, model.weeklySchedule().daysOfTheWeek().get(0));
        Assertions
            .assertEquals(OffsetDateTime.parse("2021-08-05T06:49:59Z"), model.weeklySchedule().retentionTimes().get(0));
        Assertions.assertEquals(656291257, model.weeklySchedule().retentionDuration().count());
        Assertions.assertEquals(RetentionDurationType.WEEKS, model.weeklySchedule().retentionDuration().durationType());
        Assertions.assertEquals(RetentionScheduleFormat.WEEKLY, model.monthlySchedule().retentionScheduleFormatType());
        Assertions
            .assertEquals(DayOfWeek.FRIDAY, model.monthlySchedule().retentionScheduleWeekly().daysOfTheWeek().get(0));
        Assertions
            .assertEquals(WeekOfMonth.LAST, model.monthlySchedule().retentionScheduleWeekly().weeksOfTheMonth().get(0));
        Assertions
            .assertEquals(
                OffsetDateTime.parse("2021-10-24T23:00:05Z"), model.monthlySchedule().retentionTimes().get(0));
        Assertions.assertEquals(1077682035, model.monthlySchedule().retentionDuration().count());
        Assertions
            .assertEquals(RetentionDurationType.INVALID, model.monthlySchedule().retentionDuration().durationType());
        Assertions.assertEquals(RetentionScheduleFormat.INVALID, model.yearlySchedule().retentionScheduleFormatType());
        Assertions.assertEquals(MonthOfYear.SEPTEMBER, model.yearlySchedule().monthsOfYear().get(0));
        Assertions
            .assertEquals(DayOfWeek.TUESDAY, model.yearlySchedule().retentionScheduleWeekly().daysOfTheWeek().get(0));
        Assertions
            .assertEquals(WeekOfMonth.THIRD, model.yearlySchedule().retentionScheduleWeekly().weeksOfTheMonth().get(0));
        Assertions
            .assertEquals(OffsetDateTime.parse("2021-03-21T08:13:48Z"), model.yearlySchedule().retentionTimes().get(0));
        Assertions.assertEquals(1115734201, model.yearlySchedule().retentionDuration().count());
        Assertions.assertEquals(RetentionDurationType.DAYS, model.yearlySchedule().retentionDuration().durationType());
    }
}
