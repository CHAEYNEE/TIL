/*
const likeBtn = document.querySelectorAll(".like>span");
likeBtn.forEach(function(item){
    item.addEventListener("click",function(){
        const current = item.innerText;
        if(current == "favorite"){
            item.innerText = "favorite_border";
        }else if(current == "favorite_border"){
            item.innerText = "favorite";
        }
    });
});


// 체크
const checkBtn = document.querySelector(".done");
checkBtn.addEventListener("click",function(){
    const todoText = document.querySelector(".todo-text");
    todoText.style.textDecoration = "line-through";
    checkBtn.style.display = "none";
});

// 삭제
const cancelBtn = document.querySelector(".cancel");
cancelBtn.addEventListener("click",function(){
    const todolist = document.querySelector(".todolist");
    todolist.remove();

});

*/

// todo 입력 시 리스트 추가
const addBtn = document.querySelector(".add-btn");
const input = document.querySelector("[name=input]");
input.addEventListener("keyup", function (event) {
  // 엔터의 keycode 값 : 13
  if (event.keyCode == 13) {
    addList();
  }
});
addBtn.addEventListener("click", function () {
  addList();
});
function addList() {
  const inputValue = input.value;
  if (inputValue == "") {
    return;
  }

  const ul = document.createElement("ul"); // <ul></ul>
  ul.classList.add("todolist"); // <ul class="todolist"></ul>
  const liLike = document.createElement("li"); // <li></li>
  const liTodoText = document.createElement("li"); // <li></li>
  const liChkZone = document.createElement("li"); // <li></li>
  liLike.classList.add("like"); // <li class="like"></li>
  liTodoText.classList.add("todo-text"); // <li class="todo-text"></li>
  liChkZone.classList.add("check-zone"); // <li class="check-zone"></li>
  ul.appendChild(liLike);
  ul.appendChild(liTodoText);
  ul.appendChild(liChkZone);

  const spanLike = document.createElement("span"); // <span></span>
  const spanDone = document.createElement("span"); // <span></span>
  const spanCancel = document.createElement("span"); // <span></span>

  spanLike.classList.add("material-icons");
  const favorite = document.createTextNode("favorite_border");
  spanLike.appendChild(favorite);
  liLike.appendChild(spanLike);

  // 텍스트노드
  const todo = document.createTextNode(inputValue);
  liTodoText.appendChild(todo);
  // liTodoText.innerText = inputValue;

  spanDone.classList.add("material-icons");
  spanDone.classList.add("done");
  const done = document.createTextNode("done");
  // spanDone.innerText="done"
  spanDone.appendChild(done);
  liChkZone.appendChild(spanDone);

  spanCancel.classList.add("material-icons");
  spanCancel.classList.add("cancel");
  const cancel = document.createTextNode("delete");
  // spanCancel.innerText = "delete";
  spanCancel.appendChild(cancel);
  liChkZone.appendChild(spanCancel);

  // 좋아요 버튼 이벤트 실행
  spanLike.addEventListener("click", function () {
    const current = spanLike.innerText;
    if (current == "favorite") {
      this.innerText = "favorite_border";
    } else if (current == "favorite_border") {
      this.innerText = "favorite";
    }
  });

  // 체크 버튼 이벤트 실행
  spanDone.addEventListener("click", function () {
    liTodoText.style.textDecoration = "line-through";
    this.remove();
  });

  // 삭제 버튼 이벤트 실행
  spanCancel.addEventListener("click", function () {
    ul.remove();
  });

  const listBox = document.querySelector(".list-box");
  listBox.appendChild(ul);

  input.value = "";
}
