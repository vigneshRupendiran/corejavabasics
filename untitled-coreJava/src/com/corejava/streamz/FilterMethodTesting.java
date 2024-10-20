package com.corejava.streamz;

import com.corejava.streamz.utils.CurrencyConverter;
import com.corejava.streamz.utils.TransactionPojo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterMethodTesting {
    public static void main(String[] args) {
        FilterMethodTesting filterz  = new FilterMethodTesting();
        filterz.doFilterMoreThanThousandUSD(filterz.doLoadTransaction());

    }

    private void doFilterMoreThanThousandUSD(List<TransactionPojo> transactionPojoList) {
        List<TransactionPojo> filteredUsd = transactionPojoList.stream()
                .filter(trans -> CurrencyConverter.currencyConverter(trans.getIndianRupee())>=500)
                .collect(Collectors.toList());
        filteredUsd.forEach(System.out::println);
    }

    public List<TransactionPojo> doLoadTransaction(){
        TransactionPojo trans1 = new TransactionPojo("Compaq Laptop",30000);
        TransactionPojo trans2 = new TransactionPojo("Asus Laptop",60000);
        TransactionPojo trans3 = new TransactionPojo("Apple Laptop",150000);
        TransactionPojo trans4 = new TransactionPojo("Iphone 13",115000);
        TransactionPojo trans5 = new TransactionPojo("Airpods",35675);
        TransactionPojo trans6 = new TransactionPojo("OnePlus10Pro",47456);
        TransactionPojo trans7 = new TransactionPojo("Iphone 16 pro",180000);
        return Arrays.asList(trans1,trans2,trans3,trans4,trans5,trans6,trans7);

    }

}


