package com.processor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemProcessor;
import com.model.Person;

import lombok.extern.slf4j.Slf4j;
 
@Slf4j
public class PersonItemProcessor implements ItemProcessor<Person, Person> {
	private static final Logger log = LoggerFactory.getLogger(PersonItemProcessor.class);
  @Override
  public Person process(Person person) throws Exception {
   person.getFirstName().toUpperCase();
    person.getLastName().toUpperCase();
    
    log.info("Converting (" + person + ") into (" + person + ")");
 
    return person;
  }
}