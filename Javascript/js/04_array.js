// 배열
// -> 여러 데이터를 인덱스를 통해 관리한다
// -> 자바 : 동일한 자료 여러개를
// -> 자바스크립트 : 자료형이 무관하게 여러개

/*
int[] arr = new int[5];
arr[0] = 100;
arr[1] = 200;
arr[2] = "안녕"; // 자바에선 문제되지만 자바스크립트에선 문제 안됨
*/

// 배열 선언 방법 1
const arr1 = [1, 2, 3]; // 길이가 3인 배열을 선언, 값을 순서대로 대입
console.log(arr1);
console.log(arr1[1]);
arr1[1] = 100;
console.log(arr1);
console.log(arr1[1]);

// 배열 선언 방법 2
// const arr2 = []; // 길이가 0인 배열을 선언
const arr2 = new Array(); // 길이가 0인 배열을 선언  둘 중 하나 쓰면 됨
console.log(arr2);
arr2[0] = 100;
console.log(arr2);
arr2[3] = 200; // 순서대로 넣지 않아도 됨 중간값은 undefined값
console.log(arr2);
console.log(arr2[1]);

// 배열 선언 방법 2-1
const arr3 = new Array(1, 2, 3);
console.log(arr3);

// js의 for문은 java와 동작 방식은 동일
// 차이점 -> int라는 자료형이 없으므로 변수를 let으로 선언하면 끝
for (let i = 0; i < arr3.length; i++) {
  // const선언 시 오류 남 (상수라서 값이 바뀔 수 없음)
  console.log(arr3[i]);
}

// 자바스크립트 배열에는 들어가는 값의 자료형이 상관없음
const arr4 = ["이채연", 100, true, [1, 2, 3, "떼잉"]];
for (let i = 0; i < arr4.length; i++) {
  console.log(arr4[i], typeof arr4[i]);
}

// 배열 기본 제공함수
const arr = [1, 2, 3, 4];

// indexOf(value) : 매개변수로 넣은 값이 배열 존재하면 해당 인덱스번호 리턴/없으면 -1리턴
console.log(arr.indexOf(3));
console.log(arr.indexOf(5));

// concat() : 여러 배열을 하나의 배열로 합쳐주는 함수
const fruits1 = ["사과", "바나나", "딸기"]; // 길이3
const fruits2 = ["복숭아", "파인애플", "수박"]; // 길이3
const testArr1 = [100, 25, 10, 50];
const testArr2 = [true, false, [1, 7, 2, 3]];

const data1 = fruits1.concat(fruits2, testArr1, testArr2);
console.log(data1);
console.log(fruits1);
console.log(fruits2);
console.log(testArr1);
console.log(testArr2);

// join(value) : 배열 내부의 데이터를 매개변수를 기준으로 구분해서 하나의 문자열로 리턴
const data2 = fruits1.join(",");
console.log(data2, typeof data2);
const data3 = fruits1.join(" ");
console.log(data3);
const data4 = fruits1.join(); // 매개변수를 주지 않으면 기본값(,)으로 구분하여 문자열로 리턴
console.log(data4);
const data5 = fruits1.join(""); // 띄어쓰기도 없이 매개변수 주면 싹 다 붙여서 리턴
console.log(data5);

/*
<div>
    <ul>
        <li><a href="#">메뉴1</a></li>
        <li><a href="#">메뉴2</a></li>
    </ul>
</div>
*/

/*
const data6 = "<div><ul><li><a href='#'>메뉴1</a></li><li><a href='#'>메뉴2</a></li></ul></div>";
const data7 = [
    "<div>",
    "   <ul>",
    "       <li><a href='#'>메뉴1</a></li>",
    "       <li><a href='#'>메뉴2</a></li>",
    "   </ul>",
    "</div>"
].join("");
*/

console.log(testArr1);
// 원본 배열을 정렬
// 매개변수를 넣지 않으면 유니코드 기준으로 정렬
testArr1.sort();
console.log(testArr1);

function sortASC(a, b) {
  // 오름차순
  return a - b;
}
function sortDESC(a, b) {
  // 내림차순
  return b - a;
}
const testArr3 = [1, 3, 7, 10, 2, 9, 6, 4, 8, 5];
testArr3.sort(sortASC);
console.log(testArr3);
testArr3.reverse(); // 원본 배열의 순서를 반전
console.log(testArr3);

// push, pop
const testArr4 = [1, 2, "hello", true];
console.log(testArr4);
// push : 배열 가장 뒤에 값을 추가
testArr4.push(100);
console.log(testArr4);
testArr4.push("bye");
console.log(testArr4);
// pop : 배열 가장 뒤의 값을 제거
testArr4.pop();
console.log(testArr4);

// unshift, shift
// unshift : 배열 가장 앞에 값을 추가
testArr4.unshift("안녕");
console.log(testArr4);
// shift : 배열 가장 앞의 값을 제거
testArr4.shift();
console.log(testArr4);

// slice, splice

// slice : 배열의 지정된 인덱스 번호를 복사해서 리턴
// -> 원본 배열에는 아무런 변화가 없음
// 1번 인덱스부터 3번 인덱스 앞까지 복사해서 리턴
const testArr5 = testArr4.slice(1, 3); // 1번 인덱스부터 3번 인덱스 앞까지
console.log(testArr5);
console.log(testArr4);
// 매개변수를 한개만 주는 경우 해당 인덱스부터 끝까지 복사해서 리턴
const testArr6 = testArr4.slice(3);
console.log(testArr6);
console.log(testArr4);

// testArr4를 전체를 복사하려면
const testArr7 = testArr4; // 얕은 복사 : 서로 같은 배열 공유
console.log(testArr4);
console.log(testArr7);
testArr4[4] = 200;
console.log(testArr4);
console.log(testArr7); // 같이 200으로 바뀐다

// 깊은 복사 방법
// 1. const testArr7 = testArr4.slice(0);
// 2. 전개연산자를 통한 깊은 복사
const testArr8 = [...testArr4];
console.log(testArr4);
console.log(testArr8);
testArr4[4] = 300;
console.log(testArr4);
console.log(testArr8); // 영향받지 않음

// splice : 배열을 잘라내는 함수 -> 원본 배열에서 사라짐
// splice에 매개변수가 2개인 경우
const testArr9 = testArr4.splice(1, 3); // 첫번째 매개변수 : 잘라올 배열 시작 인덱스 번호, 두번째 매개변수 : 잘라올 데이터 갯수
console.log(testArr9);
console.log(testArr4);
// splice에 매개변수가 3개인 경우 // 첫번째, 두번째는 위와 동일, 세번째 매개변수는 잘라낸 자리에 삽입하는 데이터
console.log(testArr8);
const testArr10 = testArr8.splice(2, 2, "test");
console.log(testArr10);
console.log(testArr8); // 2번자리에 test삽입
// splice를 이용한 배열 중간의 데이터 수정 삭제
// 수정 : 배열.splice(수정하고싶은 인덱스 번호,1,수정할데이터);
// 삭제 : 배열.splice(삭제하고싶은 인덱스 번호,1);
// 중간데이터 삽입 : 배열.splice(삽입하고싶은 인덱스 번호,0,삽입하고싶은 데이터);
testArr8.splice(2, 1, "안녕");
console.log(testArr8);
testArr8.splice(2, 1);
console.log(testArr8);
testArr8.splice(1, 0, "안녕");
console.log(testArr8);
