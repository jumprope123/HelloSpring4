package shin.basic;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import shin.bean.HelloSpring4Bean04;
import shin.product.ProductService01;

public class HelloSpring4App08 {
    // 상품 등록 프로그램
    // HelloSpring4App08 -> ProductService01 -> ProductDAO01
    // Main클래스에서 상품등록기능을 실행하기위해
    // new 연산자를 이용해서 ProductService01의 객체를 만들고
    // 그 객체를 통해 newProduct()를 호출함

    public static void main(String[] args) {
        ProductService01 ps = new ProductService01();
        ps.newProduct();
    }
}
