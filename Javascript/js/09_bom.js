const btn1 = document.querySelector("#btn1");
btn1.onclick = function () {
  /*
    window.open(param1,param2,param3);
    param1 : 주소(새 창에서 열릴 페이지 주소)
    param2 : 열리는 방식 oㄱ 창이름
    param3 : 옵션
    */
  window.open("http://www.naver.com", "_blank", "width=500, height=500");
};

const btn2 = document.querySelector("#btn2");
let timeoutId;
btn2.onclick = function () {
  /* 
    window.setTimeout(param1, param2);
    parma1 : 일정시간 후에 수행할 함수
    param2: 일정시간
    windo[]
    */
  timeoutId = window.setTimeout(function () {
    alert("짠!!!!!!!!!");
  }, 5 * 1000); // 5000초
};
const btn3 = document.querySelector("#btn3");
btn3.onclick = function () {
  window.clearTimeout(timeoutId);
};

const btn4 = document.querySelector("#btn4");
let clearId;
btn4.onclick = function () {
  /*
    window.setInterval(param1,param2);
    param1 : 일정시간마다 반복 실행 할 함수
    param2 : 일정시간(ms)
    */
  clearId = window.setInterval(function () {
    console.log("3초마다 반복");
  }, 3 * 1000);
};

const btn5 = document.querySelector("#btn5");
btn5.onclick = function () {
  window.clearInterval(clearId);
};

console.log(3);

const btn7 = document.querySelector("#btn7");
btn7.onclick = function () {
  console.log("화면 높이 : " + screen.height);
  console.log("화면 너비 : " + screen.width);
  console.log("실제 사용 가능한 높이 : " + screen.availHeight);
  console.log("실제 사용 가능한 너비 : " + screen.availWidth);
  console.log("사용 가능한 색상 수 : " + screen.colorDepth);
  console.log("한 픽셀 당 비트 수 : " + screen.pixelDepth);
};

const btn8 = document.querySelector("#btn8");
btn8.onclick = function () {
  location.href = "http://www.naver.com";
};

const btn9 = document.querySelector("#btn9");
btn9.onclick = function () {
  location.reload();
};
