package shin.product;

public class ProductDAO03Impl implements ProductDAO02{
    public void insertProduct(ProductVO pvo) {
        System.out.printf("입력하신 %s(이/가) 성공적으로 저장되었습니다\n", pvo.getPname());
    }
}
