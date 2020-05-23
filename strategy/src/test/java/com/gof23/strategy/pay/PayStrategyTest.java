package com.gof23.strategy.pay;

import org.junit.Test;

public class PayStrategyTest {

    public static void main(String[] args) {
        PayStrategyFactory payStrategyFactory = new PayStrategyFactory(new PayStrategy());

        Payment payment = payStrategyFactory.getPayment(PayKey.ALIPAY);
        payment.pay("1001","1",2000);
    }

    @Test
    public void test(){
        PayStrategyFactory payStrategyFactory = new PayStrategyFactory(new PayStrategy());

        Payment payment = payStrategyFactory.getPayment(PayKey.WECHARPAY);
        MessageResult result = payment.pay("1001", "1", 2000);
        System.out.println(result);
    }
}
