package com.eduardo.crud.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.amqp.support.converter.MessageConverter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MessageConfig {

	@Value("${crud.rabbitmq.routingkey}")
	String routingKey;

	@Value("${crud.rabbitmq.exchange}")
	String exchange;

	@Value("${crud.rabbitmq.queue}")
	String queue;

	@Bean
	Queue queue() {
		return new Queue(queue, true);
	}

	@Bean
	TopicExchange exchange() {
		return new TopicExchange(exchange);
	}

	@Bean
	Binding binding(Queue queue, TopicExchange exchange) {
		return BindingBuilder.bind(queue).to(exchange).with(routingKey);
	}

//	@Bean
//	public Exchange declareExchange() {
//		return ExchangeBuilder.directExchange(exchange).durable(true).build();
//	}

	@Bean
	public MessageConverter jsonMessageConverter() {
		return new Jackson2JsonMessageConverter();

	}

}
