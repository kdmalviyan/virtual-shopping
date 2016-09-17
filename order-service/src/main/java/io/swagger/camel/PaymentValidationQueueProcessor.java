package io.swagger.camel;

import io.swagger.model.Order;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.springframework.stereotype.Component;

@Component("PaymentValidationQueueProcessor")
public class PaymentValidationQueueProcessor implements Processor {

	@Override
	public void process(Exchange exchange) throws Exception {

		Order order = new Order()
				.getObject((String) exchange.getIn().getBody());

		if (order.getCreditcardnumber().startsWith("555")) {

			exchange.getOut().setHeader("payment-status", "pass");
		} else {

			exchange.getOut().setHeader("payment-status", "fail");
		}

		exchange.getOut().setBody(exchange.getIn().getBody());

	}

}
