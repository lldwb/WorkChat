package com.workChat.action.unit;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.workChat.service.WorkChat;
import com.workChat.service.WorkChatImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/updateUnit")
public class UpdateUnit extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setCharacterEncoding("utf-8");

        String id = req.getParameter("id");
        String name = req.getParameter("naem");
        String userId = req.getParameter("userId");
        String remark = req.getParameter("remark");

        WorkChat workChat = new WorkChatImpl();
        ObjectMapper om = new ObjectMapper();

        String json =om.writeValueAsString(workChat.updateUnit(Integer.parseInt(id),name,Integer.parseInt(userId),remark));
        resp.getWriter().print(json);
    }
}
