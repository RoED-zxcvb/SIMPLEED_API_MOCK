//import com.github.tomakehurst.wiremock.WireMockServer;
//import com.github.tomakehurst.wiremock.common.ConsoleNotifier;
//import com.github.tomakehurst.wiremock.core.WireMockConfiguration;
//import org.openqa.selenium.Proxy;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
//
//
//import static com.github.tomakehurst.wiremock.client.WireMock.any;
//import static com.github.tomakehurst.wiremock.client.WireMock.urlMatching;
//import static com.github.tomakehurst.wiremock.client.WireMock.aResponse;
//
//
//public class temp {
//
//
//
//
//    public static void main2(String[] args) {
//
//
//        System.setProperty("webdriver.chrome.driver", "/Users/eduard_epam/IdeaProjects/ComplexAQA123/chromedriver");
//
//
//        // Запуск WireMock на порту 8080
//        WireMockConfiguration wireMockConfiguration = new WireMockConfiguration().port(8080).notifier(new ConsoleNotifier(true));
//
//
//        WireMockServer wireMockServer = new WireMockServer(wireMockConfiguration);
//
//
//        wireMockServer.start();
//
//
//        wireMockServer.stubFor(any(urlMatching(".*"))
//                .willReturn(aResponse().proxiedFrom("http://example.com")));
//
//
//        // Настройка прокси
//        Proxy proxy = new Proxy();
//        proxy.setHttpProxy("localhost:8080");
//
//
//        ChromeOptions options = new ChromeOptions();
//        options.setProxy(proxy);
//
//
//        WebDriver driver = new ChromeDriver(options);
//
//
//        try {
//
//
//            driver.get("http://example.com");
//            Thread.sleep(3000);
//
//
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        } finally {
//            driver.quit();
//            wireMockServer.stop();
//        }
//    }
//
//
//    public static void main(String[] args) {
//        System.setProperty("webdriver.chrome.driver", "/Users/eduard_epam/IdeaProjects/ComplexAQA123/chromedriver");
//
//
//        WebDriver driver = new ChromeDriver();
//
//
//
//
//        //proxy
//        String proxyAddress = "47.88.3.19";
//        int proxyPort = 8080;
//        Proxy proxy = new Proxy();
//        proxy.setHttpProxy(proxyAddress + ":" + proxyPort);
//        proxy.setSslProxy(proxyAddress + ":" + proxyPort);
//
//
//        try {
//
//
//            //без прокси
////            driver.get("http://example.com");
////            Thread.sleep(3000);
////        } catch (InterruptedException e) {
////            throw new RuntimeException(e);
////        }
//
//
//            ChromeOptions options = new ChromeOptions();
//            options.setProxy(proxy);
//            options.addArguments("--headless"); // Run in headless mode
//        } catch (Exception ignored) {
//
//
//
//        } finally {
//            driver.quit();
//        }
////            wireMockServer.stop();
//
//
//    }
//}
