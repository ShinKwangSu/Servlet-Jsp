<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String contextPath = request.getContextPath();
int port = request.getLocalPort();
String serverName = request.getServerName();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Chat Client Socket</title>
</head>
<body>
<h1>웹소켓을 활용한 챗팅</h1>
<p>사용자 아이디를 입력 하고 로그인 하면 체팅이 시작 됩니다!</p>
<form>
   사용자 : <input id="sender" type="text" value="user1"> 
   <input id="loginBtn" value="Login" type="button">
   <input id="closeBtn" value="Disconnect" type="button" disabled ><br>
   받는이 : <input id="recipient" type="text" value="All"><br>
   메세지 : <input id="txtMsg" type="text" value="hello">
   <input id="sendBtn" value="Send" type="button">
</form>
<hr>
<textarea id="msgTxtArea" rows="10" cols="50">로그인 해주세요 ...</textarea>

<script>
// 웹소켓 프로토콜을 이용해서 서버와 연결
// WebSocket은 HTML5에 기본 제공된다.
var sender = document.getElementById("sender");

var loginBtn = document.getElementById("loginBtn");
var closeBtn = document.getElementById("closeBtn");
var sendBtn = document.getElementById("sendBtn");

var msgTxtArea = document.getElementById("msgTxtArea");
var txtMsg = document.getElementById("txtMsg");
var recipient = document.getElementById("recipient");

var endPointName = "broadSocket";
var socket = null;

loginBtn.onclick = function() {
	
	if (sender.value == "") {
		alert("사용자 아이디를 입력해주세요.");
	} else {
		socket = new WebSocket("ws://<%=serverName%>:<%=port%><%=contextPath%>/"+endPointName+"/"+sender.value);
		connection();
		
		loginBtn.disabled = true;
		closeBtn.disabled = false;
		
		msgTxtArea.textContent = "";
		
		alert("로그인 되었습니다.");
	}
}

sendBtn.onclick = function(event) {
	event.preventDefault();
	msgTxtArea.append("나 : " + txtMsg.value + "\n");
	socket.send(recipient.value + "|\|" + txtMsg.value);
}
	

closeBtn.onclick = function() {
	
	if (confirm("연결을 종료하시겠어요?") == true) {
		alert("연결을 종료합니다.");
		socket.close();
		loginBtn.disabled = false;
		closeBtn.disabled = true;
		
		msgTxtArea.textContent = "로그인 해주세요 ...";	
	} else {
		return false
	}
	
}

function connection() {

   socket.onopen = function(message) {
	   
      
   }
   
   socket.onclose = function(message) {
	   //msgTxtArea.innerHTML += message.data + "\n";
   }
   
   socket.onerror = function(err) {
	   alert("소켓 오류" + err);
	   console.log("error ...");
   }
   
   socket.onmessage = function(message) {
	   msgTxtArea.innerHTML += message.data + "\n";
	   
   }
}


</script>
</body>
</html>