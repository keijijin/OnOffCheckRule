package com.sample.RuleUnit02;

import com.sample.model.Order;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import org.kie.kogito.rules.DataSource;
import org.kie.kogito.rules.DataStore;
import org.kie.kogito.rules.RuleUnitData;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SampleRuleUnit implements RuleUnitData {
    private DataStore<Order> orders = DataSource.createStore();
}
