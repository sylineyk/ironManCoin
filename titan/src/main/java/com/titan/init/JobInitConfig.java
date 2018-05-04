
package com.titan.init;

import com.binance.api.client.BinanceApiClientFactory;
import com.binance.api.client.BinanceApiRestClient;
import com.binance.api.client.domain.market.AggTrade;
import com.titan.dao.bean.Xvg;
import com.titan.service.coin.AddInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Calendar;
import java.util.List;

/**
 * @author syline on 2017/12/02
 * @version 1.0
 */
@Component
public class JobInitConfig implements CommandLineRunner {

    @Autowired
    private AddInfo addInfo;


    @Override
    public void run(String... strings) throws Exception {
        BinanceApiClientFactory factory = BinanceApiClientFactory.newInstance();
        BinanceApiRestClient client = factory.newRestClient();

//    // Getting depth of a symbol
//    OrderBook orderBook = client.getOrderBook("XVGBTC", 10);
//    System.out.println(orderBook.getAsks());
//
//    // Getting latest price of a symbol
//    TickerStatistics tickerStatistics = client.get24HrPriceStatistics("XVGBTC");
//    System.out.println(tickerStatistics);

        // Getting all latest prices
//    List<TickerPrice> allPrices = client.getAllPrices();
//    System.out.println(allPrices);

        // Getting agg trades


        Calendar calendar = Calendar.getInstance();
        long time = Long.valueOf("1513267200000");
        calendar.setTimeInMillis(time);
        long startTime = calendar.getTimeInMillis();


        calendar.add(Calendar.HOUR_OF_DAY, 1);
        long endTime = calendar.getTimeInMillis();


        long maxTime = Long.valueOf("1525417200000");
        List<AggTrade> aggTrades;
        while (endTime < maxTime) {
            aggTrades = client.getAggTrades("XVGBTC", null, null, startTime, endTime);
            Xvg xvg;
            for (AggTrade entity : aggTrades) {
                xvg = new Xvg();
                xvg.setPriceBtc(entity.getPrice());
                xvg.setQuantity(entity.getQuantity());
                xvg.setTime(entity.getTradeTime());
                xvg.setTradeType(entity.isBuyerMaker() ? "1" : "0");
                System.out.println(xvg);
                addInfo.addXvg(xvg);
            }
            calendar.add(Calendar.SECOND, 1);
            startTime = calendar.getTimeInMillis();
            calendar.add(Calendar.HOUR_OF_DAY, 1);
            endTime = calendar.getTimeInMillis();
        }


    }


    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        long time = Long.valueOf("1513267200000");
        calendar.setTimeInMillis(time);

        System.out.println(calendar.getTime());
    }
}