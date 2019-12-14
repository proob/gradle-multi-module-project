package pl.jlabs.server.server;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import pl.jlabs.library.DoingSomething;
import pl.jlabs.model.Product;
import pl.jlabs.utils.Utils;

@Slf4j
@SpringBootApplication
public class ServerApplication {

    public static void main(String[] args) {
        Product product = Product.builder().name("toy").price(123.456789).build();
        log.info("");
        log.info(product.toString());
        log.info("Rounded price: " + Utils.round(product.getPrice(), 2));
        log.info("Dashed name: " + DoingSomething.addDashBetweenChars(product.getName()));
        log.info("");
        log.info("");
//        SpringApplication.run(ServerModuleApplication.class, args);
    }

}
