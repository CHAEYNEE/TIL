/*
public returnType methodName(param){
    메소드 수행내역
    return 메소드 종료 시 되돌려 줄 데이터;
}
*/
// 1. 선언적 함수(스크립트 코드가 만들어질 때 가장 먼저 만들어짐, 함수 생성 코드보다 사용 코드가 먼저 있어도 문제 x)
function func1() {
  console.log("func1함수 동작");
}
// 선언적함수 호출
func1();
const data1 = func1();
console.log(data1);

const data2 = func2();
console.log(data2);
function func2() {
  console.log("func2 동작");
  return "리턴값";
}

// 2. 익명 함수 1(function을 변수에 넣어둔 형태) : 반드시 선언 후 사용해야함
const data3 = function () {
  console.log("익명함수1 호출");
};
console.log(data3, typeof data3);
// 익명 함수 실행
data3();
/*
const data5 = data4(); // 오류. 익명 함수는 순서 중요 아직 data4함수 만들어지지 x
console.log(data5);
*/
const data4 = function () {
  console.log("익명함수2 호출");
  return "익명함수리턴값";
};
const data5 = data4();
console.log(data5);

// 3. 익명 함수 2(스스로 실행되는 함수) : 한 번 실행되고 재사용하지 않는 경우
// 초기화 할 때 한 번 사용
(function () {
  console.log("익명함수3 호출 - 저는 스스로 동작하죠");
})();

// 함수의 매개변수
function func3(param1, param2) {
  console.log(param1, typeof param1);
  console.log(param2, typeof param2);
}
// 매개변수로 전달하는 자료형은 아무 상관없음, 전달하는 이름도 상관없음, 순서대로 전달
func3(100, "안녕");
func3(true, [1, 2, 3]);
// 선언한 매개변수보다 부족하게 전달하는 경우, 전달된 것은 그대로 사용하고 전달되지 않은 값은 undefined 처리
func3(200);
// 선언한 매개변수보다 더 많이 전달하는 경우, 선언된 매개변수만 사용하고 나머지는 사용하지 않음
func3(100, 200, 300, 400);

function func4() {
  console.log("func4 호출");
  console.log(arguments);
  for (let i = 0; i < arguments.length; i++) {
    console.log(arguments[i], typeof arguments[i]);
  }
}

func4();
func4(100, 200, true, "ya", [1, 2, 3]);

function func5(str) {
  const test = str.charAt(0);
  return test;
}
const data6 = func5("abc");
console.log(data6);
// const data7 = func5(100);
// console.log(data7);
///////////////////////////////////////////////////////////////////

const url = "http://www.naver.com?query=앙몬드";
const str1 = encodeURI(url); // 최소한의 문자만 인코딩하는 함수
console.log(str1);
const str2 = decodeURI(str1); // encoduURI로 인코딩 된 문자열을 다시 디코딩하는 함수
console.log(str2);
const str3 = encodeURIComponent(url); // 알파벳, 숫자,.을 제외하고 모두 인코딩
console.log(str3);
const str4 = decodeURIComponent(str3);
console.log(str4);

// isFinite() : 숫자인지 확인해주는 함수 -> 매개변수로 전달한 값이 숫자면 true/아니면 false
// isNaN() : 숫자가 아닌지 확인해주는 함수 -> 매개변수로 전달한 값이 숫자가 아니면 true/면 false
const num1 = 100;
const num2 = "100";
console.log(isFinite(num1));
console.log(isFinite(num2)); // 자동형변환을 통해서 숫자로 변경할 수 있으면 true
console.log(isNaN(num1));
console.log(isNaN(num2));

// eval(문자열) : 매개변수로 받은 문자열을 자바스크립트코드로 실행
const num3 = 100;
const num4 = 200;
const result1 = num3 + num4;
console.log(result1);
const result2 = "num3+num4";
console.log(result2);
const result3 = eval("num3+num4");
console.log(result3);
