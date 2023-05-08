//alert('abcde');v
function fn2(){
	confirm('opq');
}

var n1 = 100;
console.log(n1);
console.log(typeof(n1));

var obj = new Object();
obj.name = "zhangsan";
obj.say = function(){
	console.log("hello world");
}
console.log(obj.name);
obj.say();

var m = {"name":"lisi"};
console.log(m.name);
console.log(m["name"]);

var arr1 = new Array();
var arr2 = [1,2,3];
arr1[0] = 4;
arr1[1] = 5;
console.log(arr1[1]);
console.log(arr1.length);
arr1[3] = 7;
console.log(arr1.length);
console.log(arr1[2]);
