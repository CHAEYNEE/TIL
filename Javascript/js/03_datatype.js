// string
const str = "JavaScript"; // 쌍, 외따옴표 상관X
console.log(typeof str, str);

// string에서 사용할 수 있는 함수
console.log(str.length); // 문자열의 길이를 리턴
console.log(str.toLowerCase()); // 모두 소문자로 변환해서 리턴
console.log(str); // 원본 데이터에는 변화가 없음
console.log(str.toUpperCase()); // 모두 대문자로 변환해서 리턴

// 매개변수로 준 문자열이 문자열에 몇번째에 있는지 찾아서 리턴(앞에서부터 검색)
console.log(str.indexOf("a"));
// 매개변수로 준 문자열이 문자열에 몇번째에 있는지 찾아서 리턴(뒤에서부터 검색)
console.log(str.lastIndexOf("a"));
console.log(str.indexOf("z")); // 매개변수로 준 문자열이 존재하지 않으면 -1을 리턴
console.log(str.charAt(4)); // 해당 index 존재하는 문자열 1개를 추춣하여 리턴
// for(int i = 3; i > 7; i++)
console.log(str.substring(3, 7)); // 3번 인덱스부터 7번 인덱스 앞까지 문자열 리턴
console.log(str.substring(3)); // 3번 인덱스부터 끝까지 문자열 리턴

const study = "java,oracle,jdbc,html,css,javascript";
const arr = study.split(","); // 매개변수로 전달한 값을 기준으로 문자열을 잘라서 배열 형태로 리턴
console.log(study);
console.log(arr);
console.log(typeof arr);

// number
const num = 3.5; //javascript에서는 정수/실수 구분없이 모두 number타입으로 처리
console.log(typeof num);
console.log(Math.abs(num)); // 절대값
console.log(Math.abs(-190));
console.log(Math.random()); // 0 ~ 1사이의 랜덤 실수 1개 추출
console.log(Math.round(num)); // 반올림
console.log(Math.round(3.4));
console.log(Math.floor(3.9), Math.ceil(3.1)); // 버림, 올림

// 자동 형변환
const userName = "이채연";
const userAge = 20;
const userGrade = "1";
console.log(typeof userName, typeof userAge, typeof userGrade);
console.log(userName + userAge); // "이채연"+20 -> "이채연"+"20" -> "이채연20";
console.log(userName + userGrade); // "이채연"+"1" -> "이채연1";
console.log(userAge + userGrade); // 20+"1" -> "20"+"1" -> "201";
// javascript에서는 +를 제외한 산술 연산은 모두 숫자 연산
// 산술 연산을 해야하므로 userGrade를 문자열 -> 숫자로 자동형변환
console.log(userAge - userGrade); // 20-"1" -> 20-1 -> 19;
// NaN -> Not a Number : 산술연산을 할 때 숫자로 변환이 불가능하면 NaN처리
console.log(userAge - userName); // 20-"이채연" -> 20-NaN -> NaN

// 제 이름은 이채연이고, 나이는 20살 1학년입니다.
console.log(
  "제 이름은 " +
    userName +
    "이고, 나이는 " +
    userAge +
    "살 " +
    userGrade +
    "학년입니다."
);
// 백틱(`)을 이용한 처리
console.log(
  `제 이름은 ${userName}이고, 나이는 ${userAge}살 ${userGrade}학년입니다.`
); // 작은 따옴표가 아닌 물결키 아래에 있는 기호

// 수동 형변환
const test11 = "100";
console.log(test11, typeof test11);
const test22 = Number(test11); // test11에 들어있는 값을 number타입으로 형변환
console.log(test22, typeof test22);
const test33 = String(test22); // test22에 들어있는 값을 string타입으로 형변환
console.log(test33, typeof test33);

// 연산자 -> 자바 연산자와 대부분 동일
// === , !== : 자바스크립트에 있는 추가 연산자
const oper1 = "1";
const oper2 = 1;
console.log(oper1, typeof oper1);
console.log(oper2, typeof oper2);
console.log(oper1 == oper2); // true임 ㅡㅡ 자료형과 상관없이 자동형변환을하여 값이 일치하면 true(부정 : !=)
console.log(oper1 === oper2); // flase -> 자료형과 값이 모두 일치하면 true(부정 : !==)

// 제어문 사용방법 동일(if)
/*
1. prompt()를 이용해서 숫자를 입력받아 변수(testNum) 저장
2. 입력받은 숫자가 짝수/홀수인지 구분하여 console.log로 출력
*/
const testNum = prompt("숫자를 입력하세요");
console.log(testNum, typeof testNum); // 숫자 입력하지만 문자열(string)타입으로 받아옴
if (testNum % 2 == 0) {
  console.log("짝수");
} else {
  console.log("홀수");
}

// 짧은 조건문(javascript에서만 가능한)
// && 연산자와 || 연산자의 동작방식을 이용하는 조건문
testNum % 2 == 0 || console.log("홀수");
testNum % 2 == 0 && console.log("짝수");
