package com.sample.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.kie.api.definition.type.ClassReactive;

@ClassReactive
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Order {
    String ヌル = null;

    String name;
    Boolean brave;
    String onOff;
    String message;
}
