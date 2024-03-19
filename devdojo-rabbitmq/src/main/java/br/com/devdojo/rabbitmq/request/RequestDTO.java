package br.com.devdojo.rabbitmq.request;

import lombok.Builder;
import lombok.extern.jackson.Jacksonized;

@Builder
@Jacksonized
record Request(String username,String password){}
