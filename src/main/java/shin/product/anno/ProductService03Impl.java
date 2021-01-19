package shin.product.anno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import shin.product.ProductDAO02;
import shin.product.ProductService02;
import shin.product.ProductVO;

@Component("ps03")
public class ProductService03Impl implements ProductService02 {


    @Autowired
    private ProductDAO02 pdao;
    // 인터페이스 자료형으로 pdao라는 변수를 생성했고, 어노테이션으로 객체생성된 pdao를 묶어달라.
    // 이전 예제에서는 setter를 통해 DI되었음
    // 지금은 어노테이션을 선언해서 setter메서드 없이 DI받음

    // 상품등록 기능을 수행하는 메서드
    public void newProduct() {
        System.out.println("새로운 상품을 등록합니다!!");

        ProductVO pvo = new ProductVO();
        pvo.setPname("수지로션");
        pvo.setPrice(35000);

        // 입력받은 상품 정보에 영속성을 부여하기 위해 DAO 호출
        // 마찬가지로 new 연산자로 해당 객체를 생성하고
        // insertProduct 메서드 호출함
//        ProductDAO02 pdao = new ProductDAO03Impl();

        pdao.insertProduct(pvo);

        System.out.println("새로운 상품이 등록되었습니다!");
    }
}

