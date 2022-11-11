package com.workChat.action.workCircle;

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
@WebServlet("/AddWorkCircle")
public class AddWorkCircle extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setCharacterEncoding("utf-8");
        String title = req.getParameter("title");
        String userId = req.getParameter("userId");
        String content = req.getParameter("content");

        WorkChat workChat = new WorkChatImpl();
        ObjectMapper om = new ObjectMapper();
        String json = om.writeValueAsString(workChat.addWorkCircle(title,Integer.parseInt(userId),content));
        resp.getWriter().print(json);
    }
}
