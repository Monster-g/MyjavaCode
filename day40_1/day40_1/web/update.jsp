<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title></title>
    <style>
        *{
            margin: 0px;
            padding: 0px;
        }
        body{
            font-size: 12px;
        }
        #container{
            margin: 20px auto;
            /*border: 1px solid red;*/
            width: 360px;
        }
        .c1{
            color: orange;
            margin: 0px 2px;
        }
        input[type="text"]{
            width: 240px;
            height: 30px;
            border: 1px solid #cccccc;
            box-sizing: border-box;
        }
        input[type="password"]{
            width: 240px;
            height: 30px;
            border: 1px solid #cccccc;
            box-sizing: border-box;
        }
        #phone{
            width: 120px;
        }
        .c3{
            width: 120px;
            height: 30px;
            border: 0px;
            vertical-align: top;
            color: #555;
        }
        td{
            /*height: 40px;*/
            padding: 5px 5px 5px 0px;
        }
        a{
            color: deepskyblue;
            text-decoration: none;
        }
        .c4{
            width: 120px;
            height: 30px;
            border: 0px;
            color: white;
            background-color: dodgerblue;
        }
        #div1{
            background-image: url(img/msgbg.png);
            background-repeat: no-repeat;
            width: 317px;
            height: 100px;
            border: 1px solid white;
            background-size: 100% 100%;
            position: absolute;
            top:116px;
            right: 300px;
            display: none;
        }
        #div1 div{
            margin: 26px 0px 0px 45px;
        }
        #div1 li{
            font-size: 10px;
            list-style-type: none;
            margin-top: 2px;
        }
        .c5{
            display: none;
        }
    </style>
</head>
<body>
<div id="container">
    <form action="update.do" method="post" onsubmit="return fnSubmit()">
        <input type="hidden" name="id" value="${account.id}">
        <div id="div1">
            <div>
                <li>6-20个字符，密码不能和会员名相同</li>
                <li>只能包含字母、数字以及标点符号（除空格）</li>
                <li>字母、数字和标点符号至少包含2种</li>
            </div>
        </div>
        <table>
            <caption style="font-size: 20px;font-weight: bold;">免费注册千锋账号</caption>
            <tr>
                <td><span class="c1">*</span>电子邮箱</td>
                <td><input type="text" name="email" value="${account.email}" id="email" onblur="fnEmail()"></td>
            </tr>
            <tr id="emailMsgTr" class="c5">
                <td></td>
                <td><span class="c1">电子邮箱格式不正确</span></td>
            </tr>
            <tr>
                <td><span class="c1">*</span>登录密码</td>
                <td><input type="password" value="${account.pwd}" name="pwd" id="pwd" onblur="fnPwd()"></td>
            </tr>
            <tr>
                <td><span class="c1">*</span>密码确认</td>
                <td><input type="password" name="confirmPwd" value="${account.pwd}" id="confirmPwd" onblur="fnConfirmPwd()"></td>
            </tr>
            <tr id="confirmPwdMsgTr" class="c5">
                <td></td>
                <td><span class="c1">两次密码输入不一致，请重新输入</span></td>
            </tr>
            <tr>
                <td><span class="c1">*</span>真实姓名</td>
                <td><input type="text" name="truename" value="${account.truename}" id="truename" onblur="fnTruename()"></td>
            </tr>
            <tr id="truenameMsgTr" class="c5">
                <td></td>
                <td><span class="c1">请输入2-20个字符</span></td>
            </tr>
            <tr>
                <td><span class="c1">*</span>QQ账户</td>
                <td><input type="text" name="qq" value="${account.qq}" id="qq" onblur="fnQq()"></td>
            </tr>
            <tr id="qqMsgTr" class="c5">
                <td></td>
                <td><span class="c1">QQ号为5-15位数字</span></td>
            </tr>
            <tr>
                <td><span class="c1">*</span>微信名称</td>
                <td><input type="text" name="wx" value="${account.wx}" id="wx"></td>
            </tr>
            <tr>
                <td><span class="c1">*</span>手机号码</td>
                <td><input type="text" class="c2" name="phone" value="${account.phone}" id="phone" onblur="fnPhone()"><button class="c3" id="codeBtn" type="button" onclick="fnCode()">发送验证码</button></td>
            </tr>
            <tr id="phoneMsgTr" class="c5">
                <td></td>
                <td><span class="c1">手机号不能为空</span></td>
            </tr>
            <tr>
                <td></td>
                <td><input type="checkbox" id="chk">&nbsp;我已阅读并同意<a href="">《服务协议》</a>和<a href="">《隐私权政策》</a></td>
            </tr>
            <tr id="chkMsgTr" class="c5">
                <td></td>
                <td><span class="c1">请勾选同意协议</span></td>
            </tr>
            <tr>
                <td></td>
                <td><button class="c4">修改</button></td>
            </tr>
        </table>
    </form>
