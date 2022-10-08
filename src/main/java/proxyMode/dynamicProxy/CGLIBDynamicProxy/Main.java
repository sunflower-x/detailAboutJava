package proxyMode.dynamicProxy.CGLIBDynamicProxy;

public class Main {
    public static void main(String[] args) {
        AliSmsService aliSmsService = (AliSmsService) CglibProxyFactory.getProxy(AliSmsService.class);
        aliSmsService.send("CGLIBDynamicProxy");
    }
}
