package poly.ex.pay0;

public class KakaoPay extends PayInterface {
    @Override
    public void pay(int amount) {
        System.out.println("카카오페이 시스템과 연결합니다.");
        System.out.println(amount + "원 결제를 시도합니다.");
        System.out.println("결제가 성공했습니다.");
    }
}