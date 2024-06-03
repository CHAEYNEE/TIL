// 한 줄 주석
/* 
여러줄 주석
여러줄 주석
*/
// console.log(내용) : 개발자도구 화면의 console에 내용을 출력
// -> 개발 도중 확인을 위한 용도로 사용
console.log("아아아");
console.log(123);
console.log(100 + 200);
console.log("안녕" + 100);
console.log("안녕", 100, "ya"); // 매개변수가 여러개면 모두 출력

// alert(내용) : 내용을 경고창을 통해서 출력
/*
alert("메세지!!");
alert(100);
alert(100+200);
alert("안녕"+100);
alert("안녕",100,200,"ya"); // 첫번째 매개변수만 alert으로 화면에 나오고 나머지는 버림
*/

// confirm(질문) : 메세지창을 이용해서 사용자에게 질문하고 그 결과를 true/false로 리턴
// console.log(confirm("자바스크립트는 할만한가요?")); // 확인 누르면 true 취소 누르면 false console에 입력됨
if (confirm("자바스크립트는 할만한가요?")) {
  console.log("GOOD!");
} else {
  console.log("ㅠㅠ");
}

// prompt(질문) : 메세지창을 이용해서 사용자에게 질문하고 값을 입력받아서 그 결과를 문자열로 가져옴
console.log(prompt("아무거나 입력해보시죠"));
