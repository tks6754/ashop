package com.miao.code.job.domain;

import lombok.Data;
import org.apache.ibatis.type.Alias;

import java.util.Date;


@Alias("JobTask")
@Data
public class JobTask {
    /**
     * 
     */
    private Long id;

    /**
     * 任务名
     */
    private String jobName;

    /**
     * 任务分组
     */
    private String jobGroup;

    /**
     * 任务执行时调用哪个类的方法 包名+类名
     */
    private String jobClass;

    /**
     * cron表达式
     */
    private String cronExpression;

    /**
     * 任务状态 -1:删除 0:创建 1:运行 2:停止
     */
    private Integer jobStatus;

    /**
     * 任务描述
     */
    private String description;

    /**
     * 创建时间
     */
    private Date gmtCreate;

    /**
     * 更新时间
     */
    private Date gmtModified;

    /**
     * 逻辑删除 0:未删除 1:已删除
     */
    private Integer isDeleted;
}