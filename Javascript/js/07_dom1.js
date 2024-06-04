function func1() {
  const str = prompt("메세지를 입력하세요");
  console.log(str);
  // 1. 요소노드 생성
  // p태그를 새로 생성
  const p = document.createElement("p"); //<p></p>
  // 2. 요소노드에 들어갈 텍스트노드를 생성
  const text = document.createTextNode(str); // prompt로 입력받은 문자열로 텍스트노드 생성
  p.appendChild(text); // <p>test</p>
  // 이미 작성된 문서에 있는 요소를 id를 통해서 가지고옴
  const addZone = document.getElementById("add-zone");
  addZone.appendChild(p);
  /* 
    <div id="add-zone">
        <p>text</p>
    </div>
    */
}

//텍스트노드가 없는 요소 추가하기
function func2() {
  // <img src="img/dora.png"<
  // 1. 요소노드 생성
  const img = document.createElement("img"); // <img>
  // 2. 필요한 속성값 처리
  img.src = "img/dora.png"; // <img src="img/dora.png">
  // 3. HTML문서에 추가
  const addZone = document.getElementById("add-zone");
  addZone.appendChild(img);
}

function func3() {
  // 요소노드 7개 텍스트노드 3개 필요
  /*
    <ul>
        <li>
            <a href="#">메뉴1</a>
        </li>
        <li>
            <a href="#">메뉴2</a>
        </li>
        <li>
            <a href="#">메뉴3</a>
        </li>
    </ul>
    */
  const ul = document.createElement("ul"); // <ul></ul>
  const li1 = document.createElement("li"); // <li></li>
  const li2 = document.createElement("li"); // <li></li>
  const li3 = document.createElement("li"); // <li></li>
  const a1 = document.createElement("a"); // <a></a>
  // a태그에 넣을 텍스트노드
  const text1 = document.createTextNode("메뉴1"); // "메뉴1" 생성
  // a태그에 메뉴를 넣기
  a1.appendChild(text1); // <a>메뉴1</a>
  a1.href = "#"; // <a href="#">메뉴1</a>

  const a2 = document.createElement("a"); // <a></a>
  const text2 = document.createTextNode("메뉴2"); // "메뉴2" 생성
  a2.href = "#"; // 순서 노상관 <a href="#"></a>
  a2.appendChild(text2); // <a href="#">메뉴2</a>

  const a3 = document.createElement("a"); // <a></a>
  const text3 = document.createTextNode("메뉴3"); // "메뉴3" 생성
  a3.href = "#"; // <a href="#"></a>
  a3.appendChild(text3); // <a href="#">메뉴3</a>

  li1.appendChild(a1); // <li><a href="#">메뉴1</a></li>
  li2.appendChild(a2); // <li><a href="#">메뉴2</a></li>
  li3.appendChild(a3); // <li><a href="#">메뉴3</a></li>

  ul.appendChild(li1); // <ul><li><a href="#">메뉴1</a></li></ul>
  ul.appendChild(li2); // <ul><li><a href="#">메뉴1</a></li></ul><ul><li><a href="#">메뉴2</a></li></ul>
  ul.appendChild(li3); // <ul><li><a href="#">메뉴1</a></li></ul><ul><li><a href="#">메뉴2</a></li></ul><ul><li><a href="#">메뉴3</a></li></ul>

  // id가 test-zone인 div태그를 문서에서 가져옴(메뉴를 삽입할 위치)
  const testZone = document.getElementById("test-zone");
  testZone.appendChild(ul);
}

function func4() {
  // 문서에서 id가 pw인 요소를 객체로 가져옴
  const input = document.getElementById("pw");
  // 해당 input의 type속성값을 text로 변경
  input.type = "text";
  // 문서에서 id가 show-btn인 요소를 객체로 가져옴
  const showBtn = document.getElementById("show-btn");
  // showBtn을 화면에서 숨김 -> display 속성값을 none
  // 해당요소의 css를 변경 방법 -> 객체명.style.css속성이름 = "값";
  showBtn.style.display = "none";
  // 문서에서 id가 hide-btn인 요소를 객체로 가져옴
  const hideBtn = document.getElementById("hide-btn");
  // hideBtn은 화면에 다시 나타나게 설정
  // 해당 요소의 display 속성 -> inline-block으로 처리
  hideBtn.style.display = "inline-block";
}

function func5() {
  // 문서에서 id가 pw인 요소를 객체로 가져옴
  const input = document.getElementById("pw");
  // 해당 input의 type속성값을 password로 변경
  input.type = "password";
  const hideBtn = document.getElementById("hide-btn");
  hideBtn.style.display = "none";
  const showBtn = document.getElementById("show-btn");
  showBtn.style.display = "inline-block";
}

function func6() {
  // 글씨색 변경
  // -> css에서 color 속성을 색상값
  const h2 = document.getElementById("h2");
  h2.style.color = "#cccfff";
  // 배경색 변경
  // -> css에서 background-color 속성을 색상값
  h2.style.backgroundColor = "#fffccc"; // 변수이름엔 - 불가 -> 카멜표기법으로
}

function func7() {
  // 삭제하고싶은 요소를 문서에서 가져옴
  const delBtn = document.getElementById("del-div3");
  // delBtn.style.display = "none"; // div는 존재하는데 숨겨놓은 것
  // 해당요소 삭제
  delBtn.remove(); // div자체를 삭제 -> 존재 X

  // const checkBtn = document.getElementById("del-div3");
  // document.querySelector("css선택자") : css선택자에 해당하는 요소 1개 가져옴
  const checkBtn = document.querySelector("#del-div3"); // 모든 선택자 사용 가능
  console.log(checkBtn);
}

function func8() {
  /*
    const btn1 = document.getElementById("del-div1");
    const btn2 = document.getElementById("del-div2");
    const btn3 = document.getElementById("del-div3");
    const btn4 = document.getElementById("del-div4");
    const btn5 = document.getElementById("del-div5");
    btn1.remove();
    btn2.remove();
    btn3.remove(); // 3번 삭제 버튼 누르고 전체 삭제버튼 누를 시 오류 (이미 null값이므로)
    btn4.remove();
    btn5.remove();
    */

  // 문서에서 클래스이름으로 요소를 가져옴
  // 동일한 클래스를 가진 모든 요소를 배열로 가져옴
  // 해당 클래스를 가진 요소가 1개여도 배열로 가져옴
  // const btns = document.getElementsByClassName("del-div");
  // const btns = document.querySelector(".del-div"); // 현재 클래스 5개, 제일 처음 작성된 한개만 가져옴
  // document.querySelectorAll("css선택자") : css선택자에 해당하는 요소 모두를 배열로 가져옴

  const btns = documnet.querySelectorAll(".del-div");
  const count = btns.length;
  for (let i = 0; i < count; i++) {
    btns[0].remove();
  }
}

function func9() {
  const btn = document.querySelector("#btn");
  btn.onclick = function () {
    const div5 = document.querySelector("#del-div5");
    div5.remove();
  };
}

function func10() {
  const btn = document.querySelector("#btn");
  btn.onclick = null;
}
