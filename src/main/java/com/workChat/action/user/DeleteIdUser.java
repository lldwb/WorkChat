package com.workChat.action.user; /**
 * @author 安然的尾巴
 * @version 1.0
 */

import com.fasterxml.jackson.databind.ObjectMapper;
import com.workChat.service.WorkChat;
import com.workChat.service.WorkChatImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "DeleteIdUser", value = "/DeleteIdUser")
public class DeleteIdUser extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setCharacterEncoding("utf-8");
        String id_Str = req.getParameter("id");
        WorkChat workChat = new WorkChatImpl();
        ObjectMapper om = new ObjectMapper();
        String json = om.writeValueAsString(workChat.deleteIdUser(Integer.parseInt(id_Str)));
        resp.getWriter().print(json);
    }

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }
}
