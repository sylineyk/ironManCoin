package com.binance.api.examples;

import com.binance.api.client.BinanceApiClientFactory;
import com.binance.api.client.BinanceApiRestClient;
import com.binance.api.client.domain.account.Account;

/**
 * Examples on how to get account information.
 */
public class AccountEndpointsExample {

  public static void main(String[] args) {
    BinanceApiClientFactory factory = BinanceApiClientFactory.newInstance("XAuDmThGd0BjsmVxHZAdQtikrZNkcf5mtrKyqYpktRddSwj5vAPahxldM3mzmQ2E", "tdt1g1J4lwVoLGSwKK7HN2ekSQQ4zmCMuqkUa190J5NvxhuAxh14z9Ze7kHlm7Ch");
    BinanceApiRestClient client = factory.newRestClient();

    // Get account balances
    Account account = client.getAccount(6000000L, System.currentTimeMillis());
//    System.out.println(account.getBalances());
//    System.out.println(account.getAssetBalance("XVG"));
//
//    // Get list of trades
//    List<Trade> myTrades = client.getMyTrades("XVGBTC");
//    System.out.println(myTrades);

    // Get withdraw history
    System.out.println(client.getWithdrawHistory("XVG"));

    // Get deposit history
    System.out.println(client.getDepositHistory("XVG"));

    // Get deposit address
    System.out.println(client.getDepositAddress("XVG"));

    // Withdraw
    client.withdraw("XVG", "sds", "0.1", null);
  }
}
