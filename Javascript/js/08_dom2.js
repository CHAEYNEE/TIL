function func1() {
  const d1 = document.querySelector("#d1");
  // innerHTML : 해당 요소의 시작태그와 종료태그 사이의 내용을 모두 가져옴(내부에 태그가 있으면 태그 포함)
  // innerText : 해당 요소의 시작태그와 종료태그 사이의 내용을 모두 가져옴(내부에 태그가 있으면 태그 포함X)

  const d1Html = d1.innerHTML;
  const d1Text = d1.innerText;
  console.log(d1Html, typeof d1Html);
  console.log(d1Text, typeof d1Text);
  // d1.innerHTML = "<a href='#'>테스트</a>";
  d1.innerText = "<a href='#'>테스트</a>";
  // d1.innerHTML = "변경할 문구";

  //outerHTML : 해당 요소의 시작태그와 종료태그를 포함한 모든 내용을 문자열로 가져옴(읽기전용)
  //outerHTML은 값을 수정할 수 없음
  console.log(d1.outerHTML);
}

const btn2 = document.querySelector("#btn2");
btn2.onclick = function () {
  const dd2 = document.querySelectorAll(".dd2");
  console.log(dd2[0].innerText);
  console.log(dd2[1].innerText);
  dd2[0].innerText = "세번째 div 변경!";
  dd2[1].innerText = "네번째 div 변경!!!!!!!!!!!!!!!";
};

const btn3 = document.querySelector("#btn3");
btn3.onclick = function () {
  const color = document.querySelectorAll("div[name=name1]");
  color.forEach(function (item, index) {
    item.style.color = "red";
  });

  /*
    for(let i=0; i<color.length; i++){
        color[i].style.color = "red";
    }
    */
  // color[0].style.color = "red";
  // color[1].style.color = "red";
  // color[2].style.color = "red";
};

function func4() {
  const input1 = document.querySelector("#input1");
  const input2 = document.querySelector("#input2");
  console.log(input1.innerHTML);
  console.log(input1.innerText);
  // input의 입력값을 가지고 오려면 value 속성을 사용
  // input에 함수가 돌아가는 시점에 입력되어있는 값
  const input1Value = input1.value;
  const input2Value = input2.value;
  console.log(input1Value);
  console.log(input2Value);
  input1.value = "변경값";
}

function func5() {
  const input2 = document.querySelector("#input2");
  // dom객체명.속성 = 값
  //console.log(input2.type);
  input2.type = "text";

  // dom객체에서 직접 접근 가능한 속성(type)이 존재하고
  // -> 가능한 경우 dom객체.속성이름 값 가져오고, dom객체.속성이름=변경값 으로 수정
  // 직접 접근이 불가능한 속성(readonly)도 존재
  // -> 불가능한 경우 dom객체.getAttribute("속성이름")으로 값을 가져오고,
  //      dom객체.setAttribute("속성이름",변경값)으로 수정

  console.log(input2.getAttribute("readonly"));
  input2.setAttribute("readonly", true);
}

// 1. 어떤 요소를 클릭했을 때
// id=btn8인 버튼을 클릭했을 떄
// 2. 어떤 요소의 어떤 속성을 어떻게 바꿀지
// -> 2-1. id=link인 요소의 innerText 속성
// -> 2-2. id=link인 요소의 href속성 변경

// <a href="http://www.google.com" id="link">구글로 이동</a>
const btn8 = document.querySelector("#btn8");
btn8.onclick = function () {
  const link = document.querySelector("#link");
  link.innerText = "구글로 이동";
  link.href = "http://www.google.com";
};

// 키우기버튼 누르면
// 3개 네모 모두 크기 300px x 300px
// 배경색 변경
// 원래 크기로 버튼 누르면 다시 원래대로

