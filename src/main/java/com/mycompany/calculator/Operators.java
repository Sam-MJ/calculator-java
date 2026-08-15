package com.mycompany.calculator;

import java.util.HashMap;
import java.util.HashSet;
import java.util.regex.Pattern;

public class Operators {

    public static Pattern OPERATOR_PATTERN = Pattern.compile("\\d+|[x*\\-+÷/=\\(\\)\\^]");

    public static final HashMap<String, Integer> OPERATOR_MAP = new HashMap<String, Integer>();
    static {
        OPERATOR_MAP.put("(", 0);
        OPERATOR_MAP.put(")", 0);
        OPERATOR_MAP.put("^", 3);
        OPERATOR_MAP.put("/", 2);
        OPERATOR_MAP.put("÷", 2);
        OPERATOR_MAP.put("x", 2);
        OPERATOR_MAP.put("*", 2);
        OPERATOR_MAP.put("+", 1);
        OPERATOR_MAP.put("-", 1);
    }

    public static final HashSet<Character> OPERATOR_SET = new HashSet<>();
    static {
        OPERATOR_SET.add('(');
        OPERATOR_SET.add(')');
        OPERATOR_SET.add('^');
        OPERATOR_SET.add('/');
        OPERATOR_SET.add('÷');
        OPERATOR_SET.add('x');
        OPERATOR_SET.add('*');
        OPERATOR_SET.add('+');
        OPERATOR_SET.add('-');
    }

}
