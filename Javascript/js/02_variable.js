// 1. var
var name1; // name이라는 변수 선언 완료 -> 자료의 형태가 결정 x
// 변수의 자료형은 값이 들어갈 때 들어가는 값의 형태대로 처리
console.log(typeof name1); // 변수의 자료형을 확인하는 방법
console.log(name1);
name1 = "안녕";
console.log(typeof name1);
console.log(name1);

var age1;
console.log(typeof age1);
console.log(age1);
age1 = 20;
console.log(typeof age1);
console.log(age1);

{
  var test1 = "test1";
  console.log(test1);
}

// var는 변수의 범위가 효과 없음(복잡한 코드 개발 시 이미 사용한 변수인지 체크가 불가능)
console.log(test1);

// es6 변수 선언 방식

// 2. let
let name2;
console.log(typeof name2);
console.log(name2);
name2 = "이채연";
console.log(typeof name2);
console.log(name2);
let age2 = "30";
console.log(typeof age2);
console.log(age2);

{
  let test2 = "test2";
  console.log(test2);
}
name2 = "이채연3";
console.log(typeof name2);
console.log(name2);

// console.log(test2); // test2변수는 중괄호 안에서 만들어졌으므로 해당 범위에서만 사용이 가능

// 3. const(상수) : 변경이 불가능한 변수
// 상수는 한 번 대입된 값이 변경될 수 없으므로 선언만해서 undefined상태가 불가능
// 선언하면서 값을 넣어서 바로 사용
const name3 = "이채연2";
const age3 = 35;
console.log(typeof name3);
console.log(name3);
console.log(typeof age3);
console.log(age3);

{
  const test3 = "test3";
  console.log(test3);
}

// name3 = "이채연4"; // 상수형 변수는 한 번 선언된 값을 변경하는 것이 불가능
// console.log(name3);
// console.log(test3); // test3변수는 중괄호 안에서 만들어졌으므로 해당 범위에서만 사용 가능

let arr1 = [1, 2, 3, 4, 5];
const arr2 = [1, 2, 3, 4, 5];
console.log(arr1);
arr1[1] = 100;
console.log(arr1);
console.log(arr2);
arr2[2] = 200; // arr2배열 고유값 주소는 그대로이므로 가능한 코드
console.log(arr2);