const btn9 = document.querySelector("#btn9");
btn9.onclick = function () {
  const testDiv = document.querySelectorAll(".test-div");
  /*
    for(let i=0; i<testDiv.length; i++){
        testDiv[i].style.width = "300px";
        testDiv[i].style.height = "300px";
        testDiv[i].style.backgroundColor = "#8edeec";
    }
    */
  testDiv.forEach(function (item, index) {
    item.style.width = "300px";
    item.style.height = "300px";
    item.style.backgroundColor = "#8edeec";
  });
};

const btn10 = document.querySelector("#btn10");
btn10.onclick = function () {
  const testDiv = document.querySelectorAll(".test-div");
  /*
    for(let i=0; i<testDiv.length; i++){
        testDiv[i].style.width = "150px";
        testDiv[i].style.height = "150px";
        testDiv[i].style.backgroundColor = "darkgrey";
    }
    */
  testDiv.forEach(function (item, index) {
    item.style.width = "150px";
    item.style.height = "150px";
    item.style.backgroundColor = "darkgrey";
  });
};

const btn11 = document.querySelector("#btn11");
btn11.onclick = function () {
  // class가 test-div인 요소들에게 모두 big이라는 클래스를 추가
  const divs = document.querySelectorAll(".test-div");
  // console.log(divs[0].getAttribute("class"));
  // console.log(divs[0].classList);
  // 현재 클래스 목록에 추가
  // 단, 이미 해당클래스를 가지고 있으면 추가하지 않음
  // divs[0].classList.add("big");
  divs.forEach(function (item) {
    item.classList.add("big");
  });
};

const btn12 = document.querySelector("#btn12");
btn12.onclick = function () {
  const divs = document.querySelectorAll(".test-div");
  divs.forEach(function (item) {
    // 현재 클래스 목록에서 big이라는 클래스를 제거
    // 단, big클래스가 없으면 제거하지 않음
    item.classList.remove("big");
  });
};

const btn13 = document.querySelector("#btn13");
btn13.onclick = function () {
  const divs = document.querySelectorAll(".test-div");
  divs.forEach(function (item) {
    // big클래스가 없으면 add
    // big클래스가 있으면 remove;
    item.classList.toggle("big");
  });
};

// 1. 어떤 요소를 클릭했을 때
// class가 test-div인 요소(3개)를 클릭했을 때
// 2. 어떤 요소의 어떤 속성을 어떻게 바꿀지
// 2-1. 클릭한 test-div(3개 중 클릭한 1개)에 big 클래스 추가
// 2-2. 클릭이 되지 않은 test-div(2-1에서 사용한 test-div를 제외한 나머지 2개에 big 클래스를 제거

const testDivs = document.querySelectorAll(".test-div");
testDivs.forEach(function (div) {
  div.onclick = function () {
    testDivs.forEach(function (item) {
      item.classList.remove("big");
    });
    div.classList.add("big");
  };
});
/*
for(let i=0; i<testDivs.length; i++){
    testDivs[i].onclick = function(){
        testDivs.forEach(function(item){
            item.classList.remove("big");
        });
        testDivs[i].classList.add("big");
    }
}
testDivs[0].onclick = function(){
    testDivs.forEach(function(item){
        item.classList.remove("big");
    })
    // testDivs[0].classList.remove("big");
    // testDivs[1].classList.remove("big");
    // testDivs[2].classList.remove("big");

    testDivs[0].classList.add("big");
}

testDivs[1].onclick = function(){
    testDivs.forEach(function(item){
        item.classList.remove("big");
    })
    // testDivs[0].classList.remove("big");
    // testDivs[1].classList.remove("big");
    // testDivs[2].classList.remove("big");

    testDivs[1].classList.add("big");
}

testDivs[2].onclick = function(){
    testDivs.forEach(function(item){
        item.classList.remove("big");
    })
    // testDivs[0].classList.remove("big");
    // testDivs[1].classList.remove("big");
    // testDivs[2].classList.remove("big");

    testDivs[2].classList.add("big");
}
*/
