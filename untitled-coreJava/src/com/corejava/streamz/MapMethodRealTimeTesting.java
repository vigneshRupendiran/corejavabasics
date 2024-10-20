package com.corejava.streamz;

import com.corejava.streamz.utils.CurrencyConverter;
import com.corejava.streamz.utils.TransactionPojo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapMethodRealTimeTesting {
    public static void main(String[] args) {
        MapMethodRealTimeTesting obj = new MapMethodRealTimeTesting();
        obj.convertInrToUsd(obj.doLoadTransaction());

    }

    private List<TransactionPojo> doLoadTransaction() {
        TransactionPojo obj1 = new TransactionPojo("Apple Watch",75000);
        TransactionPojo obj2 = new TransactionPojo("Apple Laptop",154567);
        TransactionPojo obj3 = new TransactionPojo("Airpods",25347);
        return Arrays.asList(obj1,obj2,obj3);
    }

    private void convertInrToUsd(List<TransactionPojo> transactionsLst) {
        List<Double> converted = transactionsLst.stream().map(trans ->
                CurrencyConverter.currencyConverter(trans.getIndianRupee()))
                .collect(Collectors.toUnmodifiableList());
        converted.forEach(System.out::println);
    }

}


