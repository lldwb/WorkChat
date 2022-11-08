package com.workChat.action;

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
 * @author 谢世杰
 * @version 1.0
 */
@WebServlet("GetUnitIdGroupChat")
public class GetUnitIdGroupChat extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setCharacterEncoding("utf-8");
        String unitId_Str = req.getParameter("unitId");
        WorkChat workChat = new WorkChatImpl();

        ObjectMapper om = new ObjectMapper();
        String json = om.writeValueAsString(workChat.getIdUser(Integer.parseInt(unitId_Str)));
        resp.getWriter().print(json);
    }

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }
}
