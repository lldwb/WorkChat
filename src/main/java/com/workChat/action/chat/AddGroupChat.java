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

@WebServlet("/AddGroupChat")
public class AddGroupChat extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setCharacterEncoding("utf-8");
        String userId = req.getParameter("userId");
        String unitId = req.getParameter("unitId");
        String word = req.getParameter("word");

        WorkChat workChat = new WorkChatImpl();
        ObjectMapper om = new ObjectMapper();
        String json = om.writeValueAsString(workChat.addChat(Integer.parseInt(userId),Integer.parseInt(unitId),word));
        resp.getWriter().print(json);
    }
}
