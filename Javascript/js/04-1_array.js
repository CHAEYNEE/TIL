const arr1 = ["hi", "hello", 100, true, [1, 2, 3, 4]];
for (let i = 0; i < arr1.length; i++) {
  console.log(i, arr1[i]);
}

// for(Member m : list)
// forEach : 해당 배열을 처음부터 끝까지 순회하면서 필요한 동작을 하는 함수
// 필요한 동작을 forEach함수의 매개변수 함수로 지정
// 이 때 내부 매개변수
// 첫번째 매개변수(item) : 반복하면서 접근하는 배열의 각 요소 -> arr1[i]
// 두번째 매개변수(i) : 인덱스 번호 -> i
// 매개변수는 순서만 일치하면 이름은 아무 상관없음 (매개변수 순서!!!!!!!)
// 인덱스 번호는 필요가 없는 경우 생략이 가능
arr1.forEach(function (item, i) {
  console.log(i, item);
});

arr1.forEach(function (content, j) {
  console.log(j, content);
});

arr1.forEach(function (item) {
  console.log(item);
});

// map : forEach와 마찬가지로 배열을 순회하는 함수 + 리턴하는 값을 다시 배열로 생성
const arr2 = arr1.map(function (item, index) {
  const str = `${index}번째 아이템은 ${item}`;
  console.log(str);
  // return하는 데이터를 배열로 다시 묶어줌
  return str;
});
console.log(arr2);

// filter : 배열에서 특정 조건에 만족하는 데이터만 필터링할 때 사용
const arr3 = [6, 2, 3, 4, 5, 1];
const arr4 = arr3.filter(function (item) {
  return item > 3; // return이 true회차의 아이템만 배열로 다시 묶어주는 역할
});
console.log(arr4);

console.log(
  "---------------------------------------------------------------------"
);

// reduce : 배열의 값을 이용해서 연산하여 특정값을 도출할 때 사용
// 6,2,3,4,5,1
/*
let sum = 0;
for(let i=0;i<arr3.length;i++){
    sum += arr3[i];
}
*/
const sum = arr3.reduce(function (acc, curr, index) {
  /*
      세번째 매개변수인 index : 반복회차변수
      최초 1회 반복 시 : acc에 첫번째 수, curr 두번째 수 // 여기서는 6, 2
      두번째부터는 acc에는 이전 회차에 리턴되는 값이 들어오고 curr에는 다음 item이 들어옴
      */
  console.log(acc, curr, index);
  return acc + curr;
});
console.log(sum);
