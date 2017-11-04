package princechima.cryptocompare.Remote;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

import princechima.cryptocompare.Model.Coin;

/**
 * Created by Prince on 01/11/2017.
 */

public interface CoinService {

    @GET("data/price")
    Call<Coin> calculateValue (@Query("fsym") String from, @Query("tsyms") String to);
}

