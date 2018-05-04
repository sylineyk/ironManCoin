package com.titan.service.coin;

import com.binance.api.client.BinanceApiClientFactory;
import com.binance.api.client.BinanceApiRestClient;
import com.binance.api.client.domain.market.AggTrade;
import com.titan.dao.bean.Xvg;
import com.titan.dao.mapper.XvgMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author syline on 2018/3/8
 * @version 1.0
 */
@Service
public class AddInfo {
    @Autowired
    private XvgMapper xvgMapper;


    public void addXvgInfo(String coin) {
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
        List<AggTrade> aggTrades = client.getAggTrades("XVGBTC", null, null, new Long("1515369600000"), new Long("1515370200000"));
        Xvg xvg;
        for (AggTrade entity : aggTrades) {
            xvg = new Xvg();
            xvg.setPriceBtc(entity.getPrice());
            xvg.setQuantity(entity.getQuantity());
            xvg.setTime(entity.getTradeTime());
            xvg.setTradeType(entity.isBuyerMaker() ? "1" : "0");
            xvgMapper.insert(xvg);
        }
    }


    public void addXvg(Xvg xvg) {
        xvgMapper.insert(xvg);
    }

}
