package vertxweb;

import io.vertx.core.Vertx;
import io.vertx.core.http.HttpServer;
import io.vertx.core.http.HttpServerResponse;

/**
 * @Auther: yinsan@douyu.tv
 * @Date: 2020/09/23/4:01 下午
 * @Description:
 */
public class VertxHttpServer {
    public static void main(String[] args) {
        Vertx vertx = Vertx.vertx();
        HttpServer httpServer = vertx.createHttpServer();
        httpServer.requestHandler(request -> {
            HttpServerResponse response = request.response();
            response.putHeader("Content-type", "text/html;charset=utf-8");
            response.end("hello vertx");
        });
        httpServer.listen(9898);
    }

}
