package rxfamily.download.config;


import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/**
 * Created by hly on 16/3/31.
 * email hugh_hly@sina.cn
 */
public class LoggingInterceptor implements Interceptor {


    @Override
    public Response intercept(Chain chain) throws IOException {

        Request request = chain.request();
        long t1 = System.nanoTime();

        Response response = chain.proceed(request);
        long t2 = System.nanoTime();

        if (request != null && request.url() != null) {
        }

        return response;
    }
}
