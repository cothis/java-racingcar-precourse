# 자동차 경주 게임
## 진행 방법
* 자동차 경주 게임 요구사항을 파악한다.
* 요구사항에 대한 구현을 완료한 후 자신의 github 아이디에 해당하는 브랜치에 Pull Request(이하 PR)를 통해 과제를 제출한다.

## 과제 제출 과정
* [과제 제출 방법](https://github.com/next-step/nextstep-docs/tree/master/precourse)

## 기능 목록
### 자동차
* 각 자동차에 이름을 부여할 수 있다.
* 자동차 이름은 쉼표로 구분한다.
* 자동차 이름은 5자 이하만 가능하다.
* 자동차는 현재 위치값을 갖는다.
* 전진하는 조건은 0 ~ 9 사이에서 random 값을 구한 후 4이상일 경우 전진하고 3이하면 멈춘다.
### 자동차 컨트롤러
* 뷰에서 받은 자동차 리스트를 저장한다.
* 뷰에서 받은 시도 횟수를 저장한다.
* 주어진 횟수 동안 n대의 자동차는 전진 또는 멈출 수 있다.
### VIEW
* 자동차 이름을 입력받는다.
* 자동차 이름을 자동차 리스트로 변환하여 전달한다.
* 시도 횟수를 입력받는다.
* 전진하는 자동차는 이름을 같이 출력한다.
* 완료 후 누가 우승했는지 알려준다.
* 한 명 이상인 경우, 쉼표로 구분해 출력한다.
* 잘못된 값 입력 경우 IllegalArgumentException 을 발생시킨다.
* 예외 발생 시 [ERROR] 로 시작하는 에러메시지를 출력 후 그 부분부터 입력을 다시 받는다.
