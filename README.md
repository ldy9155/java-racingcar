# 3단계 - 자동차 경주 (-)
    기능 요구사항
    - 초간단 자동차 경주 게임을 구현한다.
    - 주어진 횟수 동안 n대의 자동차는 전진 또는 멈출 수 있다.
    - 사용자는 몇 대의 자동차로 몇 번의 이동을 할 것인지를 입력할 수 있어야 한다.
    - 전진하는 조건은 0에서 9 사이에서 random 값을 구한 후 random 값이 4이상일 경우이다.
    - 자동차의 상태를 화면에 출력한다. 어느 시점에 출력할 것인지에 대한 제약은 없다.

    프로그래밍 요구사항
    - 모든 로직에 단위 테스트를 구현한다. 단, UI(System.out, System.in) 로직은 제외
    - 자바 코드 컨벤션을 지키면서 프로그래밍 한다!
    - else 예약어를 쓰지 않는다!
---
### Todo
- [ ] 자동차 이동 테스트 : 자동차 전진하는 조건이 0~9 사이의 랜덤 값을 구한 뒤 4이상 일때 전진하고 4미만 일 경우 멈춰 있는지 확인 한다.
- [ ] 자동차 위치 확인 테스트 : 자동차의 현재 위치를 확인 한다.
### Done
- [x] 자동차 대수 확인 테스트 : 자동차 대수를 n대를 입력할 경우 n대가 정상적으로 반환되어야 한다. (예 : 3대 => size:3 )
- [x] 자동차 이동 횟수 테스트 : 자동차의 n번 이동 횟수를 입력할 경우 n번의 이동 횟수가 정상적으로 반환되어야 한다. (예 : 5번 => size:5 )
---
# 1단계 - 학습 테스트 실습 (+)
    1-1. String 클래스에 대한 학습 테스트
### Done
- [x] "1,2"을 ,로 split 했을 때 1과 2로 잘 분리되는지 확인하는 학습 테스트를 구현한다.
- [x] "1"을 ,로 split 했을 때 1만을 포함하는 배열이 반환되는지에 대한 학습 테스트를 구현한다.
- [x] "(1,2)" 값이 주어졌을 때 String의 substring() 메소드를 활용해 ()을 제거하고 "1,2"를 반환하도록 구현한다.
- [x] "abc" 값이 주어졌을 때 String의 charAt() 메소드를 활용해 특정 위치의 문자를 가져오는 학습 테스트를 구현한다.
- [x] String의 charAt() 메소드를 활용해 특정 위치의 문자를 가져올 때 위치 값을 벗어나면 StringIndexOutOfBoundsException이 발생하는 부분에 대한 학습 테스트를 구현한다.
- [x] JUnit의 @DisplayName을 활용해 테스트 메소드의 의도를 드러낸다.
---
     1-2. Set 클래스에 대한 학습 테스트
### Done
- [x] Set의 size() 메소드를 활용해 Set의 크기를 확인하는 학습테스트를 구현한다.
- [x] Set의 contains() 메소드를 활용해 1, 2, 3의 값이 존재하는지를 확인하는 학습테스트를 구현하려한다.
- [x] 구현하고 보니 다음과 같이 중복 코드가 계속해서 발생한다.
- [x] JUnit의 ParameterizedTest를 활용해 중복 코드를 제거해 본다.
- [x] 요구사항 2는 contains 메소드 결과 값이 true인 경우만 테스트 가능하다. 입력 값에 따라 결과 값이 다른 경우에 대한 테스트도 가능하도록 구현한다.
- [x] 예를 들어 1, 2, 3 값은 contains 메소드 실행결과 true, 4, 5 값을 넣으면 false 가 반환되는 테스트를 하나의 Test Case로 구현한다.
---
# 2단계 - 문자열 덧셈 계산기 (+)
    기능 요구사항
       - 쉼표(,) 또는 콜론(:)을 구분자로 가지는 문자열을 전달하는 경우 구분자를 기준으로 분리한 각 숫자의 합을 반환 (예: “” => 0, "1,2" => 3, "1,2,3" => 6, “1,2:3” => 6)
       - 앞의 기본 구분자(쉼표, 콜론)외에 커스텀 구분자를 지정할 수 있다. 커스텀 구분자는 문자열 앞부분의 “//”와 “\n” 사이에 위치하는 문자를 커스텀 구분자로 사용한다. 예를 들어 “//;\n1;2;3”과 같이 값을 입력할 경우 커스텀 구분자는 세미콜론(;)이며, 결과 값은 6이 반환되어야 한다.
       - 문자열 계산기에 숫자 이외의 값 또는 음수를 전달하는 경우 RuntimeException 예외를 throw한다.
    
    프로그래밍 요구사항
       - 메소드가 너무 많은 일을 하지 않도록 분리하기 위해 노력해 본다.
### Done
- [x] 빈 문자열 또는 null 값을 입력할 경우 0을 반환해야 한다. (예 : "" => 0, null => 0)
- [x] 숫자 하나를 문자열로 입력할 경우 숫자를 반환한다.(예 : "1")
- [x] 숫자 두개를 컴마(,) 구분자로 입력할 경우 두 숫자의 합을 반환한다. (예 : "1,2")
- [x] 구분자를 컴마(,) 이외에 콜론(:)을 사용할 수 있다. (예 : "1,2:3" => 6)
- [x] "//"와"\n"문자 사이에 커스컴 구분자를 지정할 수 있다. (예 : "//;\n1;2;3" => 6)
- [x] 음수를 전달할 경우 RuntimeException 예외가 발생해야 한다. (예 : "-1,2,3")
---
