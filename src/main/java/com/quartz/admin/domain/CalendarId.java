/**
 * Created by joonghyun on 2019-07-16
 */
package com.quartz.admin.domain;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Embeddable
@Getter
public class CalendarId implements Serializable {

    @Column(name = "SCHED_NAME")
    private String schedulerName;

    @Column(name = "CALENDAR_NAME")
    private String calendarName;

    public CalendarId(String schedulerName, String calendarName) {
        this.schedulerName = schedulerName;
        this.calendarName = calendarName;
    }
}
