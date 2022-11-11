package com.workChat.action.workCircle; /**
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

@WebServlet(name = "UpdateWorkCircle", value = "/UpdateWorkCircle")
public class UpdateWorkCircle extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setCharacterEncoding("utf-8");
        String id_Str = req.getParameter("id");
        String title = req.getParameter("title");
        String content = req.getParameter("content");
        WorkChat workChat = new WorkChatImpl();
        ObjectMapper om = new ObjectMapper();
        String json = om.writeValueAsString(workChat.updateWorkCircle(Integer.parseInt(id_Str),title,content));
        resp.getWriter().print(json);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req, resp);
    }
}
