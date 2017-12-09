package com.ticktuts.springbootproducingsoapws;

import org.springframework.stereotype.Component;
import info.prateep.spring.soapws.State;
import org.springframework.util.Assert;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

@Component
public class StateRepository {
    private static final Map<String,State> states = new HashMap<>();

    @PostConstruct
    public void initData() {
        State ap = new State();
        ap.setId("AP");
        ap.setCapital("Amaravathi");
        ap.setName("AndhraPradesh");
        ap.setLanguage("Telugu");
        ap.setPopulation(52000000);
        states.put(ap.getId(),ap);

        State tl = new State();
        tl.setId("TL");
        tl.setCapital("Hyderabad");
        tl.setName("Telanga");
        tl.setLanguage("Telugu");
        tl.setPopulation(52000000);
        states.put(tl.getId(),tl);

        State ka = new State();
        ka.setId("KA");
        ka.setCapital("Bangalore");
        ka.setName("Karnataka");
        ka.setLanguage("Kannada");
        ka.setPopulation(52000000);
        states.put(ka.getId(),ka);

        State tn = new State();
        tn.setId("TN");
        tn.setCapital("Chennai");
        tn.setName("Tamilnadu");
        tn.setLanguage("Tamil");
        tn.setPopulation(52000000);
        states.put(tn.getId(),tn);
    }

    public State findState(String id) {
        Assert.notNull(id, "The country's name must not be null");
        return states.get(id);
    }
}
