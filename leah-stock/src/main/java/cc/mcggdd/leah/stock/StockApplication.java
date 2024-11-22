package cc.mcggdd.leah.stock;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = { "cc.mcggdd.leah" })
public class StockApplication {

    public static void main(String[] args) {
        SpringApplication.run(StockApplication.class, args);
    }
}