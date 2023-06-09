//package kr.co.ejyang.module_file;
//
//import jakarta.annotation.PostConstruct;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
//
//@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
//public class FileApplication {
//
//    @Value("${file.endpoint}")
//    private String storageEndPoint;
//
//    public static void main(String[] args) {
//        // run
//        SpringApplication.run(FileApplication.class, args);
//    }
//
//    @PostConstruct
//    private void start() {
//        System.out.println("====================== [ File Module Init ] ======================");
//        System.out.println("Storage Endpoint ::: " + storageEndPoint);
//        System.out.println("==================================================================");
//    }
//}
