package com.internetarmy.aws.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

import com.internetarmy.aws.service.impl.EmployeeConsumer;
import com.internetarmy.aws.util.AWSPropertiesConstants;

@Component
@ConditionalOnProperty(value = AWSPropertiesConstants.IS_SQS_ENABLE, havingValue = "true", matchIfMissing = false)
public class EmployeeConsumerStarter implements CommandLineRunner{
	
	@Autowired
	private EmployeeConsumer consumer;
	
	@Override
	public void run(String... args) throws Exception {
		consumer.readMessages();
		
	}

}
