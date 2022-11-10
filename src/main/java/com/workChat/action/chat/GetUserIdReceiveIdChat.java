package com.workChat.action.chat;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.workChat.entity.Chat;
import com.workChat.service.WorkChat;
import com.workChat.service.WorkChatImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * @author 安然的尾巴
 * @version 1.0
 */
@WebServlet("/GetUserIdReceiveIdChat")
public class GetUserIdReceiveIdChat extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setCharacterEncoding("utf-8");
        String userId_Str = req.getParameter("userId");
        String receiveId_Str = req.getParameter("receiveId");
        WorkChat workChat = new WorkChatImpl();

        ObjectMapper om = new ObjectMapper();
        List<Chat> json = workChat.getUserIdReceiveIdChat(Integer.parseInt(userId_Str),Integer.parseInt(receiveId_Str));
        resp.getWriter().print(json);
    }

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req,resp);
    }
}
