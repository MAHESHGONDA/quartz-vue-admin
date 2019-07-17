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
@Getter
@Embeddable
public class SchedulerStateId implements Serializable {

    @Column(name = "SCHED_NAME")
    private String schedulerName;

    @Column(name = "INSTANCE_NAME")
    private String instanceName;

    public SchedulerStateId(String schedulerName, String instanceName) {
        this.schedulerName = schedulerName;
        this.instanceName = instanceName;
    }
}
