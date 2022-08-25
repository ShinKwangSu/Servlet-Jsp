package day08_websocket;

import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

import javax.websocket.OnClose;
import javax.websocket.OnError;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.PathParam;
import javax.websocket.server.ServerEndpoint;

@ServerEndpoint(value = "/broadSocket/{userID}")
public class BroadSocket {
	static Map<String, Session> sessionMap = Collections.synchronizedMap(new HashMap<>());

	@OnOpen
	public void onOpen(Session session, @PathParam("userID") String userID) throws IOException {
		sessionMap.put(userID, session);

		for (String userid : sessionMap.keySet()) {
			(sessionMap.get(userid)).getBasicRemote().sendText(userID + "님이 입장하였습니다!");
		}
		
		System.out.println("소켓 서버" + session.getId() + "이(가) 열렸습니다...");
	}

	@OnClose
	public void onClose(Session session, @PathParam("userID") String userID) throws IOException {
		sessionMap.remove(userID);
		
		for (String userid : sessionMap.keySet()) {
			(sessionMap.get(userid)).getBasicRemote().sendText(userID + "님이 퇴장하였습니다!");
		}
		
		System.out.println("소켓 서버" + session.getId() + "이(가) 닫혔습니다...");
		
	}

	@OnMessage
	public void onMessage(String message, Session session, @PathParam("userID") String userID) throws IOException {

		synchronized (sessionMap) {

			System.out.println(message);
			StringTokenizer stk = new StringTokenizer(message, "||");
			String recipient = stk.nextToken().trim();
			String msg = stk.nextToken().trim();
			if ("All".equals(recipient)) {
				for (String userid : sessionMap.keySet()) {
					if (!userid.equals(userID)) {
						(sessionMap.get(userid)).getBasicRemote().sendText(userID + " : " + msg);
					}
				}
			} else {
				(sessionMap.get(recipient)).getBasicRemote().sendText(userID + " : " + msg);
			}
		}
	}

	@OnError
	public void onError(Throwable th) {
		th.printStackTrace();
	}
}