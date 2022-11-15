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

/**
 * @author 陈强
 * @version 1.0
 */
@WebServlet("/AddUnit")
public class AddUnit extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setCharacterEncoding("utf-8");
        String name = req.getParameter("name");
        String userId = req.getParameter("userId");
        String remark = req.getParameter("remark");
        WorkChat workChat = new WorkChatImpl();

        ObjectMapper om =new ObjectMapper();
        String json = om.writeValueAsString(workChat.addUnit(name,Integer.parseInt(userId),remark));
        resp.getWriter().print(json);



    }
}
