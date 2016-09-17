package io.swagger.camel;

import io.swagger.model.Order;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.springframework.stereotype.Component;

@Component("OrderConfirmationQueueProcessor")
public class OrderConfirmationQueueProcessor implements Processor {

	@Override
	public void process(Exchange exchange) throws Exception {

		Order order = new Order()
				.getObject((String) exchange.getIn().getBody());

		System.out
				.println("***********Order Confirmed for:" + order.getEmail());

	}

}
