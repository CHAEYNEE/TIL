# JAVA

(학원 강의 복습 기록)
<br>
<br>
<br>
<br>
<br>
<br>

- [cmd에서 자바 파일 컴파일 하는 명령어](#cmd에서-자바-파일-컴파일-하는-명령어)
- [cmd에서 class 실행하는 명령어](#cmd에서-class-실행하는-명령어)
- [cmd 자바 class 실행 오류(java.lang.ClassNotFoundException)](#cmd-자바-class-실행-오류javalangclassnotfoundexception)
- [Eclipse 코드 실행 단축키](#eclipse-코드-실행-단축키)

- [Eclipse K&R 들여쓰기 단축키](#eclipse-kr-들여쓰기-단축키)

- [Eclipse 주석 단축키](#eclipse-주석-단축키)

### cmd에서 자바 파일 컴파일 하는 명령어

-> javac 자바파일이름.java
<br>

![컴파일](https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2FbXfAMc%2FbtsBGVVOjnr%2FFrjTWaxOK2KJzndKXgfW00%2Fimg.png "자바 파일 컴파일 명령어")

### cmd에서 class 실행하는 명령어

-> java 자바파일이름
<br>

![실행](https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2FmKl1E%2FbtsBKh416vc%2FviKR8ACNt6HAmQn5KiYA1k%2Fimg.png "자바 실행 명령어")

### cmd 자바 class 실행 오류(java.lang.ClassNotFoundException)

-> 실행 시 java.lang.ClassNotFoundException 오류 발생
<br>

![실행 오류](https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2Fd8oF71%2FbtsBMRE5Dyh%2FyK0btNcCXUCAezzbmKyrv1%2Fimg.png "자바 실행 오류")
<br>
<br>
**💬 해결하는 방법**
<br>
<br>
설정 -> 시스템 -> 정보 -> 고급 시스템 설정 -> 환경 변수 -> CLASSPATH 변수 값 -> **.;JAVA_HOME%lib** 로 설정
<br>

![실행 오류 해결](https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2FNf8BT%2FbtsBGmM3WBB%2FJqE8slSesLFkkRhegd9mkK%2Fimg.png " 실행 오류 해결")

<br>
🤭 정상 출력됨! 
<br>
<br>

![cmd 출력](https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2FxwQIO%2FbtsBDKgXELK%2FOMVQIsQaGqAYLnFRy6fiT0%2Fimg.png "cmd 출력")
<br>

### Eclipse 코드 실행 단축키

-> Ctrl + F11
<br>

### Eclipse K&R 들여쓰기 단축키

-> Ctrl + Shift + F

### Eclipse 주석 단축키

블록 주석 처리(/\* \*/) -> Ctrl + Shift + /
<br>
블록 주석 해제 -> Ctrl + Shift + \\
<br>
한줄 or 블록 주석 처리(//) -> Ctrl + /
