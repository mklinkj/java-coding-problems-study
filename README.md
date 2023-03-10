# 코딩 개념 잡는 자바 코딩 문제집 - 스터디

> 엥겔 레너드 저자님이 ["스프링 부트 퍼시스턴스 모범 사례"](https://github.com/mklinkj/spring-boot-persistence-best-practices-study) 와 동일한 저자님인데, 글을 잘 쓰고 실력도 좋으신 붙 같아서 이 책도 그냥 샀음.😅
>
> 조금씩 해보자 ... 😄

### 저자

* Anghel Leonard




### 출판사 제공 예제코드 깃허브

* https://github.com/gilbutITbook/080292



### 판매처

* yes24: http://www.yes24.com/Product/Goods/113416654
  * yes24는 좀.. https 전환해줬으면 좋겠음... 😓
* 교보문고: https://product.kyobobook.co.kr/detail/S000061838512



## 진행 방향

* Java
  * Java 17 버전이상
* 빌드 도구
  * Maven
    * 스터디 용도 멀티 프로젝트 구조 잡을때, Gradle 보다 Maven이 좀 더 편한 것 같긴함.
* 개발 도구
  * IntelliJ IDEA와 Visual Studio Code
* 코드에 대한 검증
  * JUnit, AssertJ, Mockito 등을 이용해서 코드를 검증하는 식으로 진행하자 ✨




## 목차

### 1장. [문자열과 수, 수학](jcps-chap01)

### 2장. 객체와 불변성, switch문

### 3장. 날짜와 시간 다루기

### 4장. 타입 추론

### 5장. 배열, 컬렉션, 그리고 데이터 구조

### 6장. 자바 입출력 경로, 파일, 버퍼, 스캐닝, 포매팅

### 7장. 자바 리플렉션 클래스, 인터페이스, 생성자, 메서드, 필드

### 8장. 함수형 스타일 프로그래밍의 기초와 디자인 패턴

### 9장. 함수형 스타일 프로그래밍 더 깊이 파고들기

### 10장. 동시성 - 스레드 풀, 콜러블, 싱크로나이저

### 11장. 동시성 더 깊이 파고들기

### 12장. 옵셔널

### 13장. HTTP 클라이언트와 WebSocket API



## 프로젝트

### 전체 테스트 / 실행

Maven 멀티 프로젝트로 챕터별로 하위 프로젝트 만들어서 진행할 것 이여서, 루트에서 아래 명령 실행

```sh
mvnw clean test
```



### 프로젝트 생성

* [프로젝트 생성](Project-Init.md) 
  * Maven ArcheType 플러그인으로 뼈대만 만들고 다시 부모 - 자식 모듈 구조로 바꿨는데... 아키타입이 오래되서 은근히 바꿀께 많았음. 😅



## 후기

* ...

