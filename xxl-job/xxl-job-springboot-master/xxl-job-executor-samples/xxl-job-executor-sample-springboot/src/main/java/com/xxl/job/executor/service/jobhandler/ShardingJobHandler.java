package com.xxl.job.executor.service.jobhandler;

import com.xxl.job.core.biz.model.ReturnT;
import com.xxl.job.core.handler.IJobHandler;
import com.xxl.job.core.handler.annotation.JobHandler;
import com.xxl.job.core.log.XxlJobLogger;
import com.xxl.job.core.util.ShardingUtil;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Service;


/**
 * 分片广播任务
 *
 * @author xuxueli 2017-07-25 20:56:50
 */
@JobHandler(value="shardingJobHandler")
@Service
public class ShardingJobHandler extends IJobHandler {

	@Override
	public ReturnT<String> execute(String param) throws Exception {

		System.out.println("########开始执行2#######");
		XxlJobLogger.log("XXL-JOB, Hello World.");
		System.out.println("shardingJobHandler"+new SimpleDateFormat("yyy-MM-dd HH:mm:ss").format(new Date()));
		return SUCCESS;
	}

}
