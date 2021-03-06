package com.saltmarsh.springparse.primitives.stringparsers;

import com.saltmarsh.springparse.IParse;
import org.springframework.stereotype.Component;

@Component
public class StringToIntegerParser implements IParse<String, Integer> {

    @Override
    public Integer parse(String string) {
        Double d = Double.parseDouble(string);
        return d.intValue();
    }

    @Override
    public Class<String> getObjectClass() {
        return String.class;
    }

    @Override
    public Class<Integer> getTargetClass() {
        return Integer.class;
    }
}
