package io.swagger.camel;

import io.swagger.model.Order;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.springframework.stereotype.Component;

@Component("StockValidationFailureQueueProcessor")
public class StockValidationFailureQueueProcessor implements Processor {

	@Override
	public void process(Exchange exchange) throws Exception {

		Order order = new Order()
				.getObject((String) exchange.getIn().getBody());

		System.out
				.println("&&&&&&&&&&&&Order Failed Due to Unavailability of Stock:"
						+ order.getEmail());

	}

}
