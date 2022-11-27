package com.workChat.action.chat;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.workChat.service.WorkChat;
import com.workChat.service.WorkChatImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author 陈强
 * @version 1.0
 */
@WebServlet("/AddChat")
public class AddChat extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setCharacterEncoding("utf-8");
        String userId = req.getParameter("userId");
        String receiveId = req.getParameter("receiveId");
        String word = req.getParameter("word");

        WorkChat workChat = new WorkChatImpl();
        ObjectMapper om = new ObjectMapper();
        String json = om.writeValueAsString(workChat.addChat(Integer.parseInt(userId),Integer.parseInt(receiveId),word));
        resp.getWriter().print(json);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req, resp);
    }
}