</div>
</body>
</html>

<script>
    function fnEmail(){
        var tr = document.getElementById("emailMsgTr");
        var email = document.getElementById("email");
        if(/^[0-9A-Za-z]+@[0-9A-Za-z]+\.(com|net|org|cn)$/.test(email.value)){
            email.style.border = "1px solid green";
            tr.style.display = "none";
            return true;
        }else{
            email.style.border = "1px solid orange";
            tr.style.display = "table-row";
            return false;
        }
    }

    function fnPwd(){
        var div1 = document.getElementById("div1");
        var pwd = document.getElementById("pwd");
        var email = document.getElementById("email").value;
        if(/^[\S]{6,20}$/.test(pwd.value)){
            if(pwd.value != email){
                var num = false; var c = false; var oth = false;
                var count = 0;
                for(var i = 0; i < pwd.value.length; i++){
                    var ch = pwd.value.charAt(i);
                    if('0' <= ch && ch <= '9'){
                        num = true;
                    }else if(('A' <= ch && ch <= 'Z') || ('a' <= ch && ch <= 'z')){
                        c = true;
                    }else{
                        oth = true;
                    }
                }
                if(num){
                    count++;
                }
                if(c){
                    count++;
                }
                if(oth){
                    count++;
                }
                if(count >= 2){
                    pwd.style.border = "1px solid green";
                    div1.style.display = "none";
                    return true;
                }
            }
        }
        pwd.style.border = "1px solid orange";
        div1.style.display = "block";
        return false;
    }

    function fnConfirmPwd(){
        var tr = document.getElementById("confirmPwdMsgTr");
        var confirmPwd = document.getElementById("confirmPwd");
        var pwd = document.getElementById("pwd").value;
        if(confirmPwd.value == pwd){
            confirmPwd.style.border = "1px solid green";
            tr.style.display = "none";
            return true;
        }else{
            confirmPwd.style.border = "1px solid orange";
            tr.style.display = "table-row";
            return false;
        }
    }

    function fnTruename(){
        var tr = document.getElementById("truenameMsgTr");
        var truename = document.getElementById("truename");
        if(/^[\u4e00-\u9fa5]{2,20}$/.test(truename.value)){
            truename.style.border = "1px solid green";
            tr.style.display = "none";
            return true;
        }else{
            truename.style.border = "1px solid orange";
            tr.style.display = "table-row";
            return false;
        }
    }

    function fnQq(){
        var tr = document.getElementById("qqMsgTr");
        var qq = document.getElementById("qq");
        if(/^[0-9]{5,15}$/.test(qq.value)){
            qq.style.border = "1px solid green";
            tr.style.display = "none";
            return true;
        }else{
            qq.style.border = "1px solid orange";
            tr.style.display = "table-row";
            return false;
        }
    }

    function fnPhone(){
        var tr = document.getElementById("phoneMsgTr");
        var phone = document.getElementById("phone");
        if(/^[1][0-9]{10}$/.test(phone.value)){
            phone.style.border = "1px solid green";
            tr.style.display = "none";
            return true;
        }else{
            phone.style.border = "1px solid orange";
            tr.style.display = "table-row";
            return false;
        }
    }

    function fnCode(){
        var codeBtn = document.getElementById("codeBtn");
        codeBtn.disabled = true;
        var n = 60;
        var timer = setInterval(function(){
            codeBtn.innerText = n;
            if(n == 0){
                clearInterval(timer);
                codeBtn.disabled = false;
                codeBtn.innerText = "发送验证码";
            }
            n--;
        }, 1000);
    }

    function fnChk(){
        var tr = document.getElementById("chkMsgTr");
        var chk = document.getElementById("chk");
        if(chk.checked == true){
            tr.style.display = "none";
            return true;
        }else{
            tr.style.display = "table-row";
            return false;
        }
    }

    function fnSubmit(){
        if(fnEmail() & fnPwd() & fnConfirmPwd() & fnTruename() & fnQq() & fnPhone() & fnChk()){
            return true;
        }else{
            return false;
        }
    }
</script>