package com.binance.api.examples;

import com.binance.api.client.BinanceApiAsyncRestClient;
import com.binance.api.client.BinanceApiClientFactory;
import com.binance.api.client.domain.account.Account;

/**
 * Examples on how to get account information.
 */
public class AccountEndpointsExampleAsync {

  public static void main(String[] args) {
    BinanceApiClientFactory factory = BinanceApiClientFactory.newInstance("XAuDmThGd0BjsmVxHZAdQtikrZNkcf5mtrKyqYpktRddSwj5vAPahxldM3mzmQ2E", "tdt1g1J4lwVoLGSwKK7HN2ekSQQ4zmCMuqkUa190J5NvxhuAxh14z9Ze7kHlm7Ch");
    BinanceApiAsyncRestClient client = factory.newAsyncRestClient();

    // Get account balances (async)
    client.getAccount((Account response) -> System.out.println(response.getAssetBalance("ETH")));

    // Get list of trades (async)
    client.getMyTrades("NEOETH", response -> System.out.println(response));

    // Get withdraw history (async)
    client.getWithdrawHistory("ETH", response -> System.out.println(response));

    // Get deposit history (async)
    client.getDepositHistory("ETH", response -> System.out.println(response));

  }
}
