package study.java.gof.pojo._01_creational_patterns;

public class DifferenceBetweenFactoryMethodAndAbstractFactory {
    /**
     * 공통점: 구체적인 객체 생성 과정을 추상화한 인터페이스 제공
     *
     * 관점의 차이:
     *   팩토리 메소드: 팩토리를 구현하는 방법에 초점
     *   추상 팩토리: 팩토리를 사용하는 방법에 초점
     *
     * 목적의 차이:
     *   팩토리 메소드: 구체적인 객체 생성 과정을 하위 또는 구체적인 클래스로 옮기는 것이 목적
     *   추상 팩토리: 여러 객체를 구체적인 클래스에 의존하지 않고 만들 수 있게 해주는 것이 목적
     *
     * 예시:
     *   다양한 데이터베이스 연결 객체를 생성하는 팩토리 메서드
     *   다양한 테마의 UI 컴포넌트 세트를 생성하는 추상 팩토리
     */
}
