/*
 * Copyright Elasticsearch B.V. and/or licensed to Elasticsearch B.V. under one
 * or more contributor license agreements. Licensed under the Elastic License
 * 2.0; you may not use this file except in compliance with the Elastic License
 * 2.0.
 */

package org.elasticsearch.xpack.esql.expression.predicate.operator.arithmetic;

import org.elasticsearch.xpack.ql.expression.Expression;
import org.elasticsearch.xpack.ql.expression.predicate.operator.arithmetic.Mul;
import org.elasticsearch.xpack.ql.tree.Source;

public class MulTests extends AbstractArithmeticTestCase {
    @Override
    protected String expectedEvaluatorSimpleToString() {
        return "MulIntsEvaluator[lhs=Ints[channel=0], rhs=Ints[channel=1]]";
    }

    @Override
    protected Mul build(Source source, Expression lhs, Expression rhs) {
        return new Mul(source, lhs, rhs);
    }

    @Override
    protected double expectedValue(double lhs, double rhs) {
        return lhs * rhs;
    }

    @Override
    protected int expectedValue(int lhs, int rhs) {
        return lhs * rhs;
    }

    @Override
    protected long expectedValue(long lhs, long rhs) {
        return lhs * rhs;
    }
}
