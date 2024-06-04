// JAVA -> HashMap          key1:value1, key2:value2,key3:value3
// 객체생성
const obj1 = {
  name: "이채연",
  data: 100,
  c: true,
  d: [1, 2, 3, 4],
};
console.log(obj1);
console.log(obj1.name); // 객체이름.키 -> value를 가져옴
console.log(obj1.data);
console.log(obj1["c"]);
console.log(obj1.c);
console.log(obj1.d);

// 객체내부값 변경(사용중인 키에 값을 대입)
obj1.name = "안녕";
console.log(obj1);
obj1.data = 500;
console.log(obj1);
obj1.a = 1000; // 사용중이지 않은 key에 값을 대입하면 -> 새로운 key:value로 추가
console.log(obj1);

// in : 객체에서 key가 사용중인지 체크해주는 키워드
console.log("a" in obj1); // a라는 키가 사용중이면 true/사용중이지 않으면 false
console.log("b" in obj1); // b라는 키가 사용중이면 true/사용중이지 않으면 false
console.log("c" in obj1); // c라는 키가 사용중이면 true/사용중이지 않으면 false
console.log("d" in obj1); // d라는 키가 사용중이면 true/사용중이지 않으면 false

// 객체에서 속성값 삭제
delete obj1.d;
console.log(obj1);

const obj2 = {
  a: 100,
  b: 200,
  c: function () {
    console.log("객체 내부의 함수입니다.");
    return "객체 내부 함수 리턴값";
  },
};
console.log(obj2);
console.log(obj2.a);
console.log(obj2.b);
const data1 = obj2.c();
console.log(data1);

// 이름, 나이, 주소를 객체형태로 관리
const memberArr = new Array();
const member1 = {
  name: "유저1",
  age: 20,
  addr: "서울시 강남구",
};
memberArr.push(member1);
const member2 = {
  name: "유저2",
  age: 24,
  addr: "경기도 부천시",
};
memberArr.push(member2);
const member3 = makeObjcet("유저3", 30, "부산광역시");
memberArr.push(member3);
console.log(memberArr);
const member4 = new Member("유저4", 40, "광주광역시");
memberArr.push(member4);
console.log(memberArr);

// 1. 함수를 이용해서 객체를 생성(매개변수로 값들을 받아서 객체 생성 후 리턴)
function makeObjcet(param1, param2, param3) {
  const obj = {
    name: param1,
    age: param2,
    addr: param3,
  };
  return obj;
}
// 2. 생성자를 이용한 객체 생성
function Member(param1, param2, param3) {
  (this.name = param1), (this.age = param2), (this.addr = param3);
}
