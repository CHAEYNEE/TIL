const btn1 = document.querySelector("#btn1");
btn1.onclick = function () {
  console.log("고전 이벤트 동작");
};

function func1() {
  alert("인라인 이벤트 모델2");
}

const btn2 = document.querySelector("#btn2");
btn2.addEventListener("click", function () {
  console.log("표준 이벤트 모델");
});

const btn3 = document.querySelector("#btn3");
const btn4 = document.querySelector("#btn4");

btn3.onclick = function () {
  console.log("고전 이벤트1111111111");
};

btn4.addEventListener("click", function () {
  console.log("표준 이벤트 모델111111111");
});

btn3.onclick = function () {
  console.log("고전 이벤트22222222");
};

btn4.addEventListener("click", function () {
  console.log("표준 이벤트 모델222222222222");
});

const a = document.querySelector("#a");
a.addEventListener("click", function () {
  const select = confirm("네이버로 이동하시겠습니까?");
  if (select) {
    alert("이동");
    location.href = "http://www.naver.com";
  } else {
    alert("이동안함");
  }
});

function changePw() {
  const newInput = document.querySelector("#newPw");
  const newPw = newInput.value;
  const newInputRe = document.querySelector("#newPwRe");
  const newPwRe = newInputRe.value;
  if (newPw != newPwRe) {
    alert("새 비밀번호가 일치하지 않습니다.");
    return false;
  }
}

/*
const submitBtn = document.querySelector("#submitBtn");
submitBtn.addEventListener("click",function(e){
    // 비밀번호 변경 전 체크사항
    // 1. 새 비밀번호를 입력했는지
    // 2. 현재 비밀번호가 일치하는지(기존 비밀번호 : "1234")
    // 3. 새 비밀번호 == 새 비밀번호 확인
    // 4. 새 비밀번호 != 현재 비밀번호
    const currInput = document.querySelector("#currPw");
    const currPw = currInput.value;
    const newInput = document.querySelector("#newPw");
    const newPw = newInput.value;
    const newInputRe = document.querySelector("#newPwRe");
    const newPwRe = newInputRe.value;
    if(newPw == ""){
        alert("새 비밀번호를 입력하세요");
        event.preventDefault(); // 기본 이벤트 제거
    }else if(currPw != "1234"){
        alert("현재 비밀번호가 일치하지 않습니다.");
        event.preventDefault(); // 기본 이벤트 제거
    }else if(newPw != newPwRe){
        alert("새 비밀번호가 일치하지 않습니다.");
        event.preventDefault(); // 기본 이벤트 제거
    }else if(newPw == currPw){
        alert("새 비밀번호는 변경 전 비밀번호와 일치 할 수 없습니다.");
        event.preventDefault(); // 기본 이벤트 제거
    }
});
*/

const div1 = document.querySelector(".div1");
div1.addEventListener("click", function () {
  const text = div1.innerText;
  alert(text);
});

const div2 = document.querySelector(".div2");
div2.addEventListener("click", function () {
  const text = this.innerText;
  alert(text);
  window.event.stopPropagation();
});

const div3 = document.querySelector(".div3");
div3.addEventListener("click", function () {
  const text = this.innerText;
  alert(text);
  // 부모요소로 이벤트가 퍼져나가는 현상(이벤트 버블링)을 막는 코드
  window.event.stopPropagation();
});

const div4 = document.querySelector("#div4");
div4.addEventListener("click", function () {
  console.log("클릭 이벤트 동작");
});

const div5 = document.querySelector("#div5");
div5.addEventListener("dblclick", function () {
  console.log("더블클릭 이벤트 동작");
});

// mouseleave없으면 마우스 떼도 바뀐 그대로 유지
const div6 = document.querySelector("#div6");
div6.addEventListener("mouseenter", function () {
  this.style.backgroundColor = "black";
});

div6.addEventListener("mouseleave", function () {
  this.style.backgroundColor = "transparent";
});

const input1 = document.querySelector("#input1");
input1.addEventListener("focusin", function () {
  this.style.backgroundColor = "yellow";
});
input1.addEventListener("focusout", function () {
  this.style.backgroundColor = "white";
});

// 아이디 중복용 임시배열
// 이미 user01, user02, user03 사용 중이라고 가정
const userArr = new Array();
userArr.push("user01");
userArr.push("user02");
userArr.push("user03");
input1.addEventListener("change", function () {
  // change 쓰면 input박스를 나갈 때 메세지가 뜸 그러나 한번만
  console.log("키보드입력");
  const inputId = this.value;
  const searchResult = userArr.indexOf(inputId);
  const span = document.querySelector("#idChkMsg");
  if (searchResult == -1) {
    console.log("사용가능한 아이디");
    span.innerText = "사용 가능한 아이디 입니다.";
    span.style.color = "green";
  } else {
    console.log("중복 아이디");
    span.innerText = "이미 사용중인 아이디 입니다.";
    span.style.color = "red";
  }
});

// 비밀번호 일치 검사
const input3 = document.querySelector("#input3");
input3.addEventListener("keyup", function () {
  const inputPwRe = this.value;
  const input2 = document.querySelector("#input2");
  const inputPw = input2.value;
  const span = document.querySelector("#pwChkMsg");
  if (inputPw == inputPwRe) {
    span.innerText = "비밀번호가 일치합니다.";
    span.style.color = "blue";
  } else {
    span.innerText = "비밀번호가 일치하지않습니다.";
    span.style.color = "red";
  }
});

// 약관동의 전체 체크
const allAgree = document.querySelector("#allAgree");
allAgree.addEventListener("click", function () {
  // 전체 체크용 체크박스가 체크되었는지 확인(체크됨 : true / 아니면 : false)

  const status = this.checked;
  console.log(status);
  // 약관동의 세부 체크박스 가져옴
  const agree = document.querySelectorAll("[name=agree]");
  /*
    agree.forEach(function(item){
        item.checked = this.status;
    });
*/

  // 최종 if문

  for (let i = 0; i < agree.length; i++) {
    agree[i].checked = status;
  }
  /*  
        // if문 줄인것
        if(status){
            agree[i].checked = status;
        }else{
            agree[i].checked = status;
        }
            
    }
    */

  /*
    if문
    if(status == true){
        for(let i=0; i<agree.length; i++){
            agree[i].checked = true;
        }
        원래코드
        agree[0].checked = true;
        agree[1].checked = true;
        
    }else{
        for(let i=0; i<agree.length; i++){
            agree[i].checked = false;
        }
        agree[0].checked = false;
        agree[1].checked = false;

    } 
    */
});
