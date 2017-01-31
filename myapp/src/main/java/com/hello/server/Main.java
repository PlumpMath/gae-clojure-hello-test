package com.hello.server;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Main extends HttpServlet {
  @Override
  public void doPost(final HttpServletRequest req, final HttpServletResponse resp) throws IOException {
    resp.setContentType("application/json");
    resp.getWriter().println("{\"result\":\"Hello world\"}");
  }
}
