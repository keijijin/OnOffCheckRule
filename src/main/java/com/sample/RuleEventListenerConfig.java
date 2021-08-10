
package com.sample;

import javax.enterprise.context.ApplicationScoped;

import com.sample.util.TrackingAgendaEventListener;

import org.drools.core.config.DefaultRuleEventListenerConfig;

@ApplicationScoped
public class RuleEventListenerConfig extends DefaultRuleEventListenerConfig {
    public RuleEventListenerConfig() {
        super(new TrackingAgendaEventListener());
    }
}